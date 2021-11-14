class Recursion_Pal{
	
	public static void main(String... args){
		int pal=121;
		int temp=pal;
		int rev=0,rem;
		while(temp!=0){
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(pal==rev){
			System.out.println("True");
		}else{
			System.out.println("False");
		}
	}
}