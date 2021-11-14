class Recursion{
	static int i=0;
	static void show(){
		++i;
		if(i<=100){
			System.out.println(i);
			show();
		}
	}
	
	public static void main(String... args){
		show();
	}
}