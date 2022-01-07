import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       System.out.println(names);
       String[] nameList = new String[] {"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
       for(int i = 0; i < nameList.length; i++)
       {
           names.add(nameList[i]);
       }
       System.out.println(names);
       System.out.println(names.get(0));
       System.out.println(names.get(names.size() - 1));
       System.out.println(names.size());
       names.set(0, "Alice B. Toklas");
       System.out.println(names);
       names.add(4, "Doug");
       System.out.println(names);
       for(String name : names)
       {
           System.out.println(name);
       }
       ArrayList<String> names2 = new ArrayList<String>(names);
       System.out.println(names2);
       names.remove(0);
       System.out.println(names);
       System.out.println(names2);
   }
}