package DataProvider;

import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;

public class TestDataProvider2 {

	@DataProvider
	 public Object[][] getData(Method m) {
		
		System.out.println("Method or Test Name" + m.getName());
		Object[][] data = null;
		
		if(m.getName().equals("loginUser")) {
		 data = new Object[3][4];
 		 
		 //row 1
		 data[0][0] = "Chrome";
		 data[0][1] = "Admin";
		 data[0][2] = "admin_1234";
		 data[0][3] = "admin123";
		 
		 //row2
		 data[1][0] = "Mozilla";
		 data[1][1] = "Mktng";
		 data[1][2] = "marketing_1234";
		 data[1][3] = "mkt123";
		 
		 
		 //row3
		 data[2][0] = "Edge";
		 data[2][1] = "Sales";
		 data[2][2] = "sales_1234";
		 data[2][3] = "sales123";
		 
		}
		else 
			if(m.getName().equals("deleteUser")){
			data = new Object[3][2];
			
			 data[0][0] = "admin_1234";
			 data[0][1] = "admin123";
			 
			 //row2

			 data[1][0] = "marketing_1234";
			 data[1][1] = "mkt123";
			 
			 
			 //row3

			 data[2][0] = "sales_1234";
			 data[2][1] = "sales123";
			
		}
		 
		 return data;
		 
	 }
}
