package com.mbobiosio.githubsearch.core.data.source.remote

import com.mbobiosio.githubsearch.core.data.source.remote.response.ProfileRemoteSource
import com.mbobiosio.githubsearch.core.domain.model.profile.Profile
import com.mbobiosio.githubsearch.core.domain.model.profile.Repository
import com.mbobiosio.githubsearch.core.domain.repository.IProfileRepository
import com.mbobiosio.githubsearch.core.utils.ProfileMapper.mapProfileResponsesToEntities
import com.mbobiosio.githubsearch.core.utils.RepositoryMapper.mapRepositoryResponsesToEntities
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileRepository @Inject constructor(private val profileRemoteSource: ProfileRemoteSource) :
    IProfileRepository {
    override suspend fun getProfile(username: String): Profile =
        profileRemoteSource.getProfile(username).mapProfileResponsesToEntities()

    override suspend fun getRepository(username: String, page: Int): List<Repository> =
        profileRemoteSource.getRepository(username, page).mapRepositoryResponsesToEntities()
}