package lms_app_nereg2.generics;

public abstract class BaseDTO<IdT> {
	protected IdT id;

	public BaseDTO() {
	}

	public BaseDTO(IdT id) {
		this.id = id;
	}

	public IdT getId() {
		return id;
	}

	public void setId(IdT id) {
		this.id = id;
	}
}
