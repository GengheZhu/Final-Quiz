import java.util.*;

/**
 *                          100 integers    200 integers    400 integers    800 integers
 *          Bubble sort     24890 steps     96764 steps     400304 steps    1617896 steps
 *          Selection sort  15246 steps     60496 steps     240996 steps    961996 steps
 *          Insertion sort  5738 steps      19958 steps     82478 steps     324022 steps
 *
 *          When the number of integers sorted doubles, the number of steps quadruples because
 *          these are quadratic.  The bubble sort uses the most steps, and insertion sort uses
 *          the least.
 */
public class LawtonJeremyPeriod6{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public LawtonJeremyPeriod6(){
    steps = 0;
  }

  /**
   *  Performs a bubble sort on the list and returns the number of steps taken
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
  }


  /**
   *  Performs a selection sort on the list
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
    int min, temp;
    steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
      min = outer;
      for (int inner = outer + 1; inner < list.size(); inner++){
        steps += 3; //2 gets, 1 comparison
        if (list.get(inner).compareTo(list.get(min)) < 0) {
          min = inner; // a new smallest item is found
        }
      }
      //swap list[outer] & list[min]
      steps += 4; //2 gets, 2 sets
      temp = (int)list.get(outer);
      list.set(outer, list.get(min));
      list.set(min, temp);

    }
  }
  

  /**
   *  Performs an insertion sort on the list
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
    steps = 0;
    for (int outer = 1; outer < list.size(); outer++){
      int position = outer;
      int key = (int)list.get(position);
      steps++; //1 get
      // Shift larger values to the right
      steps += 2; //1 get, 1 comparison
      while (position > 0 && list.get(position - 1).compareTo(key) > 0){
        list.set(position, list.get(position - 1));
        steps += 2; //1 get, 1 set
        position--;
      }
      list.set(position, key);
      steps++; //1 set
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
