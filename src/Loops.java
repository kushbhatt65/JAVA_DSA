public class Loops {
    public static void main(String [] args) {
//        for(int i = 1; i <= 5; i++) {
//            for(int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i <= 10; i++) {
//            if(i == 2 || i == 4 || i == 6)
//                continue;
//            System.out.println(i);
//        }

// WhileLoop
//        // initialize
//        int i = 1;
//        // condition
//        while(i <=5) {
//            // process
//            System.out.println("Kushagra Bhatt");
//            // updation
//            i++;
//        }

//// nested while
//        int i = 1;
//        while(i <=2) {
//            int j =1;
//
//            while(j <= 4){
//                System.out.println("i =" + i + ", j =" + j);
//                j++;
//            }
//            i++;
//        }


// Do while

//        int i = 1;
//        do {
//            System.out.println("Kushagra Bhatt");
//            i++;
//        } while (i<=10);
//
//
//for(int i = 1; i <= 100; i++){
//    if(i%2 == 0){
//        System.out.println(i);
//    }
//}

        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }


    }
}


