import java.util.Scanner;

public class CastingPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        double korea =sc.nextDouble();
        System.out.print("영어 : ");
        double english =sc.nextDouble();
        System.out.print("수학 : ");
        double math =sc.nextDouble();

        System.out.println("총점 : "+ (int)(korea+english+math));
        System.out.println("평점 : "+ (int)((korea+english+math)/3));
    }
}
