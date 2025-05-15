
public class FindMaxMin {

	public static void main(String[] args) {

		int a=100,b=200,c=34,max,min;
		
		if(a>b) {
			max=a;
			min=b;
		}
		else {
			max=b;
			min=a;
		}
		if(c>max) max=c;
		if(c<min) min=c;
		
		System.out.println("maximum value---->"+max);
		System.out.println("minimum value---->"+min);
		
		
		
		
		
	}

}
