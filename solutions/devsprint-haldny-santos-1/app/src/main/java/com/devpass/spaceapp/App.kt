package com.devpass.spaceapp

import android.app.Application
import com.devpass.spaceapp.di.rocketDetailModule
import com.devpass.spaceapp.di.networkModule
import com.devpass.spaceapp.presentation.launch_list.di.launchListModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(listOf(networkModule, rocketDetailModule, launchListModule))
        }

    }
}
