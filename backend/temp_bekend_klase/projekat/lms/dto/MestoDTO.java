package projekat.lms.dto;

public class MestoDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 3460006282498418304L;
	private Long id;
	private String naziv;
	private DrzavaDTO drzava;
	public MestoDTO(Long id, String naziv, DrzavaDTO drzava) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.drzava = drzava;
	}
	public MestoDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public DrzavaDTO getDrzava() {
		return drzava;
	}
	public void setDrzava(DrzavaDTO drzava) {
		this.drzava = drzava;
	}
	
	
}	
