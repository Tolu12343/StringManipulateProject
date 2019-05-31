package AStringManipulate;

import java.util.ArrayList;

public class AStringManipulate {
     public static String firstString;
     public static String result;
     public static String[] check;
     public static ArrayList<String> stringList = new ArrayList<>();
     public static ArrayList<Character> charList = new ArrayList<>();
     public static int num;
     public static char c;
     
     public static void manipulate () {
    	 for(int i=0; i < firstString.length(); i++) {
    		 if(firstString.charAt(i) == ' ') {
    			 String s = new String(firstString);
    			check = s.split(" ");
    			 for(int j =0; j< check.length; j++) {
    				 stringList.add(check[j]);
    			 }
    		 }
    	 }
    	 
    	 if(stringList.size() ==0) {
    		 for(int i=0; i< firstString.length() ; i++ ) {
    			 charList.add(firstString.charAt(i));
    		 }
    	 }
    	 
    	 for(int i =0; i < stringList.size(); i++) {
    		 if(i == 0) {
    			 result = stringList.get(0);
    		 }
    		 if(i > 1) {
    		   if(result.length() < stringList.get(i).length()) {
    			   result = stringList.get(i);
    		   }

    		 }
    	 }
    	 if(result !=null) {
    		 System.out.println(result);
    	 }
    	
    	 
    	 for(int i =0; i < charList.size(); i++) {
    		 if(i == 0) {
    			 c = charList.get(0);
    		 }
    		 
    		 if(i > 1) {
      		   if(c < charList.get(i)) {
      			   
      	  		 num = (int) charList.get(i);
      	  		 c = charList.get(i);
      			   }
      		   else {
      			 num = (int) c;
      			 
      		   }
      		   
      		   }
  
    	 }
    	 if(charList.size() > 0) {
    		 System.out.println("The character " + "\"" + Character.toString(c) + "\" " + "has the highest Ascii Value" + " (" +  num  + ")");
    	 }
    		
    	
    	
    	
     }
}
