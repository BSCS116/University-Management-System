class Department{
    String departmentName;
    String departmentID;

    void addDepartment(){ };
    void removeDepartment() { };
}
class Student{
    String studentName;
    String studentID;
    int    studentAge;

    void walk(){ };
    void learn(){ };
}
class Course{
    String courseID;
    String courseTitle;
    String courseDepartment;


    void addCourse(){ };
    void removeCourse(){ };
    void teachCourse(){ };
}
class Teacher{
    String teacherName;
    String teacherID;
    String teacherCourse;

    void walk(){ };
    void teach(){ };

}

class mainClass{
    public static void main(String args []){
        Department d1 = new Department();
        d1.departmentName = "HITMS";
        d1.departmentID = "CS101";


        Student s1 = new Student();
        s1.studentName = "Syed Kazim Ali";
        s1.studentID = "24BSCS116";
        s1.studentAge = 18;

        Course c1 = new Course();
        c1.courseID = "CSC-212";
        c1.courseTitle = "Object Oriented Programming";
        c1.courseDepartment = "Computer Science";

        Teacher t1 = new Teacher();
        t1.teacherName = " Azhar Ali";
        t1.teacherID = " T1234";
        t1.teacherCourse = " CSC-212";

        System.out.println("Department Name " + d1.departmentName);
        System.out.println("Department ID " + d1.departmentID);

        System.out.println("Student Name" + s1.studentName);
        System.out.println("Student ID" + s1.studentID);
        System.out.println("Student Age" + s1.studentAge);

        System.out.println("Course ID" + c1.courseID);
        System.out.println("Course Title" + c1.courseTitle);
        System.out.println("Course Department" + c1.courseDepartment);

        System.out.println("Teacher Name" + t1.teacherName);
        System.out.println("Teacher ID" + t1.teacherID);
        System.out.println("Teacher Course" + t1.teacherCourse);

    }
}
