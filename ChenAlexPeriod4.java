import java.util.*;

/**
 * Results:
 *                  100 ints    200 ints    400 ints    800 ints
 * BubbleSort       17397       69152       278691      1108244
 * SelectionSort    10197       40397       160797      641597
 * InsertionSort    7101        29535       118575      478515
 * 
 * Out of all the sorting methods, InsertionSort seems to be the most efficient, since it consistently has
 * the least number of steps used. This is explanable since InsertionSort adapts to the code as it goes, while
 * SelectionSort and BubbleSort do not.
 */
public class ChenAlexPeriod4 {
  private long steps;

  /**
   *  Constructor, sets # of steps to 0
   *
   * @param  list  Description of Parameter
   */
  public ChenAlexPeriod4(){
    steps = 0;
  }

  /**
   *  BubbleSort algorithm
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
      steps = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
          for (int inner = 0; inner < list.size()-outer-1; inner++){
              if (list.get(inner) > list.get(inner + 1)){
                  //swap list[inner] & list[inner+1]
                  int temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp);
                  steps +=3;
                }
              steps +=2;
            }
        }
  }

  /**
   *  SelectionSort algorithm
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
      steps = 0;
      int min, temp;
      for (int outer = 0; outer < list.size() - 1; outer++){
          min = outer;
          for (int inner = outer + 1; inner < list.size(); inner++){
              if (list.get(inner) < list.get(min)) {
                  min = inner; // a new smallest item is found
              }
              steps+=2;
            }
          //swap list[outer] & list[min]
          temp = list.get(outer);
          list.set(outer, list.get(min));
          list.set(min, temp);
          steps+=3;
        }
  }

  /**
   *  InsertionSort Algorithm
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list){
    steps = 0;
      for (int outer = 1; outer < list.size(); outer++){
        int position = outer;
        int key = list.get(position);
        // Shift larger values to the right
        while (position > 0 && list.get(position - 1) > key){
            list.set(position, list.get(position - 1));
            position--;
            steps +=3;
        }
        steps +=1;
        list.set(position, key);
        steps +=2;
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
  public void swap(ArrayList <Integer> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
