import java.util.*;

/**
 *  Wei-Chris-Period-6.java
 *
 *              100 Int's       200 Int's       400 Int's       800 Int's
 *Bubble        24118           101160          394592          1586600
 *
 *Selection     16126           63008           246576          973776
 *
 *Insertion     5265            19967           83581           329961
 *
 *
 *I can see that the bubble sort method contains the most amount of steps. In second,
 *selection still doesn't seem to do that much less. Insertion seems to be the least
 *amount of steps, but I remember that if the list is already ordered it takes less
 *steps - maybe that means something I don't know.
 *
 *
 *SortsTemplate Class:
 *Code it and
 *Code it and
 *Let's get coding, like a bubblesort babbyyy,
 *Don't wanna sort it out, can we fig it out?
 *Cause we gon' be up all night, code a method
 *You say I'm a co-der, guess I'm a sus man
 *If ya want clean-code,
 *baby use the key board
 *Kinky with the data ata,
 *Baby write me java java
 *Codeuhh, program writeuhh (sorry sos)
 *
 */
public class WeiChrisPeriod6
{
      private long steps;

      public WeiChrisPeriod6()
      {
        steps = 0;
      }

      public void bubbleSort(ArrayList <Integer> list)
      {
          steps = 0;
          
          for (int outer = 0; outer < list.size() - 1; outer++)
          {
              for (int inner = 0; inner < list.size()-outer-1; inner++)
              {
                  steps += 3;
                  if (list.get(inner) > list.get(inner + 1))
                  {
                    steps += 4;
                    int temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);
                  }
              }
          }
      }
    
      public void selectionSort(ArrayList <Integer> list)
      {
          int min, temp;
          steps = 0;
        
          for (int outer = 0; outer < list.size() - 1; outer++)
          {
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++)
            {     
                steps += 3;
                if (list.get(inner) < list.get(min))
                {         
                    steps += 4;
                    min = inner;
                }
            }
            
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
          }
      }
    
      public void insertionSort(ArrayList <Integer> list)
      {
          steps = 0;
          
          for (int outer = 1; outer < list.size(); outer++)
          {
            steps += 2;
            int position = outer;
            int key = list.get(position);
            
            while (position > 0 && list.get(position - 1) > key)
            {
              steps += 2;
              list.set(position, list.get(position - 1));
              position--;
            }
            steps += 1;
            list.set(position, key);
          }
      }
    
      private void merge(ArrayList <Comparable> a, int first, int mid, int last){
        //replace these lines with your code
        System.out.println();
        System.out.println("Merge");
        System.out.println();
    
      }
    
      public void mergeSort(ArrayList <Integer> a, int first, int last){
        //replace these lines with your code
        System.out.println();
        System.out.println("Merge Sort");
        System.out.println();
      }
    
      public long getStepCount(){
        return steps;
      }
    
      public void setStepCount(long stepCount){
        steps = stepCount;
      }

      public void swap(ArrayList <Integer> list, int a, int b){
        //replace these lines with your code
        System.out.println();
        System.out.println("Swap");
        System.out.println();
      }
}
