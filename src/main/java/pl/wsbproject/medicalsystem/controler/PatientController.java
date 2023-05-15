package pl.wsbproject.medicalsystem.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsbproject.medicalsystem.model.Patient;
import pl.wsbproject.medicalsystem.service.PatientService;

import java.util.List;

@RestController
@RequestMapping(path = "api/patient")
public class PatientController {


    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping(path = "/list")
    public List<Patient> getPatients() {
        return patientService.getPatients();
    }

    @PostMapping(path = "/register")
    public void registerNewPatient(@RequestBody Patient patient){
        patientService.addNewPatient(patient);
    }

    @PutMapping(path = "/update/{patientId}")
    public void updatePatient(@PathVariable("patientId") Long patientId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email){
        patientService.updatePatient(patientId, name, email);

    }

    @DeleteMapping(path = "/delete/{patientId}")
    public void deletePatient(@PathVariable("patientId") Long patientId){
        patientService.deletePatient(patientId);
    }


}
