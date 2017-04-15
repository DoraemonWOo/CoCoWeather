package com.example.administrator.cocoweather.database;

/**
 * Created by Administrator on 2017/4/15.
 */
import org.litepal.crud.DataSupport;

public class Province extends org.litepal.crud.DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName=provinceName;
    }
    public int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }
}
