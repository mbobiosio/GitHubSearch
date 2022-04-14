package com.mbobiosio.githubsearch.core.domain.remote

import com.mbobiosio.githubsearch.core.data.source.remote.response.search.SearchResponse

interface ISearchRemoteSource {
    suspend fun searchUser(query: String, page: Int): SearchResponse
}