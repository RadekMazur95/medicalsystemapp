package pl.wsbproject.medicalsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wsbproject.medicalsystem.model.Drug;

import java.util.List;

@Repository
public interface DrugRepository extends JpaRepository<Drug, Integer> {


    List<Drug>findByNameContaining(String name);

    List<Drug>findByDrugForm(String drugForm);
}
