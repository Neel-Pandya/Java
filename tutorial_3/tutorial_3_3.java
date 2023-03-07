//3. write a java program that define the class circle with 2 constructor 
//1.accept the value of radius of circle 
//2.accept two values of a cordinate of circle and display their values
import java.util.Scanner;
class circle{
	final float pi = 3.14f;
	int X,Y;
	double area,radius;
	circle(double radius){
		this.radius = radius;
		area = pi * radius * radius;
		area();
	}
	circle(int X , int Y){
		this.X = X;
		this.Y = Y;
		printCor();
	}
	void printCor(){
		System.out.println("X cordinate = " + X);
		System.out.println("Y cordinate = " + Y);
	}
	void area(){
		System.out.println("Area of circle : " + area);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r = sc.nextDouble();
		
		System.out.println("Enter x and y cordinate : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		circle obj = new circle(r);
		circle obj2 = new circle(x,y);
	}
}