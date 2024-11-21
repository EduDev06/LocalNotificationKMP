package org.sample.localnotificationmultiplatform

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.sample.localnotificationmultiplatform.di.KoinInit
import org.sample.localnotificationmultiplatform.di.viewModelModule

class LocalNotificationApp : Application() {
    override fun onCreate() {
        super.onCreate()
        KoinInit().init {
            androidContext(this@LocalNotificationApp)
            modules(listOf(viewModelModule))
        }
    }
}