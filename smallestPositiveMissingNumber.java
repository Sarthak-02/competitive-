//http://practice.geeksforgeeks.org/problems/smallest-positive-missing-number/0

package Array;

public class smallestPositiveMissingNumber {
	public static void main(String[] args){
		int arr[] = {0,-10,1,3,-20};
		int min =0;
		int count=0;
		int diff;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				continue;
			}
			if(count==0){
				min = arr[i];
				count++;
			}
			diff = arr[i]-min;
			if(diff==1){
				min = arr[i];
			}
			if(diff<-1){
				min = arr[i];
			}
		}
		System.out.println(min+1);
	}
}
