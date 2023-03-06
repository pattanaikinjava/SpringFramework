package in.dev.repo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class MyRepository
{
	
	@Value("MYSample")
	private String sample;

	@Override
	public String toString() {
		return "MyRepository [sample=" + sample + "]";
	}
	

}
