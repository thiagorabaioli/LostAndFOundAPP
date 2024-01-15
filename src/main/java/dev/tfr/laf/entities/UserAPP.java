package dev.tfr.laf.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TB_user_app")
public class UserAPP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String porNumber;

    @OneToMany(mappedBy = "userApp")
    private List<Lost> losts = new ArrayList<>();


    public UserAPP(){};

    public UserAPP(Long id, String name, String email, String porNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.porNumber = porNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPorNumber() {
        return porNumber;
    }

    public void setPorNumber(String porNumber) {
        this.porNumber = porNumber;
    }

    public List<Lost> getLosts() {
        return losts;
    }

    public void setLosts(List<Lost> losts) {
        this.losts = losts;
    }
}
