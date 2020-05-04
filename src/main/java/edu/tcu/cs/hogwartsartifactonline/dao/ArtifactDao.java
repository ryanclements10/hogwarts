package edu.tcu.cs.hogwartsartifactonline.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import edu.tcu.cs.hogwartsartifactonline.domain.Artifact;
public interface ArtifactDao extends JpaRepository<Artifact, String> {
}
