package Single;

public class empData {
	public static void main(String args[]) {
		 employee empdata =new employee();
		 empdata.setName("employee");
         empdata.setAge(30);
         empdata.setEmpId("101");
        System.out.println("Name" +empdata.getName());
        System.out.println("Age:"+ empdata.getAge());
        System.out.println("empId"+ empdata.getEmpId());
         
	}
}
