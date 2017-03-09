
public class MillerDylanPeriod4
{
     /**
      *     Numbers were up to 100 to generate
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble              25878             100576                  404648              1607620
    *
    * Selection             15246           60496                   240996              961996
    * 
    * Insertion             5171            19073                   78139               318781
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    * It shows that the least step method is insertion over the other sorting methods with bubble having the most.
    */
    // instance variables - replace the example below with your own
     private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public MillerDylanPeriod4(){
    steps = 0;
  }

  /**
   *  Description of the Method
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
   *  Description of the Method
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
