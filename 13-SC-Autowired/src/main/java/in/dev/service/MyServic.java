package in.dev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.dev.repo.MyRepository;

@Component
public class MyServic {
	
	@Autowired 
	private MyRepository repo; //HAS-A Relationship

	@Override
	public String toString() {
		return "MyServic [repo=" + repo + "]";
	}
	
}
