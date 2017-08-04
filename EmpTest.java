
public class EmpTest {

	public static void main(String[] args) {
		
		
				Employee e1 = new Employee();
				e1.count+=1;
				Employee e2 = new Employee();
				e2.count+=1;
				Employee e3 = new Employee();
				e3.count+=1;
				
				
				
				// we can access static variables/methods without an object
				System.out.println("count of objects::" + e1.count);
				System.out.println("count of objects::" + e2.count);
				System.out.println("count of objects::" + e3.count);
			



	}

}
