package project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import project.models.Technology;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Integer>, JpaSpecificationExecutor<Technology> {
}