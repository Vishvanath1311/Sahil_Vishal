package SinglyListMain;

import java.util.Scanner;
class SinglyList{
	static class Node{
		private int data;
		private Node next;
		public Node() {
			data=0;
			next=null;
		}
		public Node(int val) {
			data=val;
			next=null;
		}
	}
	private Node head;
	SinglyList(){
		head=null;
	}
	public void display() {
		System.out.println("List: ");
		if(head==null) { //no need of this condition as we are checking the same condition in below condition itself. 
			System.out.println("List is Empty, Nothing to display");
		}else {
			Node trav=head;
			while(trav!=null) {
				System.out.println(trav.data);
				trav=trav.next;
			}	
			}
		}
	
	public void addFirst(int val) {
		Node newnode=new Node(val);
		if(head==null){
			head=newnode;
		}else{
			newnode.next=head;
			head=newnode;
		}
		
		}
	public void addlast(int val) {
		Node newnode=new Node(val);
		Node trav=head;
		if(head==null) {
			head=newnode;
		}else {
			while(trav.next!=null) {
				trav=trav.next;
			}
			trav.next=newnode;
		}
	}
	public void addAtPos(int val, int pos) {
		
		Node newnode=new Node(val);
		Node trav=head;
		if(head==null ||pos<=1) {
			head=newnode;
		}else {		
		for(int i=1;i<pos-1;i++) {
			trav=trav.next;
		}
		newnode.next=trav.next;
		trav.next=newnode;
		}	
	}	
}

public class SinglyListMain{

	public static void main(String[] args) {
		SinglyList sl=new SinglyList();
		Scanner sc=new Scanner (System.in);
		int choice=0;
		do {
		System.out.println("\n0.Exit\t1.Display\t2.Add First\t3.Add Last\t4.Add At Pos\t5.Del First\n6.Del Last\t7.Del At Pos");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			sl.display();
			break;
		case 2 :
			System.out.println("Enter the element to add");
			int val=sc.nextInt();
			sl.addFirst(val);
			break;
		case 3:
			System.out.println("Enter the element to add");
			val=sc.nextInt();
			sl.addlast(val);
			break;
		case 4:
			System.out.println("Enter the element to add");
			val=sc.nextInt();
			System.out.println("Enter the position");
			int pos=sc.nextInt();
			sl.addAtPos(val,pos);
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 0:
			System.out.println("Thanks for visiting");
			sc.close();
			break;
		default:
		System.out.println("Enter the valid choice");
		}
			
		}while(choice!=0);

	}

	

}
