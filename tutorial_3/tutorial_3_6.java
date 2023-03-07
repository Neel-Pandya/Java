/**create a java program that shows the concept of argument pass 
by reference **/

class pass_by_reference{
	int a,b;
	public void set(int a,int b){
		this.a = a;
		this.b = b;
	}

	public int mul(pass_by_reference obj){
		return obj.a * obj.b;
	}
	public static void main(String[] args) {
		pass_by_reference obj = new pass_by_reference();
		pass_by_reference obj2 = new pass_by_reference();
		obj.set(15,3);
		System.out.println(obj2.mul(obj)); 
	}
}