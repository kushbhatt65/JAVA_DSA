/*
   *****
   *   *
   *   *
   *****
 */
//public class Patterns {
//    public static void main (String [] args) {
//        int n = 4;
//        int m = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                if (i == 1 || j == 1 || i == n || j == m) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


/*

*
**
***
****
****
******

*/
//public class Patterns {
//    public static void main (String [] args) {w
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j <=i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}



/*
   *
  **
 ***
****

 */
//public class Patterns {
//    public static void main (String [] args) {
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}



/*
1
12
123
1234
12345
*/

//public class Patterns {
//    public static void main (String [] args) {
//        int n = 5;
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <=i; j++ ) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }
//    }
//}

/*

12345
1234
123
12
1

*/

//public class Patterns {
//    public static void main (String [] args) {
//        int n = 5;
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <=n-i+1 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

































class Student {
    private String name;   // private = data hiding
    private int age;

    // public getter & setter methods
    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        if (a > 0) {       // validation logic
            age = a;
        }
    }

    public int getAge() {
        return age;
    }
}

public class Patterns {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Kushagra");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
