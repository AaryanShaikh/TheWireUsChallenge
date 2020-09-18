import java.util.*;
public class Day1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[5][5];
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				arr[i][j] = in.nextInt();
			}
		}
		System.out.println();
		boolean check = true;
		for(int i=0;i<4;i++){
			if (check) {
					for(int j=0;j<4;j++){
						System.out.print(arr[j][i]+" ");
					}
				check=false;
			}else{
					for(int j=3;j>=0;j--){
						System.out.print(arr[j][i]+" ");
					}
				check=true;
			}
		}
	}
}
