import java.util.*;
public class Day14{
	static Stack<Integer> s = new Stack<Integer>();
	static void insertAtBottom(int data){
		if (s.isEmpty()) {
			s.push(data);
		}
		else{
			int prevData = s.peek();
			s.pop();
			insertAtBottom(data);
			s.push(prevData);
		}
	}
	static void reverse(){
		if (s.isEmpty()) {
			return;
		}
		int data = s.peek();
		s.pop();
		reverse();
		insertAtBottom(data);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int size = in.nextInt();
		System.out.println("Enter the "+size+" data");
		for (int i=0;i<size ;i++ ) {
			int num = in.nextInt();
			s.push(num);
		}
		System.out.println("Orignal Stack");
		System.out.println(s);
		reverse();
		System.out.println("Reversed Stack");
		System.out.println(s);
	}
}
