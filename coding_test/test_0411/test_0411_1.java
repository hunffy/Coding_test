/*  백준 2869번 문제풀이)
 *  땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
    달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
    달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.

    ex) 입력: 첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다. (1 ≤ B < A ≤ V ≤ 1,000,000,000)
        출력: 첫째 줄에 달팽이가 나무 막대를 모두 올라가는데 며칠이 걸리는지 출력한다.

        입력: 2 1 5 
        출력: 4 
 */
package test_0411;

import java.util.Scanner;

public class test_0411_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int cnt = 0;
        int res = 0;
        System.out.print("A,B,V 값을 차례대로 입력해주세요.");
        int A = scan.nextInt();
        int B = scan.nextInt();
        int V = scan.nextInt();

        while(res<V){
            res += A-B;
            cnt++;
            if(res+A>=V){
                break;
            }
        }
        System.out.print((cnt+1)+"일");
    }
}
