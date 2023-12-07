package demo.test;

import java.util.Arrays;

import demo.beans.Person;
import demo.services.personService;

public class TestMain {

	public static void main(String[] args) {
		personService ps=new personService();
		Person[] personarr=new Person[3];
		
		ps.acceptdata(personarr);
		System.out.println(Arrays.toString(personarr));
		
		ps.selectionSort(personarr);
		System.out.println(Arrays.toString(personarr));

	}
	
}
