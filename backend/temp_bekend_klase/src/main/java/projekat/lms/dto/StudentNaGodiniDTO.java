package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

import projekat.lms.generics.BaseDTO;

public class StudentNaGodiniDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 7533606543316934291L;
	
	private LocalDateTime datumUpisa;
	private String brojIndeksa;

	private GodinaStudijaDTO godinaStudija;
	private ArrayList<PolaganjeDTO> polaganja = new ArrayList<>();
	private OdbranaZavrsnogRadaDTO odbranaZavrsnogRada;
	private ZavrsniRadDTO zavrsniRad;
	private StudentDTO student;
	private ArrayList<PrijavaIspitaDTO> prijaveIspita;


	public StudentNaGodiniDTO() {
		super();
	}
	

	public StudentNaGodiniDTO(Long id, Boolean deleted, LocalDateTime datumUpisa, String brojIndeksa,
			GodinaStudijaDTO godinaStudija, ArrayList<PolaganjeDTO> polaganja,
			OdbranaZavrsnogRadaDTO odbranaZavrsnogRada, ZavrsniRadDTO zavrsniRad, StudentDTO student,
			ArrayList<PrijavaIspitaDTO> prijaveIspita) {
		super(id, deleted);
		this.datumUpisa = datumUpisa;
		this.brojIndeksa = brojIndeksa;
		this.godinaStudija = godinaStudija;
		this.polaganja = polaganja;
		this.odbranaZavrsnogRada = odbranaZavrsnogRada;
		this.zavrsniRad = zavrsniRad;
		this.student = student;
		this.prijaveIspita = prijaveIspita;
	}


	public ArrayList<PolaganjeDTO> getPolaganja() {
		return polaganja;
	}


	public ArrayList<PrijavaIspitaDTO> getPrijaveIspita() {
		return prijaveIspita;
	}


	public void setPrijaveIspita(ArrayList<PrijavaIspitaDTO> prijaveIspita) {
		this.prijaveIspita = prijaveIspita;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setPolaganja(ArrayList<PolaganjeDTO> polaganja) {
		this.polaganja = polaganja;
	}


	public OdbranaZavrsnogRadaDTO getOdbranaZavrsnogRada() {
		return odbranaZavrsnogRada;
	}


	public void setOdbranaZavrsnogRada(OdbranaZavrsnogRadaDTO odbranaZavrsnogRada) {
		this.odbranaZavrsnogRada = odbranaZavrsnogRada;
	}


	public ZavrsniRadDTO getZavrsniRad() {
		return zavrsniRad;
	}


	public void setZavrsniRad(ZavrsniRadDTO zavrsniRad) {
		this.zavrsniRad = zavrsniRad;
	}


	public StudentDTO getStudent() {
		return student;
	}


	public void setStudent(StudentDTO student) {
		this.student = student;
	}


	public LocalDateTime getDatumUpisa() {
		return datumUpisa;
	}

	public void setDatumUpisa(LocalDateTime datumUpisa) {
		this.datumUpisa = datumUpisa;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public GodinaStudijaDTO getGodinaStudija() {
		return godinaStudija;
	}

	public void setGodinaStudija(GodinaStudijaDTO godinaStudija) {
		this.godinaStudija = godinaStudija;
	}
}
