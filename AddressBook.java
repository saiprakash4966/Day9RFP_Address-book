package com.bl;

import java.util.Scanner;

class AddressBook
{
	public static void main(String[]args) 
	{
		System.out.println("Welcome to Address Book");
		Data d =new Data();
		DataNew DN=new DataNew();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first Name");
		d.firstName =sc.next();
		System.out.println("enter Last name");
		d.lastName =sc.next();
		System.out.println("enter address");
		d.address = sc.next();
		System.out.println("enter mail id");
		d.email = sc.next();
		System.out.println("enter zip");
		d.zip = sc.next();
		System.out.println("enter city");
		d.city = sc.next();
		System.out.println("enter state");
		d.state = sc.next();
		System.out.println("enter  new person Name");
		DN.NewPerson_firstName =sc.next();
		System.out.println("enter  new person lastname");
		DN.NewPerson_lastName =sc.next();
		System.out.println("enter  new person address");
		DN.NewPerson_address =sc.next();
		System.out.println("enter  new person email");
		DN.NewPerson_email =sc.next();
		System.out.println("enter  new person zip");
		DN.NewPerson_zip =sc.next();
		System.out.println("enter  new person city");
		DN.NewPerson_city =sc.next();
		System.out.println("enter  new person state");
		DN.NewPerson_state =sc.next();
		d.readData(d);
		DN.readDataNew(DN);
		
	}

}
class Data
{
    String firstName;
    String lastName;
    String address;
    String email;
    String zip;
    String city;
    String state;
    
        
    
    public void readData(Data d)
    {
        
    }
}

class DataNew
{
	String NewPerson_firstName;
	String NewPerson_lastName;
    String NewPerson_address;
    String NewPerson_email;
    String NewPerson_zip;
    String NewPerson_city;
    String NewPerson_state;
	public static void readDataNew(DataNew DN)
	{
		
	}
}	
	

