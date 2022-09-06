/*
 * 1546
 * 평균
 * 
 * 입력
 * 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다
 * 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고
 * 적어도 하나의 값은 0보다 크다
 * 
 * 출력
 * 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10^-2 이하면 정답이다.
 */
import java.util.Arrays;
import java.util.Scanner;
 
public class avg {
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double arr[] = new double[sc.nextInt()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextDouble();
		}
		
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}