package org.douifi.Exercice9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exo9 {

	public static void main(String[] args) {
		//1
		Predicate <String> moreThan4 = 	(String s) -> s == null ? false : s.length() > 4;
		List <String> strings = Arrays.asList("one","two","three","five",null);
		for (String s : strings) {
			System.out.println(s + " : more than 4 char ? " + moreThan4.test(s));
		}
		System.out.println("\n");
		//2
		Predicate <String> notEmpty = 	(String s) -> s == null ? false : true ;
		List <String> strings1 = Arrays.asList("Jan","Feb",null,"Apr","May",null);
		for (String s : strings1) {
			System.out.println(s + " : Is this String not empty ? " + notEmpty.test(s));
		}
		System.out.println("\n");
		//3
		Predicate <String> startWithJ = 	(String s) -> s == null ? false : (s.indexOf("J")==0) ;
		List <String> strings2 = Arrays.asList("Jan","Feb",null,"Apr","May","Jun");
		for (String s : strings2) {
			System.out.println(s + " : Start with J ? " + startWithJ.test(s));
		}
		System.out.println("\n");
		//4
		Predicate <String> exact5 = 	(String s) -> s == null ? false : s.length() == 5 ;
		List <String> strings3 = Arrays.asList("Polo","Ibiza",null,"BMW","Audi","Forde");
		for (String s : strings3) {
			System.out.println(s + " : Exactly 5 char ? " + exact5.test(s));
		}
		System.out.println("\n");
		//5
		Predicate <String> startJ_exact5 =  startWithJ.and(exact5) ;
		List <String> strings4 = Arrays.asList("Juane","Pedro",null,"Jouba","Audi","jordie");
		for (String s : strings4) {
			System.out.println(s + " : Start with J and has Exactly 5 char ? " + startJ_exact5.test(s));
		}
			

	}

}
