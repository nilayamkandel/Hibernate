package annotation;

import org.springframework.stereotype.Component;

@Component
public class NepaliTeacherServiceImpl implements TeacherService{

	@Override
	public void teach() {
		System.out.println("nepali........");
		
	}

}
