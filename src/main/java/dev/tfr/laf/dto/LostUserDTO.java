package dev.tfr.laf.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import dev.tfr.laf.entities.Lost;
import dev.tfr.laf.entities.UserAPP;


import java.util.Date;

public class LostDTO {

    private Long id;
    private String description;
    private Integer typeCod;
    private String whoFind;

    private String localFind;

    @JsonFormat(pattern="dd/MM/yyyy HH:mm")
    private Date instantFind;


    private UserAPP userApp;

    public LostDTO(Long id, String description, Integer typeCod, String whoFind, String localFind, Date instantFind, UserAPP userApp) {
        this.id = id;
        this.description = description;
        this.typeCod = typeCod;
        this.whoFind = whoFind;
        this.localFind = localFind;
        this.instantFind = instantFind;
        this.userApp = userApp;
    }

    public LostDTO(Lost entity){
        id = entity.getId();
        description = entity.getDescription();
        typeCod = entity.getTypeCod().getCod();
        whoFind = entity.getWhoFind();
        instantFind = entity.getInstantFind();
        userApp = entity.getUserApp()
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

    public UserAPP getUserApp() {
        return userApp;
    }
}
