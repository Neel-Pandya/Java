//create a class rectangle that uses variables length and width and method area
//that count area of rectangle and display its value;
import java.util.Scanner;
class rectangle{
	static int length , width , result;
	static int area(int l , int w){
		length = l;
		width = w;
		return result = length * width;
	}
	static void display(){
		System.out.println("Area of rectangle " + result);
	}
	public static void main(String[] args){
		int l , w;
		rectangle r = new rectangle();
		System.out.print("Enter length and width : ");
		Scanner sc = new Scanner(System.in);
		l = sc.nextInt();
		w = sc.nextInt();
		area(l,w);
		display();
		}
}