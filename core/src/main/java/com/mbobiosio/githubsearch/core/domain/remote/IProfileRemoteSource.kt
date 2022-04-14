package com.mbobiosio.githubsearch.core.domain.remote

import com.mbobiosio.githubsearch.core.data.source.remote.response.profile.ProfileResponse
import com.mbobiosio.githubsearch.core.data.source.remote.response.profile.RepositoryResponse

interface IProfileRemoteSource {
    suspend fun getProfile(username: String): ProfileResponse
    suspend fun getRepository(username: String, page: Int): List<RepositoryResponse>
}