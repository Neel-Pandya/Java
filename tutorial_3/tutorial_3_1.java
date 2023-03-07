//1. write a java program to create a class student having following data members 
//roll number 
//name
//subject1
//subject2
//subject3
//display the roll number and the marks of student using the concept of class and object.


import java.util.Scanner;
class student{
	int roll,sub1,sub2,sub3;
	String name = "";
	void insertData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student : ");
		name =  sc.nextLine();
		System.out.println("Enter roll_no of student : ");
		roll = sc.nextInt();
		
		System.out.println("Enter marks of subject 1");
		sub1 = sc.nextInt();
		System.out.println("Enter marks of subject 2");
		sub2 = sc.nextInt();System.out.println("Enter marks of subject 3");
		sub3 = sc.nextInt();
		
		
	}
	void printData(){
		
		System.out.println("Roll no of student : "+ roll );
		System.out.println("Name of student : "+name);
		System.out.println("Marks of subject 1 : " + sub1);
		System.out.println("marks of subject 2 : " + sub2);
		System.out.println("Marks of subject 3 : " + sub3); 
	}
	public static void main(String[] args){
		student obj = new student();
		obj.insertData();
		obj.printData();
	}
	
}