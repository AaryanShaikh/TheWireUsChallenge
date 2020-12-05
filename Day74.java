import java.util.*;
public class Day74{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int tc = in.nextInt();
		for (int i=0;i<tc ;i++ ) {
			int total = in.nextInt();
			String pairs[] = new String[in.nextInt()];
			in.nextLine();
			for (int j=0;j<pairs.length ;j++ ) {
			 	pairs[j] = in.nextLine();
			 }
			int index = 0,sum = 0,count=0;
			while(true){
				boolean trigger = true;
				String res = "";
				for (int j=index;j<pairs.length ;j++ ) {
					if (trigger) {
						res+=pairs[j]+" ";
						trigger = false;					
					}else{
						if (res.contains(Character.toString(pairs[j].charAt(0)))||
							res.contains(Character.toString(pairs[j].charAt(2)))) {
							index = j+1;
							if (!res.contains(Character.toString(pairs[j].charAt(0)))) {
								res+=Character.toString(pairs[j].charAt(0))+" ";
							}else if (!res.contains(Character.toString(pairs[j].charAt(2)))) {
								res+=Character.toString(pairs[j].charAt(2))+" ";
							}
						}else{
							continue;
						}
					}				
				}
				res = res.replaceAll("[^0-9]", "");
				sum+=res.length();
				count++;
				pq.add(res.length());
				if (index==pairs.length) {
					break;
				}
			}
			if (sum!=total) {
			 	pq.add(total-sum);
			 	count++;
			 }
			System.out.println(count);
			while(!pq.isEmpty()){
				System.out.print(pq.remove()+" ");
			}  
		}
	}
}