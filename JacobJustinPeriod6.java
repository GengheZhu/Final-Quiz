import java.util.*;

/**DATA:                100         200         400         800
     *
     * BubbleSort:      24974       99136       404720      1595988
     *
     * SelectionSort:   15246       60496       240996      961996
     *
     * InsertionSort:   5357        20811       82321       321757
     * The steps increase as a quadratic function of the size of the list.
     * Bubble sort is much slower than the other sorts.
     */

public class JacobJustinPeriod6{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public JacobJustinPeriod6(){
    steps = 0;
  }

  /**
   * Bubblesort Counter
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list){
      for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
              steps+= 3;
              if (list.get(inner) > list.get(inner + 1)){
                steps+=4;
                int temp = list.get(inner);
                list.set(inner, list.get(inner + 1));
                list.set(inner + 1, temp);
              }
            }
          }
  }

  /**
   *  Selection Sort Counter
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list){
      int min, temp;

      for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            steps+=3;
          if (list.get(inner) < list.get(min)) {
            min = inner; // a new smallest item is found
          }
        }
        steps+=4;
        //swap list[outer] & list[min]
        temp = list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
      }

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

            // Shift larger values to the right
            while (position > 0 && list.get(position - 1) > key){
              list.set(position, list.get(position - 1));
              position--;
              steps+=2;
            }
            steps+=3;
            list.set(position, key);
          }
  }


}
