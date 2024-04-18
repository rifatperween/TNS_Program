package inheritance;

public class DemoStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student st= new Student();
   st.setName("Rifat");
   st.setEmail("rifat@gmail");
   st.setAdharno("123");
   st.setStream("CSE");
   st.setGrade("A");
   
//   object of tostring i.e student will be called
   System.out.println(st.toString() + st);
   
   	City c1= new City();
   	c1.setCname("India");
   	c1.setSname("Goa");
   	c1.setCity("ABC");
   	System.out.println(c1.getCname() + c1.getSname() + c1.getCity() );
	}

}
