package pl.wsbproject.medicalsystem.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.wsbproject.medicalsystem.model.TypeOfTreatment;
import pl.wsbproject.medicalsystem.repository.TypeOfTreatmentRepository;
import pl.wsbproject.medicalsystem.service.TypeOfTreatmentService;

import java.util.List;

@RestController
@RequestMapping(path = "api/typeoftreatment")
public class TypeOfTreatmentController {

    @Autowired
    private TypeOfTreatmentRepository typeOfTreatmentRepository;

    private final TypeOfTreatmentService typeOfTreatmentService;

    @Autowired
    public TypeOfTreatmentController(TypeOfTreatmentService typeOfTreatmentService) {
        this.typeOfTreatmentService = typeOfTreatmentService;
    }

    @GetMapping(path = "/list")
    public List<TypeOfTreatment> getTypeOfTreatments(){
        return typeOfTreatmentService.getTypeOfTreatments();
    }

    @PostMapping(path = "/add")
    public void addTypeOfTreatment(@RequestBody TypeOfTreatment typeOfTreatment){
        typeOfTreatmentService.addNewTOT(typeOfTreatment);
    }


    }

