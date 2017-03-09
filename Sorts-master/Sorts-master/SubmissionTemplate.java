import java.util.*;
/**
 * Bailey Yang Per. 6
 * 
 *                   100 Integers        200 Integers        400 Integers        800 Integers
 * Bubble               24714               99708                397960             1557336
 * 
 * Selection            15246               60496                240996              961996
 * 
 * Insertion            5348                19614                82324               309906 
 * 
 * 
 * I agree that InsertionSort is the most efficient because it sorts in less steps. That makes BubbleSort the least 
 * efficient because it takes a lot of steps. All results seem to grow exponentially as I add more integers.
 *
 */
public class Sorts
{
  private long steps;

  public Sorts(){
      steps = 0;
  }
  
  public void bubbleSort(ArrayList <Integer> list){
	steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
      for (int inner = 0; inner < list.size()-outer-1; inner++){
        steps += 3;
        if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
           steps += 4;
           int temp = list.get(inner);
           list.set(inner,list.get(inner + 1));
           list.set(inner + 1,temp);
        }
      }
    }
	System.out.println();
	System.out.println("Bubble Sort");
	System.out.println();
	System.out.println("Steps: " + steps);
  }

  public void selectionSort(ArrayList <Integer> list){
	int steps = 0;
	int min, temp;
    for (int outer = 0; outer < list.size() - 1; outer++){
      min = outer;
      for (int inner = outer + 1; inner < list.size(); inner++){
        steps += 3;
        if (list.get(inner).compareTo(list.get(min)) < 0) {
          min = inner; //finds smallest
        }
      }
      steps += 4;
      temp = list.get(outer);
      list.set(outer, list.get(min));
      list.set(min, temp);
    }
	System.out.println();
	System.out.println("Selection Sort");
	System.out.println();
	System.out.println("Steps: " + steps);
  }

  public void insertionSort(ArrayList <Integer> list){
	steps = 0;
	for (int outer = 1; outer < list.size(); outer++){
      int position = outer;
      int key = list.get(position);
      steps++; // all larger values shift R
      steps += 2;
      while (position > 0 && list.get(position - 1).compareTo(key) > 0){
        steps += 2;
        list.set(position, list.get(position - 1));
        position--;
      }
      steps++;
      list.set(position, key);
    }
	System.out.println();
	System.out.println("Insertion Sort");
	System.out.println();
	System.out.println("Steps: " + steps);
  }
 
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
	//Im so confused what is this
	System.out.println();
	System.out.println("Merge");
	System.out.println();

  }

  public void mergeSort(ArrayList <Comparable> a, int first, int last){
	//Did we have to do these?
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
	//I doubt ur gonna read this but if u are: Hi there.
	System.out.println();
	System.out.println("Swap");
	System.out.println();
  }
}
