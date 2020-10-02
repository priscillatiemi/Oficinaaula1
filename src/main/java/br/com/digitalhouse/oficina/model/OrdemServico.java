package br.com.digitalhouse.oficina.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ordemservico")
public class OrdemServico {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 60, nullable = false)
	private String nome;
	
	@OneToMany
	@JoinColumn(name="cliente_id")
	private Set<Veiculo> veiculos = new HashSet<Veiculo>();
	
	@Column(length =  20, nullable = false)
	private String cliente;
	@Column(length = 7, nullable = false)
	private String veiculo;
	
	@Column(length = 30, nullable = false)
	private String servico;
	@Column(length = 30, nullable = false)
	private int valor;
	
	
	public OrdemServico(Long id, String cliente, String veiculo, String servico, int valor) {
		this.id = id;
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.servico = servico;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return null;
	}
}
