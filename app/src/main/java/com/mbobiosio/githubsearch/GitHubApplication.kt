package com.mbobiosio.githubsearch

import android.app.Application
import com.mbobiosio.githubsearch.core.di.CoreComponent
import com.mbobiosio.githubsearch.core.di.DaggerCoreComponent
import com.mbobiosio.githubsearch.di.AppComponent
import com.mbobiosio.githubsearch.di.DaggerAppComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.ObsoleteCoroutinesApi
import timber.log.Timber

@ExperimentalCoroutinesApi
@ObsoleteCoroutinesApi
@FlowPreview
class GitHubApplication : Application() {

    private val coreComponent: CoreComponent by lazy {
        DaggerCoreComponent.factory().create(applicationContext)
    }

    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext, coreComponent)
    }

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}