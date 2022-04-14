package com.mbobiosio.githubsearch.ui.main

import android.view.LayoutInflater
import com.mbobiosio.githubsearch.core.base.BaseActivity
import com.mbobiosio.githubsearch.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun setup() {
    }
}