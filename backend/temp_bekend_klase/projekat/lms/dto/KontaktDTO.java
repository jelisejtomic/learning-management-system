package projekat.lms.dto;

public class KontaktDTO {
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
