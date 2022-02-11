import java.time.LocalDate;
import java.util.Iterator;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
/*
 * Autor: Luiz Cesar Oliveira
 * lcesar.dev@gmail.com
 * Desafio Bootcamp GFT Start #4 Java
 * 
   Abstraindo um Bootcamp Usando Orientação a Objetos em Java
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso = new Curso();
		
		curso.setTitulo("Curso Springboot");
		curso.setDescricao("Dominando API com Sprimgboot");
		curso.setCargaHoraria(2);
		
		Curso curso2 = new Curso();
		
		curso2.setTitulo("Curso Java");
		curso2.setDescricao("Collections em Java");
		curso2.setCargaHoraria(6);

		Curso curso3 = new Curso();
		
		curso3.setTitulo("Curso java Maven");
		curso3.setDescricao("Trabalhando com Maven");
		curso3.setCargaHoraria(6);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria POO");
		mentoria.setDescricao("Apresentacao de conteudo");
		mentoria.setData(LocalDate.now());		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java developer");
		bootcamp.setDescricao("Java developer training");
		bootcamp.getConteudos().add(curso);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devLuiz = new Dev();
		devLuiz.setNome("Luiz");
		devLuiz.insccreverBootcamp(bootcamp);
		conteudoInscrito(devLuiz);
		devLuiz.progredir();
		devLuiz.progredir();
		conteudoInscrito(devLuiz);
		conteudoConcluido(devLuiz);
		//
		Dev devCesar = new Dev();
		devCesar.setNome("Cesar");
		devCesar.insccreverBootcamp(bootcamp);
		conteudoInscrito(devCesar);
        devCesar.progredir();
        conteudoInscrito(devCesar);
		conteudoConcluido(devCesar);
		//
	}
	//
	public static void conteudoInscrito(Dev dev) {
		//
		Iterator<Conteudo> iter = dev.getConteudosInscritos().iterator();
		System.out.println("Conteudos Inscritos: "+dev.getNome());
		System.out.println(String.format("%1s", "").replace(" ", "-") );
	    while(iter.hasNext()){
	        System.out.println(iter.next());
	     }
	    System.out.println(String.format("%50s", "").replace(" ", "-") );
	    System.out.println("");
		
	}
	//
	public static void conteudoConcluido(Dev dev) {
		//
		Iterator<Conteudo> iter = dev.getConteudosConcluidos().iterator();
		System.out.println("Conteudos Concluídos: "+dev.getNome());
		System.out.println(String.format("%1s", "").replace(" ", "-") );
	    while(iter.hasNext()){
	        System.out.println(iter.next());
	     }
	    System.out.println("Total XP: "+ dev.calcularTotalXp());
	    System.out.println(String.format("%50s", "").replace(" ", "-") );
	    System.out.println("");
		
	}
	
}
