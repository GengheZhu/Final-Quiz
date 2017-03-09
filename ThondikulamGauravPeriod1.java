
/**
 * Please submit your Sorts lab in the following form
 */
public class ThondikulamGauravperiod1
{
    /**
    * Name of your class: LastName-FirstName-Period-#.java
    *
    * Class includes sorts WITH STEP COUNTERS ADDED IN
    *
    * Following table should be filled out AT TOP OF CLASS:
    *
    *
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble              24958               96632               392696               1614056
    *
    * Selection           15230               60488               240964               961972
    *
    * Insertion           5088                21818               83562                323456
    *
    *
    * Write a 1-2 sentence write-up about your observations.
    */
    private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public ThondikulamGauravperiod1()
  {
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list)
  {
    int temp;
    steps = 0;
    for (int outer = 0; outer < list.size() - 1; outer++){
      for (int inner = 0; inner < list.size()-outer-1; inner++){
        steps += 3;
          if (list.get(inner).compareTo(list.get(inner + 1)) > 0){
             steps += 4;
             temp = list.get(inner);
             list.set(inner,list.get(inner + 1));
             list.set(inner + 1,temp);
            }
        }
    }
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
}

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
 public void insertionSort(ArrayList <Integer> list)
 {
     steps = 0;
     for (int outer = 1; outer < list.size(); outer++){
       int i = outer;
       int key = (int)list.get(i);
       steps++;
       steps += 2;
       while (i > 0 && list.get(i - 1).compareTo(key) > 0){
         list.set(i, list.get(i - 1));
         steps += 2;
         i--;
       }
       list.set(i, key);
       steps++;
     }
 }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list)
  {
		int smallestIndex;
		int smallest;
		steps =0;
		for (int curIndex = 0; curIndex < list.size(); curIndex++) {
			smallest = list.get(curIndex);
			smallestIndex = curIndex;

			for (int i = curIndex + 1; i < list.size(); i++) {
			    steps += 3;
				if (smallest > list.get(i)) {
					smallest = list.get(i);
					smallestIndex = i;
				}
			}
			if (smallestIndex == curIndex)
				;
			else {
			    steps+=4;
				int temp = list.get(curIndex);
				list.set(curIndex, list.get(smallestIndex));
				list.set(smallestIndex, temp);
			}


    }
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
  private void merge(ArrayList <Integer> a, int first, int mid, int last)
  {
    //replace these lines with your code
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
  public void mergeSort(ArrayList <Integer> a, int first, int last)
  {
    //replace these lines with your code
    System.out.println();
    System.out.println("Merge Sort");
    System.out.println();
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

   /**
   *  Interchanges two elements in an ArrayList
   *
   * @param  list  reference to an array of integers
   * @param  a     index of integer to be swapped
   * @param  b     index of integer to be swapped
   */
  public void swap(ArrayList <Integer> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
