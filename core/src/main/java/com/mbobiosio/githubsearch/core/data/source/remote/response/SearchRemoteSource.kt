package com.mbobiosio.githubsearch.core.data.source.remote.response

import com.mbobiosio.githubsearch.core.data.source.remote.network.GithubService
import com.mbobiosio.githubsearch.core.data.source.remote.response.search.SearchResponse
import com.mbobiosio.githubsearch.core.domain.remote.ISearchRemoteSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SearchRemoteSource @Inject constructor(private val githubService: GithubService) :
    ISearchRemoteSource {
    override suspend fun searchUser(query: String, page: Int): SearchResponse =
        githubService.search(query, page)
}