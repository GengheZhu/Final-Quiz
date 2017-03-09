import java.util.*;

/**
 *              100 integers    200 integers    400 integers    800 integers
 *  Bubble          15470           61116          242244          964624
 *  Selection       15246           60496          240996          961996
 *  Insertion       4123            20077          73757           303551
 *  
 *  Observations:
 *  When the number of integers doubles, instead of doubling, the number of steps 
 *  approximately quadruples. Insertion requires in general the least amount of steps,
 *  and bubble and selection require relatively the same amount of steps.
 */
public class LiPeggy4{
    private long steps;

    /**
     *  Description of Constructor
     *
     * @param  list  Description of Parameter
     */
    public LiPeggy4(){
      steps = 0;
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void bubbleSort(ArrayList <Comparable> list){
        setStepCount(0);
        for (int outer = 0; outer < list.size() - 1; outer++)
        {
            for (int inner = 0; inner < list.size() - outer - 1; inner++)
            {
                steps += 3;
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0)
                {
                    steps += 4;
                    swap(list, inner, inner + 1);
                }
            }
        }
    }

    /**
     *  Description of the Method
     *
     * @param  list  reference to an array of integers to be sorted
     */
    public void selectionSort(ArrayList <Comparable> list){
        setStepCount(0);
        int min, temp;
        for (int outer = 0; outer < list.size() - 1; outer++)
        {
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++)
            {
                steps += 3;
                if (list.get(inner).compareTo(list.get(min)) < 0)
                {
                    min = inner;
                }
            }
            steps += 4;
            swap(list, outer, min);
        }
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
        list.set(a, list.get(b));
        list.set(b, list.get(a));
    }
}
