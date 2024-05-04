package com.poo.springjpademo;

import com.poo.springjpademo.entity.*;
import com.poo.springjpademo.repository.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;


@SpringBootApplication
public class SpringjpademoApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringjpademoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringjpademoApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CursoRepository cursoRepository, TurmaRepository turmaRepository, SalaRepository salaRepository ,ProfessorRepository professorRepository, DisciplinaRepository disciplinaRepository, HorarioRepository horarioRepository) {
		return (args) -> {

			log.info("Adicionando dados de curso");
			cursoRepository.save(new Curso("ENG"));
			cursoRepository.save(new Curso("SIS"));
			var c1 = cursoRepository.findByNomeCurso("ENG");
			var c2 = cursoRepository.findByNomeCurso("SIS");

			log.info("Adicionando dados de turma");
			turmaRepository.save(new Turma("1S23",c1.get()));
			turmaRepository.save(new Turma("2S23",c2.get()));
			turmaRepository.save(new Turma("1S24",c1.get()));
			turmaRepository.save(new Turma("2S24",c2.get()));
			var t1 = turmaRepository.findByNomeTurma("1S23");
			var t2 = turmaRepository.findByNomeTurma("2S23");
			var t3 = turmaRepository.findByNomeTurma("1S24");
			var t4 = turmaRepository.findByNomeTurma("2S24");

			log.info("Adicionando dados de professor");
			professorRepository.save(new Professor("Leanderson"));
			professorRepository.save(new Professor("Walter"));
			professorRepository.save(new Professor("Marcelo"));
			professorRepository.save(new Professor("Dornel"));
			var p1 = professorRepository.findById(1L);
			var p2 = professorRepository.findById(2L);
			var p3 = professorRepository.findById(3L);
			var p4 = professorRepository.findById(4L);

			log.info("Adicionando dados de sala");
			salaRepository.save(new Sala("S01"));
			salaRepository.save(new Sala("S02"));
			salaRepository.save(new Sala("S03"));
			salaRepository.save(new Sala("S04"));
			var s1 = salaRepository.findByNomeSala("S01");
			var s2 = salaRepository.findByNomeSala("S02");
			var s3 = salaRepository.findByNomeSala("S03");
			var s4 = salaRepository.findByNomeSala("S04");

			log.info("Adicionando dados de disciplina");
			disciplinaRepository.save(new Disciplina("POO", t1.get(), s1.get(), p1.get()));
			disciplinaRepository.save(new Disciplina("PRO", t2.get(), s2.get(), p2.get()));
			disciplinaRepository.save(new Disciplina("SOP", t3.get(), s3.get(), p3.get()));
			disciplinaRepository.save(new Disciplina("BAN", t4.get(), s4.get(), p4.get()));
			var d1 = disciplinaRepository.findById(1L);
			var d2 = disciplinaRepository.findById(2L);
			var d3 = disciplinaRepository.findById(3L);
			var d4 = disciplinaRepository.findById(4L);

			log.info("Adicionando dados de horario");
			horarioRepository.save(new Horario("19:00","19:50", "Segunda", d1.get()));
			horarioRepository.save(new Horario("19:50","20:40","Segunda", d2.get()));
			horarioRepository.save(new Horario("20:40","21:30","Segunda", d3.get()));
			horarioRepository.save(new Horario("21:30","22:20","Segunda", d4.get()));
			var h1 = horarioRepository.findById(1L);
			var h2 = horarioRepository.findById(2L);
			var h3 = horarioRepository.findById(3L);
			var h4 = horarioRepository.findById(4L);

			log.info(" Horario");
			for(var d : horarioRepository.findAll()){
				log.info(d.toString());
			}
			var p = disciplinaRepository.findById(3L);
			log.info("-------------------------------");
			log.info(" Disciplinas do professor Leanderson");
			for(var d : disciplinaRepository.findAllByProfessor(p1.get())){
				log.info(d.toString());
			}
		};
	}

}
