package com.thiyagu.bindata.mvp;

import com.thiyagu.bindata.models.Bininfo;

public interface MainActivityContract {

interface View{


    void showData(Bininfo bininfo);
    void showError(String message);
    void showComplete();
    void showProgress();
    void hideProgress();
}
interface Presenter
{

    void loadDate();
}

}
