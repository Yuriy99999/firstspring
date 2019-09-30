package edu.tatryn.firstspring.dao.group.interfaces;

import edu.tatryn.firstspring.model.Groupe;

import java.util.List;

public interface IGroupDAO {
    Groupe create(Groupe groupe);
    Groupe get(int id);
    Groupe update(Groupe groupe);
    boolean delete(int id);
    List<Groupe> getAll();
}
