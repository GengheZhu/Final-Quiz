import java.util.*;

public class Bokhoor_Megan_Period_6
{
    /**
     *  (largest integer generated = 100)
     *                   100 Integers        200 Integers        400 Integers        800 Integers
     * Bubble                24262               98236               404880              1599108
     *
     * Selection             15246               60496               240996              961996
     * 
     * Insertion              5598                21664              80496               335354
     * 
     * 
     * It appears that by doubling the number of integers sorted, the number of steps is quadrupled. 
     * Insertion also appears to take significantly less steps than the other methods of sorting. 
     */

    private long steps;

    public Bokhoor_Megan_Period_6(){
        steps = 0;
    }

    /**
     *  Counts steps in bubble method.
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Integer> list){
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3; //count one compare and 2 gets
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                    steps += 4; //count 2 gets and 2 sets
                    int temp = list.get(inner);
                    list.set(inner,list.get(inner + 1));
                    list.set(inner + 1,temp);
                }
            }
        }

        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();
    }

    /**
     *  Counts steps for selection sort. 
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Integer> list){
        int min, temp;

        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps += 3; //2 gets, 1 comparison
                if (list.get(inner) < list.get(min)) {
                    min = inner; // a new smallest item is found
                }
            }
            steps += 4; //2 gets, 2 sets
            //swap list[outer] & list[min]
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }

        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    }

    /**
     *  Counts steps for insertion sort. 
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void insertionSort(ArrayList <Integer> list){
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            int key = list.get(position);
            steps += 1; //1 get
            steps += 2; //1 get, 1 comparison
            // Shift larger values to the right
            while (position > 0 && list.get(position - 1) > key){
                list.set(position, list.get(position - 1));
                position--;
                steps += 2; //1 set, 1 get
            }
            list.set(position, key);
            steps += 1; //1 set
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
}
