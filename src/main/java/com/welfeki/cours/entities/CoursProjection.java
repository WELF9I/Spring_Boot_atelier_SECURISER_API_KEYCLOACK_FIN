package com.welfeki.cours.entities;

import org.springframework.data.rest.core.config.Projection;
import java.time.LocalDateTime;

@Projection(name = "coursProjection", types = { Cours.class })
public interface CoursProjection {
	public String getTitle();
	public String getContent();
	public Integer getDuration();
	public String getVideoUrl();
	public LocalDateTime getCreatedDate();
	public Matiere getMatiere();
}