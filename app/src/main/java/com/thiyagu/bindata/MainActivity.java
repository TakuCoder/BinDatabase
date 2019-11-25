package com.thiyagu.bindata;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;

import com.thiyagu.bindata.models.Bininfo;
import com.thiyagu.bindata.mvp.MainActivityContract;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
RelativeLayout root_layout;
    AnimationDrawable anim;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        root_layout = findViewById(R.id.root_layout);
        //AnimationDrawable animDrawable = new AnimationDrawable();

        anim= (AnimationDrawable) root_layout.getBackground();
        anim.setEnterFadeDuration(6000);
        anim.setExitFadeDuration(2000);

    }
    @Override
    protected void onResume() {
        super.onResume();
        if (anim != null && !anim.isRunning())
            anim.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        if (anim != null && anim.isRunning())
            anim.stop();
    }

    @Override
    public void showData(Bininfo bininfo) {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showComplete() {

    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }
}
