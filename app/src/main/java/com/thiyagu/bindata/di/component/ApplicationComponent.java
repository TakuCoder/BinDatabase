package com.thiyagu.bindata.di.component;


import android.content.Context;

import com.thiyagu.bindata.MyApplication;
import com.thiyagu.bindata.di.module.ContextModule;
import com.thiyagu.bindata.di.module.RetrofitModule;
import com.thiyagu.bindata.di.qualifier.ApplicationContext;
import com.thiyagu.bindata.di.scopes.ApplicationScope;
import com.thiyagu.bindata.repo.remote.APIInterface;

import dagger.Component;
import dagger.Module;

@ApplicationScope
@Component(modules = {ContextModule.class, RetrofitModule.class})
public interface ApplicationComponent {

    APIInterface getApiInterface();

    @ApplicationContext
    Context getContext();

    void injectApplication(MyApplication myApplication);



}
