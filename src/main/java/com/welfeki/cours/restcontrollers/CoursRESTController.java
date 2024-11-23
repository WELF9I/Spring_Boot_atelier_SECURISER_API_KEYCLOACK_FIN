package com.welfeki.cours.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.welfeki.cours.entities.Cours;
import com.welfeki.cours.service.CoursService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CoursRESTController {
	@Autowired
	CoursService coursService;

	@RequestMapping(path="all", method = RequestMethod.GET)
	public List<Cours> getAllCours() {
		return coursService.getAllCours();
	}

	@RequestMapping(value="/getbyid/{id}", method = RequestMethod.GET)
	public Cours getCoursById(@PathVariable("id") Long id) {
		return coursService.getCours(id);
	}

	@RequestMapping(value="/addcours", method = RequestMethod.POST)
	public Cours createCours(@RequestBody Cours cours) {
		return coursService.saveCours(cours);
	}

	@RequestMapping(value="/updatecours", method = RequestMethod.PUT)
	public Cours updateCours(@RequestBody Cours cours) {
		return coursService.updateCours(cours);
	}

	@RequestMapping(value="/delcours/{id}", method = RequestMethod.DELETE)
	public void deleteCours(@PathVariable("id") Long id) {
		coursService.deleteCoursById(id);
	}

	@RequestMapping(value="/coursmatiere/{idMatiere}", method = RequestMethod.GET)
	public List<Cours> getCoursByMatiereId(@PathVariable("idMatiere") Long idMatiere) {
		return coursService.findByMatiereId(idMatiere);
	}

	@GetMapping("/auth")
	Authentication getAuth(Authentication auth) {
		return auth;
	}
}