package com.dudzak.brocode.di.component

import android.app.Application
import com.dudzak.brocode.App
import com.dudzak.brocode.di.module.*
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Dagger AppComponent
 */
@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidModule::class,
    ActivityModule::class,
    NetworkModule::class,
    FragmentModule::class,
    ViewModelModule::class,
    DbModule::class
])
interface AppComponent: AndroidInjector<App> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder
        fun build(): AppComponent
    }
}