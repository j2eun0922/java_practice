import java.util.Scanner;

public class VariablePractice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("성별을 입력하세요(남/여) : ");
        String gender = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("키를 입력하세여(cm)");
        double hight = sc.nextDouble();

        System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다!" ,hight,age,gender,name);
    }
}
