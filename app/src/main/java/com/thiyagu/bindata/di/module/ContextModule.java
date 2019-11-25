package com.thiyagu.bindata.di.module;


import android.content.Context;

import com.thiyagu.bindata.di.qualifier.ApplicationContext;
import com.thiyagu.bindata.di.scopes.ApplicationScope;

import java.security.PrivateKey;
import java.util.PriorityQueue;

import dagger.Module;
import dagger.Provides;

@Module
public class ContextModule {
    private Context context;


    public ContextModule(Context context)
    {

        this.context = context;
    }


    @Provides
    @ApplicationScope
    @ApplicationContext
   public Context provideContext()
    {

        return context;
    }
}
