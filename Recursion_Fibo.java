class Recursion_Fibo{
	static int c=0;
	static int n=0;
	static void fibonacci(int a, int b){
		while(n<=10){
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			n++;
			fibonacci(a,b);
		}
	}
	public static void main(String... args){
		int a=0;
		int b=1;
		
		System.out.print(a+" "+b);
		fibonacci(a,b);
	}
}

