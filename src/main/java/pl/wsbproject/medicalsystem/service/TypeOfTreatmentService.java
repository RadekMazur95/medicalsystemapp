package pl.wsbproject.medicalsystem.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsbproject.medicalsystem.model.TypeOfTreatment;
import pl.wsbproject.medicalsystem.repository.TypeOfTreatmentRepository;

import java.util.List;

@Service
public class TypeOfTreatmentService {

    @Autowired
    private final TypeOfTreatmentRepository typeOfTreatmentRepository;

    public TypeOfTreatmentService(TypeOfTreatmentRepository typeOfTreatmentRepository) {
        this.typeOfTreatmentRepository = typeOfTreatmentRepository;
    }

    public List<TypeOfTreatment> getTypeOfTreatments(){
        return typeOfTreatmentRepository.findAll();
    }

    public void addNewTOT(TypeOfTreatment typeOfTreatment){
        typeOfTreatmentRepository.save(typeOfTreatment);
    }




}
