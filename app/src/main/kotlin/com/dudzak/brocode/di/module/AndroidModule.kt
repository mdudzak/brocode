package com.dudzak.brocode.di.module

import android.app.Application
import android.content.Context
import android.content.res.Resources
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class AndroidModule {

    @Binds
    internal abstract fun bindContext(application: Application): Context
}