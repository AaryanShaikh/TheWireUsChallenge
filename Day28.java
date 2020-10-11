/* Book Details input : 7 Maths (no of excercises 'space' book name) 
	7 -> denotes the no of excersise left
	maths -> denotes the name/subject of the book
*/
import java.util.*;
public class Day28{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of books");
		int size = in.nextInt();
		in.nextLine();
		System.out.println("Enter the no of excercises and name of the book");
		Stack<String> book = new Stack<String>();
		Stack<Integer> exc = new Stack<Integer>();
		int arr[] = new int[size];  
		for (int i=0;i<size ;i++ ) {
			String str = in.nextLine();
			String strsplit[] = str.split(" ");
			exc.push(Integer.parseInt(strsplit[0]));
			book.push(strsplit[1]);
			arr[i] = Integer.parseInt(strsplit[0]);
		}
		Arrays.sort(arr);
		Stack<String> resbook = new Stack<String>();
		Stack<Integer> resexc = new Stack<Integer>();
		int count = 0;
		String temp;
		System.out.println("Louise has started studying");
		while(true){
			if (book.isEmpty()||exc.isEmpty()) {
				break;
			}

			while(arr[count]!=exc.peek()){
				 temp = book.pop();
				System.out.println("Louise has placed "+temp+" Book back to the messy floor!!");
				resbook.push(temp);
				resexc.push(exc.pop());
			}
			if (arr[count]==exc.peek()) {
				System.out.println("Louise has completed "+book.peek()+"'s excersises");
				exc.pop();
				book.pop();

				while(!resexc.isEmpty()||!resbook.isEmpty()){
					exc.push(resexc.pop());
					temp = resbook.pop();
					System.out.println("Louise put "+temp+" book back to the pile!");
					book.push(temp);
				}
			}
			count++;
		}
		System.out.println("Louise has finished all the excersises.");
	}
}
