
import java.util.*;

/**
 *  Description of the Class
 *
 * @author     Andy Tran Period 6
 * 
 *                  100 Integers        200 Integers        400 Integers        800 Integers
 * Bubble           24422               100460              403088              1602636
 * 
 * Selection        15246               60496               240996              961996                             
 * 
 * Insertion        5154                19348               87174               331438               
 * 
 * Observations
 * When I ran the different sorts, the bubble sort would always take the most amount of steps
 * so therefore it is the least efficient. Insertion sort would always take the least amount of
 * steps so therefore it is the most efficient of the 3 with Selection sort always in the middle.
 */
public class TranAndyPeriod6
{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public TranAndyPeriod6(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list)
  {
     steps = 0; 
     for (int outer = 0; outer < list.size() - 1; outer++){
       for (int inner = 0; inner < list.size()-outer-1; inner++)
       {
         steps += 3;//count one compare and 2 gets
         if (list.get(inner).compareTo(list.get(inner + 1)) > 0)
         {
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
  public void selectionSort(ArrayList <Comparable> list)
  {
    int min, temp;
    steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++)
    {
      min = outer;
      for (int inner = outer + 1; inner < list.size(); inner++)
      {
        steps += 3; //3 steps
        if (list.get(inner).compareTo(list.get(min)) < 0)
        {
          min = inner; // a new smallest item is found
           
        }
      }
      //swap list[outer] & list[min]
      temp = (int) list.get(outer);
      list.set(outer, list.get(min));
      list.set(min, temp);
      steps += 4; //4 steps
    }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list)
  {
    steps = 0; 
    for (int outer = 1; outer < list.size(); outer++)
     {
     int position = outer;
     int key = (int) list.get(position);
     steps += 1;//1 step
     // Shift larger values to the right
     steps += 2;//2 steps
     while (position > 0 && list.get(position - 1).compareTo(key) > 0)
     {
       list.set(position, list.get(position - 1));
       steps += 2;//2 steps
       position--;
       }
     list.set(position, key);
     steps += 1;//1 step
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
