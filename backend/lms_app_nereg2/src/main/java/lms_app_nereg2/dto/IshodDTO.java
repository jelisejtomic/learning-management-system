package lms_app_nereg2.dto;

import java.util.Set;

public class IshodDTO {
	private Long id;
	private String opis;
//	private TerminNastave termin;
	private PredmetDTO predmet;
	private Set<NastavniMaterijalDTO> nastavniMaterijal;

	public IshodDTO() {
		super();
	}

	public IshodDTO(Long id, String opis, PredmetDTO predmet, Set<NastavniMaterijalDTO> nastavniMaterijal) {
		super();
		this.id = id;
		this.opis = opis;
		this.predmet = predmet;
		this.nastavniMaterijal = nastavniMaterijal;
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

	public PredmetDTO getPredmet() {
		return predmet;
	}

	public void setPredmet(PredmetDTO predmet) {
		this.predmet = predmet;
	}

	public Set<NastavniMaterijalDTO> getNastavniMaterijal() {
		return nastavniMaterijal;
	}

	public void setNastavniMaterijal(Set<NastavniMaterijalDTO> nastavniMaterijal) {
		this.nastavniMaterijal = nastavniMaterijal;
	}

}
