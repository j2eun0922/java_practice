import java.util.Scanner;

public class LoopPractice {
    public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        LoopPractice lp = new LoopPractice();
        lp.practice1();
        lp.practice2();
        lp.practice3();
        lp.practice4();
        lp.practice5();
        lp.practice6();
        lp.practice7();
        lp.practice8();
        lp.practice9();
    }

    public void practice1() {
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num >= 1) {
            for (int i = 0; i < num; i++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        } else
            System.out.println("1이상의 숫자를 입력해주세요");
    }

    public void practice2() {
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        if (num >= 1) {
            for (int i = num; i > 0; i--) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else
            System.out.println("1이상의 숫자를 입력해주세요");
    }

    public void practice3() {
        System.out.print("정수를 하나 입력하세요 : ");
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int i;
        for (i = 0; i < num; i++) {
            sum += i + 1;
            if (i < num - 1)
                System.out.print(i + 1 + " + ");
        }
        System.out.println(i + " = " + sum);
    }

    public void practice4() {
        System.out.print("첫 번째 숫자 :");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("두 번째 숫자 :");
        int num2 = Integer.parseInt(sc.nextLine());

        if (num1 < 1 || num2 < 1) {
            System.out.println("1이상의 숫자를 입력해주세요");
            return;
        }

        for (int i = num1; i <= num2; i++)
            System.out.print(i + " ");

        System.out.println();
    }

    public void practice5() {
        System.out.print("숫자 : ");
        int n = Integer.parseInt(sc.nextLine());

        System.out.println("==== " + n + "단 ====");
        for (int i = 1; i <= 9; i++)
            System.out.println(n + " * " + i + " = " + (n * i));
    }

    public void practice6() {
        System.out.print("숫자 : ");
        int n = Integer.parseInt(sc.nextLine());

        if (n > 9) {
            System.out.println("9이하의 숫자만 입력해주새요");
            return;
        }

        for (int i = n; i <= 9; i++) {
            System.out.println("==== " + i + "단 ====");
            for (int j = 1; j <= 9; j++)
                System.out.println(i + " * " + j + " = " + (i * j));
            System.out.println();
        }
    }

    public void practice7() {
        System.out.print("시작 숫자 :");
        int num = Integer.parseInt(sc.nextLine());
        System.out.print("공차 :");
        int x = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < 10; i++) {
            num += x;
            System.out.print(num + " ");
        }

        System.out.println();
    }

    public void practice8() {
        System.out.print("정수 입력 : ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void practice9() {
        System.out.print("정수 입력 : ");
        int num = Integer.parseInt(sc.nextLine());

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
