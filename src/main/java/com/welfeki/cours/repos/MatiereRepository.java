package com.welfeki.cours.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.welfeki.cours.entities.Matiere;

@RepositoryRestResource(path = "cat")
public interface MatiereRepository extends JpaRepository<Matiere, Long> {

}
