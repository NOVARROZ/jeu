package outils.son.exceptions;

import java.io.Serializable;

public class SonErreurDiverse extends SonException implements Serializable{
	/**
	   * Construit l'exception
	   * @param e Exception générée à la construction du son
	   */
	  public SonErreurDiverse(Exception e)
	  {
	    super("Une erreur s'est produite lors de l'analyse du son : " +
	          e.getMessage());
	  }
}
