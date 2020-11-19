package com.training.org;

public class Amenity {
 String amenity;
 public Amenity() {
	 this.amenity="";
 }
public Amenity(String amenity) {
	super();
	this.amenity = amenity;
}
public String getAmenity() {
	return amenity;
}
public void setAmenity(String amenity) {
	this.amenity = amenity;
}
@Override
public String toString() {
	return "Amenity [amenity=" + amenity + "]";
}
 
 
}
