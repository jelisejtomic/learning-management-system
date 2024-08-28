package projekat.lms.dto;

public class AdresaDTO{
	private String ulica;
	private String broj;
	private MestoDTO mesto;
	public AdresaDTO(String ulica, String broj, MestoDTO mesto) {
		super();
		this.ulica = ulica;
		this.broj = broj;
		this.mesto = mesto;
	}
	public AdresaDTO() {
		super();
	}
	public String getUlica() {
		return ulica;
	}
	public void setUlica(String ulica) {
		this.ulica = ulica;
	}
	public String getBroj() {
		return broj;
	}
	public void setBroj(String broj) {
		this.broj = broj;
	}
	public MestoDTO getMesto() {
		return mesto;
	}
	public void setMesto(MestoDTO mesto) {
		this.mesto = mesto;
	}
	
	
}
