import java.util.*;
/**
 *  Description of the Class
 *
 * @author     Dylan Dilger
 */
public class DylanDilgerPeriod1{
   /**
                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble         24650               100260              396368              1602984
    *
    * Selection      14850               59700               239400              958800
    * 
    * Insertion      5215                19509               80561               325821
    * 
    * 
    * Bubble sort is the least efficient method of sorting with Insertion being the most efficient.
    * Even though it isn't as bad as bubble, Selection isn't great either.
    */
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public DylanDilgerPeriod1(){
    steps = 0;
  }

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
	System.out.println("Steps: " + steps);
 }

 void selectionSort(ArrayList <Comparable> list){
	steps = 0;
    int min, temp;
    for (int outer = 0; outer < list.size() - 1; outer++){
      min = outer;
      for (int inner = outer + 1; inner < list.size(); inner++){
        steps += 3;  
        if (list.get(inner).compareTo(list.get(min)) < 0)
          min = inner; // a new smallest item is found
        }
      
      //swap list[outer] & list[min]
      temp = (int) list.get(outer);
      list.set(outer, list.get(min));
      list.set(min, temp);
    }

	System.out.println();
	System.out.println("Selection Sort");
	System.out.println();
	System.out.println("Steps: " + steps);
 }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
void insertionSort(ArrayList <Comparable> list){
  steps = 0;
  for (int outer = 1; outer < list.size(); outer++){
    int position = outer;
    int key = (int) list.get(position);
    // Shift larger values to the right
    while (position > 0 && list.get(position - 1).compareTo(key) > 0){
      list.set(position, list.get(position - 1));
      position--;
      steps+=2;
    }
    steps+=3;
    list.set(position, key);
  }
  System.out.println();
  System.out.println("Insertion Sort");
  System.out.println();
  System.out.println("Steps: " + steps);
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
