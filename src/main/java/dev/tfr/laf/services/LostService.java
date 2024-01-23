package dev.tfr.laf.services;

import dev.tfr.laf.dto.LostUserDTO;
import dev.tfr.laf.entities.Lost;
import dev.tfr.laf.entities.UserAPP;
import dev.tfr.laf.enums.TYPELOST;
import dev.tfr.laf.repositories.LostRepositories;
import jdk.jfr.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Service
public class LostService {

    @Autowired
    private LostRepositories repo;



    @Transactional(readOnly = true)
    public Page<LostUserDTO> findAll(Pageable pageable){
        Page<Lost> result = repo.findAll(pageable);
        return result.map(x -> new LostUserDTO(x));
    }

    public LostUserDTO insert (LostUserDTO dto)  {
        Lost entity = new Lost();
        entity.setId(dto.getId());
        entity.setDescription(dto.getDescription());
        entity.setLocalFind(dto.getLocalFind());
        entity.setWhoFind(dto.getWhoFind());
        entity.setTypeCod(TYPELOST.toEnum(dto.getTypeCod()));
       entity.setInstantFind(dto.getInstantFind());
        UserAPP user = new UserAPP();
        user.setId(dto.getUserAppDto().getId());
        entity.setUserApp(user);
        entity = repo.save(entity);
        return new LostUserDTO(entity);
    }

}
