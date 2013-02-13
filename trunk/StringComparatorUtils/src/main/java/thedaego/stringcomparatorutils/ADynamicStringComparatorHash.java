/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thedaego.stringcomparatorutils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author thedaego
 */
public class ADynamicStringComparatorHash implements Comparator<String>
{
    private HashMap<String, Integer> hash = new HashMap<String, Integer>();
    /**
     * String Comparator class that takes an explicit desired order. 
     * Case insensitive. If an encountered String is not contained within the
     * provided desiredOrder, then it will be placed at the end of the known
     * list within desiredOrder and then sorted natively.  
     * @param desiredOrder 
     */
    public ADynamicStringComparatorHash(List<String> desiredOrder)
    {
        if(desiredOrder == null){
            throw new IllegalArgumentException("desiredOrder cannot be null.");
        }
        for (int i = 0; i < desiredOrder.size(); i++) {
            hash.put(desiredOrder.get(i).toLowerCase(), i);
        }

    }

    @Override
    public int compare(String s1, String s2) 
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int indexOfS1;
        //get index for 1
        if(hash.get(s1) != null){
            indexOfS1 = hash.get(s1);
        }else{
            indexOfS1 = hash.size();
        }

        int indexOfS2;
        //get index for 1
        if(hash.get(s2) != null){
            indexOfS2 = hash.get(s2);
        }else{
            indexOfS2 = hash.size();
        }
        
        if(indexOfS1 == hash.size() && indexOfS2 == hash.size())
        {
            return s1.compareTo(s2);
        }else{
            return indexOfS1 - indexOfS2;
        }
    }
}
