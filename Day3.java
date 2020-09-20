import java.util.*;
public class Day3{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of bars in the histogram");
		int size = in.nextInt();
		System.out.println("Enter the sizes of the histogram");
		int hist[] = new int[size];
		for(int i=0;i<size;i++){
			hist[i] = in.nextInt();
		}
		System.out.println("The max area of the rectangle in the histogram is "+maxArea(hist));
	}
	static int maxArea(int hist[]){
		Stack<Integer> s = new Stack<Integer>();
		int max=0,i=0,area=0,currMax=0;
		while(i<hist.length){
			if (s.isEmpty()||s.peek()<hist[i]) {
				s.push(i);
				i++;
			}
			else{
				currMax = s.pop(); 
				area = hist[currMax] * (s.isEmpty() ? i-1 : i-1-s.peek());
				if (area>max) {
					max = area;
				}
			}
		}
		while(!s.isEmpty()){
			currMax = s.pop(); 
			area = hist[currMax] * (s.isEmpty() ? i-1 : i-1-s.peek());
			if (area>max) {
					max = area;
				}
			}
			return max;	
		}
	}
