package org.douifi.Exercice11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exo11 {

			
			public static void main(String[] args) {
				List <String> strings = Arrays.asList(
						
						"one","two","three","four","five","six",
						"seven","eight","nine","ten"); 
				
				// 1
				Comparator <String> cmp = 
						(String s1, String s2) ->  s1.length() - s2.length(); 
												
				strings.forEach((String s) -> System.out.println(s + ""));
				strings.sort(cmp);
				System.out.println("\nSorted by length : \n");
				strings.forEach((String s) -> System.out.println(s + ""));
				
				List<Person> persons = Arrays.asList(
						 new Person("Rikardo","Kaka",41),
						 new Person("Lio","Messi",31),
						 new Person("Michel","Jakson",41),
						 new Person("Michel","Amande",41),
						 new Person("Michel","Zidane",41),
						 new Person("Thom","Hanks",51),
						 new Person("Harry","Jakson",61),
						 new Person("Mo","Sun",24));
				
				
				// 2
				Comparator <Person> cmpPerFirstName = Comparator.comparing(p -> p.getFirstNameString());
				Comparator <Person> cmpPerLastName = Comparator.comparing(p -> p.getLastNameString());
//					
				Comparator <Person> cmpPer = Comparator.comparing((Person p) -> p.getLastNameString()).thenComparing(p -> p.getFirstNameString()) ;

				System.out.println("\nPersons : \n");
				persons.forEach((Person p) -> System.out.println(p + ""));			 						
				persons.sort(cmpPerLastName);		
						
				System.out.println("\nPersons Sorted by Lastname : \n");
				for(Person person : persons) {
					System.out.println(person );		
				}			 						
				persons.sort(cmpPerFirstName);		
						
				System.out.println("\nPersons Sorted by Firstname : \n");
				for(Person person : persons) {
					System.out.println(person );		
				}
				persons.sort(cmpPer);	
				System.out.println("\nPersons sorted: \n");
				persons.forEach((Person p) -> System.out.println(p + ""));			 						
				
				Comparator <Person> cmpPerInv = cmpPer.reversed() ;
				persons.sort(cmpPerInv);	
				System.out.println("\nPersons Sorted inverse : \n");
				persons.forEach((Person p) -> System.out.println(p + ""));	
				
				
				
				//Comparator <Person> cmpPerLastName = Comparator.comparing(p -> p.getLastNameString());
//				(Person per1, Person per2) -> {
//				   if(per1.getLastNameString().compareTo(per2.getLastNameString())==0){
//						
//						return per1.firstNameString.compareTo(per2.firstNameString);
//					}
//					    return per1.lastNameString.compareTo(per2.lastNameString);
//			   };
				
			}

//			@SuppressWarnings("unused")
//			private static Comparator<Person> reversed(Comparator<Person> cmpPer) {
//				// TODO Auto-generated method stub
//				return (Person per1, Person per2) -> -cmpPer.compare(per1,per2);
//			}	
			
}