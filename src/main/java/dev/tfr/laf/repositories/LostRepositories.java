package dev.tfr.laf.repositories;

import dev.tfr.laf.entities.Lost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LostRepositories extends JpaRepository<Lost, Long>{

}
