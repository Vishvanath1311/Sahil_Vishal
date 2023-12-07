package demo.services;

import java.util.Scanner;

import demo.beans.Person;

public class personService {

	public void acceptdata(Person[] personarr) {
		Scanner sc=new Scanner (System.in);
		
		for(int i=0;i<personarr.length;i++) {
			System.out.println("Enter id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter age");
			int age=sc.nextInt();
			
			personarr[i]=new Person(id,name,age);
		}
		
	}

	public void selectionSort(Person[] personarr) {
		
		for(int i=0;i<personarr.length;i++) {
			int min_idx=i;
			for(int j=i+1;j<personarr.length;j++) {
				if(personarr[j].getAge()<personarr[min_idx].getAge());
				min_idx=j;
			}
			Person temp=personarr[i];
			personarr[i]=personarr[min_idx];
			personarr[min_idx]=temp;
		
		}

	}
}
