package com.mbobiosio.githubsearch.di

import android.content.Context
import com.mbobiosio.githubsearch.core.ui.profile.ProfileController
import com.mbobiosio.githubsearch.core.ui.search.SearchController
import dagger.Module
import dagger.Provides

@Module
class EpoxyModule {

    @Provides
    fun provideSearchController(context: Context) = SearchController(context)

    @Provides
    fun provideProfileController(context: Context) = ProfileController(context)
}