package com.like.entity;

import com.util.ExcelImport;

import java.util.Date;

/**
 * Created by Lovelyz
 * on 2019-05-13 17:17
 * 导入Excel
 * 实体类
 */
public class XDiningHallimport {
    /**
     *菜单
     */
    @ExcelImport(columnIndex = 0)
    private String srecipe;


    /**
     * 早中晚
     */
    @ExcelImport(columnIndex = 1)
    private String skind;

    /**
     * 时间
     */
    @ExcelImport(columnIndex = 2)
    private String ddate;

    public String getDdate() {
        return ddate;
    }

    public void setDdate(String ddate) {
        this.ddate = ddate;
    }

    public String getSrecipe() {
        return srecipe;
    }

    public void setSrecipe(String srecipe) {
        this.srecipe = srecipe;
    }

    public String getSkind() {
        return skind;
    }

    public void setSkind(String skind) {
        this.skind = skind;
    }




}


