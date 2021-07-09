package com.addressbookworkshop;

/**
 *************************************************************************************************************** 
 * Purpose: This Class is Implemented to Create Person info  
 * @author ZameerAhamad Ron <zameerraone96@gmail.com>
 * @version 1.4
 * @since 09-07-2021
 *****************************************************************************************************************
 **/
public class ContactInfo {
	// Getting the Pesrson details using String syntax..
	
	String first_Name;
	String last_Name;
	String address;
	String city;
	String state;
	int zip;
	long phone;
	String email;
	private String firstName;
	private String lastName;
	
	ContactInfo(String firstname, String lastname, String address, String city, String state, 
													int zip, long phone, String mail)
		{
	
		//Using POJO to Implement the Person details..
	
		this.first_Name=firstname;
		this.last_Name=lastname;	
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone=phone;
		this.email=mail;
	}
	
	public String getFirstName() {
        return getFirstName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return getFirstName();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getNumber() {
        return phone;
    }

    public void setNumber(long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
	public String toString () {
		
		//Returning of the Details..
		return this.firstName + " " + this.lastName + ":" + this.phone + "," + this.email + ":"
        + " address:" + this.address + ", state:" + this.state + ", city:" + this.city + ", zip:"
        + this.zip;
	}
		
}
