package com.bl;

import java.util.Scanner;

class AddressBook
{
	public static void main(String[]args) 
	{
		System.out.println("Welcome to Address Book");
		Data d =new Data();
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
		d.readData(d);
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



