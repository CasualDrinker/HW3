/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {

    // INSERT CODE HERE - DO NOT FORGET TO PLACE YOUR NAME ABOVE
    //
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.
    Set<Integer> result = new TreeSet<>(setA);

    // Add all elements from setB to result
    result.addAll(setB);

    // Create a temporary set to hold the common elements
    Set<Integer> common = new TreeSet<>(setA);
    common.retainAll(setB); // Retain only elements present in both sets

    // Remove common elements from result to get the symmetric difference
    result.removeAll(common);

    return result;

  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {

    // INSERT CODE HERE.
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();

    // Iterate through the map entries
    while (iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();

      // Check if the key is even
      if (entry.getKey() % 2 == 0) {
        iterator.remove(); // Remove the entry with an even key
      }
    }
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    // INSERT CODE HERE

    return tree1.equals(tree2);
  }

} // end treeProblems class
