class Student  {
    static String school,school1;
    String name;
}
public class OOP {
    public static void main(String[] args) {
        Student.school = "Saint Paul Convent";
        Student.school1 = "Oxford Public School";

        Student s1 = new Student();
        Student s2 = new Student();
        s1.name = "Kushagra";
        s2.name = "Atharv";

        System.out.println(s1.name);
        System.out.println(s1.school);
        System.out.println(s2.name);
        System.out.println(s2.school1);
    }
}
