
import java.util.*;

public class LanJustin1stPeriod {
     /**
    * Name of your class: Lan-Justin-Period-1.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        
    * Bubble			4950
    *
    * Selection			4950
    * 
    * Insertion			2557
    * 
    * 
    *				   200 Integers
    * Bubble			19900
    * 
    * Selection			19900
    * 
    * Insertion			10205
* 			   400 Integers
* Bubble			79800
* 
* Selection			79800
* 
* Insertion			40986
* 
* 
* 			    800 Integers
* Bubble			319600
* 
* Selection			319600
* 
* Insertion			166036

    * Selection sorting does less steps than Bubble sorting, but 
    * Insertion sorting does less steps than Selection sorting 
    * does. Out of the three sorting methods, Bubble sorting is
    * is the least efficient compared to Selection and Insertion
    * sorting.
    */

  private long steps;

  public LanJustin1stPeriod(){
    steps = 0;
  }

  public void bubbleSort(ArrayList <Comparable> list){
    int i = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
        for (int inner = 0; inner < list.size()-outer-1; inner++){
            if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                //Swaps the list
                Comparable temp = list.get(inner);
                list.set(inner, list.get(inner + 1));
                list.set(inner + 1, temp);
            }
            i++;
        }
    }
    System.out.println();
    System.out.println("Bubble Sort");
    steps = i;
    System.out.println();
  }

  public void selectionSort(ArrayList <Comparable> list){
    Comparable temp;
    int min;
    int i = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            i++;
          if (list.get(inner).compareTo(list.get(min)) < 0) {
            min = inner; // The new smallest item is found
          }
        }
        //Swaps the list
        temp = list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
      }
    System.out.println();
    System.out.println("Selection Sort");
    steps = i;
    System.out.println();
  }

  public void insertionSort(ArrayList <Comparable> list){
    int i = 0;
      for (int outer = 1; outer < list.size(); outer++){
        int position = outer;
        Comparable key = list.get(position);
        // Shifts the larger values to the right
        while (position > 0 && list.get(position - 1).compareTo(key) > 0){
          list.set(position, list.get(position - 1));
          position--;
          i++;
        }
        list.set(position, key);
      }
    System.out.println();
    System.out.println("Insertion Sort");
    steps = i;
    System.out.println();
  }

  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
    System.out.println();
    System.out.println("Merge");
    System.out.println();

  }

  public void mergeSort(ArrayList <Comparable> a, int first, int last){
    System.out.println();
    System.out.println("Merge Sort");
    System.out.println();
  }

  public long getStepCount(){
    return steps;
  }

  public void setStepCount(long stepCount){
    steps = stepCount;
  }
 
  public void swap(ArrayList <Comparable> list, int a, int b){
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}