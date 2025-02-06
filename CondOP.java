import java.util.*;
class CondOP{
	public static void main(String[] args) {
		int a=22;
		int b=52;
		int c=10;
		int lar=(a>b)?((a>c)?(a):(c)):((b>c)?(b):(c));
		System.out.println(lar);
	}
}