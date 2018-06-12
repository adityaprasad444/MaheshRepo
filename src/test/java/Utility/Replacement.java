package Utility;
import java.io.*;
import java.util.*;
//import java.util.regex;
 
public class Replacement {
    List<String> lines = new ArrayList<String>();
 
    public void replace(){
    
    	File file= new File("C:\\Users\\Mahesh Nukala\\Documents\\hosts.txt");
    	if(file.exists()){
    		System.out.println("file is present");
    	}
    	else{
    		System.out.println("delete operation failed");
    	}
    
 
    }
        public static void main(String [] args) {
        Replacement r = new Replacement();
        r.replace();
        System.out.println("done");
    }
}
