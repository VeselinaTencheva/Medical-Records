package com.university.MedicalRecords.controllers.view;

import com.sun.el.stream.Stream;
import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.services.PillsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/pills")
public class PillsController {

    final private PillsService pillsService;

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("pills",pillsService.findAll());
        return "pills/pills";
    }

    @GetMapping("/create")
    public String showCreatePillForm(Model model){
        model.addAttribute("pill",new Pills());
        return "pills/create-pill";
    }


    @PostMapping("/create")
    public String createSchool(@Valid @ModelAttribute("pill") Pills pill,
                               BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "pills/create-pill";
//        }
        pillsService.create(pill);
        return "redirect:/pills";
    }

    @GetMapping(value = "edit/{id}")
    public String showEditPillForm(Model model, @PathVariable("id") long id){
        model.addAttribute("pill",pillsService.findById(id));
        return "pills/edit-pill";
    }

    @PostMapping("/edit/{id}")
    public String editPill(Model model, @PathVariable long id, Pills pill) {
        pillsService.edit(id, pill);
        return "redirect:/pills";
    }

    @GetMapping("/delete/{id}")
    public String deletePill(@PathVariable int id) {
        pillsService.delete(pillsService.findById(id));
        return "redirect:/pills";
    }
}
