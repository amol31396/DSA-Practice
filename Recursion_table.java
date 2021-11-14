class Recursion_table{
	static int num=0;
	static int x=5;
	static void table(){
		num++;
		if(num<=10){
			System.out.println(x+" * "+num+" = "+(x*num));
			table();
		}
	}
	public static void main(String... args){
		table();
	}
}