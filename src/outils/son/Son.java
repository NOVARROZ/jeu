package outils.son;

import java.io.File;
import outils.son.exceptions.*;
import java.io.Serializable;
import java.net.URL;

public class Son implements Serializable {
	/**
	 * son qui peut �tre jou�
	 */
    private Sound sound ;

    /**
     * Cr�ation d'un objet de type Sound, � partir d'un fichier de son
     * @param nomfic url du fichier
     */
    public Son (URL nomfic) {
        try {
//            this.sound = new Sound(new File(nomfic));
            this.sound = new Sound(nomfic);
        } catch (SonException ex) {
        }
    }

    /**
     * Joue le son une fois
     */
    public void play() {
        this.sound.boucle(1) ;
    }

    /**
     * ferme le son (lib�re l'objet de la m�moire)
     */
    public void close() {
        this.sound.fermer();
    }

    /**
     * Joue le son en boucle (musique de fond)
     */
    public void playContinue () {
        sound.boucle() ;
    }
}
