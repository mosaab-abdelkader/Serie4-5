package org.douifi.Exercice10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Exo10 {

	public static void main(String[] args) {
		
	
		List<String> strings = Arrays.asList("one", "two","three","four");
		// 1
		//Function<String, String> identity = (String s) -> s ; 
		Function<String, String> toUpper = s -> s.toUpperCase();
		for (String string : strings) {
			System.out.println(string + " upperCase is : "+ toUpper.apply(string)) ; 
		}
		// 2
		System.out.println("\n");
		Function<String, String> nullToEmpty = 	(String s) -> s == null ? "" : s;
		List <String> strings2 = Arrays.asList("Jan","Feb",null,"Apr","May",null);
		for (String s : strings2) {
			System.out.println(s + " : Return the same or turn it to empty if null ? " + nullToEmpty.apply(s));
		}
		// 3
		System.out.println("\n");// 
		Function<String, Integer> lengthString = s-> s == null ? 0 : s.length()  ;
		List <String> strings3 = Arrays.asList("Juane","Fabio",null,"Alene","Mamido",null);
		for (String s : strings3) {
			System.out.println(s + " : Return length or return zero if null ? " + lengthString.apply(s));
		}
		// 4
		System.out.println("\n");
		Function<String, String> brackets = 	 s -> s == null ? "(  )" : ("( "+s+" )");
		List <String> strings4 = Arrays.asList("Jan","Feb",null,"Apr","May",null);
		for (String s : strings4) {
			System.out.println(s + " :  String betwin brackets -> " + brackets.apply(s));
		}
		//5
		System.out.println("\n");
		//cherche la chaine 2 dans la chaine 1
		BiFunction<String , String, Integer> indexOf = 
				( text ,  word ) -> text.indexOf(word);

			System.out.println ("nj dans bonjour : " + indexOf.apply("bonjour", "nj"));
			System.out.println ("soi dans Bonsoir  : " + indexOf.apply("Bonsoir ", "soi"));
			System.out.println ("Hello dans Bonsoir  : " + indexOf.apply("Bonsoir ", "Hello"));
		//5
		System.out.println("\n");
		Function<String , Integer> spetialIndexOf = 
				( word  ) -> ("abcdefghi").indexOf(word);

			System.out.println ("de dans abcdefghi : " + spetialIndexOf.apply( "de"));
			System.out.println ("soi dans abcdefghi  : " + spetialIndexOf.apply( "soi"));
			System.out.println ("ef dans abcdefghi  : " + spetialIndexOf.apply( "ef"));

	
	}

}
