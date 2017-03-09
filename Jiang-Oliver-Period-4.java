
/**
 * Please submit your Sorts lab in the following form
 */
public class JiangOliverPeriod4
{
    /**
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble	       17484                 70247                 282519               1082894 
    *
    * Selection    10197                 40397                  160797               641597
    * 
    * Insertion     7167                   29379                  124359               496689
    * 
    * I notice that Bubble is significantly slower than the other two methods in every situation listed, taking almost twice as much time to sort than Selection. 
    * Of the other two, Insertion is faster than Selection by about 25%. Compared with my neighbor's stats, I notice that our Selection numbers were all the same,
    * which makes sense because Selection sort does not adapt.
    */

    /**
    *  swap terms until the largest is at the right place. Repeat until sorted.
    *
    * @param  list  reference to an array of integers to be sorted
    */
    public void bubbleSort(ArrayList <Integer> list){
      for (int outer = 0; outer < list.size() - 1; outer++){
          for (int inner = 0; inner < list.size()-outer-1; inner++){
              steps += 2;
              if (list.get(inner) > list.get(inner + 1)){
                  steps += 3;
                  //swap list[inner] & list[inner+1]
                  int temp = list.get(inner);
                  list.set(inner, list.get(inner + 1));
                  list.set(inner + 1, temp);
              }
          }
      }
    }
    
    /**
    *  find the smallest number and set it aside. repeat until sorted
    *
    * @param  list  reference to an array of integers to be sorted
    */
    public void selectionSort(ArrayList <Integer> list){
      int min, temp;
      for (int outer = 0; outer < list.size() - 1; outer++){
          min = outer;
          for (int inner = outer + 1; inner < list.size(); inner++){
              steps += 2;
              if (list.get(inner) < list.get(min)) {
                  min = inner; // a new smallest item is found
              }
          }
          //swap list[outer] & list[min]
          temp = list.get(outer); steps += 1;
          list.set(outer, list.get(min)); steps += 1;
          list.set(min, temp); steps += 1;
      }
    }
    
    /**
    *  inserts elements into the sorted section until everything is sorted
    *
    * @param  list  reference to an array of integers to be sorted
    */
    public void insertionSort(ArrayList <Integer> list){
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            int key = list.get(position); steps += 1;

            // Shift larger values to the right
            while (position > 0 && list.get(position - 1) > key){
                list.set(position, list.get(position - 1));
                position--;
                steps += 3;
            }
            steps+= 1;
            list.set(position, key); steps += 1;
        }
    }
}
