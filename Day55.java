import java.io.*;
import java.util.*;

public class Day55 {
	
	static int max=99998;
	public static void main(String[] args)throws IOException
	{
		FastReader f=new FastReader();
		StringBuffer sb = new StringBuffer();
		
		int test=f.nextInt();
		while(test-->0)
		{
			int d=f.nextInt();
			List<Integer> list=new ArrayList<>();
			if(d==0)
			{
				sb.append("2\n");
				sb.append("1 1\n");
				continue;
			}
			while(d!=0)
			{
				if(d<=max)
				{
					list.add(d+1);
					list.add(d+2);
					list.add(1);
					d=0;
				}
				else
				{
					list.add(max+1);
					list.add(max+2);
					list.add(1);
					d-=max;
				}
			}
			sb.append(list.size()+"\n");
			for(int i:list)
				sb.append(i+" ");
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static class FastReader 
	{ 
	    BufferedReader br; 
	    StringTokenizer st; 

	    public FastReader() {
	    	br = new BufferedReader(new
	                 InputStreamReader(System.in)); 
	    }
	    String next() { 
	        while (st == null || !st.hasMoreElements()) { 
	            try{ 
	                st = new StringTokenizer(br.readLine()); 
	            } 
	            catch (IOException  e) { 
	                e.printStackTrace(); 
	            } 
	        } 
	        return st.nextToken(); 
	    } 
	    int nextInt() { 
	        return Integer.parseInt(next()); 
	    } 
	    long nextLong() { 
	        return Long.parseLong(next()); 
	    } 
	    double nextDouble() { 
	        return Double.parseDouble(next()); 
	    } 
	    String nextLine() { 
	        String str = ""; 
	        try{ 
	            str = br.readLine(); 
	        } 
	        catch (IOException e) { 
	            e.printStackTrace(); 
	        } 
	        return str; 
	    } 
	} 
}
