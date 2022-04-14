package com.mbobiosio.githubsearch.core.utils

import com.mbobiosio.githubsearch.core.data.source.remote.response.profile.ProfileResponse
import com.mbobiosio.githubsearch.core.domain.model.profile.Profile

object ProfileMapper {
    fun ProfileResponse.mapProfileResponsesToEntities() =
        Profile(
            avatarUrl = avatarUrl ?: "-",
            name = name ?: "-",
            login = login ?: "-",
            bio = bio ?: "-",
            company = company ?: "-",
            email = email ?: "-",
            followers = followers ?: "-",
            following = following ?: "-"
        )
}