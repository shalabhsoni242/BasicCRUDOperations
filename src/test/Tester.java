package test;
//tester class 
import static collection.CollectionBuddy.populateData;
import static collection.CollectionBuddy.populateMapData;

import java.time.LocalDate;
import static java.time.LocalDate.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import static utils.UtilityMethods.*;
import com.app.core.Buddy;

public class Tester {

	public static void main(String[] args) {
		
		
		try(Scanner sc =new Scanner(System.in)){
		//hashmap and popualate buddy data
		HashMap<String,Buddy> bmap=new HashMap<>();
		bmap=populateMapData(populateData());		

		boolean flag=true;
		while(flag) {
			System.out.println("***********WELCOME TO MY BUDDIES************\n1.Add new Buddy\n2.Search Buddy by Email\n3.Delete Buddy by email\n4.Display all my Buddies\n5.Display all buddy wrt given dob\n6.Exit\nEnter your choice");
			
			try{
			switch (sc.nextInt()) {
			case 1://add new buddy
				System.out.println("Enter: Email, Name, PhoneNo, Date of Birth, &,  City");
                 String emailId = validateEmail(sc.next());
                 checkDups(bmap,emailId);
                 String Name=validateName(sc.next());
                 String phone=validatePhone(sc.next());
                 checkPhoneNo(bmap,phone);
                 LocalDate date=parse(sc.next());
                 checkDob(date);
                 String City=sc.next();
                 bmap.put(emailId, new Buddy(emailId,Name,phone,date,City));
                 System.out.println("Buddy Added SuccesFully");
				break;
				
			case 2://Search Buddy by Email
				System.out.println("Enter Email of Buddy to search");
				System.out.println(bmap.get(sc.next()));
				break;
				
			case 3://Delete Buddy by email
				 System.out.println("Enter Email of Buddy to Delete");
			        bmap.remove(sc.next());
			        System.out.println("Buddy Removed Succesfully");
				break;
				
			case 4://Display all my Buddies
              System.out.println("Details of all buddies ");
              bmap.values().forEach(System.out :: println);
				break;
				
			case 5://display all buddy wrt given dob
				 System.out.println("Buddy Details sorted wrt Date of Birth :");
			        bmap.values().stream().sorted(Comparator.comparing(Buddy :: getDob)).forEach(System.out :: println);
				break;
			case 6:
               flag=false;
				break;

			}
		}
	
		catch(Exception e) {
			e.printStackTrace();
		}
		sc.nextLine();
	}
		}
	}

}
