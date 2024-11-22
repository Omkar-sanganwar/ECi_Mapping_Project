package com.tka.ECIEntity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Candidate {
    @Id
    private int id;
    private String name;
    private String party;

    public Candidate() {}

    public Candidate(int id, String name, String party) {
        this.id = id;
        this.name = name;
        this.party = party;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    @Override
    public String toString() {
        return "Candidate [ID=" + id + ", Name=" + name + ", Party=" + party + "]";
    }
}
