package assignmentclass;

public class Duplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int [] arr = new int [] {7, 8, 7, 5, 10,3,10,5, 2};   
         
	        System.out.println("Duplicate numbers are :- ");  
	        //for search duplicate no 
	        for(int i = 0; i < arr.length; i++) {  
	            for(int j = i + 1; j < arr.length; j++) {  
	                if(arr[i] == arr[j])  
	                    System.out.println(arr[j]);  
	            }  
	        }  
	    }  
	}  
