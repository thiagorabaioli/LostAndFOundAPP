package dev.tfr.laf.dto;

import dev.tfr.laf.entities.UserAPP;

public class UserAPPDTO {

    private Long id;
    private String name;
    private String email;
    private String pornumber;

    public UserAPPDTO(Long id, String name, String email, String pornumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pornumber = pornumber;
    }

    public UserAPPDTO (UserAPP entity){
        id = entity.getId();
        name = entity.getName();
        email= entity.getEmail();
        pornumber = entity.getPornumber();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPornumber() {
        return pornumber;
    }
}
