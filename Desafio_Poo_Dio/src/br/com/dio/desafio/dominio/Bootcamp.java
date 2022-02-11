package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	//
	private final LocalDate DATA_INICIAL = LocalDate.now();
	private final LocalDate DATA_FINAL = DATA_INICIAL.plusDays(45);
	//
	private String nome;
	private String descricao;
	//
	private Set<Dev> devsInscritos = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}
	
	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}
	
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(DATA_FINAL, DATA_INICIAL, conteudos, descricao, devsInscritos, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(DATA_FINAL, other.DATA_FINAL) && Objects.equals(DATA_INICIAL, other.DATA_INICIAL)
				&& Objects.equals(conteudos, other.conteudos) && Objects.equals(descricao, other.descricao)
				&& Objects.equals(devsInscritos, other.devsInscritos) && Objects.equals(nome, other.nome);
	}


}
