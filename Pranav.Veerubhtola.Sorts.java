import java.util.*;

/**
 *  Pranav Veerubhotla period 4
 *  100     200     400     800
 *  B25190 B98088   B393744 B1583396
 *  S15246 S60496   S240996 S961996  
 *  I5301  I19911   I77571  I318217
 */
public class Sorts{
  private int steps;

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
   
   
   
   
  public void bubbleSort(ArrayList <Integer> list){
      for (int outer = 0; outer < list.size() - 1; outer++){
          for (int inner = 0; inner < list.size()-outer-1; inner++){
              steps+= 3; //switching and checking total of 3 times
              if (list.get(inner) > list.get(inner + 1)){//checks 
                  steps+=4;
                  int temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp); //switches 
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
      int min, x;
      for (int outer = 0; outer < list.size() - 1; outer++){
          min = outer; //just a starting value for min
          for (int inner = outer + 1; inner < list.size(); inner++){
              steps+=3;
              if (list.get(inner) < list.get(min)) min = inner; // finds
          }
          steps+=4;//
          x = list.get(outer); //gets
          list.set(outer, list.get(min)); //switches
          list.set(min, x);//sets
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
            while (position > 0 && list.get(position - 1) > key){
                  list.set(position, list.get(position - 1));
                  position--; //check 
                  steps+=2;
            }
            steps+=3;
            list.set(position, key); //sets 
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
  public void setStepCount(int stepCount){
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
