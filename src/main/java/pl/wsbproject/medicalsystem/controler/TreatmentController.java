package pl.wsbproject.medicalsystem.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsbproject.medicalsystem.dto.RegisterTreatment;
import pl.wsbproject.medicalsystem.model.Patient;
import pl.wsbproject.medicalsystem.model.Treatment;
import pl.wsbproject.medicalsystem.repository.PatientRepository;
import pl.wsbproject.medicalsystem.repository.TreatmentRepository;
import pl.wsbproject.medicalsystem.service.TreatmentService;

@RestController
@RequestMapping(path = "/api/treatment")
public class TreatmentController  {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private final TreatmentService treatmentService;

    public TreatmentController(TreatmentService treatmentService) {
        this.treatmentService = treatmentService;
    }

    @PostMapping(path = "/register")
    public Patient registerTreatment(@RequestBody RegisterTreatment registerTreatment){
        return patientRepository.save(registerTreatment.getPatient());
    }

    @DeleteMapping(path = "/delete/{treatmentId}")
    public void deleteTreatment(@PathVariable("treatmentId") Integer treatmentId){
        treatmentService.deleteTreatment(treatmentId);
    }



}

