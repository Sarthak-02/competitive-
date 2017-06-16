package Search;
//Find the number which is occured odd time ,there's only one such number
public class OddNumber {
	public static void main(String args[]){
		int[] a = {2,2,3,4,5,4,7,5,7};
		int x =0;
		for(int i=0;i<a.length;i++){
			x = x^a[i];
		}
		System.out.print("number which occured odd times is: "+x);
	}
}
