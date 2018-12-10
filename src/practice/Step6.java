package practice;
import java.util.Scanner;


public class Step6 {

	/*
	 * 문제 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
	 * 
	 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
	 * 
	 * 입력 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
	 * 
	 * 출력 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
	 * 
	 * 예제 입력 1 5 예제 출력 1
	 *****
	 ****
	 ***
	 **
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 0;
		Scanner sc = new Scanner(System.in);	

		n= sc.nextInt();

		
		for (int a = n; a >= 1; a--) {
			for (int b = a; b>= 1; b--) {
			System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}



/*import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		int n = 0;

		Scanner sc = new Scanner(System.in);	

		n= sc.nextInt();



		for(int j=0; j<n;j++){
			for(int i=n; i<j+n; i++ ){
				System.out.print(" ");
				
			}


			for(int i=n; i-j>0; i--){ //5 , 4번
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();

	}

}

*/