/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thedaego.stringcomparatorutils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author thedaego
 */
public class ADynamicStringComparator implements Comparator<String>
{
    private ArrayList<String> order = new ArrayList<String>();

    /**
     * String Comparator class that takes an explicit desired order. 
     * Case insensitive. If an encountered String is not contained within the
     * provided desiredOrder, then it will be placed at the end of the known
     * list within desiredOrder and then sorted natively.  
     * @param desiredOrder 
     */
    ADynamicStringComparator(List<String> desiredOrder)
    {
        if(desiredOrder == null){
            throw new IllegalArgumentException("desiredOrder cannot be null.");
        }
        //set everything to lowercase
        for (String string : desiredOrder) {
            this.order.add(string.toLowerCase());
        }
    }

    @Override
    public int compare(String s1, String s2) 
    {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //get index for 1
        int indexOfS1 = order.indexOf(s1);
        if(indexOfS1 == -1){
            indexOfS1 = order.size();
        }

        //get index for 2
        int indexOfS2 = order.indexOf(s2);
        if(indexOfS2 == -1){
            indexOfS2 = order.size();
        }

        if(indexOfS1 == order.size() && indexOfS2 == order.size())
        {
            return s1.compareTo(s2);
        }else{
            return indexOfS1 - indexOfS2;
        }
    }
}

