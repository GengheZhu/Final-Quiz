
import java.util.*;
/**
 * Counts steps in bubble sort, selection sort, and insertion sort.
 *
 * @author Kaavya Singhal
 * @version March 8, 2017, Sos, Period 6
 * 
 *          100 Integers        200 Integers        400 Integers        800 Integers
Bubble        24786              98836                  404812           1612444

Selection     15246             60496                   240996             961996

Insertion     4876              18888                   85344             312814

 * 
 * 
 * 
 * 
 * 
 * 
 * In the each of the three kinds of sorting, when you double the number of integers sorted, the number of steps taken is quadrupled. 
Although the number of steps is not always exactly quadrupled, it is an estimation and serves as proof of the fact that there is a quadratic relationship between the number of integers sorted 
and the number of steps.
 */
public class SinghalKaavya6
{
    private long steps;

    public void setStepCount(int num){
        steps = 0;
    }

    public long getStepCount(){
        return steps;
    }

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
    }

    //selection
    void selectionSort(ArrayList <Integer> list){
        int min, temp;

        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps += 3; //2 gets and 1 comparison
                if (list.get(inner) < list.get(min)) {
                    min = inner; 
                }
            }
            steps += 4; //2 gets, 2 sets
            //swap list[outer] & list[min]
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
    }

    //insertion
    void insertionSort(ArrayList <Integer> list){

        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            int key = list.get(position);
            steps += 1; //get
            steps += 2; //get and comparison

            while (position > 0 && list.get(position - 1) > key){
                list.set(position, list.get(position - 1));
                position--;
                steps += 2; //1 set, 1 get
            }
            list.set(position, key);
            steps += 1; //1 set
        }
    }
}

