import java.util.*;
import java.lang.Comparable;
/**
 *  Description of the Class
 *
 * @author     Irene Sha    
 * @created    Some Day, some Year
 * 
 *               100 integers    200 integers    400 integers    800 integers
 *  Bubble          15470           61116          242244          964624
 *  Selection       15246           60496          240996          961996
 *  Insertion       4123            20077          73757           303551
 *  
 *  Observations: Insertion is the fastest out of all three methods (because it can eliminate extra rounds of calculation by checking for existing order).
 *  The sorting methods quadruple in steps when integer amounts double. 
 */
public class ShaIrene6{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public ShaIrene6(){
        steps = 0;
    }

    /**
     *  Description of the Method
     *  Bubble Sort 
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Comparable> list){
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3;
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                    steps += 4;
                    Comparable temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);
                }
            }
        }
        System.out.println();
        System.out.println("Bubble Sort:");
        System.out.println(steps + " steps");
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Comparable> list){
        int min;
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps += 3; 
                if ((list.get(inner)).compareTo(list.get(min)) < 0) {
                    min = inner; // a new smallest item is found
                }
            }            
            swap(list, outer, min);
            steps += 4;
        }
        System.out.println();
        System.out.println("Selection Sort:");
        System.out.println(steps + " steps");
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Comparable> list){
        setStepCount(0);
        for (int outer = 1; outer < list.size(); outer++)
        {
            int position = outer;
            steps += 3;
            int key = (int)list.get(position);
            while (position > 0 && (int)list.get(position - 1) > key)
            {
                steps += 2;
                list.set(position, list.get(position - 1));
                position --;
            }
            list.set(position, key);
        }

        System.out.println();
        System.out.println("Insertion Sort:");
        System.out.println(steps + " steps");
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
        Comparable swap1 = list.get(a);
        Comparable swap2 = list.get(b);
        list.set(b, swap1);
        list.set(a, swap2);

        System.out.println();
        System.out.println("Swap");
        System.out.println();
    }
}
