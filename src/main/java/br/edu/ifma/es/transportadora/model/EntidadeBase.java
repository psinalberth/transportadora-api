package br.edu.ifma.es.transportadora.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

@MappedSuperclass
public abstract class EntidadeBase implements Serializable {
	
	private static final long serialVersionUID = -204928181570843889L;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATA_ULT_ALTERACAO")
	private Date dataUltAlteracao;
	
	@NotNull
	@Version
	@Column(name="VERSAO")
	private int versao;
	
	public abstract int getId();
	
	public Date getDataUltAlteracao() {
		return dataUltAlteracao;
	}
	
	public void setDataUltAlteracao(Date dataUltAlteracao) {
		this.dataUltAlteracao = dataUltAlteracao;
	}
	
	public int getVersao() {
		return versao;
	}
	
	public void setVersao(int versao) {
		this.versao = versao;
	}
}