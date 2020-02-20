class String1{
	public static void main(String args[]){
		String s="Welcome to Java World";
		System.out.println(s.charAt(4));
		String s1="Welcome";
		System.out.println(s.compareTo(s1));
		String s2=s.concat(" Let us learn");
		System.out.println(s2);
		System.out.println(s.indexOf('a'));
		String replaceString=s.replace('a','e');
		System.out.println(replaceString);
		System.out.println(s.substring(4,10));
		System.out.println(s.toLowerCase());
	}
}