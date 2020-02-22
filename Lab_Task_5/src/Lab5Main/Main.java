package Lab5Main;

import Lab5Student.*;
import Lab5Account.*;
import Lab5Book.*;
import Lab5Triangle.*;
import Lab5Contact.*;


public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("20-65-2", "Messi", "CS", 2.7);
		s1.showInfo();
		
		Account a1 = new Account("Brack", "12b", 0);
		a1.deposit(800);
		a1.withdraw(200);
		System.out.println(a1.getAccName() + " " + a1.getAcid()+" " + a1.getBalance());
		System.out.println();
		
		Book b1 = new Book("Copperfield", "Dickens", "23-m-09", "Novel", 5);
		b1.bookCounter();
		
		b1.showInfo();
		b1.addBookCopy(12);
		b1.showTotalBookInfi();
		System.out.println();
		Triangle t1 = new Triangle(9, 1, 3);
		t1.testTriangle();
		System.out.println();
		
		Contact c1 = new Contact("Lionel", "125c", 23, "018407217", 'M');
		c1.detectMobileOperator();
		System.out.println(c1.getPersonName()+" " +c1.getPersonId()+" " +c1.getMobileNumber()+ " " +c1.getGender()+ " " +c1.getAge());
		
	}

}
	
	
	

