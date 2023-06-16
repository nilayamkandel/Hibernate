package annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value= "colz")
public class College {
	
//default value can be set directly
	
	@Value("KEC")
	private String name;
	@Value("01234")
	private String phone;
	
	public void printCollegeInfo() {
		System.out.println("Name: "+name);
		System.out.println("Phone:"+phone);
	}
	
	
}
