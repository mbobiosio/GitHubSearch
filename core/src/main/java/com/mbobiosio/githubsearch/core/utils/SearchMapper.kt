package com.mbobiosio.githubsearch.core.utils

import com.mbobiosio.githubsearch.core.data.source.remote.response.search.SearchResponse
import com.mbobiosio.githubsearch.core.domain.model.search.Search
import com.mbobiosio.githubsearch.core.domain.model.search.SearchItem

object SearchMapper {
    fun SearchResponse.mapSearchResponsesToEntities() =
        Search(
            items = items?.map { searchItemResponse ->
                SearchItem(login = searchItemResponse.login ?: "")
            }.orEmpty()
        )
}