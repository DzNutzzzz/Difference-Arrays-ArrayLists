/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wk3discussionproject;
import java.util.ArrayList;

/**
 *
 * @author chell
 */
public class DifferenceArraysArraysLists {

    public static void main(String[] args) 
    {
        // Example 1: USing a Java Array
        // An array has a fixed size of five elements.
        String[] arrayStudents = {
            "Alex", "Rose", "Adrian", "Alyce", "Arielle"
        };
        
        System.out.println("===== JAVA ARRAY =====");
        
        //Display array elements using a for loop.
        for (int i = 0; i < arrayStudents.length; i++) {
            System.out.println("Student " + (i +1) + ": " + arrayStudents[i]);
        }
        
        // Array allow existing values to be changed.
        arrayStudents[0] = "Sirius";
        
        System.out.println("\nUpdated Array:");
        for (String student : arrayStudents) {
            System.out.println(student);
        }
        
        // The array size remains five and cannot grow.
        System.out.println("Array size: " + arrayStudents.length);
        
        // Example 2: Using an ArrayList
        // Arraylists can grow and shrink dynamically.
        ArrayList<String> studentList = new ArrayList<>();
        
        System.out.println("\n===== JAVA ARRAYLIST =====");
        
        // Add elements using the add() method.
        studentList. add("Alex");
        studentList.add("Rose");
        studentList.add("Adrian");
        studentList.add("Alyce");
        studentList.add("Arielle");
        
        // Dsiplay ArrayList elements.
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Student " + (i + 1) + ": " + studentList.get(i));
        }
        
        // Replace and existing element using set().
        studentList.set(0, "Sirius");
        
        // Add another student without creating a new list.
        studentList.add("Squiggy");
        
        // Remove a student using the remove() method.
        studentList.remove("Rose");
        
        System.out.println("\nUpdated ArrayList:");
        for (String student : studentList) {
            System.out.println(student);
        }
        
        // ArrayLists use size() to return the number of elements.
        System.out.println("ArrayList size: " + studentList.size());
        
        // Comparison
        
        System.out.println("\n===== COMPARISON =====");
        System.out.println("Array size: " + arrayStudents.length);
        System.out.println("ArrayList size: " + studentList.size());
        
        System.out.println("Arrays have a fixed size.");
        System.out.println("ArrayLists can grow or shrink dynamically.");
    }
}
