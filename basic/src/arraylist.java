// we should import array list
// we cannot use primitive data types such as int double boolean int double boolean, float etc
// so we should convert those primitive type into reference type by use wrapper class such as Integer,Boolean, Double,Float,String etc..
// Arraylist<type of array> name of arraylist = new Arraylist<Type>(); let us consider number as name
// we can add elements in arraylist by using name.add();
//we can remove elements in arraylist by using name.remove() (value inside bracket refers to index value of arraylist)
// we can remove a particular data from array list by using name.remove(valueOf(value));
// to print array list same as array System.out.prinln(number.toString());
// import and use comparator from java.util to sort the array list

import java.util.*;

public class arraylist {
    public static void main(String args []){
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);

        System.out.println("Before: "+numbers.toString());

        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number),number*5);
        });
        System.out.println("After: "+numbers.toString());
    }
}
