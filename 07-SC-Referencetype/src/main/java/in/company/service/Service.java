package in.company.service;

import in.company.ref.Repository;

public class Service
{
	private Repository repo;

	public Service() {
		super();
		
	}

	
	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}

	public Repository getRepo() {
		return repo;
	}

	public void setRepo(Repository repo) {
		this.repo = repo;
	}
	
	

}
