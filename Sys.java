package Projeto;

import javax.swing.JOptionPane;

public class Sys {
	public static void main(String[] args) {

		Lista lista = new Lista();

		Oracao o1 = new Oracao("pe de cabra", "bla blaJHSFGJEFGJSFDGJFGJFJGFJJFGJFGJFGJGJFJJGFJ bla bla", "casa",
				"meia noite");
		lista.addRitual(o1);

		JOptionPane.showMessageDialog(null, "666@LISTA DE RITUAIS@666 \n" + lista.listaDeRituais());

		if (JOptionPane.showConfirmDialog(null, "Deseja adicionar um novo ritual?") == 0) {
			lista.addRitual();
		} else {
			JOptionPane.showMessageDialog(null, "então N faz nada u.u");
		}

		if (JOptionPane.showConfirmDialog(null, "Deseja listar os rituais?") == 0) {
			JOptionPane.showMessageDialog(null, "666@LISTA DE RITUAIS@666 \n" + lista.listaDeRituais());
		}

	}
}
