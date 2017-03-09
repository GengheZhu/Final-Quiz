
import java.util.*;

/**
 *  
 *
 * @author     Felix Yan
 *               100 Integers      200 Integers      400 Integers      800 Integers
 * 
 * Bubble           24102             97632            381496            1507384  
 * 
 * Selection        15246             60496            240996             961996
 * 
 * Insertion        9208              34832            149684             575308
 * 
 * Write-up: Selection does roughly 60% the steps that Bubble does, and Insertion does 
 * roughly 60% of the steps that Selection does, meaning that Insertion does should do
 * 36% of the steps that Bubbles does, which is true. Even so, all three sorting
 * algorithms grow at exponential rates.
 */
public class YanFelix1{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public YanFelix1(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
    int temp;
    for(int loop1 = 0; loop1 < list.size()-1; loop1++){
        for(int loop2 = 1; loop2 < list.size()-loop1; loop2++){
            steps+=3;//one for getting the first integer, one for getting the second, and one for comparing
            if(list.get(loop2-1) > list.get(loop2)){
                temp = list.get(loop2-1);
                list.set(loop2-1,list.get(loop2));
                list.set(loop2,temp);
                steps+=4;//one for getting the int, one for setting the int to temp, one for setting the
                         //second int to the first int, and one for setting the temp to the second int
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
    int min;
    int temp;
    for(int loop1 = 0; loop1 < list.size()-1; loop1++){
        min = loop1;
        for(int loop2 = loop1 + 1; loop2 < list.size(); loop2++){
            steps+=3;
            if(list.get(loop2)<list.get(min)){
                min = loop2;
               }
           }
           //swaps the index with the temp
           steps+=4;
           temp = list.get(loop1);
           list.set(loop1, list.get(min));
           list.set(min,temp);
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
    int position;
    int key;
      for(int loop1 = 1; loop1 < list.size(); loop1++){
        position = loop1;
        key = list.get(position);
        steps+=1;//get above
        while(position > 0 && list.get(position-1) > key){
            steps+=2; // for the comparison above
            list.set(position, list.get(position-1));
            steps+=2; //for the set and get above
            position--;
        }
        steps+=2;//to account if the while above is false, it will compare at least once
        list.set(position,key);
        steps+=1;//set above
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
  public void swap(ArrayList <Integer> list, int a, int b){
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
