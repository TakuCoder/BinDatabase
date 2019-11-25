package com.thiyagu.bindata;

import android.app.Activity;
import android.app.Application;

import com.thiyagu.bindata.di.component.ApplicationComponent;
import com.thiyagu.bindata.di.component.DaggerApplicationComponent;
import com.thiyagu.bindata.di.module.ContextModule;

public class MyApplication extends Application {
ApplicationComponent applicationComponent;

@Override
public void onCreate() {
    super.onCreate();


    applicationComponent = DaggerApplicationComponent.builder().contextModule(new ContextModule(this)).build();
    applicationComponent.injectApplication(this);
}
public static MyApplication get(Activity activity)
{

    return (MyApplication)activity.getApplication();
}
public ApplicationComponent getApplicationComponent()
{


    return this.applicationComponent;
}
}
