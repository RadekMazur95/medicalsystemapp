package pl.wsbproject.medicalsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsbproject.medicalsystem.model.Treatment;
import pl.wsbproject.medicalsystem.repository.TreatmentRepository;

@Service
public class TreatmentService {

    @Autowired
    private final TreatmentRepository treatmentRepository;

    public TreatmentService(TreatmentRepository treatmentRepository) {
        this.treatmentRepository = treatmentRepository;
    }

    public void addTreatment(Treatment treatment){
        treatmentRepository.save(treatment);
    }

    public void deleteTreatment(Integer treatmentId) {
        boolean exists = treatmentRepository.existsById(treatmentId);
        if (!exists) {
            throw new IllegalStateException("treatment with id " + treatmentId + "does not exists");
        }
        treatmentRepository.deleteById(treatmentId);
    }



}
