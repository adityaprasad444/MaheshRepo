package Testcases;

public class ReverseString {

	public static void main(String[] args) {
		String a="Mahesh";
		String temp="";
		for(int i=a.length()-1;i>=0;i--){
			temp=temp+a.charAt(i);
		}
		System.out.println(temp);
	

	
	//Method2
	StringBuffer sb= new StringBuffer(a);
	System.out.println(sb.reverse());
	
	}
	
}
