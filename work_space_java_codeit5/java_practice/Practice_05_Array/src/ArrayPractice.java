import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayPractice ap = new ArrayPractice();
        ap.practice1();
        ap.practice2();
        ap.practice3();
        ap.practice4();
        ap.practice5();
        ap.practice6();
        ap.practice7();
        ap.practice8();
        ap.practice9();
        ap.practice10();
    }

    public void practice1() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void practice2() {
        int[] array = new int[10];
        int j = 0;
        for (int i = array.length; i > 0; i--) {
            array[j++] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void practice3() {
        System.out.print("양의 정수 : ");
        int num = Integer.parseInt(sc.nextLine());

        int[] array = new int[num];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void practice4() {
        String[] array = {"사과", "귤", "포도", "복숭아", "참외"};
        System.out.println(array[1]);
    }

    public void practice5() {
        System.out.print("문자열 :");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);
        int count = 0;

        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + ch + " 개수 : " + count);
    }

    public void practice6() {
        System.out.print("정수 : ");
        int num = Integer.parseInt(sc.nextLine());

        int[] array = new int[num];
        int sum = 0;

        for (int i = 0; i < num; i++) {
            System.out.print("배열 " + i + "번쩨 인덱스에 넣을 값 : ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        for (int i = 0; i < num; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        

        System.out.println("\n총 합 : " + sum);
    }

    public void practice7() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10) + 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void practice8() {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10) + 1;

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
        }
        System.out.println("\n최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

    public void practice9() {
        Random random = new Random();
        int[] array = new int[10];
        int i = 0;

        while (i < array.length) {
            boolean isDuplicate = false;
            int x = random.nextInt(10) + 1;

            for (int j = 0; j <= i; j++) {
                if (x == array[j]) {
                   isDuplicate = true;
                   break;
                }
            }

            if (!isDuplicate) {
                array[i] = x;
                i++;
            }
        }

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    public void practice10() {
        Random random = new Random();
        int[] array = new int[6];
        int i = 0;

        while (i < array.length) {
            boolean isDuplicate = false;
            int x = random.nextInt(45) + 1;

            for (int j = 0; j <= i; j++) {
                if (x == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                array[i] = x;
                i++;
            }
        }

        Arrays.sort(array);

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }
}