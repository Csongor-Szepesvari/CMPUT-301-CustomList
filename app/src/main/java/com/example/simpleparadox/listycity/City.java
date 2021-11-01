package com.example.simpleparadox.listycity;

import androidx.annotation.Nullable;

public class City implements Comparable<City>{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    String getCityName(){
        return this.city;
    }

    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city){
        return this.city.compareTo(city.getCityName());
    }


    @Override
    public boolean equals(@Nullable Object obj) {
        if (obj == this){
            return true;
        }

        if(!(obj instanceof City)){
            return false;
        }
        City city = (City) obj;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }
}
