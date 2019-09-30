package edu.tatryn.firstspring.model;

import java.util.Objects;

public class Groupe {
    private int id;
    private String name;
    private String curator;

    public Groupe() {
    }

    public Groupe(int id, String name, String curator) {
        this.id = id;
        this.name = name;
        this.curator = curator;
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

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Groupe groupe = (Groupe) o;
        return id == groupe.id &&
                name.equals(groupe.name) &&
                curator.equals(groupe.curator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, curator);
    }

}
