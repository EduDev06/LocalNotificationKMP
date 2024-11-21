package org.sample.localnotificationmultiplatform.di

import org.koin.core.module.Module
import org.koin.dsl.module
import org.sample.localnotificationmultiplatform.platform.NotificationManager

actual fun platformModule(): Module = module {
    single { NotificationManager(context = get()) }
}