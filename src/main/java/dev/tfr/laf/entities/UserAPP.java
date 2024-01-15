package dev.tfr.laf.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user_app")
public class UserAPP {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String pornumber;

    @OneToMany(mappedBy = "userApp")
    private List<Lost> losts = new ArrayList<>();


    public UserAPP(){};

    public UserAPP(Long id, String name, String email, String pornumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pornumber = pornumber;

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

    public String getPornumber() {
        return pornumber;
    }

    public void setPornumber(String porNumber) {
        this.pornumber = porNumber;
    }

    public List<Lost> getLosts() {
        return losts;
    }

    public void setLosts(List<Lost> losts) {
        this.losts = losts;
    }
}
