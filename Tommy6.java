 /**
   * Please submit your Sorts lab in the following form
   */
 -public class SubmissionTemplate
 import java.util
 public class Kim_Tommy_Period_6
  {
      /**
     * Name of your class: LastName-FirstName-Period-#.java
     * Name of your class: Kim-Tommy-Period-6.java
      * 
      * Class includes sorts WITH STEP COUNTERS ADDED IN
      * 
      * Following table should be filled out AT TOP OF CLASS:
      * 
      * 
      *                   100 Integers        200 Integers        400 Integers        800 Integers
     * Bubble
     * Bubble            24278                  96868               404692            1612440
      *
     * Selection
     * Selection         15246                  60496               240996            961996
     *   
     * Insertion         7707                   31589               116964            491885
      * 
     * Insertion
     * 
    * 
     * Write a 1-2 sentence write-up about your observations.
     * After comparing all the sorts, bubble sort is the least efficient because it takes many more steps to complete the same task. 
     * Between selection and insertion, insertion is more efficient because it takes half as many steps and finishes at a faster rate.
      */
 }
    private long steps;
  
    public Kim_Tommy_Period_6(){
        steps = 0;
    }
   
    public void bubbleSort(ArrayList <Comparable> list){
        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
                   //swap list[inner] & list[inner+1]
                    steps+=4;
                    Comparable temp = list.get(inner);
                    list.set(inner, list.get(inner + 1));
                    list.set(inner + 1, temp);
               }
                steps+=3;
            }
        }
        System.out.println("Bubble Sort");
    }
    
    public void selectionSort(ArrayList <Integer> list){
        steps = 0;
        int min, temp;
        for (int outer = 0; outer < list.size() - 1; outer++){
            min = outer;
            for (int inner = outer + 1; inner < list.size(); inner++){
                steps += 3; 
                if (list.get(inner).compareTo(list.get(min)) < 0) 
                    min = inner; // a new smallest item is found
            }
            //swap list[outer] & list[min]
            steps += 4;
            temp = list.get(outer);
            list.set(outer, list.get(min));
            list.set(min, temp);
        }
        System.out.println("Selection Sort");
   }
 
   public void insertionSort(ArrayList <Integer> list){
       steps = 0;
       for (int outer = 1; outer < list.size(); outer++){
           int position = outer;
           int key = list.get(position);
           // Shift larger values to the right
           while (position > 0 && list.get(position - 1) > key){
               list.set(position, list.get(position - 1));
               position--;
               steps += 3;
           }
           list.set(position, key);
           steps += 1;
       }
       System.out.println("Insertion Sort");
   }
   
   public int getStepCount(){
       return steps;
   }
  
   public void setStepCount(int x){
      steps = x;
   }
