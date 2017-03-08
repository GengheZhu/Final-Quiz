/**
 *                   100 Integers        200 Integers        400 Integers        800 Integers
 * Bubble            25658               97320               392232              1581608
 *
 * Selection         15246               60496               240996              961996
 * 
 * Insertion         9330                37914               156170              634410
 * 
 * Observations:
 * Bubble is the slowest sorting algorithm, and insertion is the fastest. Required steps for all the
 * algorithms increase exponentially.
 */
import java.util.*;

public class LiuBrandonPeriod4{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public LiuBrandonPeriod4(){
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
                steps += 3;
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
        System.out.println();
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Comparable> list){
        int min;
        Comparable temp;
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps += 3;
                if (list.get(inner).compareTo(list.get(min)) < 0) {
                    min = inner; // a new smallest item is found
                }
            }
            //swap list[outer] & list[min]
            steps += 4;
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
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
    public void insertionSort(ArrayList <Comparable> list){
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            Comparable key = list.get(position);

            // Shift larger values to the right
            steps += 2;
            while (position > 0 && list.get(position - 1).compareTo(key) > 0){
                steps += 4;
                list.set(position, list.get(position - 1));
                position--;
            }
            list.set(position, key);
        }
        System.out.println();
        System.out.println("Insertion Sort");
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
}
