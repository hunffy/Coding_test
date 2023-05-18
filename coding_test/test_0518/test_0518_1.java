package test_0518;

import java.util.Arrays;
import java.util.Scanner;

/*  
    
    어떤 수들이 있을 때, 그 수들을 대표하는 값으로 가장 흔하게 쓰이는 것은 평균이다. 
    평균은 주어진 모든 수의 합을 수의 개수로 나눈 것이다. 예를 들어 10, 40, 30, 60, 30의 평균은 (10 + 40 + 30 + 60 + 30) / 5 = 170 / 5 = 34가 된다.
    평균 이외의 또 다른 대표값으로 중앙값이라는 것이 있다. 중앙값은 주어진 수를 크기 순서대로 늘어 놓았을 때 가장 중앙에 놓인 값이다. 
    예를 들어 10, 40, 30, 60, 30의 경우, 크기 순서대로 늘어 놓으면

    10 30 30 40 60

    이 되고 따라서 중앙값은 30이 된다.

    다섯 개의 자연수가 주어질 때 이들의 평균과 중앙값을 구하는 프로그램을 작성하시오.
 *  
 * 
 *  입력)
 *  첫째 줄부터 다섯 번째 줄까지 한 줄에 하나씩 자연수가 주어진다. 주어지는 자연수는 100 보다 작은 10의 배수이다.
 * 
 *  출력)
 *  첫째 줄에는 평균을 출력하고, 둘째 줄에는 중앙값을 출력한다. 평균과 중앙값은 모두 자연수이다.
 */
public class test_0518_1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // 길이 5를 가진 배열생성
        int [] N_list = new int[5];

        //반복문을통해 5개의 자연수를 입력
        for(int i=0; i<5; i++){
            System.out.print("숫자를 입력하세요.");
            N_list[i]=scan.nextInt();
        }
        //중앙값을 찾기위해 정령
        Arrays.sort(N_list);
        
        int sum =0;
        int avg = 0;
        for(int i=0; i<5; i++){
            sum+=N_list[i];
        }
        avg = sum/5;
        System.out.println(avg);
        System.out.println(N_list[2]);
    }
}
