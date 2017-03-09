
     *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble         	24130              	98900                  392288                1598224
    *
    * Selection		15246			60496			240996			961996
    * 
    * Insertion		5156			19116			78156			322614
    * 
    * 
    * Write Up: Compared to Bubble and Selection, Insertion Sort requires significantly less amount of steps, while Selection require less steps than Bubble. The sorts increase as a quadratic.(n^2)
    */


import java.util.*;
public class Choi_Joseph_Period_4{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Choi_Joseph_Period_4(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
    for (int outer = 0; outer < list.size() - 1; outer++){
        for (int inner = 0; inner < list.size()-outer-1; inner++){
            steps+=3;
            if (list.get(inner) > list.get(inner + 1)){
                steps+=4;
                int temp = list.get(inner);
                list.set(inner, list.get(inner + 1));
                list.set(inner + 1, temp);
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
    steps=0;
    for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            steps+=3;
            if (list.get(inner) < list.get(min)) {
                min = inner; // a new smallest item is found
            }
        }
        //swap list[outer] & list[min]
        steps+=4;
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
    for (int outer = 1; outer < list.size(); outer++){
    int position = outer;
    int key = list.get(position);
    steps +=1;
    // Shift larger values to the right
    while (position > 0 && list.get(position - 1) > key){
      list.set(position, list.get(position - 1));
      position--;
      steps+=2;
    }
    list.set(position, key);
    steps+=3;
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
  private void merge(ArrayList <Integer> a, int first, int mid, int last){
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
