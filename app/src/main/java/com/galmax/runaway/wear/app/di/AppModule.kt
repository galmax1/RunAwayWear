package com.galmax.runaway.wear.app.di

import com.galmax.runaway.wear.app.RunawayApp
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val appModule = module {

    single {
        (androidApplication() as RunawayApp).applicationScope
    }
}