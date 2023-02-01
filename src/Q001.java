// 1번째에 숫자의 개수를 입력받고 (1 이상 100이하의 수), 2번째에 숫자 N개가 공백없이 주어짐. 숫자 N개의 합을 출력.

import java.util.Scanner;

public class Q001{
    public static void main(String[] args){

        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();

        Scanner inputLine = new Scanner(System.in);
        long line = inputLine.nextLong();

        int[] arr = new int[number];

        while(line > 0) {
            for (int i = 0; i < number; i++) {

                long afterDivide = line / 10;
                long value = line % 10;

                arr[i] =(int)value;

                line = afterDivide;
            }
        }

        int sum = 0;

        for(int i = 0; i < number; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
