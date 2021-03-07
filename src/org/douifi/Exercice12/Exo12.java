package org.douifi.Exercice12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		//words.add("aix");
		
		System.out.println(" # Liste :"+ words.size());
		words.forEach(s -> System.out.println(" - "+ s ));
		//Q2
		//Predicate <String> isPair = 	 s -> (s.length()%2 == 0 ) ;
		// words1 copy of words to work on in this question
		List<String> words1 = new ArrayList<>(words);
		for (int i = words1.size()-1; i>=0 ; i--) {
			String value = words1.get(i);
			int len = value.length();
			if(len%2==0) {
				words1.remove(i);
			}
			//words1.removeIf(isPair.test(value));
		}
		System.out.println("Liste without words of  pair length :");
		System.out.println(" # Liste :"+ words1.size());
		words1.forEach(s -> System.out.println( s ));
		//Q3

		words.replaceAll(String :: toUpperCase);
		System.out.println("\n Liste in uppercase :");
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
			System.out.println("does < "+ string +" > start with  vowel ? "+isVoyelle.test(string));
			
		}
		//3b
		List<String> words2 = new ArrayList<>(words);

		System.out.println("\n Upper words start with vowel ");
		for (String string : words2) {
			
			if(isVoyelle.test(string)) System.out.println( string.toUpperCase());
			else System.out.println(string);
			
		}
		//Q4

		Comparator<String> cmpByNameLength = Comparator.comparing(s -> s.length());
		System.out.println("\n Liste of words sorted by length :");
		Collections.sort(words,cmpByNameLength);
		words.forEach(s -> System.out.println( s ));
		
		//Q5

		Comparator<String> cmpByAlphab = (s1,s2)-> s1.compareTo(s2);
		
		Comparator<String> cmpString = cmpByNameLength.thenComparing(cmpByAlphab);
		System.out.println("\n Liste of words sorted :");
		Collections.sort(words,cmpString);
		words.forEach(s -> System.out.println( s ));
		
	}

}
