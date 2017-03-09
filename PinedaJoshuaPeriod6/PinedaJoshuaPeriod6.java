import java.util.*;
/**
 * Please submit your Sorts lab in the following form
 */
public class PinedaJoshuaPeriod6
{
  //driver wasn't working for me so I used the fillArrayWithInts method to get a list and paste it here
  List<Integer> list = new ArrayList<Integer>(Arrays.asList(46, 92, 15, 80, 28, 71, 36, 26, 77, 26, 84, 12, 27, 27, 92, 67, 13, 5, 69, 73, 2, 21, 24, 66, 83, 99, 27, 68, 6, 27, 38, 80, 90, 28, 53, 96, 24, 91, 80, 34, 55, 67, 53, 95, 48, 10, 73, 90, 20, 53, 78, 28, 36, 56, 25, 67, 8, 92, 37, 59, 76, 82, 4, 53, 83, 24, 42, 32, 9, 64, 15, 62, 40, 81, 33, 39, 27, 67, 76, 86, 36, 75, 79, 33, 44, 55, 92, 91, 98, 72, 68, 1, 17, 77, 77, 53, 82, 61, 76, 67, 30, 18, 71, 99, 72, 93, 64, 52, 99, 18, 72, 27, 35, 67, 96, 3, 15, 85, 18, 9, 8, 100, 92, 30, 33, 65, 85, 52, 91, 46, 85, 26, 54, 29, 32, 95, 10, 42, 34, 30, 40, 99, 34, 37, 18, 31, 81, 20, 55, 82, 50, 90, 75, 23, 45, 33, 16, 12, 97, 47, 49, 72, 43, 41, 20, 21, 41, 36, 26, 40, 63, 88, 18, 30, 61, 65, 97, 8, 94, 6, 94, 90, 29, 28, 67, 90, 71, 63, 78, 51, 100, 45, 17, 39, 75, 75, 81, 6, 14, 34, 14, 41, 11, 11, 54, 94, 54, 6, 47, 80, 86, 98, 31, 37, 26, 45, 83, 49, 61, 72, 72, 19, 63, 94, 6, 86, 81, 14, 14, 60, 16, 67, 76, 94, 89, 15, 50, 97, 92, 32, 13, 87, 71, 16, 78, 24, 49, 61, 24, 23, 41, 76, 16, 6, 9, 42, 53, 21, 57, 64, 56, 63, 86, 77, 37, 98, 59, 40, 32, 74, 59, 56, 58, 20, 51, 39, 91, 33, 99, 46, 53, 88, 65, 7, 76, 2, 39, 82, 34, 53, 31, 22, 54, 4, 8, 24, 80, 30, 43, 49, 67, 61, 92, 37, 44, 76, 27, 81, 70, 65, 99, 26, 64, 5, 51, 40, 3, 1, 4, 81, 17, 90, 99, 92, 79, 89, 79, 14, 6, 61, 27, 60, 27, 2, 14, 63, 36, 15, 8, 60, 32, 40, 74, 64, 46, 94, 85, 12, 5, 49, 8, 47, 77, 31, 76, 81, 53, 99, 75, 97, 23, 21, 41, 79, 84, 42, 73, 43, 97, 23, 12, 21, 87, 14, 91, 33, 86, 10, 56, 3, 2, 49, 68, 21, 27, 13, 48, 3, 16, 74, 10, 64, 98, 18, 74, 19, 15, 51, 58, 27, 1, 99, 76, 63, 17, 87, 71, 7, 6, 18, 4, 25, 95, 16, 87, 74, 62, 31, 90, 36, 22, 90, 10, 83, 100, 93, 50, 79, 18, 58, 33, 45, 37, 37, 36, 64, 97, 100, 92, 84, 79, 17, 66, 62, 30, 40, 10, 54, 91, 29, 69, 52, 88, 96, 59, 83, 1, 9, 61, 45, 95, 55, 9, 77, 36, 69, 24, 50, 7, 27, 25, 92, 56, 11, 24, 73, 21, 36, 28, 18, 66, 37, 42, 13, 43, 62, 68, 11, 60, 63, 75, 59, 57, 2, 90, 77, 39, 20, 43, 22, 51, 33, 59, 53, 51, 74, 98, 3, 71, 59, 57, 80, 83, 20, 69, 14, 46, 93, 73, 99, 38, 63, 92, 50, 83, 63, 56, 95, 34, 86, 55, 32, 66, 47, 56, 13, 33, 80, 58, 80, 96, 67, 90, 26, 13, 25, 23, 2, 13, 34, 43, 63, 19, 60, 72, 2, 4, 39, 68, 94, 81, 74, 47, 7, 18, 99, 96, 55, 89, 5, 7, 8, 56, 39, 50, 32, 88, 90, 62, 58, 36, 95, 77, 92, 18, 43, 78, 22, 93, 76, 46, 63, 15, 20, 42, 25, 21, 7, 98, 83, 97, 62, 88, 14, 84, 79, 78, 36, 18, 99, 15, 85, 47, 78, 60, 29, 24, 43, 92, 88, 27, 39, 44, 76, 28, 14, 25, 80, 70, 37, 46, 2, 58, 46, 43, 63, 62, 51, 17, 36, 9, 9, 69, 5, 91, 73, 51, 43, 33, 52, 8, 58, 63, 45, 45, 51, 90, 85, 41, 29, 97, 91, 25, 43, 39, 10, 10, 67, 68, 78, 35, 75, 62, 99, 54, 88, 54, 90, 34, 96, 96, 51, 84, 9, 72, 8, 22, 68, 87, 39, 44, 92, 2, 51, 22, 10, 37, 77, 23, 50, 1, 86, 49, 14, 40, 70, 61, 19, 70, 79, 10, 94, 14, 100, 82, 84, 98, 58, 53, 45, 56, 12, 95, 100, 97, 11, 69, 16, 88, 92, 24, 36, 85, 10, 14, 27, 48, 50, 77, 46, 54, 30, 86, 80, 71, 38, 19, 13, 29, 9, 94, 16, 28, 87, 58, 6, 43, 69, 87, 20, 4, 91, 14, 68, 96, 26, 43, 4, 38, 2, 80, 29, 30, 93, 11, 27, 78, 42, 51, 2, 77, 62, 44, 4, 32, 1, 81, 67, 14, 35, 79, 86, 16, 49, 13, 15, 74, 22, 83, 9));
    
    void insertionSort(){
      int steps = 0;
      for (int outer = 1; outer < list.size(); outer++){
          
          int position = outer;
          int key = list.get(position);
          //counts 1 get
          steps+=1;
          // Shift larger values to the right
          while (position > 0 && list.get(position - 1) > key){
              //counts get and set
              steps+=2;
              list.set(position, list.get(position - 1));
              position--;
            }
          //counts 1 set
          steps+=1;
          list.set(position, key);
      }
      System.out.println(steps);
  }
  
  void selectionSort(){
      int min, temp;
      int steps = 0;

      for (int outer = 0; outer < list.size() - 1; outer++){
          min = outer;
          for (int inner = outer + 1; inner < list.size(); inner++){
              //counts 2 gets
              steps+=2;
              if (list.get(inner) < list.get(min)) {
                  min = inner; // a new smallest item is found
                }
            }   
          //counts 2 sets and 1 get
          steps+=3;
          //swap list[outer] & list[min]
          temp = list.get(outer);
          list.set(outer, list.get(min));
          list.set(min, temp);
        }
      System.out.println(steps);
  }
  
      public void bubbleSort(){
      List<Integer> list = new ArrayList<Integer>(Arrays.asList(44, 28, 30, 70, 78, 66, 49, 30, 61, 33, 22, 43, 32, 88, 63, 51, 7, 46, 48, 10, 66, 71, 79, 41, 73, 19, 35, 75, 38, 21, 76, 78, 13, 16, 81, 51, 31, 97, 42, 93, 93, 16, 78, 97, 89, 46, 89, 74, 89, 50, 36, 88, 36, 97, 90, 76, 73, 39, 9, 30, 21, 2, 82, 3, 21, 49, 34, 43, 62, 98, 20, 6, 22, 2, 8, 71, 92, 83, 53, 73, 64, 48, 78, 38, 16, 18, 54, 43, 55, 99, 8, 71, 81, 79, 59, 14, 8, 14, 28, 44));
      int steps = 0;
      for (int outer = 0; outer < list.size() - 1; outer++){        
          for (int inner = 0; inner < list.size()-outer-1; inner++){
              steps += 3;//count one compare and 2 gets
              if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                  steps += 4;//count 2 gets and 2 sets
                  Integer temp = list.get(inner);
                  list.set(inner,list.get(inner + 1));
                  list.set(inner + 1,temp);
              }
          }
      }
      System.out.println(steps);
  }
    
    /**
    * Name of your class: LastName-FirstName-Period-#.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            24950              24950                24950               24950
    *
    * Selection         10197              10197                80116               323490
    * 
    * Insertion         5248               40397                160797              641597
    * 
    * 
    * I see that although insertion uses very little steps with a small array, it becomes more and more innefficient as the array gets bigger. Selection is the most efficient with 200 characters in the array. Bubble always has the same number of moves although it may have been coded incorrectly.
    */
}
