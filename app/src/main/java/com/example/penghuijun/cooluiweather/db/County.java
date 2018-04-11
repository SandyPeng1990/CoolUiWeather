package com.example.penghuijun.cooluiweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by penghuijun on 2018/4/10.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public String getCountyName() {
        return countyName;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setWeatherId(int weatherId){
        this.weatherId  = weatherId;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

}
