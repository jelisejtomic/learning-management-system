package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class AdministratorDTO  extends BaseDTO implements Serializable{

	private static final long serialVersionUID = -1256488500918369924L;

	public AdministratorDTO() {
		super();
	}

	public AdministratorDTO(Long id, Boolean deleted) {
		super(id, deleted);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
