public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("", "", "");
        instructor.setFirstName("Nim");
        instructor.setLastName("Davarpanah");
        instructor.setOfficeNumber("3-2636");

        Instructor instructorTwo = new Instructor("", "", "");
        instructorTwo.setFirstName("David");
        instructorTwo.setLastName("Shahi");
        instructorTwo.setOfficeNumber("4-5678");

        Textbook textbook = new Textbook("", "", "");
        textbook.setTitle("Clean Code");
        textbook.setAuthor("Robert Cecil Martin");
        textbook.setPublisher("Pearson");

        Textbook textbookTwo = new Textbook("", "", "");
        textbookTwo.setTitle("Complete Java");
        textbookTwo.setAuthor("John Doe");
        textbookTwo.setPublisher("McGraw-Hill");

        Course course = new Course("CS 4800", new Instructor[]{instructor, instructorTwo}, new Textbook[]{textbook, textbookTwo});

        // Print course information
        course.printCourseInformation(course);
    }
}