package com.ymd.flutter_audio_capture_example

import android.app.Application

class MyApplication: Application(){

    companion object {
        @JvmStatic
        lateinit var instance: MyApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}