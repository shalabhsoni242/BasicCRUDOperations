package utils;

import java.time.LocalDate;

import java.util.HashMap;

import com.app.core.Buddy;

import coustomExp.ValidateBuddyException;
// class for applying validations for respective costraints
public class UtilityMethods {
	
	//checking duplicates wrt key : email
	public static void checkDups(HashMap<String,Buddy> bmap,String email)
			throws  ValidateBuddyException
	{
	if(bmap.containsKey(email))
		throw new ValidateBuddyException("The same email already exists ") ;
	}
	
	//validating date of birth
	public static void checkDob(LocalDate date) throws  ValidateBuddyException
	{
		if(date.isAfter(LocalDate.now()))
			throw new ValidateBuddyException("Invalid Date of Birth");
	} 
	
	//cking duplicates wrt key : email
	public static void checkPhoneNo(HashMap<String,Buddy> bmap,String no)throws  ValidateBuddyException
	{
		for(Buddy b : bmap.values())
		{
			if(b.getPhone().equals(no))
				throw new   ValidateBuddyException("Phone number already Exists");
		}		
	}
	
	//validating email
	public static String validateEmail(String email) throws  ValidateBuddyException {
		String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
		if(email.matches(regex))		
			return email;
		else
			throw new ValidateBuddyException("Email invalid !!!!!!!!!!");
	}
	
	//validating name
	public static String validateName(String name) throws  ValidateBuddyException {
		if (name.length() < 3)
			throw new ValidateBuddyException("Name invalid !!!!!!!!!!");
		else
			return name;
	}
	
	//validating phone no
	public static String validatePhone(String phone) throws ValidateBuddyException
	{
		if(phone.length()<10)
			throw new ValidateBuddyException("Phone number is too short..");
		
		else if(phone.length()>10)
			throw new ValidateBuddyException("Phone number is too long..");
		
		else
			return phone;
	}
	
}
