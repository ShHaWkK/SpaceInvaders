package entites;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import jeu.Main;
import ressources.Chrono;
import ressources.Constantes;

public class Vaisseau extends Entite {
		private int compteur = 0;
		
		public Vaisseau() {

            super.xPos = Constantes.X_POS_INIT_VAISSEAU;
			super.yPos = Constantes.Y_POS_VAISSEAU;
			super.largeur = Constantes.LARGEUR_VAISSEAU;
			super.hauteur = Constantes.HAUTEUR_VAISSEAU;
			super.dx = 0;
			super.dy = 0;
			super.strImg1 = "/images/vaisseau.png";
			super.strImg2 = "/images/vaisseauDetruit1.png";
			super.strImg3 = "/images/vaisseauDetruit2.png";
			super.ico = new ImageIcon(getClass().getResource(super.strImg1));
			super.img = this.ico.getImage();
			super.vivant = true;
		}
		
		
	public int deplacementVaisseau() {
		if(this.dx < 0){if(this.xPos > Constantes.LIMITE_GAUCHE_VAISSEAU) {this.xPos = this.xPos + this.dx;}
		}else if(dx > 0) {if(this.xPos + this.dx < Constantes.LIMITE_DROITE_VAISSEAU) {this.xPos = this.xPos + this.dx;}}
		return this.xPos;
	}
	
	public void dessinVaisseau(Graphics g) {
		g.drawImage(this.img, this.deplacementVaisseau(), this.yPos, null);
	}
	
	
}
