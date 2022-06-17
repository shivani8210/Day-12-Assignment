package com.shi.q2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
		
		Demo d = new Demo();
		Citizen c = new Citizen();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name- ");
		String x = sc.nextLine();
		System.out.println("Enter AadharNumber- ");
		String y = sc.nextLine();
		System.out.println("Enter MobileNumber- ");
		String z = sc.nextLine();
		
		if(d.validation("name","aadharNumber","mobileNumber")){
            c.setName("name");
            c.setAadharNumber("aadharNumber");
            c.setMobileNumber("mobileNumber");
            System.out.println(c.getName());
            System.out.println(c.getMobileNumber());
            System.out.println(c.getAadharNumber());
		
		}

	}

	private boolean validation(String name, String aadharNumber, String mobileNumber) {
		
		if(Pattern.matches("[a-zA-Z]{3,8}",name)) {
        }
		else {
            System.out.println("Name should be alphabetic and length should be 3 to 16");
            return false;
        }

		if(Pattern.matches("[\\d]{12}",aadharNumber)) {
		}
		else {
			System.out.println("adharNumber should be numeric length should be 12");
			return false;
		}
        if(Pattern.matches("[9876]{1}[0-9]{9}",mobileNumber)) {
        }
        else {
            System.out.println("mobileNumber start should 9 8 7 6 length should be 10");
            return false;
        }
        return true;
	}
	
}