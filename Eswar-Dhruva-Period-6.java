import java.util.*;

public class EswarDhruvaPeriod6{
/**
 * @author Dhruva Eswar
 * @version 3/9/2017
 */


/**
 *                      100             200         400                 800
 * Bubble               24614           103420      396080              1588028
 * 
 * Selection            15246           60496       240996                 961996       
 * 
 * Insertion                8506            40838      159722                639462   
 * 
 * 
 * 
 * The bubble and selection sorts are for the most part on the same order of magnitude 
 * in terms
 * of how many steps it takes to fully sort an list of n values. However, the insertion 
 * sort takes considerably fewer steps.
 */

  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  
  public EswarDhruvaPeriod6(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
    steps = 0;  
  for (int outer = 0; outer < list.size() - 1; outer++){
    for (int inner = 0; inner < list.size()-outer-1; inner++){
        steps += 3;//count one compare and 2 gets
        if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
           steps += 4;//count 2 gets and 2 sets
           Comparable temp = list.get(inner);
           list.set(inner,list.get(inner + 1));
           list.set(inner + 1,temp);
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
  public void selectionSort(ArrayList <Comparable> list){
      steps = 0;
int min;
Comparable temp;

  for (int outer = 0; outer < list.size() - 1; outer++){
    min = outer;
    for (int inner = outer + 1; inner < list.size(); inner++){
        steps += 3;
      if (list.get(inner).compareTo(list.get(min)) < 0) {
        min = inner; // a new smallest item is found
      }
    }
    steps += 4;
    //swap list[outer] & list[min]
    temp = list.get(outer);
    list.set(outer, list.get(min));
    list.set(min, temp);
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
  public void insertionSort(ArrayList <Comparable> list){
  for (int outer = 1; outer < list.size(); outer++){
    int position = outer;
    steps += 1;
    Comparable key = list.get(position);


    // Shift larger values to the right
    while (position > 0 && list.get(position - 1).compareTo(key) > 0){
       steps += 2;
        steps += 2;
      list.set(position, list.get(position - 1));
      position--;
    }
    steps += 1;
    list.set(position, key);
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




