public class BasicMaths {

    // print digits
//    static void printDigits(int num) {
//        while (num != 0) {
//            int digit = num%10;
//            System.out.println(digit);
//            num = num/10;
//        }
//    }
static int coutDigit (int num){
    int count =0;
    while (num!=0){
        int digit = num%10;
        count++;
        num = num/10;

    }
    return count;
}
public static void main(String [] args) {
        int num = 521412;
        int ans =coutDigit(num);
        System.out.println(ans);
    }
}
