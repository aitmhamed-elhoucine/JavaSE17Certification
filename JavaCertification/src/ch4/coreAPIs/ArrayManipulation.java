package ch4.coreAPIs;

import java.util.Arrays;

public class ArrayManipulation {
    
	//varags syntax
    public static void getNextSortedElement(int element, int ... array) {
    	Arrays.sort(array);
    	int index = Arrays.binarySearch(array,element);
    	if (( index == array.length -1) || (index < 0)){
    		System.out.println("Does not exist, index : "+ index);
    	}else {
    		System.out.println(array[index+1]);
    	}
    	
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] numbers = new int[5];
        System.out.println(numbers[1]);
        String days[] = new String[7];
        System.out.println(days[1]);
        String [] cities = {"Casablanca","Fes","Paris"};
        String copyCities [] = cities;
        System.out.println(cities);
        System.out.println(copyCities);
        System.out.println(cities.equals(copyCities));//reference Equality
        // to print arrays use Arrays.toString()
        System.out.println(Arrays.toString(cities));
        String[] strings = {"stringValue"};
        Object [] objects = strings;
        String[] copyfromObjectArray = (String[]) objects;
        //copyfromObjectArray[1]="newString";//Runtime exception java.lang.ArrayIndexOutOfBoundsException
        copyfromObjectArray[0]="newStringValue";
        //copyfromObjectArray[0]= new StringBuilder("stringBuilderValue"); does not compile
        //objects[0] = new StringBuilder("stringBuilderValue"); //java.lang.ArrayStoreException
        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(copyfromObjectArray));
        
        //length method
        var birds = new String[6];
        System.out.println(birds.length);
        int num[]= new int[10];
        for(int i=0; i<10;i++) {
        	num[i] = i+5;
        }
        System.out.println(Arrays.toString(num));
        
        //Sorting
        System.out.println("*** Sorting ***");
        int[] numbersS = {4,5,2,7,3,9};
        System.out.println("Before Sorting : "+ Arrays.toString(numbersS));
        Arrays.sort(numbersS);
        System.out.println("Before Sorting : "+ Arrays.toString(numbersS));
        //Searching only if the array is already sorted.
        System.out.println(Arrays.binarySearch(numbersS, 0));
        System.out.println(Arrays.binarySearch(numbersS, 9));
        
        //Comparing using Arrays.compare()
        System.out.println("When comparing two\r\n" + 
        		"arrays, they must be the same array type.");
        System.out.println(Arrays.compare(new int[] {1,2}, new int[] {1}));//positive number
        System.out.println(Arrays.compare(new int[2] , new int[] {1}));//negative number
        System.out.println(Arrays.compare(new String[] {"a","a"}, new String[] {"a","AA"}));//positive number
        System.out.println(Arrays.compare(new String[] {"A"}, new String[] {"a"}));//negative number
        
        System.out.println(Arrays.compare(new String[] {"A","A","A"}, new String[] {"a","a"}));//negative number
        
        //Comparing using mismatch
        System.out.println(Arrays.mismatch(new int[] {9}, new int[] {9}));//-1
        System.out.println(Arrays.mismatch(new int[] {9,1}, new int[] {9}));//1     
        
        //Multidimensional arrays
        int[][] tabNumbers= new int[3][];
        tabNumbers[0] = new int[4];
        tabNumbers[1] = new int[2];
        tabNumbers[2] = new int[3];
        for(int i=0;i<tabNumbers.length;i++) {
        	for(int j=0;j<tabNumbers[i].length ; j++) {
        		tabNumbers[i][j]= i+j;
        	}
        }
        
        for(int[] numb : tabNumbers) {
        	for(int tab : numb) {
        		System.out.print(tab+" | ");
        	}
        	System.out.println("");
        }
        Object[][][] cubbies = new Object[3][][];
        //varags syntax
        int[] varargNumbers = {4,5,3,9,6,1};
        getNextSortedElement(1);
        getNextSortedElement(3,varargNumbers);
        getNextSortedElement(9,varargNumbers);
        
	}

}
