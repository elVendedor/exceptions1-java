package model.exceptions;

//RuntimeException é um tipo de excesão generica que o compilador NÃO obriga voce a tratar ex:throw
//Exception é um tipo de excesão que o copilador OBRIGA voce a tratar ex:ParseException
public class DomainException extends RuntimeException{
	private static final long serialVersionUID = 1L; //declara versão de clase serializable
	
	public DomainException(String msg) {
		super(msg);
	}
	}
