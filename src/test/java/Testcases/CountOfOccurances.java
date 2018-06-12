package Testcases;

public class CountOfOccurances {

	public static void main(String[] args) {
		String str="fdsfdsfdfdfdffsfedsfdsf";
		String temp="";
		for(int i=0;i<str.length();i++){
			if(temp.indexOf(str.charAt(i))==-1){
				temp=temp+str.charAt(i);
			}
				
		}
		System.out.println(temp);
	
		for(int j=0;j<temp.length();j++){
	
		int count=0;
		for(int i=0;i<str.length();i++){
			
		char c=temp.charAt(j);
		if(c==str.charAt(i)){
			count++;
		}
		
		}
		System.out.println("The repeat of character "+ temp.charAt(j) +"is : "+ count);
	}
	}
}
