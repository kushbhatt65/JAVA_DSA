public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Kush", 20,21);
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);

    }
}

class Student {
    String name;
    int age;
    int rollNumber;

//    Student () { // Default constructor. automatically created.
//
//    }

//    Student() {
//        name = "Kushagra Bhatt";
//        age = 20;
//        rollNumber = 21;
//    }

    //  parameterized constructor --

    Student(String n, int a, int rn) {
        name = n;
        age = a;
        rollNumber = rn;
    }
}


//  this keyword ---
