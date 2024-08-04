package miscConcept;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Strings are immutable
		String a ="hello";	//String literal
		String b ="hello";	
		a.concat("world");
		System.out.println(a);
		String c =a.concat("world");
		System.out.println(c);
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));// match the actual content
		System.out.println(a==b); //match the reference
		
		String s = new String("Hello");	//String class object way defining
		String s1 = new String("Hello");
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
//		To make Strings mutable
//		StringBuffer and StringBuilder classes are used
		
		StringBuffer sb = new StringBuffer("This");
		sb.append(" nandha");
		System.out.println(sb);//This nandha
		sb.insert(4," is");
		System.out.println(sb);//This is nandha
		sb.replace(5, 7, "was");// will delete from 5 till 7 ie 5&6
		System.out.println(sb);//This was nandha
		sb.delete(5, 8);
		System.out.println(sb);//This  nandha
		sb.reverse();
		System.out.println(sb);//ahdnan  sihT
	}

}
