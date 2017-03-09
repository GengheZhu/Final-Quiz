
import java.util.*;

/**
    * Name of your class: LastName-FirstName-Period-#.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            24126               98092                406440              1586652
    *
    * Selection         15246               60496                240996              961996
    * 
    * Insertion         5615               20579                 77327               345191

    * 
    * 
    * Bubble sorts take up the most steps so the computer is going through more work. 
    * Insertion took the least steps out of the three sorts meaning it is the fastest option, but also depending onf= the situation.
    */
 
public class RanavatNiva1st{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public RanavatNiva1st(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
	//replace these lines with your code
	for(int i=0;i<list.size()-1;i++){
	    for(int j=0;j<list.size()-i-1;j++){
	        steps+=3;
	        if(list.get(j).compareTo(list.get(j+1))>0){
	            steps+=4;
	            Comparable temp=list.get(j);
	            list.set(j,list.get(j+1));
	            list.set(j+1,temp);
	        }
	       }
	   }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
	//replace these lines with your code
	for(int i=0;i<list.size()-1;i++){
	    int min=i;
	    for(int j=i+1;j<list.size();j++){
	        steps+=3;
	        if (list.get(j).compareTo(list.get(min))>0){
	            min=j;
	           }
	       }
	    steps+=4; 
	    Comparable temp=list.get(min);
	    list.set(min,list.get(i));
	    list.set(i,temp);
	       }
	   
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
	//replace these lines with your code
	for(int i=1;i<list.size();i++){
	    Comparable key = list.get(i);
	    int j=i-1;
	    while(j>=0 && list.get(j).compareTo(key)>0){
	        list.set(j+1,list.get(j));
	        j=j-1;
	        steps+=2;
	       }
	       steps+=3;
	       list.set(j+1,key);
	   }
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
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
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
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
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
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
  
   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Comparable> list, int a, int b){
	//replace these lines with your code
	System.out.println();
	System.out.println("Swap");
	System.out.println();
  }
}
