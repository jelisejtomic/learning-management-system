package lms_app_nereg2.model.old;

import java.time.LocalDateTime;

import lms_app_nereg2.model.NastavniMaterijal;

public class File {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String opis;
	private String url;
	private String type;
	private LocalDateTime createdAt;

//	@ManyToOne //u modelu vise na vise
	private NastavniMaterijal nastavniMaterijal;
	
//	u modelu vise na vise
//	private InstrumentEvaluacije instrumentEvaluacije;

//	@ManyToOne
//	private ZavrsniRad zavrsniRad;
}
