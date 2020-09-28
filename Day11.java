import java.util.*;
public class Day11{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String strsplit[] = str.split(":");
		String hh = strsplit[0];
		String mm = strsplit[1]; 
		String ss = strsplit[2];
		if (ss.charAt(ss.length()-2) == 'A') {
			ss=ss.replaceAll("AM","");
			if (hh.equals("12") && Integer.parseInt(hh) < 45) {
				hh = "00";
			}
			System.out.println(hh+":"+mm+":"+ss);
		}
		else{
			ss=ss.replaceAll("PM","");
			if (!hh.equals("12")) {
			    int nh = Integer.parseInt(hh);
				nh += 12;
				System.out.println(nh+":"+mm+":"+ss);
			 }else{ 
				System.out.println(hh+":"+mm+":"+ss);
			}
		}
	}
}
