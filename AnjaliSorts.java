import java.util.*;

/**
 *  Sorts Class for Sorts
 *
 * @author     Anjali Kantharuban
 * @created    March 8, 2017
 *
 *                   100 Integers        200 Integers        400 Integers        800 Integers
 * Bubble            29207               97142               412239              1993135
 *
 * Selection         16425               61182               230876              923396
 * 
 * Insertion         5251                22830               82383               338273
 * 
 * Conlusion: Bubble sorting takes significantly more resources and time. The other two work better, with insertion being the most efficient.
 */
public class AnjaliSorts{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public AnjaliSorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Comparable> list){
	  int step = 0;
	for (int a = 0; a < list.size(); a++){
		for (int b = 0; b < list.size()-1-a; b++){
			if(list.get(b).compareTo(list.get(b+1))>0){
				swap(list, b, b+1);
				step++;
			}
		}
	}
    setStepCount(step);

	System.out.println();
	System.out.println("Bubble Sort");
	System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Comparable> list){
	  int step = 0;
	  for (int i = 0; i < list.size() - 1; i++)
      {
          for (int j = i + 1; j < list.size(); j++)
              if (list.get(j).compareTo(list.get(i)) < 0){
            	  swap(list, j, i);
            	  step++;
              }
      }
      setStepCount(step);
	  System.out.println();
	System.out.println("Selection Sort");
	System.out.println();
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Comparable> list){
	  Comparable temp;
	  int step = 0;
      for (int i = 1; i < list.size(); i++) {
          for(int j = i ; j > 0 ; j--){
              if(list.get(j).compareTo(list.get(j-1)) > 0){
            	  swap(list, j, j-1);
            	  step++;
              }
          }
      }
      setStepCount(step);

      System.out.println();
	System.out.println("Insertion Sort");
	System.out.println();
  }


 /**
   *  Takes in entire vector, but will merge the following sections
   *  together:  Left sublist from a[first]..a[mid], right sublist from
   *  a[mid+1]..a[last].  Precondition:  each sublist is already in
   *  ascending order
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  mid    midpoint index of range of values to be sorted
   * @param  last   last index of range of values to be sorted
   */
  private void merge(ArrayList <Comparable> a, int first, int mid, int last){
	  ArrayList <Comparable> temp = new ArrayList <Comparable> ();
	  int step = 0;
	  int in1 = 0;
	  int in2 = mid;
      for (int i = 0; i < a.size()/2-1; i++) {
          if(a.get(in1).compareTo(a.get(in2)) == 0){
        	  temp.add(a.get(in1));
        	  temp.add(a.get(in2));
        	  in1++;
        	  in2++;
          } else if (a.get(in1).compareTo(a.get(in2)) < 0){
        	  temp.add(a.get(in1));
        	  in1++;
          } else {
        	  temp.add(a.get(in2));
        	  in2++;
          }
          step++;
      }
      setStepCount(step);
      a = temp;
      System.out.println();
	System.out.println("Merge");
	System.out.println();
	

  }

  /**
   *  Recursive mergesort of an array of integers
   *
   * @param  a      reference to an array of integers to be sorted
   * @param  first  starting index of range of values to be sorted
   * @param  last   ending index of range of values to be sorted
   */
  public void mergeSort(ArrayList <Comparable> a, int first, int last){
	//replace these lines with your code
	System.out.println();
	System.out.println("Merge Sort");
	System.out.println();
  }

 
  /**
   *  Accessor method to return the current value of steps
   *
   */
  public long getStepCount(){
    return steps;
  }

  /**
   *  Modifier method to set or reset the step count. Usually called
   *  prior to invocation of a sort method.
   *
   * @param  stepCount   value assigned to steps
   */
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
	  Comparable temp = list.get(a);
	  list.set(a, list.get(b));
	  list.set(b, temp);
	  System.out.println();
	  System.out.println("Swap");
	  System.out.println();
  }
}
