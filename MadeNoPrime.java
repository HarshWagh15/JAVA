import java.util.*;
class MadeNoPrime{
	public static void main(String[] args) {
		Scanner SC= new Scanner(System.in);
		System.out.print("Enter the No:");
		int num=SC.nextInt();
		boolean flag=true;
		for(int i=2;i<num;i++){
			if(num%i==0){
				flag=false;
				num++;
				i=2;
			}
		}

System.out.println("New prime:"+num);
	}
}