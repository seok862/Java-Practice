import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int F = sc.nextInt();
		
		N = N-N%100;
		for(int i=0; i<100; i++) {
			if(N%F == 0) {
				System.out.printf("%02d",N%100);
				break;
			}
			
			N = N+1;
		}
	}
}
