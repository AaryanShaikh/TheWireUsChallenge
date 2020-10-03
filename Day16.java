import java.util.*;
public class Day16{
	static void recur(String left, String right, int n, int diff){
		if (n > 9) {
			return;
		}
		if (n > 0 && (2 * Math.abs(diff) <= n))
		{
			if (n == 1)
			{
				recur(left, '0' + right, 0, diff);
				recur(left, '1' + right, 0, diff);
				return;
			}
			if (!left.equals(""))
			{
				recur(left + '0', right + '0', n - 2, diff);
				recur(left + '0', right + '1', n - 2, diff - 1);
			}
			recur(left + '1', right + '0', n - 2, diff + 1);
			recur(left + '1', right + '1', n - 2, diff);
		}
		else if (n == 0 && diff == 0) {
				System.out.print(left + right + " ");
			}
		}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		n*=2;
		String left = "", right = "";
		int diff = 0;
		recur(left, right, n, diff);
	} 
}
