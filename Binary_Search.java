class Binary_Search{
	int search(int arr[],int key){
		int l=0;
		int h=arr.length-1;
		while(l<=h){
			int m=l+(h-l)/2;
			
			if(arr[m]==key)
				return m;
			
			if(arr[m]<key)
				l=m+1;
			else
				h=m-1;
		}
		return -1;
	}
	
	int binary_search(int arr[], int key, int l, int h){
		if(h>=l){
			int mid=l+(h-l)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				return binary_search(arr,key,l,mid-1);
			return binary_search(arr,key,mid+1,h);
		}
		return -1;
	}
	
	public static void main(String... args){
		Binary_Search obj = new Binary_Search();
		int arr[]={11,33,55,88,99};
		int key = 33;
		int x=arr.length-1;
		// int res=obj.search(arr,key);
		int res=obj.binary_search(arr,key,0,x);
		if(res==-1)
			System.out.println("Not found !!!");
		else
			System.out.println("Found !!!");
	}
}