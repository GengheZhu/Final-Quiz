
/**
 * Please submit your Sorts lab in the following form
 */
public class SubmissionTemplate
{
    /**
    * Name of your class: Malekar-Ameya-Period-4.java
    * 
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    * 
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble		15192		    63408		223104              980220
    *
    * Selection		1012		    2120		4708		    9626
    * 
    * Insertion		7707		    31589		116964              491885
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    */ Out of all of the sorts, buuble sorting seems to be the least efficient, as so many more
       steps are needed to execute the same task as the other sorts. Out of insertion and selection
       selection is more efficient, as it executes the code in many less steps and finishes relatively
       quickly.	
    */

	private int steps;
	
	public Sorts(){
		steps = 0;
	}
	public void bubbleSort(ArrayList <Integer> list){
	     steps = 0;
     	for (int outer = 0; outer < list.size() - 1; outer++){
    	for (int inner = 0; inner < list.size()-outer-1; inner++){
     	 if (list.get(inner) > list.get(inner + 1)){
       	 //swap list[inner] & list[inner+1]
        	int temp = list.get(inner);
       	        list.set(inner, list.get(inner + 1));
                list.set(inner + 1, temp);
		steps+=6;
      }
    }
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
    }
  }
}
	public void selectionSort(ArrayList <Integer> list){
    	 int min, temp;
	 steps = 0;
  	for (int outer = 0; outer < list.size() - 1; outer++){
   	 min = outer;
    	for (int inner = outer + 1; inner < list.size(); inner++){
      	if (list.get(inner) < list.get(min)) {
        min = inner; // a new smallest item is found
	steps+=2;
      }
    }
    	//swap list[outer] & list[min]
    	temp = list.get(outer);
    	list.set(outer, list.get(min));
    	list.set(min, temp);
	steps += 4;
    }
    	System.out.println();
    	System.out.println("Selection Sort");
    	System.out.println();
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
   		System.out.println();
    		System.out.println("Insertion Sort");
    		System.out.println();
  }
	public int getStepCount(){
		return steps;
	}
	public void setStepCount(int x){
		steps = x;
	}
