package pl.wsbproject.medicalsystem.controler;


import org.springframework.web.bind.annotation.*;
import pl.wsbproject.medicalsystem.model.Drug;
import pl.wsbproject.medicalsystem.model.Examination;
import pl.wsbproject.medicalsystem.repository.DrugRepository;
import pl.wsbproject.medicalsystem.repository.ExaminationRepository;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/examination/drug")
public class ExaminationDrugController {

    private ExaminationRepository examinationRepository;

    private DrugRepository drugRepository;

    public ExaminationDrugController(ExaminationRepository examinationRepository, DrugRepository drugRepository) {
        this.examinationRepository = examinationRepository;
        this.drugRepository = drugRepository;
    }

   @PostMapping
   public Examination saveExaminationWithDrug(@RequestBody Examination examination){
        return examinationRepository.save(examination);
   }

   @GetMapping
    public List<Examination> findAllExaminations(){
        return examinationRepository.findAll();
   }

   @GetMapping(path = "/{examinationId}")
   public Examination findExamination(@PathVariable Integer examinationId){
        return examinationRepository.findById(examinationId).orElse(null);
   }

   @GetMapping(path = "/find/{examinationDate}")
   public List<Examination> findExaminationsContainingByDate(@PathVariable LocalDate examinationDate){
        return examinationRepository.findByExaminationDateContaining(examinationDate);
   }

   @GetMapping(path = "/find/{name}")
   public List<Drug> findDrugsContainingByName(@PathVariable String name){
        return drugRepository.findByNameContaining(name);
   }

   @GetMapping(path = "/find/{drugForm}")
    public List<Drug> findDrugsByDrugForm(@PathVariable String drugForm){
        return drugRepository.findByDrugForm(drugForm);
   }


}
