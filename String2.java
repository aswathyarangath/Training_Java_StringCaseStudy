class String2{
	public static void main(String args[]){
		StringBuffer  sb=new StringBuffer ("This is StringBuffer  ");
		sb.append("This is a sample program");
		System.out.println(sb);
		sb.insert(21,"Object");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		
		System.out.println(sb.replace(14,21,"Builder"));

	}
}