
/**
 * Please submit your Sorts lab in the following form
 */
public class Monks_Cameron_4th
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
    * Bubble                4708                19324               79824               317456
    *
    * Selection             198                 398                 789                 1598
    * 
    * Insertion             4490                20782               81100               319492
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    * Selection seems to be the fastest, although it starts to take noticable time with larger data sets, or if the data has a large range.
    * Both Bubble and insert have a much more constant rate of increace, but generally take more steps.
    * 
    */
   public void bubbleSort(ArrayList <Integer> list){
     boolean flag = true;
     int temp;
     while ( flag )
     {
            flag= false;
            for( int j=0;  j < list.size() -1;  j++ )
            {
                   if ( list.get(j) < list.get(j+1) )
                   {
                           temp = list.get(j);
                           list.set(j, list.get(j+1));
                           steps++;
                           list.set(j+1, temp);
                           steps++;
                          flag = true;
                  } 
            } 
      } 
    System.out.println();
    System.out.println("Bubble Sort");
    System.out.println();
  }
     public void selectionSort(ArrayList <Integer> list){
     int first;
     int temp;
     for ( int i = list.size() - 1; i > 0; i--)  
     {
          first = 0;
          for(int j = 1; j <= i; j ++)
          {
               if( list.get(j) < list.get(first))         
                 first = j;
          }
          temp = list.get(first);
          list.set(first, i);
          list.set(i, temp); 
      }     
    System.out.println();
    System.out.println("Selection Sort");
    System.out.println();
  }   
     public void insertionSort(ArrayList <Integer> list){
      int temp;
     for (int i = 1; i < list.size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(list.get(j) < list.get(j-1)){
                    temp = list.get(j);
                    steps++;
                    list.set(j, list.get(j-1));
                    steps++;
                    list.set(j-1, temp);
                }
            }
        }
    System.out.println();
    System.out.println("Insertion Sort");
    System.out.println();
  }
}
