import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author gcschmit
 * @version 
 */
public class ArrayListNotes
{
    public static void main(String[] args)
    {
        /*
         * The ArrayList is a Java Generic.
         * 
         * We have to specify the type of elements in the list in angle brackets
         *      (ie., < >) after every ArrayList identifier.
         *      
         *  Primitives (e.g., int,double, boolean) are not classes and cannot be 
         *      specified as the type of element in a generic. Instead, we can use the
         *      corresponding Wrapper Classes (e.g, Integer, Double, Boolean).
         */
        ArrayList<Integer> myList;
        myList = createRandomIntegerList(10,20);
        System.out.println(myList);
        removeEvens(myList);
        System.out.println(myList);
        sumList(myList);
        System.out.println(sumList(myList));
    }
    
    /**
     * Creates and returns a reference to an ArrayList of the specified number of
     *      Integer elements where each element is assigned a random value between 
     *      1 and range.
     *      
     * @param size  the number of Integer elements to add to the list
     * @param range the range of random values to assign to each element [1, range]
     * @return a reference to the newly created and initialized list
     */
    public static ArrayList<Integer> createRandomIntegerList(int size, int range)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < size; i++)
        {
            int value = (int)(Math.random() * range) + 1;
            
            /*
             * The add method adds the specified object to the end of the list
             * 
             * Autoboxing:
             *      Primitives values are automatically converted to their corresponding
             *          wrapper class. However, type promotion does not occur.
             */
            list.add(value);
        }
        
        return list;
    }
    
    /**
     * Removes even numbers from the specified list.
     * 
     * @param list  the list of number of potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        int size = list.size();
        
        for(int i = 0; i < list.size(); i++)
        {
            int value = list.get(i);
            if(value % 2 == 0)
            {
                /*
                 * The remove method deletes the element at the specified index
                 *      from the list. All subsequent elements are "shifted left".
                 */
                list.remove(i);
                i--;
            }
        }
    }
    
    public static void removeEvensAlt(ArrayList<Integer> list)
    {
        for(int i = list.size() - 1; i >= 0; i--)
        {
            if(list.get(i) % 2== 0)
            {
                list.remove(i);
            }
        }
    }
    
    public static int sumList(ArrayList<Integer> list)
    {
        int sum = 0;
        
        for(int value : list)
        {
            sum += value;
            
            //list.add(7)
        }
        
        return sum;
    }
}