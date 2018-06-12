package Testcases;

public class SwapStrings {

	
	public static void main(String[] args) {
		
		String S1="Mahesh";
		String S2="Java";
		String temp="";
		
		//Method1
		
		S1=S1+S2;
		S2=S1.substring(0,S1.length()-S2.length());
		S1=S1.substring(S2.length());
		System.out.println("S1 is: "+ S1);
		System.out.println("S2 is: "+ S2);
	}
}
