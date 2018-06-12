package Testcases;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInArray {

	public static void main(String[] args) {
		
		int[] array= {20,50,40,20,10,50};
		Arrays.sort(array);
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
		//Method1
		Set<Integer> set= new HashSet<>();
		for(int i=0;i<array.length;i++){
			
			if(set.add(array[i])==false){
				set.add(array[i]);
			}
			
			
		}
		Object[] obj= set.toArray();
		for(int i=0;i<obj.length;i++){
			System.out.println("The unique elemenets are : "+ obj[i]);
		}
		
	}

}
