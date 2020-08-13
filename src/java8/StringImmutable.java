package java8;

public class StringImmutable {
	public static void main(String args[]) {
		String str1 = new String ("ABCD");
		String str2 = new String ("ABCD");
		if(str1 == str2) {
			System.out.println("String1 == String2  is true");
		}
		else
			System.out.println("String1== String2 is false");
	 
	 String str3 =str2;
	 
	 if(str3 == str2) {
		 System.out.println("String3 and String 2  is true");
		 
	 }else 
		 System.out.println("String3 and String 2  is false");
	
	if(str1.equals(str2)) {
		System.out.println("String1 == String2  is true");
	} else
		System.out.println("String1 == String2  is false");
	}

}

