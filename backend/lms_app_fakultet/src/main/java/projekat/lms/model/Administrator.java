package projekat.lms.model;

import jakarta.persistence.Entity;
import projekat.lms.generics.BaseEntity;

@Entity
public class Administrator extends BaseEntity{

	public Administrator() {
		super();
	}

	public Administrator(Long id, Boolean deleted) {
		super(id, deleted);
	
	}
	
	
	
}
