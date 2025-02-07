
import java.util.*;
class FactorsWithPrime{
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.print("Enter the Num:");
		int num=SC.nextInt();
		int cnt=0;
		for(int i=2;i<num;i++){
			if(num%i==0){
				cnt++;
			}	
			}
			System.out.println(cnt==0?"It Is Prime":"It is not Prime");
			}
		}
