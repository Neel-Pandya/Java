//Write a java application that implements the concept of method overloading.
class method_overloading{
	public void print(){
		System.out.println("print with no args");
	}
	public void print(int a){
		System.out.println("print with one integer arg");

	}
	public void print(int a, int b){
		System.out.println("print with 2 int args");
	}
	public static void main(String[] args) {
		method_overloading obj = new method_overloading();
		obj.print(3,4);
		obj.print(3);
		obj.print();
	}
}