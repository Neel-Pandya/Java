//Write a java application that implements the concept of method overriding.
class sample1{
	public void set(){
		System.out.println("set method of sample1 class");
	}

}
class sample2 extends sample1{
	public void set(){
		System.out.println("set method of sample2 class");
	}
}
class method_overriding {

	public static void main(String[] args) {
		sample2 obj = new sample2();
		obj.set();
	}
}