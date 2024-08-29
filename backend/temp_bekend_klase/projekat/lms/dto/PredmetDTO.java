package projekat.lms.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class PredmetDTO extends BaseDTO implements Serializable {
	private static final long serialVersionUID = -6564050817281102873L;
	private Long id;
	private String akronim;
	private String naziv;
	private Integer espb; // od 1 do 15
	private boolean obavezan;
	private Integer semestar; // od 1 do 8
	private Integer semestarTrajanje;
	private Integer brojPredavanja;
	private Integer brojVezbi;
	private Integer drugiObliciNastave; // radionice, posete sajmovima, nesto sto nije nastava i vezbe
	private Integer istrazivackiRad; // broj casova izdvojen za istrazivacki rad
	private Integer ostaliCasovi; // fond preostalih casova (nekategorisani dopunski casovi i sl)
	private String stranicaPredmeta;
	
	private Set<IshodDTO> silabus = new HashSet<>();
	private PredmetDTO preduslov;
	
	public PredmetDTO() {
		super();
	}

	public PredmetDTO(Long id, String akronim, String naziv, Integer espb, boolean obavezan, Integer semestar,
			Integer semestarTrajanje, Integer brojPredavanja, Integer brojVezbi, Integer drugiObliciNastave,
			Integer istrazivackiRad, Integer ostaliCasovi, String stranicaPredmeta, Set<IshodDTO> silabus,
			PredmetDTO preduslov) {
		super();
		this.id = id;
		this.akronim = akronim;
		this.naziv = naziv;
		this.espb = espb;
		this.obavezan = obavezan;
		this.semestar = semestar;
		this.semestarTrajanje = semestarTrajanje;
		this.brojPredavanja = brojPredavanja;
		this.brojVezbi = brojVezbi;
		this.drugiObliciNastave = drugiObliciNastave;
		this.istrazivackiRad = istrazivackiRad;
		this.ostaliCasovi = ostaliCasovi;
		this.stranicaPredmeta = stranicaPredmeta;
		this.silabus = silabus;
		this.preduslov = preduslov;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAkronim() {
		return akronim;
	}

	public void setAkronim(String akronim) {
		this.akronim = akronim;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public Integer getEspb() {
		return espb;
	}

	public void setEspb(Integer espb) {
		this.espb = espb;
	}

	public boolean isObavezan() {
		return obavezan;
	}

	public void setObavezan(boolean obavezan) {
		this.obavezan = obavezan;
	}

	public Integer getSemestar() {
		return semestar;
	}

	public void setSemestar(Integer semestar) {
		this.semestar = semestar;
	}

	public Integer getSemestarTrajanje() {
		return semestarTrajanje;
	}

	public void setSemestarTrajanje(Integer semestarTrajanje) {
		this.semestarTrajanje = semestarTrajanje;
	}

	public Integer getBrojPredavanja() {
		return brojPredavanja;
	}

	public void setBrojPredavanja(Integer brojPredavanja) {
		this.brojPredavanja = brojPredavanja;
	}

	public Integer getBrojVezbi() {
		return brojVezbi;
	}

	public void setBrojVezbi(Integer brojVezbi) {
		this.brojVezbi = brojVezbi;
	}

	public Integer getDrugiObliciNastave() {
		return drugiObliciNastave;
	}

	public void setDrugiObliciNastave(Integer drugiObliciNastave) {
		this.drugiObliciNastave = drugiObliciNastave;
	}

	public Integer getIstrazivackiRad() {
		return istrazivackiRad;
	}

	public void setIstrazivackiRad(Integer istrazivackiRad) {
		this.istrazivackiRad = istrazivackiRad;
	}

	public Integer getOstaliCasovi() {
		return ostaliCasovi;
	}

	public void setOstaliCasovi(Integer ostaliCasovi) {
		this.ostaliCasovi = ostaliCasovi;
	}

	public String getStranicaPredmeta() {
		return stranicaPredmeta;
	}

	public void setStranicaPredmeta(String stranicaPredmeta) {
		this.stranicaPredmeta = stranicaPredmeta;
	}

	public Set<IshodDTO> getSilabus() {
		return silabus;
	}

	public void setSilabus(Set<IshodDTO> silabus) {
		this.silabus = silabus;
	}
	
	public PredmetDTO getPreduslov() {
		return preduslov;
	}

	public void setPreduslov(PredmetDTO preduslov) {
		this.preduslov = preduslov;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
