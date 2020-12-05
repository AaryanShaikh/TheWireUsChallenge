import java.util.*;
public class Day71{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tc = in.nextInt();
		in.nextLine();
		for (int j=0;j<tc ;j++ ) {
			String str = in.nextLine();
			Stack<String> s = new Stack<String>();
			String strsplit[] = str.split("");
			int count=0;
			for (int i=0;i<strsplit.length ;i++ ) {
				if (s.isEmpty()) {
					s.push(strsplit[i]);
				}else{
					if (s.peek().equals("x")&&strsplit[i].equals("y")||
						s.peek().equals("y")&&strsplit[i].equals("x")) {
						count++;
						s.pop();
					}else{
						s.push(strsplit[i]);	
					}
				}
			}
			System.out.println(count);
		}	
	}
}