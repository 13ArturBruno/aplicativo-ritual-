package Projeto;

public class Oracao extends Ritual {
	String descricao;
	String local;
	String horario;

	public Oracao(String titulo, String descricao, String local, String horario) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.local = local;
		this.horario = horario;
	}

	public Oracao() {

	}

	public String toString() {
		return "\n TITULO : " + titulo + "\n DESCRIÇÃO : " + descricao + "\n HORARIO : " + horario + "\n LOCAL : "
				+ local + "\n";
	}

}
