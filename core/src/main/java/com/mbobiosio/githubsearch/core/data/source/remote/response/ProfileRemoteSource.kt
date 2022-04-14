package com.mbobiosio.githubsearch.core.data.source.remote.response

import com.mbobiosio.githubsearch.core.data.source.remote.network.GithubService
import com.mbobiosio.githubsearch.core.data.source.remote.response.profile.ProfileResponse
import com.mbobiosio.githubsearch.core.data.source.remote.response.profile.RepositoryResponse
import com.mbobiosio.githubsearch.core.domain.remote.IProfileRemoteSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileRemoteSource @Inject constructor(private val githubService: GithubService) :
    IProfileRemoteSource {
    override suspend fun getProfile(username: String): ProfileResponse =
        githubService.profile(username)

    override suspend fun getRepository(username: String, page: Int): List<RepositoryResponse> =
        githubService.repository(username, page)
}