package br.edu.unievangelica.ftt.seintegra.domain.pais;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.edu.unievangelica.ftt.seintegra.core.entity.AbstractEntity;
import br.edu.unievangelica.ftt.seintegra.domain.endereco.Endereco;

@Entity
@Table(name ="pais")
public class Pais extends AbstractEntity {
	
	private static final long serialVersionUID =1L;
	
	@Column(name = "pais",length = 80,nullable = false)
	private String pais;
	
	@OneToMany(mappedBy = "pais")
	private List<Endereco> enderecos;

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
	

}
