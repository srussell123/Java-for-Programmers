/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradebook;

/**
 * Description: Short Ch3 program for creating a gradeBook
 * @author scottrussell
 */
public class GradeBook {
    
    // Variables
    private String courseName; 

    // Constructors
    public GradeBook( String name ){
        courseName = name;
    } // end constructor
    // Access modifiers
    public void setCourseName( String name ){
        courseName = name;
    }
    
    public String getCourseName(){
        return courseName;
    }

    public void displayMessage( String courseName ){
        System.out.printf( "Welcome to the grade book for \n%s!\n", 
                getCourseName());
    } //end displayMessage
    
} // end class GradeBook
//git added
