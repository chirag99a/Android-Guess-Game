package com.example.kotlinfragmentslifecycle

import android.app.Application
import timber.log.Timber

class PusherApplication: Application() {
    fun OnCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}