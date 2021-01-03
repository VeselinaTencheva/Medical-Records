package com.university.MedicalRecords.controllers.api;

import com.university.MedicalRecords.entities.Pills;
import com.university.MedicalRecords.services.PillsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/pills")
public class PillsController {
    private final PillsService pillsService;

    @GetMapping()
    public List<Pills> getPills(){
        return this.pillsService.findAll();
    }

    @GetMapping(value = "/{id}")
    public Pills getPill(@PathVariable("id") long id){
        return this.pillsService.findById(id);
    }

    @PostMapping()
    public Pills createPill(@RequestBody Pills pill){
        return this.pillsService.create(pill);
    }

    @PutMapping(value = "/{id}")
    public Pills updatePill(@PathVariable("id") long id,@RequestBody Pills pill){
        return this.pillsService.edit(id,pill);
    }

    @DeleteMapping()
    public void deletePill(@RequestBody Pills pill){
        this.pillsService.delete(pill);
    }
}
