
public class Demo2 {

	public static void main(String[] args) {

		int num = 12345,r,sum=0;
		// 1+2+3+4+5
		// %
	
		while(num != 0) {
			r = num % 10;
			sum = sum + r;
			num = num/10;
			System.out.println(r+" ");
		}
		
		System.out.println("sum--->"+sum);
		
	
	
	}

}
