
import java.util.*;

/**
    * Name of your class: ChengMichellePeriod1.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble                24094               101076             396400             1598924
    *
    * Selection             15246                60496             240996              961996
    * 
    * Insertion              9022                40934             164678              641578
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    * Insertion sort is the fastest while Bubble sort is the slowest. Insertion sort takes about 67% of the time
    * taken by Selection sort and 40% of the time taken by Bubble sort. This is because Insertion sort sets
    * fewer times compared to Selection and Bubble sort.
    */
public class ChengMichellePeriod1{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
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
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
    int min, temp;

    for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            steps += 3; // 2 gets, 1 compare
            if (list.get(inner).compareTo(list.get(min)) < 0) {
                min = inner; // a new smallest item is found
            }
        }
        //swap list[outer] & list[min]
        temp = (int)list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
        steps += 4;  // 2 gets, 2 sets
    }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
    for (int outer = 1; outer < list.size(); outer++){
        int position = outer;
        int key = (int)list.get(position);
        steps += 1;   // 1 get
    
        // Shift larger values to the right
        while (position > 0 && list.get(position - 1).compareTo(key) > 0){
            steps += 4; // 2 gets, 1 set, 1 compare
            list.set(position, list.get(position - 1));
            position--;
        }
        list.set(position, key);
        steps += 1;  // 1 set
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
