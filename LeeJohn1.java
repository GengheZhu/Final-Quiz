import java.util.*;

  /**                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble               24682               100328              393672             1596732  
    *
    * Selection            15264               60496               240996             961996 
    * 
    * Insertion            9832                44044               162208             628212
    * 
    * The bubble sort definitely takes the most steps while the insertion sort takes the shortest. 
    * The insertion sort code also does seem to be more simple, whie the selection sort seems the 
    * most complicated. 
    **/ 

public class LeeJohn1{
    private long steps;

    public LeeJohn1(){
        steps = 0;
    }

    public void bubbleSort(ArrayList <Integer> list){
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3; //count one compare and two gets 
                if (list.get(inner) > list.get(inner + 1)){
                    //swap list[inner] & list[inner+1]
                    steps+=4; //count 2 gets and 2 sets 
                    int temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);
                }
            }
        }
        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();
    }

    public void selectionSort(ArrayList <Integer> list){
        int min, temp;
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps+= 3; //counts two gets and a comparison
                if (list.get(inner) < list.get(min)) {
                    min = inner; // a new smallest item is found
                }
            }
            //swap list[outer] & list[min]
            steps+= 4; //counts 2 gets and 2 sets 
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    }

    public void insertionSort(ArrayList <Integer> list){
        steps = 0;
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            steps+=3; //counts the get and the first get and comparison of the whil loops
            int key = list.get(position);
            // Shift larger values to the right
            while (position > 0 && list.get(position - 1) > key){
                steps+= 4;
                list.set(position, list.get(position - 1));
                position--;
            }
            steps+=1; //counts the set
            list.set(position, key);
        }
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
    }

    public long getStepCount(){
        return steps;
    }

    public void setStepCount(long stepCount){
        steps = stepCount;
    }
    
}
