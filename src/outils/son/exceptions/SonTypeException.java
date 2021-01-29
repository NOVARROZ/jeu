package outils.son.exceptions;

import java.io.Serializable;

public class SonTypeException extends SonException implements Serializable {
	  /**
	   * Construit l'exception
	   */
	  public SonTypeException()
	  {
	    super("Le type du son n'est pas reconnu");
	  }
}
