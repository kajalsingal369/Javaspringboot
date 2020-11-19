package com.training.org;
import java.time.LocalTime;
import java.util.*;

public class Vendor {
	String name;
	String description;
	LocalTime openingTime, closingTime;
	ArrayList<File> images;
	ArrayList<Bookable> offers;
	ArrayList<Amenity> amneties;
	
public Vendor() {
	this.name="";
	this.description="";
    offers= new ArrayList<Bookable>();
    images= new ArrayList<File>();
    amneties=new ArrayList<Amenity>();
    }

public Vendor(String name, String description, LocalTime openingTime, LocalTime closingTime, ArrayList<File> images,
		ArrayList<Bookable> offers, ArrayList<Amenity> amneties) {
	super();
	this.name = name;
	this.description = description;
	this.openingTime = openingTime;
	this.closingTime = closingTime;
	this.images = images;
	this.offers = offers;
	this.amneties = amneties;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public LocalTime getOpeningTime() {
	return openingTime;
}

public void setOpeningTime(LocalTime openingTime) {
	this.openingTime = openingTime;
}

public LocalTime getClosingTime() {
	return closingTime;
}

public void setClosingTime(LocalTime closingTime) {
	this.closingTime = closingTime;
}

public ArrayList<File> getImages() {
	return images;
}

public void setImages(ArrayList<File> images) {
	this.images = images;
}

public ArrayList<Bookable> getOffers() {
	return offers;
}

public void setOffers(ArrayList<Bookable> offers) {
	this.offers = offers;
}

public ArrayList<Amenity> getAmneties() {
	return amneties;
}

public void setAmneties(ArrayList<Amenity> amneties) {
	this.amneties = amneties;
}


}