package com.mbobiosio.githubsearch.di

import android.content.Context
import com.mbobiosio.githubsearch.core.di.CoreComponent
import com.mbobiosio.githubsearch.ui.detail.ProfileFragment
import com.mbobiosio.githubsearch.ui.search.SearchFragment
import dagger.BindsInstance
import dagger.Component
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.ObsoleteCoroutinesApi

@FlowPreview
@ObsoleteCoroutinesApi
@ExperimentalCoroutinesApi
@AppScope
@Component(
    dependencies = [CoreComponent::class],
    modules = [AppModule::class, ViewModelModule::class, EpoxyModule::class]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context, coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: SearchFragment)
    fun inject(fragment: ProfileFragment)
}