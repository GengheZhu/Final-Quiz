import java.util.*;

/**
 *  Description of the Class
 *
 * Winnie Zhou
 * 3/7/17
 * 
 *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            23494               96868               384840              1600300
    *
    * Selection         15147               60297               240597              961197
    * 
    * Insertion          5133               20827                78715              312665
    * 
    * 
    * Insertion has more steps than Selection, which has more steps than Bubble,
    * because in Bubble, you need to compare every value to all the others down the list. 
    * In Selection, you only compare the values to the smallest value in the list. 
    * This skips many unnecessary comparisons made in Bubble. 
    * In Insertion, the values change order after comparison, futher reducing unnecessary comparisons.
    * Bubble usually has around 5x the steps as Insertion and Comparison has around 3x as many steps.
 */
public class Zhou_Winnie_Period_1{
  private long steps;
  
  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Zhou_Winnie_Period_1(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
    steps = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
        for (int inner = 0; inner < list.size()-outer-1; inner++){
          steps +=3;
            if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
              //swap list[inner] & list[inner+1]
              steps += 4;
              Comparable temp = list.get(inner);
              list.set(inner, list.get(inner + 1));
              list.set(inner + 1, temp);
          }
        }
    }
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println(list);
    System.out.println("Steps: " + steps);
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
     Comparable temp;
     int min;
     steps=0;
      for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
          steps += 3;
          if (list.get(inner).compareTo(list.get(min))< 0) {
            min = inner; // a new smallest item is found
          }
        }
        //swap list[outer] & list[min]
        temp = list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
        steps+=3;
      }
     System.out.println();
     System.out.println("Selection Sort");
     System.out.println(list);
     System.out.println("Steps: " + steps);
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
     steps = 0;
      for (int outer = 1; outer < list.size(); outer++){
        int position = outer;
        Comparable key = list.get(position);
        // Shift larger values to the right
        steps +=2;
        while (position > 0 && list.get(position - 1).compareTo(key)>0){
          steps+=2;
          list.set(position, list.get(position - 1));
          position--;
        }
        list.set(position, key);
        steps++;
     }
     System.out.println();
     System.out.println("Insertion Sort");
     System.out.println(list);
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
  /**
  public static void main(String[] args){
    ArrayList <Comparable> list1 = new ArrayList<Comparable>(4);
    list1.add(1);
    list1.add(4);
    list1.add(3);
    list1.add(2);
    bubbleSort(list1);
    selectionSort(list1);
    insertionSort(list1);
  }
  */
}

