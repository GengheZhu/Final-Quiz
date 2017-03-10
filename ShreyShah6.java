/**
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            24828               99714               400296              1629448
    *
    * Selection         15246               60496               240996              961996
    * 
    * Insertion         5436                21028               80982               319908
    * 
    * 
    * As the number of integers goes up, the sort time goes up. The ratio for these 3 sorts are almost constant, but for what are considered better sort, the ratio changes with more integers.
    * 
    */ 
import java.util.*;
public class ShreyShah6 {
  private long steps;
    public QuadSort() {
        steps = 0;
    }
    public void bubbleSort(ArrayList <Comparable> list){
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3;//count one compare and 2 gets
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                    steps += 4;//count 2 gets and 2 sets
                    Comparable temp = list.get(inner);
                    list.set(inner,list.get(inner + 1));
                    list.set(inner + 1,temp);
                }
            }
        }
        System.out.println("Bubble Sort steps: " + steps);
    }
    public void selectionSort(ArrayList <Comparable> list){
        int min, temp;
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                if (list.get(inner).compareTo(list.get(min)) > 0) {
                    steps += 2;
                    min = inner; // a new smallest item is found
                }
                steps += 2;
            }
            //swap list[outer] & list[min]
            temp = (int) list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
            steps += 4;
        }
        System.out.println("Selection Sort steps: " + steps);
    }
    public void insertionSort(ArrayList <Comparable> list){
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            int key = (int) list.get(position);
            steps++;
            // Shift larger values to the right
            while (position > 0 && list.get(position - 1).compareTo(key) > 0){
                steps += 3;
                list.set(position, list.get(position - 1));
                position--;
            }
            list.set(position, key);
            steps++;
        }
        System.out.println("Insertion Sort steps: " + steps);
    }
    public long getStepCount(){
        return steps;
    }
    public void setStepCount(long stepCount){
        steps = stepCount;
    }
}