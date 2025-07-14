import java.util.Scanner;

public class VariablePractice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 : ");
        double a = sc.nextDouble();
        System.out.print("세로 : ");
        double b = sc.nextDouble();

        System.out.println("면적 : "+(a*b));
        System.out.println("둘레 : "+((a+b)*2));
    }
}

