//Find an element in array such  that all element left of it is smaller and right of it is greater

package Array;

public class UnsortedArray {

	public static void main(String args[]){
		int [] a = {4,3,2,7,8,9};
		int num = a[0];
		int diff=0;
		int flag=1;
		for(int i=1;i<a.length;i++){
			diff = a[i]-num;
			if(flag==1 && diff>0){
				num = a[i];
				i++;
				flag=0;
			}
			if(diff<0){
				flag=1;
				num = a[i];
			}
		}
		System.out.println(num);
	}
}
