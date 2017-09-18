package Projeto;

import java.util.*;

import javax.swing.JOptionPane;

public class Lista {
	public Lista() {
	}

	ArrayList<Oracao> rituais = new ArrayList<Oracao>();

	public void addRitual(Oracao oracao) {
		rituais.add(oracao);
	}

	public void addRitual() {
		String tit = null;
		tit = JOptionPane.showInputDialog("Qual é o titulo do ritual?");
		String desc = null;
		desc = JOptionPane.showInputDialog("Qual é a descrição do ritual?");
		String loc = null;
		loc = JOptionPane.showInputDialog("Qual é o local do ritual?");
		String hor = null;
		hor = JOptionPane.showInputDialog("Qual é o horario do ritual?");
		Oracao o2 = new Oracao(tit, desc, loc, hor);
		rituais.add(o2);
	}

	public String listaDeRituais() {
		String lista = "";
		for (int i = 0; i < rituais.size(); i++) {
			Oracao or = rituais.get(i);
			lista = lista + or;
		}

		return lista;
	}
}
