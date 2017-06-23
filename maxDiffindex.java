//http://www.geeksforgeeks.org/given-an-array-arr-find-the-maximum-j-i-such-that-arrj-arri/



public class maxDiffindex {
	
	static void maxDiff(int[] a,int n){
		int maxDiff = -1;
		int i,j;
		int Rmax[] = new int[n];
		int Lmin[] = new int[n];
		//construct Lmin such that Lmin contains the min value left of i ;
		Lmin[0] = a[0];
		int t=0;
		for(i=1;i<n;i++){
			if(a[i]<=Lmin[t]){
				t++;
				Lmin[t] = a[i];
				
			}
			if(a[i]>Lmin[t])
			{
				t++;
				Lmin[t] = Lmin[t-1];
			}
		}
		//construct Rmax such that  it contains the max value right of j;
		Rmax[n-1] = a[n-1];
		t = n-1;
		for(j=n-2;j>=0;j--){
			if(a[j]>=Rmax[t])
			{
				t--;
				Rmax[t] = a[j];
				
			}
			if(a[j]<Rmax[t]){
				t--;
				Rmax[t] = Rmax[t+1];
			}
		}
		i=0;j=0;int diff =-1;
		while(j<n && i<n){
			if(Lmin[i]<Rmax[j])
			{
				if(j-i > diff){
					diff = j-i;
				}
				j++;
			}
			else i++;
		}
		for(i=0;i<n;i++)
		System.out.print(Lmin[i]+" ");
		System.out.println();
		for(i=0;i<n;i++)
			System.out.print(Rmax[i]+" ");
		System.out.println();
		System.out.println(diff);
	}
	public static void main(String args[]){
		int arr[] = {9, 2, 3, 4, 5, 6, 7, 8, 6, 0};
		int n = arr.length;
		maxDiff(arr,n);
	}
}
