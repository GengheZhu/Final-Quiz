import java.util.*;


public class AshnaKumar
{
  private int steps;
  public AshnaKumar()
  {
    steps = 0;
  }

  public int bubbleSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
    steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
    for (int inner = 0; inner < list.size()-outer-1; inner++){
        steps += 3;//count one compare and 2 gets
        if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
           steps += 4;//count 2 gets and 2 sets
           int temp = list.get(inner);
           list.set(inner,list.get(inner + 1));
           list.set(inner + 1,temp);
        }
    }
   }
   return steps; 
  }

  public int selectionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
    int min, temp;
    steps = 0; 

  for (int outer = 0; outer < list.size() - 1; outer++){
    min = outer;
    for (int inner = outer + 1; inner < list.size(); inner++){
        steps+=3;
      if (list.get(inner) < list.get(min)) {
        min = inner; // a new smallest item is found
      }
    }
    //swap list[outer] & list[min]
    steps += 4; 
    temp = list.get(outer);
    list.set(outer, list.get(min));
    list.set(min, temp);
  }
  return steps; 
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public int insertionSort(ArrayList <Integer> list){
    //replace these lines with your code
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
    steps = 0; 
    for (int outer = 1; outer < list.size(); outer++){
    int position = outer;
    int key = list.get(position);
    steps+=1; 
    // Shift larger values to the right
    while (position > 0 && list.get(position - 1) > key){
      list.set(position, list.get(position - 1));
      position--;
      steps += 3; 
    }
    steps+=1; 
    list.set(position, key);
  }
  return steps; 
  }


 /**
   *  Takes in whole vector, and merges left sublist from a[first]..a[mid], 
   *  right sublist from a[mid+1]..a[last].  Precondition:  each sublist 
   *  is already in ascending order
   * @param  a reference to an array of integers to be sorted
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
