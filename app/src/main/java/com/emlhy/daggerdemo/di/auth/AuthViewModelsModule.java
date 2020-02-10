package com.emlhy.daggerdemo.di.auth;

import androidx.lifecycle.ViewModel;

import com.emlhy.daggerdemo.di.ViewModelKey;
import com.emlhy.daggerdemo.ui.auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule  {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthVeiwModel(AuthViewModel viewModel);
}
