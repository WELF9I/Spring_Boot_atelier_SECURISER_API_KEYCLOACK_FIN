package com.welfeki.cours.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.welfeki.cours.entities.Matiere;
import com.welfeki.cours.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
	List<Cours> findByTitle(String title);
	List<Cours> findByTitleContains(String title);

	@Query("select c from Cours c where c.title like %:title and c.duration > :duration")
	List<Cours> findByTitleAndDuration(@Param("title") String title, @Param("duration") Integer duration);

	@Query("select c from Cours c where c.matiere = ?1")
	List<Cours> findByMatiere(Matiere matiere);

	List<Cours> findByMatiereId(Long id);

	List<Cours> findByOrderByTitleAsc();

	@Query("select c from Cours c order by c.title ASC, c.duration DESC")
	List<Cours> sortCoursesByTitleAndDuration();
}