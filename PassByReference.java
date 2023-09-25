
class Test {
	int x;
	Test(int i) { x = i; }
	Test() { x = 0; }
}

class PassByReference {
	public static void main(String[] args)
	{
		
		Test t = new Test(5);

		// we are passing reference to the function.
		change(t);

		// The Output will be 5 becasue we refered to different location so no manupulation of memeber is done
		System.out.println(t.x);
	}
	public static void change(Test t)
	{
		// But here are referencing to different location
		t = new Test();

		t.x = 10;
	}
}
