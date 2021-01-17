package collection;

import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.HashMap;

import com.app.core.Buddy;
//collection class to populate buddy data
public class CollectionBuddy {
	//Array Collection
	public static ArrayList<Buddy> populateData() {
	
		ArrayList<Buddy> arr=new ArrayList<Buddy>();
	Buddy  b1=new Buddy("shalabh@gmail", "shalabh", "9329646770", parse("1998-05-28"), "Bhilai");
	arr.add(b1);
	
    Buddy  b2=new Buddy("mintu@gmail", "mintu", "8770782232", parse("1997-05-05"), "Durg");
    arr.add(b2);
    
    Buddy  b3=new Buddy("yash@gmail", "yash", "7389614473", parse("1995-12-12"), "Raipur");
    arr.add(b3);
    
    Buddy  b4=new Buddy("guddu@gmail", "guddu", "75874879005", parse("1999-12-12"), "Goa");	
	arr.add(b4);
	
	Buddy  b5=new Buddy("babblu@gmail", "babblu", "7986543146", parse("1998-05-28"), "Bhilai");
	arr.add(b5);
	
    Buddy  b6=new Buddy("kaaleen@gmail", "kaaleen", "78966541230", parse("1997-05-05"), "Durg");
    arr.add(b6);
    
    Buddy  b7=new Buddy("Ganesh@gmail", "Ganesh", "6547981325", parse("1995-12-12"), "Raipur");
    arr.add(b7);
    
    Buddy  b8=new Buddy("gutthi@gmail", "gutthi", "3216549874", parse("1999-12-12"), "Goa");	
	arr.add(b8);
	
    return arr;
	}
	//Map Collection
	public static HashMap<String,Buddy> populateMapData(ArrayList<Buddy> arr){
		HashMap<String,Buddy> map=new HashMap<>(); 
		for(Buddy b: arr)
		map.put(b.getEmail(), b);
		return map;
		
	}
}
