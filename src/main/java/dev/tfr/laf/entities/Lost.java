package dev.tfr.laf.entities;

import dev.tfr.laf.enums.TYPELOST;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name= "tb_lost")
public class Lost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private TYPELOST typeCod;
    private String whoFind;

    private String localFind;

    private Date instantFind;

    @ManyToOne
    @JoinColumn(name="userApp_id")
    private UserAPP userApp;

    public Lost(Long id, String description, TYPELOST typeCod, String whoFind, String localFind, Date instantFind, UserAPP userApp) {
        this.id = id;
        this.description = description;
        this.typeCod = typeCod;
        this.whoFind = whoFind;
        this.localFind = localFind;
        this.instantFind = instantFind;
        this.userApp = userApp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TYPELOST getTypeCod() {
        return typeCod;
    }

    public void setTypeCod(TYPELOST typeCod) {
        this.typeCod = typeCod;
    }

    public String getWhoFind() {
        return whoFind;
    }

    public void setWhoFind(String whoFind) {
        this.whoFind = whoFind;
    }

    public String getLocalFind() {
        return localFind;
    }

    public void setLocalFind(String localFind) {
        this.localFind = localFind;
    }

    public Date getInstantFind() {
        return instantFind;
    }

    public void setInstantFind(Date instantFind) {
        this.instantFind = instantFind;
    }

    public UserAPP getUserApp() {
        return userApp;
    }

    public void setUserApp(UserAPP userApp) {
        this.userApp = userApp;
    }
}
