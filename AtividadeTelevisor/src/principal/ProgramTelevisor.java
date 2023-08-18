package principal;

import java.util.Scanner;

import entities.Televisor;

public class ProgramTelevisor {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Televisor tv = new Televisor();
		
		
		tv.mostrarStatus();
		tv.ligarTelevisor();
		tv.mostrarStatus();
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.mostrarStatus();
		
		for(int cont = 16; cont>0; cont--) {
			tv.diminuirVolume();
		}
		tv.mostrarStatus();
		for(int cont = 0; cont<15; cont++) {
			tv.aumentarCanal();
		}
		tv.mostrarStatus();
		
		sc.close();

	}

}
