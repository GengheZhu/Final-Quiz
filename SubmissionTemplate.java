 /**
    *
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            24910               97716               394432              1589604
    *
    * Selection         15246               60496               240996              961996
    *
    * Insertion         12449               50394               193579              793959
    *
    * Bubble sort generally takes the most steps with selection in the middle and insertion finishing the quickest.
    * However, the rate that the number of steps changes by is nearly always 4x as the number of integers in the array doubles for all 3 of the sorting algorithms.
    * Write a 1-2 sentence write-up about your observations.
    */
import java.util.*;

public class QiLaryn1{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public QiLaryn1(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
     int n = list.size();
     int temp = 0;
     for(int i=0; i < n; i++){
         for(int j=1; j < (n-i); j++){
             steps +=3;
             if(list.get(j-1) > list.get(j)){
                 //swap elements
                 steps+=4;
                 temp = list.get(j-1);
                 list.set(j-1, list.get(j));
                 list.set(j, temp);
                }
            }
        }
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
     for (int i = 0; i < list.size() - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < list.size(); j++){
            steps+=3;
                if (list.get(j) < list.get(index)){
                    index = j;
                }
            }
            steps+=4;
            int smallerNumber = list.get(index);
            list.set(index, list.get(i));
            list.set(i, smallerNumber);


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
  public void insertionSort(ArrayList <Integer> list){


    int n = list.size();
    for (int j = 1; j < n; j++) {
        steps +=1;
        int key = list.get(j);
        int i = j-1;
        while ( (i > -1) && ( list.get(i) > key ) ) {
            steps+=5;
            list.set(i+1, list.get(i));
            i--;
        }
        list.set(i+1, key);
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
  public void swap(ArrayList <Integer> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
