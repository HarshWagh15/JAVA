import java.util.*;
class seriesSquarQube{
	public static void main(String[] args) {
		for(int i=12;i<=16;i++){
			if(i%2==0){
				System.out.print(i*i+",");
			}else{
				System.out.print(i*i*i+",");
			}
		}
	}
}