import java.util.Scanner;
//
//public class unitConversion {
//    public static void main(String[] args) {
//        Scanner a=new Scanner(System.in);
//        int inch = 1000;
//
//        double meters= inch * 0.0254;
//        System.out.println(meters +  "meters");
//    }
//}

//Correct way with scanner class that allows input
public class unitConversion{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int inchesGivenByUser= in.nextInt();
        System.out.println(inchesGivenByUser/39.37 + "meters");
    }
}