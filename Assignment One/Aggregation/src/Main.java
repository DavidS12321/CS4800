public class Main {
    public static void main(String[] args) {

        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Instructor instructorTwo = new Instructor("David", "Shahi", "4-5678");

        Textbook textbook = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");
        Textbook textbookTwo = new Textbook("Complete Java", "John Doe", "McGraw-Hill");

        Course course = new Course("CS 4800", new Instructor[]{instructor, instructorTwo}, new Textbook[]{textbook, textbookTwo});

        course.printCourseInformation(course);
    }
}