package com.magic.cardsInventory.models;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PlayerModelDTO {

    private String name;
    private String email;


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

    @Override
    public String toString() {
        return "PlayerModel{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
