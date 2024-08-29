package projekat.lms.dto;

import java.time.LocalDate;


public class ZvanjeDTO extends BaseDTO implements Serializable{
	private static final long serialVersionUID = 7829136421241571165L;
	private LocalDate datumIzbora;
	private LocalDate datumPrestanka;
	
	private NaucnaOblastDTO naucnaOblast;
	private TipZvanjaDTO tipZvanja;
	
	public ZvanjeDTO() {
		super();
	}
	
	public LocalDate getDatumIzbora() {
		return datumIzbora;
	}
	public void setDatumIzbora(LocalDate datumIzbora) {
		this.datumIzbora = datumIzbora;
	}
	public LocalDate getDatumPrestanka() {
		return datumPrestanka;
	}
	public void setDatumPrestanka(LocalDate datumPrestanka) {
		this.datumPrestanka = datumPrestanka;
	}
	public NaucnaOblastDTO getNaucnaOblast() {
		return naucnaOblast;
	}
	public void setNaucnaOblast(NaucnaOblastDTO naucnaOblast) {
		this.naucnaOblast = naucnaOblast;
	}
	public TipZvanjaDTO getTipZvanja() {
		return tipZvanja;
	}
	public void setTipZvanja(TipZvanjaDTO tipZvanja) {
		this.tipZvanja = tipZvanja;
	}
	
}
