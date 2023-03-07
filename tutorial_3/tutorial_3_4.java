/* create a java program that uses "this" keyword */
class this_keyword{
	int a = 30;
	public void print(int a){

		System.out.print(this.a);
	}
	public static void main(String[] args) {
		this_keyword t = new this_keyword();
		t.print(40);
	}
}