package projekat.lms.model;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import projekat.lms.generics.BaseEntity;

@Entity
public class NastavnikNaRealizaciji extends BaseEntity{
	@Column(nullable = false, columnDefinition = "INT")
	private Integer brojCasova;
	
	@ManyToOne
	private Nastavnik predavac;
	
	@ManyToOne
	private TipNastave tipNastave;

	@ManyToOne
	private RealizacijaPredmeta realizacijaPredmeta;
	
	@OneToMany
	private ArrayList<Obavestenje> obavestenja;
	
	
	public NastavnikNaRealizaciji() {
		super();
	}
		
	

	public NastavnikNaRealizaciji(Long id, Boolean deleted, Integer brojCasova, Nastavnik predavac,
			TipNastave tipNastave, RealizacijaPredmeta realizacijaPredmeta, ArrayList<Obavestenje> obavestenja) {
		super(id, deleted);
		this.brojCasova = brojCasova;
		this.predavac = predavac;
		this.tipNastave = tipNastave;
		this.realizacijaPredmeta = realizacijaPredmeta;
		this.obavestenja = obavestenja;
	}



	public Nastavnik getPredavac() {
		return predavac;
	}

	public void setPredavac(Nastavnik predavac) {
		this.predavac = predavac;
	}

	public TipNastave getTipNastave() {
		return tipNastave;
	}
	public void setTipNastave(TipNastave tipNastave) {
		this.tipNastave = tipNastave;
	}
	public RealizacijaPredmeta getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}
	public void setRealizacijaPredmeta(RealizacijaPredmeta realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}
	public ArrayList<Obavestenje> getObavestenja() {
		return obavestenja;
	}
	public void setObavestenja(ArrayList<Obavestenje> obavestenja) {
		this.obavestenja = obavestenja;
	}
	public Integer getBrojCasova() {
		return brojCasova;
	}

	public void setBrojCasova(Integer brojCasova) {
		this.brojCasova = brojCasova;
	}
	
}
