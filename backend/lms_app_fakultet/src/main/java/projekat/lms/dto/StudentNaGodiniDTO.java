package projekat.lms.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import projekat.lms.generics.BaseDTO;

public class StudentNaGodiniDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 7533606543316934291L;
	
	private LocalDateTime datumUpisa;
	private String brojIndeksa;

	private GodinaStudijaDTO godinaStudija;
	private List<PolaganjeDTO> polaganja = new ArrayList<>();
	private OdbranaZavrsnogRadaDTO odbranaZavrsnogRada;
	private ZavrsniRadDTO zavrsniRad;
	private StudentDTO student;
	private List<PrijavaIspitaDTO> prijaveIspita;


	public StudentNaGodiniDTO() {
		super();
	}
	

	public StudentNaGodiniDTO(Long id, Boolean deleted, LocalDateTime datumUpisa, String brojIndeksa,
			GodinaStudijaDTO godinaStudija, List<PolaganjeDTO> polaganja,
			OdbranaZavrsnogRadaDTO odbranaZavrsnogRada, ZavrsniRadDTO zavrsniRad, StudentDTO student,
			List<PrijavaIspitaDTO> prijaveIspita) {
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


	public List<PolaganjeDTO> getPolaganja() {
		return polaganja;
	}


	public void setPolaganja(List<PolaganjeDTO> polaganja) {
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


	public List<PrijavaIspitaDTO> getPrijaveIspita() {
		return prijaveIspita;
	}


	public void setPrijaveIspita(List<PrijavaIspitaDTO> prijaveIspita) {
		this.prijaveIspita = prijaveIspita;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
