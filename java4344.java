/*
 * 4344
 * 평균은 넘겠지
 * 
 * 입력
 * 첫째 줄에 테스트 케이스의 개수 C 주어진다
 * 
 * 둘째 줄버터 각 테스트 케이스 마다 학생의 수 N , 이어서 N명의 점수
 * 
 * 출력
 * 각 케이스 마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
 */

import java.util.Scanner;

public class java4344 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        for(int i=0; i<c; i++){ // 테스트 케이스의 개수 만큼 반복해야 할 for문

            int n = sc.nextInt();
            int[] arr = new int[n]; //학생 수 n 입력

            double sum = 0;

            for(int j=0; j<n; j++){ //성적을 받아 총합 및 평균을 구하는 부분
                int val = sc.nextInt();
                arr[j] = val;
                sum += val;
            }

            double rate = (sum / n);
            double cnt = 0;

            for(int j=0; j < n; j++){
                if(arr[j]>rate){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n",(cnt/n)*100);
        }
    }
}
