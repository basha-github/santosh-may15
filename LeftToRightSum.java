import java.util.Scanner;

public class LeftToRightSum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();// 1234
		int t;
		int r,sum=0,d=1;
		t=num;
		while(num !=0) {
			num = num/10;
			d = d * 10;
		}
		d = d/10;
		num=t;
		System.out.println("d----->"+d);
		while(num != 0) {
			r = num /d;// 1234
			sum = sum + r;
			num = num % d;
			d = d/10;
			System.out.println(r+" ");
		}
		System.out.println("sum--->"+sum);

	}

}
