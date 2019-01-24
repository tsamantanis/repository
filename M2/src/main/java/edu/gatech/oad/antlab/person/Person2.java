// package edu.gatech.oad.antlab.person;
import java.lang.Math;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Bob
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */

	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here


      String temp = input;
      for (int i = 0; i < input.length() * 10; i++) {
           int x  = (int) (Math.random() * (input.length()));
          String temp3 = input.substring(0, x);
          String temp2 = input.substring(x, input.length());
          temp = temp2 + temp3;
          System.out.println(temp);
      }
	  return null;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}

    public static void main(String[] args) {
        Person2 p = new Person2("g3tb1g2");
        String k = p.calc("g3tb1g2");
    }
}
