package edu.tatryn.firstspring.controller.web;

import edu.tatryn.firstspring.model.Person;
import edu.tatryn.firstspring.service.groupe.impls.GroupServiceImpl;
import edu.tatryn.firstspring.service.person.interfaces.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonWebController {
        @Autowired
        //GroupDAOFakeImpl groupDAOFake;
        PersonServiceImpl personService;

        @RequestMapping("/person/list")
        public String showGroups(Model model){
            model.addAttribute("persons", personService.getAll());
            return "personlist";
        }




        /*@RequestMapping("/groupe/delete/{id}")
        String delete(Model model,@PathVariable(value = "id")int id){
            groupService.delete(id);
            model.addAttribute("grupes", groupService.getAll());
            return "groupelist";
        }*/

        //@RequestMapping("/groupe/get/{id}")
        //Groupe show(@PathVariable(value = "id")int id){
        //return groupService.get(id);
        //}

        //@RequestMapping("/groupe/create")
        //Groupe create(@Valid @RequestBody Groupe groupe)
        //{
            //return groupService.create(groupe);
        //}

    }

