package com.thiyagu.bindata.repo.remote;

import com.thiyagu.bindata.models.Bininfo;

import java.util.List;

import retrofit2.http.GET;

public interface APIInterface {

//https://safe-hollows-39263.herokuapp.com/
    @GET("checkbin/{id}")
    public List<Bininfo> getBinInfo(String id);
}
