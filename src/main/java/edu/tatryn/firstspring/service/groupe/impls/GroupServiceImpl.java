package edu.tatryn.firstspring.service.groupe.impls;

import edu.tatryn.firstspring.dao.group.impls.GroupDAOFakeImpl;
import edu.tatryn.firstspring.model.Groupe;
import edu.tatryn.firstspring.service.groupe.interfaces.IGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GroupServiceImpl implements IGroupService {
    @Autowired
    GroupDAOFakeImpl groupDAOFake;
    @Override
    public Groupe create(Groupe groupe) {
        return groupDAOFake.create(groupe);
    }

    @Override
    public Groupe get(int id) {
        return groupDAOFake.get(id);
    }

    @Override
    public Groupe update(Groupe groupe) {
        return groupDAOFake.update(groupe);
    }

    @Override
    public boolean delete(int id) {
        return groupDAOFake.delete(id);
    }

    @Override
    public List<Groupe> getAll() {
        return groupDAOFake.getAll();
    }

    @Override
    public Groupe getByName(String name) {
        return this.getAll().stream().filter(groupe -> groupe.getName().equals(name))
                .findFirst().orElse(null);

    }
}
