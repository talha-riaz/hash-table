import java.io.*;
import java.util.*;


public class main {     

     
    public static void main(String[] args) {
    //TODO:build the hash table and insert keys using the insertKeyArray function.
    	
    	Chaining chainingMapX = new Chaining (10, 0, 1023);
    	
    	int [] keyArrayX = new int [] {70, 54, 19, 58, 46, 14, 67, 80, 3, 93, 47, 50, 74, 72, 85, 95, 86, 91, 81, 90};
    	
    int collisionsChainingX = 	chainingMapX.insertKeyArray(keyArrayX);
    
    System.out.println("The number of collisions in Chaining key list X are: " + collisionsChainingX);
    
    
    	
    Chaining chainingMapY = new Chaining (10, 0, 1018);
    
    	int [] keyArrayY = new int [] {52, 71, 34, 95, 68, 25, 44, 38, 47, 77, 92, 84, 94, 12, 61, 9, 89, 56, 28, 75};
    	
    	int collisionsY = 	chainingMapY.insertKeyArray(keyArrayY);
    	 
    	System.out.println("The number of collisions in Chaining key list Y are: " + collisionsY);
    	
    	
    	
    	
    	Open_Addressing openMapX = new Open_Addressing (10, 0, 1023);
    	
    	int collisionsOpenX = openMapX.insertKeyArray(keyArrayX) ;
    	
    	System.out.println("The number of collisions in Open Addressing key list X are: " + collisionsOpenX);
    	
    	
    	Open_Addressing openMapY = new Open_Addressing (10, 0, 1018);
    	
    	int collisionsOpenY = openMapY.insertKeyArray(keyArrayY);
    	
    	System.out.println ("The number of collisions in Open Addressing key list Y are: " + collisionsOpenY);
    	
    	
    	
    	
    	
    }
}