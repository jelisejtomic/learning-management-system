package projekat.lms.dto;

import java.io.Serializable;

import projekat.lms.generics.BaseDTO;

public class KontaktDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = 3063725557737610339L;
	private String vrednost;
	private TipKontaktaDTO tipKontakta;

	public KontaktDTO(String vrednost, TipKontaktaDTO tipKontakta) {
		super();
		this.vrednost = vrednost;
		this.tipKontakta = tipKontakta;
	}

	public KontaktDTO() {
		super();
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getVrednost() {
		return vrednost;
	}

	public void setVrednost(String vrednost) {
		this.vrednost = vrednost;
	}

	public TipKontaktaDTO getTipKontakta() {
		return tipKontakta;
	}

	public void setTipKontakta(TipKontaktaDTO tipKontakta) {
		this.tipKontakta = tipKontakta;
	}

}
