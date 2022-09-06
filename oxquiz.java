/*
 * 8958
 * 
 * 입력
 * 첫째 줄에 테스트 케이스의 개수가 주어진다
 * 각 테스트 케이스는 한 줄로 이루어져 있고
 * 길이가 0보다 크거나 80보다 작은 문자열이 주어진다.
 * 문자열은 O와 X만으로 이루어져 있다.
 * 
 * 출력
 * 각 테스트 케이스마다 점수를 출력한다.
 */

import java.util.Scanner;
 
public class oxquiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		String arr[] = new String[sc.nextInt()];
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
				
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	
			int sum = 0;	
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
	}
}