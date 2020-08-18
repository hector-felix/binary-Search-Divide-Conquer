/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author Hector Felix
 */
import java.lang.Math; 
import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        
        int[] A = {2, 4, 5, 7, 8, 10, 12};
        int searchingFor = 12;
        System.out.println("A[]: "+Arrays.toString(A));
        int indexFound = ImprovedBinarySearch(A,searchingFor,0,A.length-1);
        
        
        if (indexFound != -1)
            System.out.println(searchingFor + " found at index "+ indexFound);
        else
            System.out.println(searchingFor + " not found in Array");
        
        
    }
    static public int ImprovedBinarySearch(int[] A, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int p = low + ((high - low)/3);
        int q = high - ((high - low)/3);
        
        if(key == A[p])
            return p;
        else if(key == A[q])
            return q;
        else if(key < A[p])
            return ImprovedBinarySearch(A,key,low,p-1);
        else if(key > A[q])
            return ImprovedBinarySearch(A,key,q+1,high);
        else
            return ImprovedBinarySearch(A,key,p+1,q-1);
    }
}