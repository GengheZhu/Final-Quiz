package com.vishnu;

import java.util.*;

/**
 *  
 *
 *
 *              100 integers  200 integers  400 integers  800 integers
 *BubbleSort    297            597          1197            2397
 *
 *SelectionSort 2475           2475         2475            2475
 *
 *InsertionSort 401            801          1601            2401
 *Through this "experience" I figured that the number of steps taken in bubble sort is 3(n-1) where n is the number of items, selection sort is always the same, and 
 *insertion is about 4n+1. Plus, I learnt of the Comparable object and its versitility.
 *
 * @author     Vishnu Kalidas
 * @created    November 16, 2000
 */
public class KalidasVishnuPeriod4 {
    private long steps;

    public KalidasVishnuPeriod4(){
        steps = 0;
    }

    
    public void bubbleSort(ArrayList <Comparable> list) {
        for (int outer = 0; outer < list.size() - 1; outer++) {
            for (int inner = 0; inner < list.size() - outer - 1; inner++) {
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0) {
                    steps += 3;
                    if(list.get(inner).compareTo(list.get(inner + 1)) > 0) {
                        steps += 4;
                        Comparable temp = list.get(inner);
                        list.set(inner, list.get(inner + 1));
                        list.set(inner + 1, temp);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();
    }


    public void selectionSort(ArrayList <Comparable> list){
        int min, temp;

        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                if (list.get(inner).compareTo(list.get(min)) > 0) {
                    steps += 3;
                    min = inner;
                }
            }
            steps += 3;
            temp = (int) list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
        System.out.println();
        System.out.println("Selection Sort");
        System.out.println();
    }


    public void insertionSort(ArrayList <Comparable> list){
        for (int outer = 1; outer < list.size(); outer++){
            int position = outer;
            int key = (int) list.get(position);

            while (position > 0 && list.get(position).compareTo(list.get(position - 1)) > key){
                list.set(position, list.get(position - 1));
                steps += 3;
                position--;
            }
            list.set(position, key);
            steps += 1;
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

    /**
     *  Interchanges two elements in an ArrayList
     *
     * @param  list  reference to an array of integers
     * @param  a     index of integer to be swapped
     * @param  b     index of integer to be swapped
     */
    public void swap(ArrayList <Comparable> list, int a, int b){
        //replace these lines with your code
        System.out.println();
        System.out.println("Swap");
        System.out.println();
    }
}
