/*Choice ---> 3 (Insertion)

How many numbers do you wish to generate? 100
Largest integer to generate? 200

Array reset to:

183  19  97  119  152  70  59  165  56  128  164  155  
158  76  177  1  83  187  165  104  88  16  17  7  
131  12  112  173  185  174  129  181  29  131  6  163  
6  166  81  169  23  12  150  22  16  30  171  108  
98  116  131  60  128  43  26  184  65  170  156  157  
145  71  7  123  191  1  62  3  66  41  71  148  
84  74  60  129  169  162  181  195  112  140  167  134  
88  172  190  154  190  126  110  97  106  67  175  183  
82  113  55  3  

Array sorted to:

183  19  97  119  152  70  59  165  56  128  164  155  
158  76  177  1  83  187  165  104  88  16  17  7  
131  12  112  173  185  174  129  181  29  131  6  163  
6  166  81  169  23  12  150  22  16  30  171  108  
98  116  131  60  128  43  26  184  65  170  156  157  
145  71  7  123  191  1  62  3  3  66  41  71  
148  84  74  60  129  169  162  181  195  112  140  167  
134  88  172  190  154  190  126  110  97  106  67  175  
183  82  113  55  

	
# steps = 65

	
Choice ---> 2 (Selection)

How many numbers do you wish to generate? 100
Largest integer to generate? 200

Array reset to:

39  112  24  143  51  157  141  187  92  101  69  14  
158  166  31  64  154  114  77  82  49  35  165  99  
127  76  118  200  177  10  13  171  52  49  99  108  
100  67  84  77  117  155  135  110  138  144  53  49  
80  133  8  137  85  125  25  187  195  35  110  55  
163  176  150  32  183  38  19  37  185  97  67  20  
97  21  66  141  151  171  47  138  21  69  153  110  
56  176  102  163  171  34  1  38  64  1  46  29  
44  163  154  104  

Array sorted to:

1  1  8  10  13  14  19  20  21  21  24  25  
29  31  32  34  35  35  37  38  38  39  44  46  
47  49  49  49  51  52  53  55  56  64  64  66  
67  67  69  69  76  77  77  80  82  84  85  92  
97  97  99  99  100  101  102  104  108  110  110  110  
112  114  117  118  125  127  133  135  137  138  138  141  
141  143  144  150  151  153  154  154  155  157  158  163  
163  163  165  166  171  171  171  176  176  177  183  185  
187  187  195  200  

# steps = 15246



Choice ---> 1 (Insertion)

How many numbers do you wish to generate? 100
Largest integer to generate? 200

Array reset to:

92  145  180  10  166  155  147  163  82  63  87  29  
93  58  142  190  165  154  139  199  192  174  200  83  
145  55  46  127  73  142  195  7  6  160  86  82  
186  36  137  195  91  62  147  113  98  19  42  88  
58  92  2  94  32  104  60  34  65  146  126  70  
4  82  107  53  100  127  103  159  138  194  200  106  
174  70  188  27  119  123  180  10  199  9  130  139  
156  10  92  9  28  129  60  5  192  62  75  164  
147  59  18  30  

Array sorted to:

2  4  5  6  7  9  9  10  10  10  18  19  
27  28  29  30  32  34  36  42  46  53  55  58  
58  59  60  60  62  62  63  65  70  70  73  75  
82  82  82  83  86  87  88  91  92  92  92  93  
94  98  100  103  104  106  107  113  119  123  126  127  
127  129  130  137  138  139  139  142  142  145  145  146  
147  147  147  154  155  156  159  160  163  164  165  166  
174  174  180  180  186  188  190  192  192  194  195  195  
199  199  200  200  

# steps = 25814


*/

import java.util.*;
/**
 *  Here is a description
 *
 * @author     Patrick Mackle
 * @created    Month Day, Year
 */
public class Sorts
{
  private long steps;

  /**
   *  Description of Constructor
   *
   * @param  list  Description of Parameter
   */
  public Sorts(){
    steps = 0;
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void bubbleSort(ArrayList <Integer> list)
  {
      for (int outer = 0; outer < list.size() - 1; outer++)
      {
            for (int inner = 0; inner < list.size()-outer-1; inner++)
            {
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

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void selectionSort(ArrayList <Integer> list)
{
      int min, temp;
      for (int outer = 0; outer < list.size() - 1; outer++){
        min = outer;
        for (int inner = outer + 1; inner < list.size(); inner++){
            steps+=3;
          if (list.get(inner) < list.get(min)) {
            min = inner;
          }
        }
        steps+=4;
        temp = list.get(outer);
        list.set(outer, list.get(min));
        list.set(min, temp);
      }
  }

  /**
   *  Description of the Method
   *
   * @param  list  reference to an array of integers to be sorted
   */
  public void insertionSort(ArrayList <Integer> list)
  {
            int indexx = (list.size() - 1);
            int key = list.get(indexx);
            while (indexx >= 0 && list.get(indexx - 1) > key)
            {   
              list.set(indexx, list.get(indexx - 1));
              indexx--;
              steps+=2;
            }
            steps+=3;
            list.set(indexx, key);
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
  private void merge(ArrayList <Integer> a, int first, int mid, int last){
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
  public void mergeSort(ArrayList <Integer> a, int first, int last){
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
  public void swap(ArrayList <Integer> list, int a, int b){
    //replace these lines with your code
    System.out.println();
    System.out.println("Swap");
    System.out.println();
  }
}
