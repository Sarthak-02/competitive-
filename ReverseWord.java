package String_Algo;
//http://www.geeksforgeeks.org/reverse-words-in-a-given-string/
public class ReverseWord {

	public static void main(String[] args) {
		String s = "My name is Sarthak ";
		StringBuffer sb = new StringBuffer();
		int n = s.length();
		int j =n;
		int i;
		for(i = n-1;i>=0;i--){
			
			if(s.charAt(i) == ' '){
				sb.append(s.substring(i+1, j));
				sb.append(" ");
				j = i;
			}
		}
		sb.append(s.substring(0,j));
		System.out.println(sb);
	}
}
