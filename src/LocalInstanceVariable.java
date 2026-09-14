//public class LocalInstanceVariable {
//    public static void main(String[] args) {
//
//
//        Student s1 = new Student();
//
//        // default values.
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//        System.out.println(s1.rollNumber);
//        System.out.println((s1.college));
//
//        int x; // local variable. -> its scope is only in the main function as the main function is also treated as a function itself. so the local variables do not contain any default values,only instance variable that are being created inside the class have default values.
////        System.out.println(x); //  --> Variable 'x' might not have been initialized, we have to initialize value to the variable to print it.  declared in stack.
//
//        //
//    }
//}
//class Student {
//    String name; // information/data/characteristics. --> instance variables --  declared in heap.
//    // default value for String is null.
//    int age;
//    // default value for Integer is 0.  
//    int rollNumber;
//    // default value for Integer is 0.
//    String college;
//    // default value for String is null.
//    // and for boolean is false.
//    // for floating is 0.0.
//
//    void markAttendance(){ // behavior --> functions --> instance methods.
//        System.out.println("Attendance marked" + name);
//    }
//}
