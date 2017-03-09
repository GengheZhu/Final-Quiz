import java.util.*;

/**
                    100 Integers        200 Integers        400 Integers        800 Integers
    
    * Bubble        10162               41324               162172              633360
    *
    * Selection     5148                20298               80598               321198
    * 
    * Insertion     9314                38728               156740              631584
     
     
     I found it interesting that Bubble and Insertion sort had similar performance results, with both
     growing linearly. Selection seems to do well with, also growing linearly, though I may have
     messed that one up
 */
public class ToussaintGreen_Amani_Per4{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public ToussaintGreen_Amani_Per4(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
   
    for (int outer = 0; outer < list.size() - 1; outer++){
        for (int inner = 0; inner < list.size()-outer-1; inner++){
            
            //Increment from comparison
            steps++;
            if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                //swap list[inner] & list[inner+1]
                swap(list, inner, inner+1);
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
    
    int first;
    for(int i = list.size() - 1; i > 0; i--){
        first = 0;
        for(int j = 1; j <= i; j++){
            //Increment from comparison
            steps++;
            if(list.get(j).compareTo(list.get(i)) < 0)
                first = j;
        }
        swap(list, first, i);
    }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
   
    for (int i = 1; i < list.size(); i++) {
        for(int j = i ; j > 0 ; j--){
            //Increment from comparison
            steps++;
            if(list.get(j).compareTo(list.get(j-1)) < 0){
                swap(list, j, j-1);
            }
        }
    }
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
    Comparable temp = list.get(a);
    list.set(a, list.get(b));
    list.set(b, temp)
    ;
    //Increment steps
    steps += 2;
  }
}
