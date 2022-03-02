package GitPackage;

public class str {
	public static void main(String[]args) {
		String str1=new String("Hello");
		String str2=new String("hello");
		
		
	//	System.out.println(str1.charAt(4));
	//	System.out.println(str1.concat(str2));
	//	System.out.println(str1);
	//	str1="   Welcome"+str1;
	//	System.out.println(str1.indexOf('l'));
	//	System.out.println(str1.lastIndexOf('l'));
	//	System.out.println(str1.length());
	//	System.out.println(str1.trim().length());
		
		StringBuffer sb=new StringBuffer("vishal");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.append("  admin"));
		System.out.println(sb);
	}
}
