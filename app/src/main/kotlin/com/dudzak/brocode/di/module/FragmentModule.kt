package com.dudzak.brocode.di.module

import com.dudzak.brocode.ui.main.MainFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun provideMainFragment(): MainFragment

}