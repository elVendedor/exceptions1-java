package model.exceptions;

//RuntimeException � um tipo de exces�o generica que o compilador N�O obriga voce a tratar ex:throw
//Exception � um tipo de exces�o que o copilador OBRIGA voce a tratar ex:ParseException
public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L; //declara vers�o de clase serializable
	
	public DomainException(String msg) {
		super(msg);
	}
	}
