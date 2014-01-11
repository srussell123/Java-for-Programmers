package gradebook;
import java.util.Scanner; //for use of IO from Command window

/**
 * 
 * @author scottrussell
 * Description: Tests the output of GradeBook
 */
public class GradeBookTest {
    public static void main(String[] args){

        GradeBook myGradeBook;

        // create Scanner for input
        Scanner input = new Scanner( System.in );

        System.out.println( "Please enter the course name: ");
        String nameOfCourse = input.nextLine();  // read line of text
        myGradeBook = new GradeBook(nameOfCourse);

        System.out.println(); //outputs blank line
        //test GradeBook method
        myGradeBook.displayMessage( nameOfCourse );
    } // end main
} // end class GradeBookTest
