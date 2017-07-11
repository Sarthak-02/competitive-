//http://practice.geeksforgeeks.org/problems/zero-sum-subarrays/0

import java.util.*;
public class ZeroSumSubArray {
	static void zeroSubArray(int[] a){
		int n = a.length;
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum=0;
		for(int i=0;i<n;i++){
			sum = sum+a[i];
			if(map.containsKey(sum)){
				int j = map.get(sum);
				System.out.println("Zero Subarray from "+(j+1)+"to"+(i));
			}
			else
			{
				map.put(sum, i);
			}
		}
	}
	public static void main(String[] args){
		int a[] = {6  ,-1 ,-3 ,4 ,-2 ,2 ,4 ,6 ,-12 ,-7};
		zeroSubArray(a);
	}
}
