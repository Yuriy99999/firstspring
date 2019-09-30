package edu.tatryn.firstspring.controller.rest;

import edu.tatryn.firstspring.dao.group.impls.GroupDAOFakeImpl;
import edu.tatryn.firstspring.model.Groupe;
import edu.tatryn.firstspring.model.Student;
import edu.tatryn.firstspring.service.groupe.impls.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class GroupeRestController {
    @Autowired
    //GroupDAOFakeImpl groupDAOFake;
            GroupServiceImpl groupService;

       /* @RequestMapping("/groupe/list")
        List<Groupe> showGroups(){

            return groupService.getAll();
        }


        @RequestMapping("/groupe/delete/{id}")
        boolean delete(@PathVariable(value = "id")int id){
            return groupService.delete(id);
        }

        @RequestMapping("/groupe/get/{id}")
        Groupe show(@PathVariable(value = "id")int id){
        return groupService.get(id);
        }

        @RequestMapping("/groupe/create")
        Groupe create(@Valid @RequestBody Groupe groupe)
        {
            return groupService.create(groupe);
        }


*/
}