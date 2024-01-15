package dev.tfr.laf.repositories;

import dev.tfr.laf.entities.Lost;
import dev.tfr.laf.entities.UserAPP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAPPRepositories extends JpaRepository<UserAPP, Long>{

}
