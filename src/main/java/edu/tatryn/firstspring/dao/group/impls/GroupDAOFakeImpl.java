package edu.tatryn.firstspring.dao.group.impls;

import edu.tatryn.firstspring.dao.group.interfaces.IGroupDAO;
import edu.tatryn.firstspring.model.Groupe;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Configuration
public class GroupDAOFakeImpl implements IGroupDAO {
    private List<Groupe> groupes = new ArrayList<>(
            Arrays.asList(
                    new Groupe(1, "243", "Ivanov"),
                    new Groupe(2, "244", "Petrov"),
                    new Groupe(3, "245", "Sidorov")
            )
    );


    @Override
    public Groupe get(int id) {

        return this.getAll().stream()
                .filter(groupe->groupe.getId()==id)
                .findFirst().orElse(null);
    }

    @Override
    public Groupe update(Groupe groupe) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        Groupe groupe = this.get(id);
        return this.getAll().remove(groupe);
    }

    @Override
    public Groupe create(Groupe groupe) {
        int max = this.getAll().stream().mapToInt(item ->item.getId()).max().orElse(0);
        int newId = max++;
        groupe.setId(newId);

        groupes.add(groupe);
        return this.get(newId);
    }


    @Override
    public List<Groupe> getAll() {
        return groupes;
    }
}
