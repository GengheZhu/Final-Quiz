import java.util.*;
/**DATA:            100 ints    200 ints    400 ints    800 ints
 *
 * Bubble:      24524       98512       404235      1435839
 *
 * Selection:   15253       60313       235834      993853
 *
 * Insertion:   5371        19953       80593      359293
 
 * When I ran the sorts, the bubble sort took the most steps, with selection taking the 2nd most
 * steps, and insertion being the quickest.
 */

public class TangAlpinePeriod1{
    private long steps;
    
    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public TangAlpinePeriod1(){
        steps = 0;
    }
    
    /**
     * Bubblesort Counter
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){
        for (int outer = 0; outer < list.size() - 1; outer++){ //outer #
            for (int inner = 0; inner < list.size()-outer-1; inner++) //inner #
            {
                steps+= 3; // counts 1, 2 gets
                if (list.get(inner) > list.get(inner + 1)){
                    steps+=4;
                    int temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);
                }
            }
        }
        System.out.println();
        System.out.println("Bubble");
        System.out.println();
    }
    
    
    /**
     *  Selection Sort Counter
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        int min, temp;
        
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer; //sets min to outer #
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps+=3;
                if (list.get(inner) < list.get(min)) {
                    min = inner; // new smallest item
                }
            }
            //swaps
            steps+=4;
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
        System.out.println();
        System.out.println("Selection");
        System.out.println();
    }
    
    /**
     *  Insertion sort step counter.
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Integer> list){
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            int key = list.get(position);
            steps +=3;
            // Shift larger values to the right
            while (position > 0 && list.get(position - 1) > key){
                list.set(position, list.get(position - 1));
                steps+=4;
                position--;
            }
            steps+=1;//counts
            list.set(position, key);
        }
        System.out.println();
        System.out.println("Insertion");
        System.out.println();
    }
    public long getStepCount()
    {
        return steps;
    }
    public void setStepCount(long stepCount)
    {
        steps = stepCount;
    }
    public void swap(ArrayList <Comparable> list, int a, int b){
        //replace these lines with your code
        System.out.println();
        System.out.println("Swap");
        System.out.println();
    }
}



