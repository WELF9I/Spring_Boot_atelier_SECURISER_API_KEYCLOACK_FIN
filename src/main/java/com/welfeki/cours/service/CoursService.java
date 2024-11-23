package com.welfeki.cours.service;

import java.util.List;

import com.welfeki.cours.entities.Matiere;
import com.welfeki.cours.entities.Cours;

public interface CoursService {

	Cours saveCours(Cours c);
	Cours updateCours(Cours c);
	void deleteCours(Cours c);
	void deleteCoursById(Long id);
	Cours getCours(Long id);
	List<Cours> getAllCours();

	List<Cours> findByTitle(String title);
	List<Cours> findByTitleContains(String title);
	List<Cours> findByTitleAndDuration(String title, Integer duration);
	List<Cours> findByMatiere(Matiere matiere);
	List<Cours> findByMatiereId(Long id);
	List<Cours> findByOrderByTitleAsc();
	List<Cours> sortCoursesByTitleAndDuration();
}