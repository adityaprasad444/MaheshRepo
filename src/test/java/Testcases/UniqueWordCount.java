package Testcases;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueWordCount {

	public static void main(String[] args) {
		
		String S="Mahesh is smart boy is learning Java and Java";
		String[] list=S.split(" ");
		String temp[]=null;
		int size=list.length;
		System.out.println("The total words are: " +size);
		Set<String>set= new HashSet<String>();
		for(int i=0;i<size;i++){
			set.add(list[i]);
			
		}
		
		
			System.out.println("The unique words are:" + set.size());
			Iterator<String>it=set.iterator();
			while(it.hasNext()){
				System.out.println("The unique words are" + it.next());
			}
		
			Object[] UniqueWordsCount= set.toArray();
			
			for(int i=0;i<UniqueWordsCount.length;i++){
				int count=0;
				for(int j=0;j<list.length;j++){
					if(UniqueWordsCount[i].equals(list[j])){
						count++;
					}
				}
				System.out.println("The word count of "+ UniqueWordsCount[i] + " is ==>"+ count);
			}
			
	}
}
		

