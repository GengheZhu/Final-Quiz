Skip to content
This repository
Search
Pull requests
Issues
Gist
 @Cyka-Blyat
 Sign out
 Watch 0
  Star 0
 Fork 89 Cyka-Blyat/Sorts Private
forked from foothillhighcs/Sorts
 Code  Pull requests 0  Projects 0  Wiki  Pulse  Graphs  Settings
Branch: patch-1 Find file Copy pathSorts/KshavAyerSorts
e95c9e8  9 hours ago
@Cyka-Blyat Cyka-Blyat KshavAyerSorts
1 contributor
RawBlameHistory     
195 lines (158 sloc)  4.87 KB
import java.util.*;

/**
 * Write a description of class SortsKshavAyer here.
 * 
 * @author (your name) Kshav Ayer
 * @version (a version number or a date)
 */


/**
 *  
 * 
 * Write: 
 * 
 * Insertion is the fastest, Selection is the 2nd fastest, and Bubble is the slowest.
 * They all go faster as they contine though
 */
public class SortsKshavAyer{
  private long stepamount;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public SortsKshavAyer(){
    stepamount = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
    int temporary;
    for(int loop1 = 0; loop1 < list.size()-1; loop1++){
        for(int loop2 = 1; loop2 < list.size()-loop1; loop2++){
            stepamount+=3;
            
            if(list.get(loop2-1) > list.get(loop2)){
                temporary = list.get(loop2-1);
                list.set(loop2-1,list.get(loop2));
                list.set(loop2,temporary);
                stepamount+=4;
               }
               
           }
       }
       
       
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
      
    int minimum;
    int temp;
    
    
    for(int loop1 = 0; loop1 < list.size()-1; loop1++){
        minimum = loop1;
        
        for(int loop2 = loop1 + 1; loop2 < list.size(); loop2++){
            stepamount+=3;
            
            if(list.get(loop2)<list.get(minimum)){
                minimum = loop2;
               }
           }
           
           //swaps the index with the temp
           
           stepamount+=4;
           
           temp = list.get(loop1);
           
           list.set(loop1, list.get(minimum));
           
           list.set(minimum,temp);
       }
       
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
      
    int pos;
    int xlen;
    
      for(int loop1 = 1; loop1 < list.size(); loop1++){
          
        pos = loop1;
        xlen = list.get(pos);
        stepamount+=1;//get above
        while(pos > 0 && list.get(pos-1) > xlen){
            
            stepamount+=2; // for the comparison above
            list.set(pos, list.get(pos-1));
            stepamount+=2; //for the set and get above
            pos--;
        }
        
        stepamount+=2;//to account if the while above is false, it will compare at least once
        list.set(pos,xlen);
        stepamount+=1;//set above
    }
    
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }


 /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
  private void merge(ArrayList <Integer> a, int first, int mid, int last){
    //replace these lines with your code
    System.out.println();
    System.out.println("Merge");
    System.out.println();

  }

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(ArrayList <Integer> a, int first, int last){
    //replace these lines with your code
    System.out.println();
    System.out.println("Merge Sort");
    System.out.println();
  }

 
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return stepamount;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    stepamount = stepCount;
  }
  
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Integer> list, int a, int b){
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
Contact GitHub API Training Shop Blog About
© 2017 GitHub, Inc. Terms Privacy Security Status Help