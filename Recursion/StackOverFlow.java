class StackOverFlow
{
	static int a=1;	//Global variable to print incrementing numbers in recursion

	public static void main(String[] args) {
		m1();	//Calling static method
	}

	public static void m1()
	{
		a++;	//incrementing global variable
		System.out.println(a);
		m1();	//Recusrion
	} 
}
