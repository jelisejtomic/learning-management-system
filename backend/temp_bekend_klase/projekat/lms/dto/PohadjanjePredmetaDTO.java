package projekat.lms.dto;

public class PohadjanjePredmetaDTO  extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 5155900689286442503L;
	private Long id;
	private int konacnaOcena;
	private int bodovi;
	private int bonusBodovi;
	private StudentDTO student;
	private RealizacijaPredmetaDTO realizacijaPredmeta;
	
	public PohadjanjePredmetaDTO() {
		super();
	}
	
	public PohadjanjePredmetaDTO(Long id, int konacnaOcena, int bodovi, int bonusBodovi, StudentDTO student,
			RealizacijaPredmetaDTO realizacijaPredmeta) {
		super();
		this.id = id;
		this.konacnaOcena = konacnaOcena;
		this.bodovi = bodovi;
		this.bonusBodovi = bonusBodovi;
		this.student = student;
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public StudentDTO getStudent() {
		return student;
	}

	public void setStudent(StudentDTO student) {
		this.student = student;
	}

	public RealizacijaPredmetaDTO getRealizacijaPredmeta() {
		return realizacijaPredmeta;
	}

	public void setRealizacijaPredmeta(RealizacijaPredmetaDTO realizacijaPredmeta) {
		this.realizacijaPredmeta = realizacijaPredmeta;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getKonacnaOcena() {
		return konacnaOcena;
	}
	public void setKonacnaOcena(int konacnaOcena) {
		this.konacnaOcena = konacnaOcena;
	}
	public int getBodovi() {
		return bodovi;
	}
	public void setBodovi(int bodovi) {
		this.bodovi = bodovi;
	}
	public int getBonusBodovi() {
		return bonusBodovi;
	}
	public void setBonusBodovi(int bonusBodovi) {
		this.bonusBodovi = bonusBodovi;
	}
}
