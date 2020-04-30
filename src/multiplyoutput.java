import java.util.Scanner;

//public class multiplyoutput {
//    public static void main(String[] args){
//        System.out.println(numProduct(100,100));
//    }
//    public static int numProduct(int param1, int param2){
//        return param1 * param2;
//    }
//}
//

//Correct way to take user input in terminal
public class multiplyoutput{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int firstUserInputInteger = in.nextInt();
        int secondUserInputInteger = in.nextInt();
        System.out.println(firstUserInputInteger * secondUserInputInteger);
    }
}