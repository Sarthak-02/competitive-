package Search;

public class FirstRepeatedElement {

	public static void main(String args[]){
		int a[] ={3,2,1,2,2,3};
		int count =-1;
		for(int i=0;i<a.length;i++){
			if(a[i]==-1){
				System.out.println(i);
				break;
			}
			if(a[i]<0){
				continue;
			}
			a[a[i]]=count;
			count--;
		}
	}
}
