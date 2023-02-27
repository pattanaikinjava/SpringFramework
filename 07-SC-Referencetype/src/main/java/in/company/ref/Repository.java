package in.company.ref;

public class Repository
{
	
	private String entity;
	
	/* alt + shift + S+ S */
	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}

	/* alt + shift +S + R */
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}

	/* alt + shift + S + O */
	public Repository() {
		super();
		
	}

			
	

}
