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

/*

<point>

-next, nextInt 차이.
-toCharArray는 String을 Char형 배열로 변환.
-length 사용하기.
-char을 int로 변환하기.


import java.util.Scanner;

public class Q001{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<cNum.length; i++){
            sum += cNum[i] - '0';
        }
        System.out.print(sum);
     }
}

*/
