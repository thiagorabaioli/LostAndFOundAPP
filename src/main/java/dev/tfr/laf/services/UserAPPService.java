package dev.tfr.laf.services;

import dev.tfr.laf.dto.UserAPPDTO;
import dev.tfr.laf.entities.UserAPP;
import dev.tfr.laf.repositories.UserAPPRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserAPPService {

    @Autowired
    private UserAPPRepositories repo;

    public Page<UserAPPDTO> findAll(Pageable pageable){
        Page<UserAPP> result = repo.findAll(pageable);
        return result.map(x -> new UserAPPDTO((x)));
    }
}
