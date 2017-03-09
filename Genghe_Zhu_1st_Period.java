import java.util.*;

/**
 * Please submit your Sorts lab in the following form
 */
public class Genghe_Zhu_1st_Period {
    
{
    /**
    * Name of your class: Zhu-Genghe-Period-1#.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            4950                19900               79800               319600
    *
    * Selection         4950                19900               79800               319600
    * 
    * Insertion         2557                10205               40986               166036
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    * As we can see, the bubble and selection sorting algorithms both take the exact same amount of 
    * time/steps to run. On the other hand, the insertion sorting algorithm is faster during the entire range 
    * of 100 - 800 integers. The insertion algorithm takes varying amount of steps as every time it is different.
    */
}

  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Genghe_Zhu_1st_Period(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
    //replace these lines with your code
    int i = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
        for (int inner = 0; inner < list.size()-outer-1; inner++){
            if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                //swap list[inner] & list[inner+1]
                Comparable temp = list.get(inner);
                list.set(inner, list.get(inner + 1));
                list.set(inner + 1, temp);
            }
            i++;
        }
    }
    System.out.println();
    System.out.println("Bubble Sort");
    steps = i;
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
    //replace these lines with your code
    Comparable temp;
    int min;
    int i = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            i++;
          if (list.get(inner).compareTo(list.get(min)) < 0) {
            min = inner; // a new smallest item is found
          }
        }
        //swap list[outer] & list[min]
        temp = list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
      }
    System.out.println();
    System.out.println("Selection Sort");
    steps = i;
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
    //replace these lines with your code
    int i = 0;
      for (int outer = 1; outer < list.size(); outer++){
        int position = outer;
        Comparable key = list.get(position);
    
        // Shift larger values to the right
        while (position > 0 && list.get(position - 1).compareTo(key) > 0){
          list.set(position, list.get(position - 1));
          position--;
          i++;
        }
        list.set(position, key);
      }
    System.out.println();
    System.out.println("Insertion Sort");
    steps = i;
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
