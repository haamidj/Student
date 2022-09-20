import java.util.Scanner;

public class Student {
	Scanner input = new Scanner(System.in);
	public static String fname; // creating a variable for first name
	public static String lname;// creating variable for last name
	public static int studentID;// creating variable for studentID
	public static String mpass;// creating variable to store whether student passed math
	public static String epass;// creating variable to store whether student passed english
	public static double mtotgrade;// creating variable to store total math grade
	public static double etotgrade;// creating a variable to store total english grade

	public void getName() {
		System.out.println("Enter student first name and your last name: "); // asking user for full name
		String fullname = input.nextLine(); // storing input as string variable

		fname = fullname.substring(0, fullname.indexOf(" ")); // splitting fullname into first name
		lname = fullname.substring(fullname.indexOf(" ") + 1, fullname.length());// splitting fullname into last name

	}// end of getName()

	public void getID() {
		System.out.println("Enter student ID: "); // asking user for students id
		studentID = input.nextInt(); // storing student id
	}// end of getID()

	public void getGpa() {

		System.out.println("Enter course name to input grades: "); // asking user for the course name
		String course = input.next(); // storing the inputted course name in variable course

		switch (course) {
		case "Math": // if the user enters math as the course name then this will run
			System.out.println("Enter Math test 1 grade: "); // entering the first test grade
			double mt1grade = input.nextDouble(); // storing the 1st test grade

			System.out.println("Enter Math test 2 grade: "); // entering the second test grade
			double mt2grade = input.nextDouble(); // storing the 2nd test grade

			System.out.println("Enter Math test 3 grade: "); // entering third test grade
			double mt3grade = input.nextDouble(); // storing the 3rd test grade

			System.out.println("Enter Math final exam grade: ");// entering the final exam grade
			double mfegrade = input.nextDouble();// storing the final exam grade

			mtotgrade = (((mt1grade) * .2) + (mt2grade * .2) + (mt3grade * .2) + (mfegrade * .4));
			// calculating the weighted average of the grades and storing it as the total
			// math grade
			// test are each worth 20% of the grade and the final exam is 40% of the grade

			System.out.printf("%s's total Math grade is : %.2f%%%n", fname, mtotgrade);
			// printing the students total math grade

			System.out.println("Would you like to enter grades for another course: (Y/N)");
			// asking user if they want to add more grades
			String reinputdecision1 = input.next(); // storing the response

			if (reinputdecision1.equals("N") == true) { // seeing if the user respone is no
				break; // if it is no then terminate the switch loop
			} else { // if user input is not N then recall the method
				getGpa(); // puts user back to the course selection prompt
			}

		case "English": // if the user enters English
			System.out.println("Enter English test 1 grade: "); // ask for test 1 grade
			double et1grade = input.nextDouble(); // store test 1 grade

			System.out.println("Enter English test 2 grade: "); // ask for test 2 grade
			double et2grade = input.nextDouble(); // store test 2 grade

			System.out.println("Enter English test 3 grade: "); // ask for test 3 grade
			double et3grade = input.nextDouble(); // store test 3 grade

			System.out.println("Enter English final exam grade: "); // ask for final exam grade
			double efegrade = input.nextDouble();// store final exam grade

			etotgrade = ((et1grade * .2) + (et2grade * .2) + (et3grade * .2) + (efegrade * .4));
			// calculate english total weighted grade using weighted average
			// test are each worth 20% of the grade and the final exam is 40% of the grade

			System.out.printf("%s's total English grade is : %.2f%%%n", fname, etotgrade);
			// Print the students english grade

			System.out.println("Would you like to enter grades for another course: (Y/N)");
			// ask user if they want to input more grades
			String reinputdecision2 = input.next();// store response

			if (reinputdecision2.equals("N")) {// see if user response is no
				break; // end the switch
			} else {// else call the method again restarting the loop
				getGpa();
			}

		default: // if user enters anything other than the stored course names
			System.out.println("Invalid input");
			System.out.println("Please try again");
			getGpa();
			break;

		}// end of switch
		if (mtotgrade > 70.0) { // seeing if student grade is above the passing cutoff
			mpass = "Passed"; // if it is above then student passed
		} else { // in any other case student has failed
			mpass = "Failed";
		}
		if (etotgrade > 70.0) {// checking if english grade is above a passing grade or not
			epass = "Passed"; // student has passed
		} else {
			epass = "Failed";// student has failed
		}
	}// end getGpa()

	public void display() { // method to display the students information
		System.out.println("Student First name\t: " + fname);
		System.out.println("Student Last name\t: " + lname);
		System.out.println("Student ID number\t: " + studentID);

		System.out.printf("Math: %s with a %.2f%%%n", mpass, mtotgrade);
		System.out.printf("English: %s with a %.2f%%%n", epass, etotgrade);
	}// end of display()

}// end of class
