/* height = height of the tower
   tower[] = tower containing chips;
   //Special Case
   if the below chip has the same value as that of the top chip it'll fall(Removed) too
   due to gravity!!! 
*/
import java.util.Scanner;
public class Day26{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the height(size) of the tower");
		int height = in.nextInt();
		System.out.println("Enter the "+height+" default chips to put in the tower");
		int tower[] = new int[height];
		int index = 0;
		for (index=0;index<height ;index++ ) {
			tower[index] = in.nextInt();
		}
		boolean flag = true;
		while(flag){
			System.out.println("\n1.Put the chip on the tower");
			System.out.println("2.Remove the chip from the top of the tower");
			System.out.println("3.Display the tower");
			System.out.println("4.Stop the program");
			System.out.println("What's Your choice??");
			int ch = in.nextInt();
			switch(ch){
				case 1: if (index>tower.length-1) {
					System.out.println("The tower is full!!");
				}else{
					System.out.println("The value of the chip you want to enter!");
					tower[index] = in.nextInt();
					System.out.println(tower[index]+" is added to the tower");
					index++;	
				}
					break;
				case 2: if (index<=0) {
					System.out.println("The tower is empty");
				}else{
						index--;
						int temp = tower[index];
						tower[index] = 0;
						System.out.println(temp+" was removed from the tower");
						if (index!=0) {
							while(tower[index-1]==temp){
								index--;
								tower[index] = 0;
								System.out.println(temp+" fell from the tower due to Gravity!!");	
							}
						}
				}
					break;
				case 3: if (index<=0) {
					System.out.println("The tower is empty");	
						}else{
						System.out.println("Tower (bottom->top)");
						for (int i=0;i<height ;i++ ) {
							if (tower[i]!=0) {
								System.out.print(tower[i]+" ");
							}
						}
						System.out.println();
						}
					break;
				case 4: flag = false;
					break;
				default: System.out.println("Your input is incorrect");
					break;
			}
		}
	}
}
