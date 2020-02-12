package com.emlhy.daggerdemo.di;

import com.emlhy.daggerdemo.di.auth.AuthModule;
import com.emlhy.daggerdemo.di.auth.AuthViewModelsModule;
import com.emlhy.daggerdemo.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {AuthViewModelsModule.class, AuthModule.class})
    abstract AuthActivity contributeAuthActivity();

}
