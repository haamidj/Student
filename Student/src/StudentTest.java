

public class StudentTest extends Student {
	//creating driver class that extends the student class

	public static void main(String[] args) {
		Student s1 = new Student(); //creating an object from the student class called s1
		
		s1.getName();
		s1.getID();
		s1.getGpa();
		s1.display();
		//using methods from the student class for this instance of student
		
	}// end of main(..)

}// end of class
