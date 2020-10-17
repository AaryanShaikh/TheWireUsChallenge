import java.util.*;
import java.text.DecimalFormat;
public class Day37{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		System.out.println("Enter the amount Nikil would like to withdraw");
		float withdraw = in.nextFloat();
		System.out.println("Enter Nikil's Account Balance");
		float balance = in.nextFloat();
		if (withdraw>balance) {
			System.out.println(df.format(balance));
		}else if(withdraw%5!=0){
			System.out.println(df.format(balance));
		}
		else{
			System.out.println(df.format((balance-withdraw)-0.50));
		}
	}
}
