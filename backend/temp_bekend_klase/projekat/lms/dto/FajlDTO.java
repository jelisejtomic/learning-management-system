package projekat.lms.dto;

import java.time.LocalDateTime;

public class FajlDTO {
	private Long id;
	private String opis;
	private String url;
	private String tip;
	private LocalDateTime createdAt;
	public FajlDTO() {
		super();
	}
	public FajlDTO(Long id, String opis, String url, String tip, LocalDateTime createdAt) {
		super();
		this.id = id;
		this.opis = opis;
		this.url = url;
		this.tip = tip;
		this.createdAt = createdAt;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
