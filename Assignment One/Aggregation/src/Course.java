public class Course {

    private String courseName;
    private Instructor[] instructors;
    private Textbook[] textbooks;

    public Course (String name, Instructor[] inst, Textbook[] book ) {
        this.courseName = name;
        this.instructors = inst;
        this.textbooks = book;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public void setInstructor(Instructor[] inst) {
        this.instructors = inst;
    }

    public void setTextbook(Textbook[] book) {
        this.textbooks = book;
    }

    public String getCourseName(){
        return courseName;
    }

    public Textbook[] getTextbook(){
        return textbooks;
    }

    public Instructor[] getInstructor(){
        return instructors;
    }

    public void printCourseInformation(Course course){
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Instructors:");
        for (Instructor instructor : course.instructors) {
            System.out.println("- " + instructor.getFirstName() + " " + instructor.getLastName() + " Office: (" + instructor.getOfficeNumber() + ")");
        }
        System.out.println("Textbooks:");
        for (Textbook textbook : course.textbooks) {
            System.out.println("- " + textbook.getTitle() + " by " + textbook.getAuthor() + " (Publisher: " + textbook.getPublisher() + ")");
        }
    }
}