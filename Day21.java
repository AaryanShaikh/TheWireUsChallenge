import java.util.*;
public class Day21{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		String d1[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String d10[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
		String d100[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String d1000[] = {"","M","MM","MMM"};
		System.out.println(d1000[num/1000]+d100[(num%1000)/100]+d10[(num%100)/10]+d1[(num%10)]);
	}
}
