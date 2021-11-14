class Recursion_series{
	static double sum=0;
	static double i=1;
	static double inv;
	static void series(double num){
		if(i<4){
			inv = num/i;
			sum=sum+inv;
			i++;
			series(-num);
		}
	}
	
	public static void main(String... args){
		series(1);
		System.out.println("Sum = "+sum);
	}
}