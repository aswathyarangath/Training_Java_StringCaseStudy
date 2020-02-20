import java.util.*;
class String4{
	public static void main(String args[]){
		String s3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()==s2.length()){
			String t=s1.concat(s2);
			System.out.println(t);
		}
		else{
			System.out.println("Else part");
			if(s1.length()>s2.length()){
				s3=s1.substring(s1.length()-s2.length())+s2;
				System.out.println(s3);
				
			}
			else{
				s3=s1+s2.substring(s2.length()-s1.length());
				System.out.println(s3);
			}
		}
	}
}
			
		
