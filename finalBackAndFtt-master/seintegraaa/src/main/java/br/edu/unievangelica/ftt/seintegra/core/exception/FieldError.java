package br.edu.unievangelica.ftt.seintegra.core.exception;



public class FieldError {
	
	private String field;
	private String message;
	private String codeError;
	
	public FieldError(String field, String message, String codeError) {
		
		this.field = field;
		this.message = message;
		this.codeError = codeError;
	}

	public String getField() {
		return field;
	}

	

	public String getMessage() {
		return message;
	}

	
	

	public String getCodeError() {
		return codeError;
	}

	
	
	
}
