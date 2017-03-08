import java.util.*;

/**
 *  Wang-Sophia-4th Period
 */

/*                                              TABLE
 *                  100             200             400             800
 * Bubble           24646           100968          398716          1612720    
 * 
 * Selection        15246           60496           240996          961996
 * 
 * Insertion        5356            21006           78862           328200
 
 * 
 * I found it very interesting that when I ran the code again for selection, the number of steps
 * were exactly the same. This is probably because selection goes through all of the numbers
 * regardless of whether they are the same. Also, insertion was the most effective by far. 
 * 
 * */

public class Sorts{
      private long steps;
    
      public Sorts(){
         steps = 0;
      }
    
      //counts steps taken in bubble sort
      public void bubbleSort(ArrayList <Integer> list){
          steps=0;
          for (int outer = 0; outer < list.size() - 1; outer++){
              for (int inner = 0; inner < list.size()-outer-1; inner++){
                  steps+=3;
                  if (list.get(inner) > list.get(inner + 1)){
                      steps+=4;
                      int temp = list.get(inner);
                      list.set(inner, list.get(inner + 1));
                      list.set(inner + 1, temp);
                  }
              }
          }
          System.out.println("This is steps for bubbleSort: "+ steps);
      }
    
      //counts steps taken in selection sort
      public void selectionSort(ArrayList <Integer> list){
          int min, temp;
          steps=0;

          for (int outer = 0; outer < list.size() - 1; outer++){
              min = outer;
              for (int inner = outer + 1; inner < list.size(); inner++){
                    steps+=3;
                    if (list.get(inner) < list.get(min)) {
                      min = inner; // a new smallest item is found
                    }
              }
              steps+=4;
              temp = list.get(outer);
              list.set(outer, list.get(min));
              list.set(min, temp);
          }
          System.out.println("This is steps for selectionSort: "+ steps);
      }
    
      //counts steps taken in insertion sort
      public void insertionSort(ArrayList <Integer> list){
          steps=0;
          for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            steps+=1;
            int key = list.get(position);
        
            steps+=2;
            while (position > 0 && list.get(position - 1) > key){
              steps+=2;
              list.set(position, list.get(position - 1));
              position--;
            }
            steps+=1;
            list.set(position, key);
          }
          System.out.println("This is steps for insertionSort: "+ steps);
        }

      
}

    
      