import java.util.Scanner;

public class ControlPractice {
    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ControlPractice cp = new ControlPractice();
        cp.practice1();
        cp.practice2();
        cp.practice3();
        cp.practice4();
        cp.practice5();
        cp.practice6();
        cp.practice7();
        cp.practice8();
    }

    public void practice1() {
        System.out.print("정수 : ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("양수다");
        else
            System.out.println(("양수가 아니다"));
    }

    public void practice2() {
        System.out.print("정수 : ");
        int num = sc.nextInt();
        if (num > 0)
            System.out.println("양수다");
        else if (num == 0)
            System.out.println("0이다");
        else
            System.out.println(("음수다"));
    }

    public void practice3() {
        System.out.print("정수 : ");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("짝수다");
        else
            System.out.println("홀수다");
    }

    public void practice4() {
        System.out.print("정수 : ");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("양수만 입력해주새요");
            return;
        }
        if (num % 2 == 0)
            System.out.println("짝수다");
        else
            System.out.println("홀수다");
    }

    public void practice5() {
        System.out.print("주민번호를 입력하세요 (- 포함) : ");
        String number = sc.next();
        int num = number.charAt(7) - '0';
        if (num % 2 == 0)
            System.out.println("여자");
        else
            System.out.println("남자");
    }

    public void practice6() {
        System.out.print("나이 : ");
        int age = sc.nextInt();
        if (age <= 13)
            System.out.println("어린이");
        else if (age <= 19)
            System.out.println("청소년");
        else
            System.out.println("어른");
    }

    public void practice7() {
        String id = "test";
        String pw = "1212";

        sc.nextLine();

        System.out.print("아이디 : ");
        String input_id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String input_pw = sc.nextLine();

        if (!input_id.equals(id)) {
            System.out.println("아이디가 틀렸습니다");
            return;
        }
        if (!input_pw.equals(pw)) {
            System.out.println("비밀번호가 틀렸습니다");
            return;
        }

        System.out.println("로그인 성공");
    }

    public void practice8() {
        System.out.print("피연산자1 입력 : ");
        int x = sc.nextInt();
        System.out.print("피연산자2 입력 : ");
        int y = sc.nextInt();
        System.out.print("연산자를 입력 (+,-,*,/,%) : ");
        char ch = sc.next().charAt(0);

        if (x > 0 && y > 0) {
            switch (ch) {
                case '+' -> System.out.println("" + x + ch + y + " = " + (x + y));
                case '-' -> System.out.println("" + x + ch + y + " = " + (x - y));
                case '*' -> System.out.println("" + x + ch + y + " = " + (x * y));
                case '/' -> System.out.printf("" + x + ch + y + " = %.6f",  ((double) x / y));
                case '%' -> System.out.println("" + x + ch + y + " = " + (x % y));
                default -> System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다");
            }
        }
        else
            System.out.println("양수를 입력해주세요");
    }
}
