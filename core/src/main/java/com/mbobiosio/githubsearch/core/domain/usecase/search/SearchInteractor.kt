package com.mbobiosio.githubsearch.core.domain.usecase.search

import com.mbobiosio.githubsearch.core.domain.model.search.SearchItem
import com.mbobiosio.githubsearch.core.domain.repository.ISearchRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchInteractor @Inject constructor(
    private val searchRepository: ISearchRepository
) :
    SearchUseCase {
    override suspend fun searchUser(query: String, page: Int): Flow<List<SearchItem>> =
        flow { emit(searchRepository.searchUser(query, page)) }
}