package com.mbobiosio.githubsearch.core.di

import com.mbobiosio.githubsearch.core.data.source.remote.ProfileRepository
import com.mbobiosio.githubsearch.core.data.source.remote.SearchRepository
import com.mbobiosio.githubsearch.core.domain.repository.IProfileRepository
import com.mbobiosio.githubsearch.core.domain.repository.ISearchRepository
import dagger.Binds
import dagger.Module

@Module(includes = [NetworkModule::class])
abstract class RepositoryModule {

    @Binds
    abstract fun provideSearchRepository(searchRepository: SearchRepository): ISearchRepository

    @Binds
    abstract fun provideProfileRepository(profileRepository: ProfileRepository): IProfileRepository
}