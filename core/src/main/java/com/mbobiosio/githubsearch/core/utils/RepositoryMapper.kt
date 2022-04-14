package com.mbobiosio.githubsearch.core.utils

import com.mbobiosio.githubsearch.core.data.source.remote.response.profile.RepositoryResponse
import com.mbobiosio.githubsearch.core.domain.model.profile.Owner
import com.mbobiosio.githubsearch.core.domain.model.profile.Repository

object RepositoryMapper {
    fun List<RepositoryResponse>.mapRepositoryResponsesToEntities() =
        map {
            Repository(
                name = it.name ?: "-",
                owner = it.owner?.let { owner ->
                    Owner(
                        avatarUrl = owner.avatarUrl ?: "-"
                    )
                },
                description = it.description ?: "-",
                stargazersCount = it.stargazersCount ?: 0,
                updatedAt = it.updatedAt ?: "-"
            )
        }
}