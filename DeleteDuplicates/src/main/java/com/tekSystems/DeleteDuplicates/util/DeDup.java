package com.tekSystems.DeleteDuplicates.util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang.ArrayUtils;

/**
 * 
 * Utility Class to remove the duplicates from the given random int array in
 * below ways 
 * 
 * 		1. Iterate thru the int random array and add to set 
 * 		2. Iterate thru the int random array and add to Treeset to maintain the order 
 * 		3. Converting int array to set by using apache lang
 * 		4. With JDK 8 Stream
 * 
 * @author Venugopal Kommineni
 * @version 1.0
 */
public class DeDup {

	public static int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3, 
			20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
			13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

	public static void main(String[] args) {

		/**
		 * Method 1: Removing the duplicates in random int array by using Set
		 */
		System.out.println("removeDuplicatesWithSet -->" +removeDuplicatesWithSet(randomIntegers));
		
		/**
		 * Method 2: Removing the duplicates in random int array with TreeSet to maintain the order
		 */
		System.out.println("removeDuplicatesWithTreeSet -->" + removeDuplicatesWithTreeSet(randomIntegers));
		
		/**
		 * Method 3: Removing the duplicates in random int array with Apache lang
		 */
		System.out.println("removeDuplicatesWithUtility -->" + removeDuplicatesWithUtility(randomIntegers));
		
		/**
		 * Method 4: Removing the duplicates in random int array with Jdk 8 stream
		 */
		System.out.println("removeDuplicatesWithStreams --> "+ Arrays.toString(removeDuplicatesWithStreams(randomIntegers)));
		
	}
	
	/**
	 * To remove the duplicates with Set
	 * 
	 * @param randomIntegers
	 * @return distinct set
	 */
	private static Set<Integer> removeDuplicatesWithSet(int[] randomIntegers){
		Set<Integer> randomIntSet =  new HashSet<Integer>();
		
		if(null!=randomIntegers){
			for (int randomNum: randomIntegers){
				randomIntSet.add(randomNum);
			}
		}else{
			System.out.println("Input Array is null or empty, please check....");
		}
		
		return randomIntSet;
	}

	
	/**
	 * To remove the duplicates with Treeset to maintain the same order
	 * 
	 * @param randomIntegers
	 * @return distinct int Treeset
	 */
	private static Set<Integer> removeDuplicatesWithTreeSet(int[] randomIntegers){
		Set<Integer> randomIntTreeSet =  new TreeSet<Integer>();
		
		if(null!=randomIntegers){
			for (int randomNum: randomIntegers){
				randomIntTreeSet.add(randomNum);
			}
		}else{
			System.out.println("Input Array is null or empty, please check....");
		}
		
		return randomIntTreeSet;
	}
	
	
	/**
	 * To remove the duplicates with apache commons
	 * 
	 * @param randomIntegers
	 * @return distinct int set
	 */
	private static Set<Integer> removeDuplicatesWithUtility(int[] randomIntegers){
		
		if(null!=randomIntegers){
			return new TreeSet<Integer> (Arrays.asList(ArrayUtils.toObject(randomIntegers))) ;
		}else{
			System.out.println("Input Array is null or empty, please check....");
		}
		
		return null;
	}
	
	
	/**
	 * To remove the duplicates with Jdk 8 streams
	 * 
	 * @param randomIntegers
	 * @return distinct int array
	 */
	private static int[] removeDuplicatesWithStreams(int[] randomIntegers){
		
		if(null!=randomIntegers){
			
			return Arrays.stream(randomIntegers).distinct().toArray() ;
		}else{
			System.out.println("Input Array is null or empty, please check....");
		}
		
		return null;
	}
}
