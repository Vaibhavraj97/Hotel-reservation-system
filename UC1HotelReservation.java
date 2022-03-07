package com.bridgelabz.HotelReservation;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

	
	class Hotel{
	  
	    private String hotelName;
	    private int hotelPriceWeekDays;
	    private int hotelPriceWeekEnds;
	
	  
	    @Override
	    public String toString() {
	        return "\n"+"Hotel{" +
	                "hotelName='" + hotelName + '\'' +
	                ", hotelPriceWeekDays=" + hotelPriceWeekDays +
	                ", hotelPriceWeekEnds=" + hotelPriceWeekEnds +
	                
	                '}';
	    }
	    public String getHotelName() {
	        return hotelName;
	    }
	    public Hotel(){};

	    public void setHotelName(String hotelName) {
	        this.hotelName = hotelName;
	    }

	    public int getHotelPriceWeekDays() {
	        return hotelPriceWeekDays;
	    }

	    public void setHotelPriceWeekDays(int hotelPriceWeekDays) {
	        this.hotelPriceWeekDays = hotelPriceWeekDays;
	    }

	    public int getHotelPriceWeekEnds() {
	        return hotelPriceWeekEnds;
	    }

	    public void setHotelPriceWeekEnds(int hotelPriceWeekEnds) {
	        this.hotelPriceWeekEnds = hotelPriceWeekEnds;
	    }


	    public Hotel(String hotelName, int hotelPriceWeekDays, int hotelPriceWeekEnds, int hotelRating, int hotelRewardWeekDays, int hotelRewardWeekEnds) {
	        this.hotelName = hotelName;
	        this.hotelPriceWeekDays = hotelPriceWeekDays;
	        this.hotelPriceWeekEnds = hotelPriceWeekEnds;
	    
	     	    }

	}

	
