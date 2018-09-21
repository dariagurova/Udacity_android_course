package com.example.android.quakereport;

public class EarthQuake {


    private String mag;

    private String place;

    private long date;

    public EarthQuake(String magnit, String loc, long time){
        mag = magnit;
        place = loc;
        date = time;
    }


    public String getMag(){
        return mag;
    }

    public String getPlace(){
        return place;
    }

    public long getDateMiliseconds(){
        return(date);
    }

}
