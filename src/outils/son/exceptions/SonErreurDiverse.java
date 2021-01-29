package outils.son.exceptions;

import java.io.Serializable;

public class SonErreurDiverse extends SonException implements Serializable{
	/**
	   * Construit l'exception
	   * @param e Exception g�n�r�e � la construction du son
	   */
	  public SonErreurDiverse(Exception e)
	  {
	    super("Une erreur s'est produite lors de l'analyse du son : " +
	          e.getMessage());
	  }
}
