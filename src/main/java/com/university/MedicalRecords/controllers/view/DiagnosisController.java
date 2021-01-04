package com.university.MedicalRecords.controllers.view;

import com.university.MedicalRecords.entities.Diagnosis;
import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.services.DiagnosisService;
import com.university.MedicalRecords.services.PillsService;
import jdk.jshell.Diag;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/diagnosis")
public class DiagnosisController {

    final private DiagnosisService diagnosisService;

    @GetMapping()
    public String getAll(Model model) {
        model.addAttribute("diagnosis",diagnosisService.findAll());
        return "diagnosis/diagnosis";
    }

    @GetMapping("/create")
    public String showCreateDiagnosisForm(Model model){
        model.addAttribute("diagnosis",new Diagnosis());
        return "diagnosis/create-diagnosis";
    }


    @PostMapping("/create")
    public String createDiagnosis(@Valid @ModelAttribute("diagnosis") Diagnosis diagnosis,
                               BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "pills/create-pill";
//        }
        diagnosisService.createDiagnosis(diagnosis);
        return "redirect:/diagnosis";
    }

    @GetMapping(value = "edit/{id}")
    public String showEditDiagnosisForm(Model model, @PathVariable("id") long id){
        model.addAttribute("diagnosis",diagnosisService.findById(id));
        return "diagnosis/edit-diagnosis";
    }

    @PostMapping("/edit/{id}")
    public String editDiagnosis(Model model, @PathVariable long id, Diagnosis diagnosis) {
        diagnosisService.editDiagnosis(id, diagnosis);
        return "redirect:/diagnosis";
    }

    @GetMapping("/delete/{id}")
    public String deleteDiagnosis(@PathVariable int id) {
        diagnosisService.deleteDiagnosis(diagnosisService.findById(id));
        return "redirect:/diagnosis";
    }
}
