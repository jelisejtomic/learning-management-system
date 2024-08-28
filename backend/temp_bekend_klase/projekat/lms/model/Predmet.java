package projekat.lms.model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class Predmet extends BaseEntity {
	@Column(nullable = false, unique = true, columnDefinition = "VARCHAR(64)")
	private String akronim;

	@Column(nullable = false, columnDefinition = "VARCHAR(128)")
	private String naziv;

	@Column(nullable = false)
	private Integer espb; // od 1 do 15

	@Column(nullable = false, columnDefinition = "TINYINT(1)")
	private Boolean obavezan;

	@Column(nullable = false)
	private Integer semestar; // od 1 do 8

	@Column(nullable = false)
	private Integer semestarTrajanje; // 1 ili 2

	@Column(nullable = false)
	private Integer brojPredavanja;

	@Column(nullable = false)
	private Integer brojVezbi;

	private Integer drugiObliciNastave; // radionice, posete sajmovima, nesto sto nije nastava i vezbe

	private Integer istrazivackiRad; // broj casova izdvojen za istrazivacki rad

	private Integer ostaliCasovi; // fond preostalih casova (nekategorisani dopunski casovi i sl)

	private String stranicaPredmeta;

	@OneToMany(orphanRemoval = true)
	private Set<Ishod> silabus = new HashSet<>();
	
	@ManyToOne(optional = true, cascade = CascadeType.PERSIST)
	private Predmet preduslov;

//	@OneToMany(mappedBy = "predmet")
//	private Set<Obavestenje> obavestenja = new HashSet<>();

	public Predmet() {
		super();
	}
	
	public Predmet(Long id, String akronim, String naziv, Integer espb, Boolean obavezan, Integer semestar,
		Integer semestarTrajanje, Integer brojPredavanja, Integer brojVezbi, Integer drugiObliciNastave,
		Integer istrazivackiRad, Integer ostaliCasovi, String stranicaPredmeta, Set<Ishod> silabus, Predmet preduslov) {
		super(id);
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

	public Boolean getObavezan() {
		return obavezan;
	}

	public void setObavezan(Boolean obavezan) {
		this.obavezan = obavezan;
	}

	public Predmet getPreduslov() {
		return preduslov;
	}

	public void setPreduslov(Predmet preduslov) {
		this.preduslov = preduslov;
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

	public Set<Ishod> getSilabus() {
		return silabus;
	}

	public void setSilabus(Set<Ishod> silabus) {
		this.silabus = silabus;
	}

}
