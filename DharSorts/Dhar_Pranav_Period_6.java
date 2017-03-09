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
    * Bubble              24278               96868               404692              1612440
    *
    * Selection           15246               60496               240996              961996
    * 
    * Insertion           5374                20500               83462               330540
    * 
    * 
    *  The bubble sort uses the highest number of steps whereas the insertion sort uses the least.
    *  When the number of integers that are sorted doubles in number, the number of steps quadruples
    *  since these are quadratic.
    *
    */
public class Dhar_Pranav_Period_6 
{
  private long steps;
  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Dhar_Pranav_Period_6(){
   steps = 0;
  }
  /**
   *
   * @param  list  reference to an array of integers to be sorted
   */
  void bubbleSort(ArrayList <Comparable> list){
      steps = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
           for (int inner = 0; inner < list.size()-outer-1; inner++){
              if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                  //swap list[inner] & list[inner+1]
                  steps+=4;
                  Comparable temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp);
              }
              steps+=3;
           }
      }
  }
  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  void selectionSort(ArrayList <Comparable> list){
   int min;
   Comparable temp;
   steps = 0;
   for (int outer = 0; outer < list.size() - 1; outer++){
    min = outer;
    for (int inner = outer + 1; inner < list.size(); inner++){
      steps += 3;
      if (list.get(inner).compareTo(list.get(min)) < 0) {
        min = inner; // a new smallest item is found
      }
    }
    //swap list[outer] & list[min]
    steps += 4;
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
   steps = 0;
    for (int outer = 1; outer < list.size(); outer++){
    int position = outer;
    steps += 1;
    Comparable key = list.get(position);
    // Shift larger values to the right
    while (position > 0 && list.get(position - 1).compareTo(key) > 0){
        steps += 4;
      list.set(position, list.get(position - 1));
      position--;
    }
    steps += 3;
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