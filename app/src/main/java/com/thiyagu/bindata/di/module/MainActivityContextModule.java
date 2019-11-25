package com.thiyagu.bindata.di.module;

import android.content.Context;

import com.thiyagu.bindata.MainActivity;
import com.thiyagu.bindata.di.qualifier.ActivityContext;
import com.thiyagu.bindata.di.qualifier.ApplicationContext;
import com.thiyagu.bindata.di.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityContextModule {

    private MainActivity mainActivity;
    private Context context;


    public MainActivityContextModule(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
        this.context = mainActivity;
    }

    @Provides
    @ActivityScope
    @ActivityContext
    public MainActivity providesMainActivity()
    {

        return mainActivity;
    }
}
