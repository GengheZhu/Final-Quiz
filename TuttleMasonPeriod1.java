import java.util.*;
/**
 * Please submit your Sorts lab in the following form
 */
public class TuttleMasonPeriod1
{
    /**
    * Name of your class: LastName-FirstName-Period-#.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * I did not include steps that wouldnt change the position of ints.
    * Also, I generated up to a value of 10 for each.
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble                2239               8966               36686               146873
    *
    * Selection              267                558                1204               2258
    * 
    * Insertion              2165               8460              38455               143933
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    * Selection by far seems the most superior since it only is multiplied by around 2 for each time 
    * the value is multiplied by 2 whereas both insertion and bubble multiply by 4 for every x2.
    * Also I found that insertion and bubble result in similar amounts of steps for each amount of integer.
    */

  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public TuttleMasonPeriod1(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list)
  {
      for (int outer = 0; outer < list.size() - 1; outer++)
      {
          for (int inner = 0; inner < list.size()-outer-1; inner++)
          {
              if (list.get(inner) > list.get(inner + 1))
              {
                  //swap list[inner] & list[inner+1]
                  int temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp);
                  steps++;
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
	     int min, temp;

      for (int outer = 0; outer < list.size() - 1; outer++){
          min = outer;
          for (int inner = outer + 1; inner < list.size(); inner++)
          {
              if (list.get(inner) < list.get(min)) 
              {
                  min = inner; // a new smallest item is found
                  steps++;
              }
          }
               //swap list[outer] & list[min]
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
            steps++;
      }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
      for (int outer = 1; outer < list.size(); outer++){
          int position = outer;
          int key = list.get(position);

          // Shift larger values to the right
          while (position > 0 && list.get(position - 1) > key){
              list.set(position, list.get(position - 1));
              position--;
              steps++;
          }
          list.set(position, key);
          steps++;
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
   
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
	//replace these lines with your code
	System.out.println();
	System.out.println("Merge");
	System.out.println();

  }
  */

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
	//replace these lines with your code
	System.out.println();
	System.out.println("Merge Sort");
	System.out.println();
  }
  */
 
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
 
    
    