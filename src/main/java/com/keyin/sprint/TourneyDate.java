package com.keyin.sprint;

public class TourneyDate{

    int year;
    int month;
    int day;

    public TourneyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;

    }

    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setDay(int day){
        this.day = day;
    }
    public String toString(){
        return(year + "-" + month + "-" + day);

    }




}
