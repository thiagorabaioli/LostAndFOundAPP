package dev.tfr.laf.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import dev.tfr.laf.entities.Lost;
import dev.tfr.laf.entities.UserAPP;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class LostUserDTO {

    private Long id;
    private String description;
    private Integer typeCod;
    private String whoFind;

    private String localFind;

    private LocalDateTime d01  = LocalDateTime.now();

    @JsonFormat(pattern = "dd/MM/yyyy HH:mm")

    private Date instantFind;


    private UserAPPDTO userAppDto;

    public LostUserDTO(Long id, String description, Integer typeCod, String whoFind, String localFind, Date instantFind, UserAPPDTO userAppDto) {
        this.id = id;
        this.description = description;
        this.typeCod = typeCod;
        this.whoFind = whoFind;
        this.localFind = localFind;
        this.instantFind = instantFind;
        this.userAppDto = userAppDto;
    }

    public LostUserDTO(Lost entity) {
        id = entity.getId();
        description = entity.getDescription();
        typeCod = entity.getTypeCod().getCod();
        whoFind = entity.getWhoFind();
        localFind = entity.getLocalFind();
        instantFind = entity.getInstantFind();
        userAppDto = new UserAPPDTO(entity.getUserApp());
    }

    public LocalDateTime getD01() {
        return d01;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getTypeCod() {
        return typeCod;
    }

    public String getWhoFind() {
        return whoFind;
    }

    public String getLocalFind() {
        return localFind;
    }

    public Date getInstantFind() {
        return instantFind;
    }

    public UserAPPDTO getUserAppDto() {
        return userAppDto;
    }
}