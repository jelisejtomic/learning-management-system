package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class ObrazovniCiljDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = -5808492620063686504L;
	private String opis;

	public ObrazovniCiljDTO(Long id, Boolean deleted, String opis) {
		super(id, deleted);
		this.opis = opis;
	}

	public ObrazovniCiljDTO() {
		super();
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
