package org.douifi.Exercice12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1	
		List<String> words = new ArrayList<>();
		words.add("one");
		words.add("two");
		words.add("three");
		words.add("four");
		words.add("five");
		words.add("six");
		words.add("seven");
		words.add("eight");
		words.add("nine");
		words.add("ten");
		words.add("eleven");
		words.add("twelve");
		
		System.out.println(" # Liste :"+ words.size());
		words.forEach(s -> System.out.println(" - "+ s ));
		//Q2
		//Predicate <String> isPair = 	 s -> (s.length()%2 == 0 ) ;
		for (int i = words.size()-1; i>=0 ; i--) {
			String value = words.get(i);
			int len = value.length();
			if(len%2==0) {
				words.remove(i);
			}
			//words.remove(isPair.test(value));
		}
		System.out.println("Liste without pair length :");
		System.out.println(" # Liste :"+ words.size());
		words.forEach(s -> System.out.println( s ));
		//Q3

		words.replaceAll(String :: toUpperCase);
		System.out.println("Liste in uppercase :");
		words.forEach(s -> System.out.println( s ));
		//3a
		words.replaceAll(String :: toLowerCase);
		Predicate <String> isVoyelleA = 	(String s) -> s.charAt(0) == 'a' ;
		Predicate <String> isVoyelleE = 	(String s) -> s.charAt(0) == 'e' ;
		Predicate <String> isVoyelleY = 	(String s) -> s.charAt(0) == 'y' ;
		Predicate <String> isVoyelleU = 	(String s) -> s.charAt(0) == 'u' ;
		Predicate <String> isVoyelleI = 	(String s) -> s.charAt(0) == 'i' ;
		Predicate <String> isVoyelleO = 	(String s) -> s.charAt(0) == 'o' ;
		
		Predicate <String> isVoyelle = 	isVoyelleA.or(isVoyelleE.or(isVoyelleY
												  .or(isVoyelleU.or(isVoyelleI
												  .or(isVoyelleO))))) ;
		
		for (String string : words) {
			System.out.println("does "+ string +" start with  vowel ?"+isVoyelle.test(string));
			
		}
		//3b
		for (int i=0;i<words.size();i++) {
			String string =words.get(i); 
			 String s = string.toUpperCase();
			 char U = s.charAt(0);
			 System.out.println("Uper"+ U);
			if(isVoyelle.test(string)) (words.get(i)).replace(string.charAt(0), U);
		}
		words.forEach(s -> System.out.println( s ));
		//Q4
		
		
		
	}

}
