package org.sample.localnotificationmultiplatform.di

import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module
import org.sample.localnotificationmultiplatform.home.HomeViewModel

actual val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
}