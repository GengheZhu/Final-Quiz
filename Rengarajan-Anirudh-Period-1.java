import java.util.ArrayList;

/**
 * Please submit your Sorts lab in the following form
 */
public class Rengarajan-Anirudh-Period-1
{
    /**
    * Following table should be filled out AT TOP OF CLASS:
    * 
    * 
    *                   100 Integers        200 Integers        400 Integers        800 Integers
    * Bubble			20136				79920				316828				1274028
    *
    * Selection			10296				40596				161196				642396
    * 
    * Insertion			5039				19489				83175				329393
    * 
    * 
    * Write a 1-2 sentence write-up about your observations.
    * For every sort, I made the amount of integers generated equal to the amount of integers in the list.
    * As a result, I noticed the approximate pattern where Insertion is half of Selection which is half of Bubble. Also, my
    * 4x jump from 100-200 integers was most likely because I doubled the amount of integers stored in my array, which
    * quadrupled the steps.
    * 
    */
	
	/**
	   *  Bubble Sort Algorithm
	   *
	   * @param  list  reference to an array of integers to be sorted
	   */
	  public void bubbleSort(ArrayList <Integer> list){
		   int j, temp;
		   boolean flag = true;
		   while (flag)
		   {
			   flag = false;
		       for(j=0; j < list.size()-1; j++)
		       {
		    	   if (list.get(j) < list.get(j+1))
		    	   {
		    		   			   steps+=4;
		                           temp = list.get(j);
		                           list.set(j, list.get(j));
		                           list.set(j+1, temp);
		                           flag = true;  
		           } 
		    	   steps+=2;
		        } 
		    } 
	  }
	  /**
	   *  Selection Sort Algorithm
	   *
	   * @param  list  reference to an array of integers to be sorted
	   */
	  public void selectionSort(ArrayList <Integer> list){
		  	 int first, temp;  
		     for (int i = list.size() - 1; i > 0; i--)  
		     {
		          first = 0;
		          for(int j = 1; j <= i; j ++)
		          {
		        	  steps+=2;
		              if(list.get(j) < list.get(first)) first = j;
		          }
		          temp = list.get(first);
		          list.set(first, list.get(i));
		          list.set(i, list.get(temp)); 
		          steps+=5;
		      }
	  }

	  /**
	   *  Insertion Sort Algorithm
	   *
	   * @param  list  reference to an array of integers to be sorted
	   */
	  public void insertionSort(ArrayList <Integer> list){
		  for (int outer = 1; outer < list.size(); outer++){
			    int position = outer;
			    steps+=3;
			    int key = list.get(position);
			    while (position > 0 && list.get(position - 1) > key){
			    	steps+=2;
			      list.set(position, list.get(position - 1));
			      position--;
			    }
			    list.set(position, key);
			  }
	  }
}
