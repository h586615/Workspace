package no.hvl.dat100;

import java.awt.Font;

import easygraphics.*;

	public class Grafikk extends EasyGraphics {

		public static void main(String[] args) {
			launch(args);
		}

		public void run() {
			makeWindow("Grafikk", 700, 500);
			drawCircle(150, 70, 60);
			drawCircle(150,190,60);
		}
		
	}
	