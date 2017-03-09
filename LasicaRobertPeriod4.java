import java.util.*;
/**
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble            24818               99644               405296              1599448
    *
    * Selection         15246               60496               240996              961996
    * 
    * Insertion         5116                21068               74982               311708
    * 
    * 
    * While the sort methods are almost instantaneous, certain methods are faster than others. For Example, Insertion
    * seems to use one fith as many steps as bubble, and Selection uses six tenths as many steps as bubble.
    * 
    */ 
public class LasicaRobertPeriod4
{
    private long steps;

    public LasicaRobertPeriod4(){
        steps = 0;
    }
      public void bubbleSort(ArrayList <Integer> list){
          steps = 0;
          for (int o = 0; o < list.size() - 1; o++){
          for (int i = 0; i < list.size()-o-1; i++){
              steps += 3;
              if (list.get(i) > list.get(i + 1)){
                  //swap list[inner] & list[inner+1]
                  int temp = list.get(i);
                  list.set(i + 1, temp);
                  list.set(i, list.get(i + 1));
                  steps += 4;
              }
            }
        }
    }

    public void selectionSort(ArrayList <Integer> list){
        int min, temp;
        steps = 0;
        for (int o = 0; o < list.size() - 1; o++){
            min = o;
            for (int i = o + 1; i < list.size(); i++){
                steps += 3;
                if (list.get(i) < list.get(min)) {
                    min = i; // a new smallest item is found
                }
            }
            //swap list[outer] & list[min]
            steps += 4;
          temp = list.get(o);
          list.set(o, list.get(min));
          list.set(min, temp);
        }
    }
  public void insertionSort(ArrayList <Integer> list){
      steps = 0;
      for (int o = 1; o < list.size(); o++){
          int position = o;
          steps++;
          int key = list.get(position);
          // Shift larger values to the right
          while (position > 0 && list.get(position - 1) > key){
              steps += 2;
              list.set(position, list.get(position - 1));
              position--;
          }
          steps++;
          list.set(position, key); 
      }
  }
/*
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
    //replace these lines with your code
    System.out.println();
    System.out.println("Merge");
    System.out.println();
  }
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
    //replace these lines with your code
    System.out.println();
    System.out.println("Merge Sort");
    System.out.println();
  }
*/
  public long getStepCount(){
    return steps;
  }
  
  public void setStepCount(long stepCount){
    steps = stepCount;
  }
  /*
  public void swap(ArrayList <Comparable> list, int a, int b){
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
   */
   
}
