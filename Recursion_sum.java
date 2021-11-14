class Recursion_sum{
	static int sum(int num){
		if(num<=1)
			return 1;
		else
			return num+sum(num-1);
	}
	// static int pow(int a, int num){
		// if(num==0)
			// return 1;
		// else
			// return a*pow(a,num-1);
	// }
	public static void main(String... args){
		// System.out.println(sum(5));
		
		 System.out.println(pow(3,4));
	}
}