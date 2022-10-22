package com.hendisantika.service;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.hendisantika.entity.Film;
import com.hendisantika.entity.Media;
import com.hendisantika.entity.Personne;
import com.hendisantika.repository.FilmRepository;

@Service
public class FilmService extends AbstractService<Film> {
	FilmRepository filmRepository;
	public FilmService(FilmRepository filmRepository) {
		this.filmRepository=filmRepository;
	}
	
	@Override
	protected JpaRepository<Film, Long> getRepository() {
		return filmRepository;
	}
	
	public List<Personne> getActeursFilm(Long id){
		Film film=getOne(id);
		Hibernate.initialize(film.getActeurs());
		return film.getActeurs();
	}
	
	public List<Media> getMediasFilm(Long id){
		Film film=getOne(id);
		Hibernate.initialize(film.getMedias());
		return film.getMedias();
	}
	

}
