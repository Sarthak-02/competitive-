package Search;
//find the missing number in the array if the elements are supposed to be from 1 to n
public class MissingNumber {

	public static void main(String[] args){
		int[] a = {6,1,2,5,3,4};
		int n = a.length;
		int count=0;
		//System.out.println(n);
		
		for(int i=0;i<n;i++){
			if(a[i]==n+1){
				count=1;
				continue;
			}
			else{
				a[(a[i]-1)%n] +=n;
			}
		}
		if(count==0){
			System.out.println("The missing element is "+(n+1));
		}
		else{
			for(int i=0;i<n;i++){
				if(a[i]/(n+1)==0){
					System.out.println("The missing element is: "+(i+1));
					break;
				}
			}
		}
	}
	
}

******************************** * * * * * * ** * * * **  * * * * * **  ** *  * * ** ** * *  *
public class MissingNumber_1 {

	public static void main(String[] args){
		int[] a = {1,2,3,4,6,7};
		int x=0 ; int y=0;
		for(int i=0;i<=a.length;i++){
			x = x^(i+1);
		}
		for(int i=0;i<a.length;i++){
			y=y^a[i];
		}
		System.out.println("The missing number would be "+(x^y));
	}
}
