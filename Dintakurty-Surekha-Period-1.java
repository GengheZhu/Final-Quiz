
public class Dintakurty-Surekha-1.java
{
    /**
    * Name of your class: Dintakurty-Surekha-1.java
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    */
      
   /* Following table should be filled out AT TOP OF CLASS:
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    
    * Bubble               25258               100244              405900            1573052


    * Selection            15246               60496               240996            961996


    * Insertion            5210                21560               83132             327248
    */
    
 // Constructor
  public Sorts()
  {
    steps = 0;
  }   
    
// Method below is for Bubble Sort
    
  public void bubbleSort(ArrayList <Comparable> list){
  steps = 0;
  for (int outer = 0; outer < list.size() - 1; outer++){
    for (int inner = 0; inner < list.size()-outer-1; inner++){
        steps += 3;//count one compare and 2 gets
        if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
           steps += 4;//count 2 gets and 2 sets
           Comparable temp = list.get(inner);
           list.set(inner,list.get(inner + 1));
           list.set(inner + 1,temp);
        }
    }
  }
  System.out.println("Number of steps executed in bubble sort:"+steps);
}
  
//Method below is for Selection Sort
    
  public void selectionSort(ArrayList <Comparable> list){
 int min;
  steps =0;
  for (int outer = 0; outer < list.size() - 1; outer++){
    min = outer;
    for (int inner = outer + 1; inner < list.size(); inner++){
      steps += 3; //count one compare and 2 gets  
      if (list.get(inner).compareTo(list.get(min)) < 0){     
        min = inner; // a new smallest item is found
      }
    }
    //swap list[outer] & list[min]
    steps +=4; //count 2 gets and 2 sets
    Comparable temp = list.get(outer);
    list.set(outer, list.get(min));
    list.set(min, temp);
  }
  System.out.println("Number of steps executed in selection sort:"+steps);
}
    
//Method for Insertion Sort
  public void insertionSort(ArrayList <Comparable> list){
   steps=0;   
      
   for (int outer = 1; outer < list.size(); outer++){
       int position = outer;
       steps += 1; // one get 
       Comparable key = list.get(position);
       

       // Shift larger values to the right
       steps += 2; //one comparison and one get
       while (position > 0 && (list.get(position - 1).compareTo(key)>0)){
           steps += 2; //one get and one set operation
           list.set(position, list.get(position - 1));
           position--;
      }
      steps += 1; //one set
      list.set(position, key);
  }
  System.out.println("Number of steps executed in insertion sort:"+steps);
  
}
    
/**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount()
  {
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
  public void setStepCount(long stepCount)
  {
    steps = stepCount;
  }
    
    
   /* Write a 1-2 sentence write-up about your observations.
    
      I noticed that the output of the number of steps decreases from each sorting method.
        Bubble Sort use the most number of steps, Then Selection and finnaly Insertion uses the lest amount of Steps.
        As the vallue of Integers increase one additional unit in the amount of step increases, hense the quardatic form. */
}
