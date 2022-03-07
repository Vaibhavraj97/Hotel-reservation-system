package com.bridgelabz.HotelReservation;
import org.junit.Assert;
import org.junit.Test;
public class HotelReservationTest {

	@Test
	public void GivenHotelName_ShouldReturnProperHotelName() {
		HotelReservation hotelReservation = new  HotelReservation();
		hotelReservation.addHotel1("LakeWood", 110, 90);
		hotelReservation.addHotel1("BridgeWood", 150, 50);
	    hotelReservation.addHotel1("RidgeWood", 220, 150);
		String hotelName = hotelReservation.hotelDetails.get(0).getHotelName();
		Assert.assertEquals("LakeWood",hotelName);
		
	}
	
}
