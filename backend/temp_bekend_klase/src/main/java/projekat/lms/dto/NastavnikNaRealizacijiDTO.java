package projekat.lms.dto;

import java.io.Serializable;
import java.util.ArrayList;

import projekat.lms.generics.BaseDTO;

public class NastavnikNaRealizacijiDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 4488826747600137876L;
	private int brojCasova;
	
	private TipNastaveDTO tipNastave;
	private RealizacijaPredmetaDTO realizacijaPredmeta;
	private ArrayList<ObavestenjeDTO> obavestenja;
	private NastavnikDTO predavac;
	
	public NastavnikNaRealizacijiDTO() {
		super();
	}
	
	public NastavnikNaRealizacijiDTO(Long id, Boolean deleted, Long id2, int brojCasova, TipNastaveDTO tipNastave,
			RealizacijaPredmetaDTO realizacijaPredmeta, ArrayList<ObavestenjeDTO> obavestenja, NastavnikDTO predavac) {
		super(id, deleted);
		id = id2;
		this.brojCasova = brojCasova;
		this.tipNastave = tipNastave;
		this.realizacijaPredmeta = realizacijaPredmeta;
		this.obavestenja = obavestenja;
		this.predavac = predavac;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public NastavnikDTO getPredavac() {
		return predavac;
	}

	public void setPredavac(NastavnikDTO predavac) {
		this.predavac = predavac;
	}

	public int getBrojCasova() {
		return brojCasova;
	}
	public void setBrojCasova(int brojCasova) {
		this.brojCasova = brojCasova;
	}
	public TipNastaveDTO getTipNastave() {
		return tipNastave;
	}
	public void setTipNastave(TipNastaveDTO tipNastave) {
		this.tipNastave = tipNastave;
	}
	public RealizacijaPredmetaDTO getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}
	public void setRealizacijaPredmeta(RealizacijaPredmetaDTO realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}
	public ArrayList<ObavestenjeDTO> getObavestenja() {
		return obavestenja;
	}
	public void setObavestenja(ArrayList<ObavestenjeDTO> obavestenja) {
		this.obavestenja = obavestenja;
	}
	
		
}
