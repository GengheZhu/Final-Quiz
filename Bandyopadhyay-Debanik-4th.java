import java.util.*;
public class Sorts{
    // Debanik Bandyopadhyay- 4th Period- 3/8/17
  private long steps;
  public Sorts(){
    steps = 0;
  }
  //
                       100 Integers        200 Integers        400 Integers        800 Integers
    Bubble
    
   Selection
   
    Insertion

    
    //
  public void bubbleSort(ArrayList <Integer> list){
	  for (int outer = 0; outer < list.size() - 1; outer++){
		    for (int inner = 0; inner < list.size()-outer-1; inner++){
		      steps+= 3;
		      if (list.get(inner) > list.get(inner + 1)){
		    	steps+=4;
		        int temp = list.get(inner);
		        list.set(inner, list.get(inner + 1));
		        list.set(inner + 1, temp);
		      }
		    }
		  }
  }
  public void selectionSort(ArrayList <Integer> list){
	  int min, temp;

	  for (int outer = 0; outer < list.size() - 1; outer++){
	    min = outer;
	    for (int inner = outer + 1; inner < list.size(); inner++){
	    	steps+=3;
	      if (list.get(inner) < list.get(min)) {
	        min = inner; // a new smallest item is found
	      }
	    }
	    steps+=4;
	    //swap list[outer] & list[min]
	    temp = list.get(outer);
	    list.set(outer, list.get(min));
	    list.set(min, temp);
	  }

  }
  public void insertionSort(ArrayList <Integer> list){
	  for (int outer = 1; outer < list.size(); outer++){
		    int position = outer;
		    int key = list.get(position);

		    // Shift larger values to the right
		    while (position > 0 && list.get(position - 1) > key){
		      list.set(position, list.get(position - 1));
		      position--;
		      steps+=2;
		    }
		    steps+=3;
		    list.set(position, key);
		  }
  }
  private void merge(ArrayList <Integer> a, int first, int mid, int last){
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