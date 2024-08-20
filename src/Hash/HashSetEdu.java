package Hash;

import java.util.HashSet;
import java.util.Iterator;
public class HashSetEdu {
    /**
     * * HashSet is a data structure
     * * HashSet is an efficient data structure because it takes constant time complexity
     *   To add -> 0(1)
     *   To search -> 0(1)
     *   To remove -> 0(1)
     * * In a set, there cannot contains duplicate values
     * * set is an unordered data structure
     * * Set has no index, contains only values
     * * Some regular HashSet functions are -
     *   add(), contains(), size(), remove()
     */

    public static void main(String[] args) {

        //Initialize HashSet
        HashSet<Integer> set = new HashSet<>();

        //adding values
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        //this value will ignore with the previous one due to its duplicate input
        // we can sure it by checking its size
        set.add(1);

        //HashSet Size
        System.out.println("Size of the set " + set.size());

        //Print the set
        System.out.println(set);

        //Iterating
        for(Integer integer : set){
            System.out.println(integer);
        }

        //Iterating with Iterator
        Iterator<Integer> itr = set.iterator();
        /**
         * Iterator functions -> next(), hasNext()
         * Iterator initial value is null.
         * So when it starts iterating it start with first value and next....
         */

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Searching element from set
        if(set.contains(1)){
            System.out.println("Element founds");
        }

        //Removing element from set
        set.remove(2);
        if(!set.contains(2)){
            System.out.println("Element removed");
        }
    }
}
