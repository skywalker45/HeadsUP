package com.example.danie.headsup;

/**
 * Created by Blaker on 4/30/2017.
 */

public class CalendarEvent {



    private String month;
    private String day;
    private String title;

    public CalendarEvent(String month, String day, String title){

        this.month = month;
        this.day = day;
        this.title = title;

    }


    public void insertEvent(){

    }


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }




}
