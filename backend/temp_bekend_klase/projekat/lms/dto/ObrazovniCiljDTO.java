package projekat.lms.dto;

import java.io.Serializable;

public class ObrazovniCiljDTO implements Serializable{
	private static final long serialVersionUID = -5808492620063686504L;
	private Long id;
	
	private String opis;
	
	

	public ObrazovniCiljDTO(Long id, String opis) {
		super();
		this.id = id;
		this.opis = opis;
	}

	public ObrazovniCiljDTO() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
