
import java.util.*;
/**
 *  This class uses a variety of algorithms to organize
 *  data, while recording the number of steps taken to do
 *  so.
 *
 * @author     Max Platt
 * @created    3/8/2017
 * 
 *                   100 Integers        200 Integers        400 Integers        800 Integers
 * Bubble               24630               101076              396400              1598924
 *
 * Selection            15246               60496               240996              961966
 * 
 * Insertion            9022                40934               164678              641578
 * 
 * Write Up:
 * Insertion sort is the most efficient of the sorts, continually using the least amount of
 * steps.  Bubble sort, due to its need to parse through the entirety of data pieces present,
 * takes the most steps.
 */
public class PlattMaxPeriod4
 {
  private long steps;
  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public PlattMaxPeriod4(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list)
  {
        Comparable copy;
        steps = 0;
        for (int x = 0; x < list.size(); x++)
            for (int i = 0; i < list.size() - i; i++)                
            {    
                steps += 3;     //2 gets, 1 compare
                if (list.get(i).compareTo(list.get(i+1)) > 0)
                {
                    steps += 4;     //2 gets, 2 sets
                    copy = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, copy);
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
        Comparable copy;
        int smallest;
        steps = 0;
        for (int i = list.size() - 1; i > 0; i--)
        {    
            smallest = 0;
            for (int j = 1; j <= i; j++)
            {    
                if (list.get(j).compareTo(list.get(smallest)) >= 0)
                    smallest = j;
                steps += 3;  //Take, move, and compare
            }        
            copy = list.get(smallest);
            list.set(smallest, list.get(i));
            list.set(i, copy);
            steps += 4; //Reset smallest, create copy, then 2 sets
        }    
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
      steps = 0; 
      for (int i = 1; i < list.size(); i++)
       {
       int j = i;
       Comparable key = list.get(j);
       steps += 3;
       while (j > 0 && list.get(j - 1).compareTo(key) > 0)
       {
         list.set(j, list.get(j - 1));
         steps += 2;//2 steps
         j--;
         }
       list.set(j, key);
       steps += 1; //1 step
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
