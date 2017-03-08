import java.util.*;
/**
 * Please submit your Sorts lab in the following form
 */
public class GrantSubmission
{
    
    /**
    * Name of your class: Grant-Koziol-Period-4.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers    200 Integers    400 Integers    800 Integers
    * Bubble               15192            63408          223104          980220
    *
    * Selection            1012             2120            4708            9526
    * 
    * Insertion            7707             31589          116964          491885
    * 
    * 
    * 
    * 
    * 
    * Write a 1-2 sentence write-up about your observations:
    * selection consistently has he least steps and does not increase by as much as the
    * other 2. Bubble has the most steps geting up to almost 1 million at 800 integers.
    * Insertion has nearly half he steps of all runs of the bubble sort.
    */
   
   

  private int steps;
  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public GrantSubmission(){
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
              
              if (list.get(inner) < (list.get(inner + 1))){
                  //swap list[inner] & list[inner+1]
                int temp = list.get(inner);
                list.set(inner, list.get(inner + 1));
                list.set(inner + 1, temp);
                steps += 6;
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
    steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            if (list.get(inner) < list.get(min)) {
                min = inner; // a new smallest item is found
                steps += 2;
            }
        }
        //swap list[outer] & list[min]
        temp = list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
        steps += 4;
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
          int key = list.get(position);
          steps += 1;
          // Shift larger values to the right
          while (position > 0 && list.get(position - 1) > key){
              list.set(position, list.get(position - 1));
              position--;
              steps += 3;
            }
          list.set(position, key);
          steps += 1;
        }
   }

  /**
   *  Accessor method to return the current value of steps
   *
   */
  public int getStepCount(){
    return steps;
  }
  public void setStepCount(int x){
    steps = x;
  }

}


