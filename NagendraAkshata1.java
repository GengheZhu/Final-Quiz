
import java.util.*;

/**
 *  
 *
 * @author     Akshata Nagendra
 * @created    03-08-17
 */
public class NagendraAkshata1
/**
 *           100 Integers          200 Integers          400 Integers          800 Integers
 * Bubble    24390                 102376                400892                1608600
 * 
 * Selection 152446                60496                 240996                961996
 * 
 * Insertion 4843                  20201                 76065                 278937  
 * 
 * 2 sentence write-up:
 * The amount of steps increases quadratically(function of x^2). This works for all the functions above. 
 * Also, the InsertionSort takes significantly less steps.
 */
{

  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public NagendraAkshata1(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
    for (int outer = 0; outer < list.size() - 1; outer++){
         for (int inner = 0; inner < list.size()-outer-1; inner++){
             steps+=3;
             if (list.get(inner) > list.get(inner + 1)){
                  //swap list[inner] & list[inner+1]
                  steps+=4;
                  int temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp);
                }
            }
    }
  }
  

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
    int min, temp;
    for (int outer = 0; outer < list.size() - 1; outer++){
      min = outer;
      for (int inner = outer + 1; inner < list.size(); inner++){
          steps+=3;
          if (list.get(inner) < list.get(min)) {
               min = inner; // a new smallest item is found
            }
        }
      //swap list[outer] & list[min]
      steps+=4;
      temp = list.get(outer);
      list.set(outer, list.get(min));
      list.set(min, temp);
    }
  }


  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
    for (int outer = 1; outer < list.size(); outer++){
        int position = outer;
        int key = list.get(position);

        // Shift larger values to the right
        while (position > 0 && list.get(position - 1) > key){
        list.set(position, list.get(position - 1));
        position--;
        steps+=2;
       }
       steps+=3;
       list.set(position, key);
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
  public void swap(ArrayList <Comparable> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
