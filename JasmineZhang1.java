import java.util.*;

/**
 *                  100             200             400             800
 * Bubble Sort      24054           94748           401488          1581316
 * Selection Sort   15246           60496           240996          961996
 * Insertion Sort   4928            19670           85896           323200
 * 
 * After this lab, I discovered that the Insertion Sort was the most efficient
 * way of sorting elements because it reduces the amount of steps by continuously
 * comparing values. Bubble Sort and Selection Sort produce the same result, yet
 * take longer because they compare each value individually.
 * 
 * @author Jasmine Zhang
 * @version 3/8/17
 */
public class Sorts{
  private long steps;

  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
      steps = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
          for (int inner = 0; inner < list.size()-outer-1; inner++){
              steps += 3;
              if (list.get(inner) > list.get(inner + 1)){
                  //swap list[inner] & list[inner+1]
                  int temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp);
                  steps += 4;
              }
            }
        }
  }

  public void selectionSort(ArrayList <Integer> list){
      int min, temp;
      steps = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
          min = outer;
          for (int inner = outer + 1; inner < list.size(); inner++){
              steps += 3;
              if (list.get(inner) < list.get(min)) {
                  min = inner; // a new smallest item is found
              }
          }
          //swap list[outer] & list[min]
          steps += 4;
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
      steps = 0;
      for (int outer = 1; outer < list.size(); outer++){
          int position = outer;
          steps++;
          int key = list.get(position);
          // Shift larger values to the right
          while (position > 0 && list.get(position - 1) > key){
              steps += 2;
              list.set(position, list.get(position - 1));
              position--;
          }
          steps++;
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