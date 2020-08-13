package College;

public class HadoopTeacher extends Teacher {
	String mainSubject=  "SPARK" ;
	public static void main(String args[]) {
		HadoopTeacher obj = new HadoopTeacher();
		System.out.println(obj.collegeName);
		System.out.println(obj.designation);
		System.out.println(obj.mainSubject);
		obj.does();
	}
	

}
