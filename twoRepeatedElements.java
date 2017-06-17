package Search;
//Find the two elements which are repeated twice , elements are from 1 to n , size of array would be n+2
public class twoRepeatingElements {
	public static void main(String args[]){
		int a[] = {1,2,3,2,4,4,5};
		int size = a.length;
		int n = size-2;
		int sum=0;
		int prod=1;
		for(int i=0;i<size;i++)
		{
			sum = sum+a[i];
			prod = prod*a[i];
		}
		int x;
		int y;
		x=sum - n*(n+1)/2;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		y = prod/fact;
		int p = x+(int)(Math.sqrt(x*x - 4*y));
		int q = x-(int)(Math.sqrt(x*x- 4*y));
		System.out.println("the two repeating elements are: "+ (p/2)+" and "+(q/2));
		
	}
}
