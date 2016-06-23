package br.edu.ifma.es.transportadora.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="CLIENTE")
public class Cliente extends EntidadeBase {

	private static final long serialVersionUID = -50880749569399731L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_CLIENTE")
	private int id;
	
	@NotNull
	@Column(name="NOME")
	private String nome;
	
	@NotNull
	@Column(name="ENDERECO")
	private String endereco;
	
	@NotNull
	@Column(name="TELEFONE")
	private String telefone;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
	private Set<Frete> fretes = new HashSet<Frete>();

	@Override
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Set<Frete> getFretes() {
		return fretes;
	}

	public void setFretes(Set<Frete> fretes) {
		this.fretes = fretes;
	}
}
