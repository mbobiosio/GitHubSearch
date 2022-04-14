package com.mbobiosio.githubsearch.di

import com.mbobiosio.githubsearch.core.domain.usecase.profile.ProfileInteractor
import com.mbobiosio.githubsearch.core.domain.usecase.profile.ProfileUseCase
import com.mbobiosio.githubsearch.core.domain.usecase.search.SearchInteractor
import com.mbobiosio.githubsearch.core.domain.usecase.search.SearchUseCase
import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun provideSearchUseCase(searchInteractor: SearchInteractor): SearchUseCase

    @Binds
    abstract fun provideProfileUseCase(profileInteractor: ProfileInteractor): ProfileUseCase
}