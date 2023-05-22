package pl.wsbproject.medicalsystem.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wsbproject.medicalsystem.model.TypeOfTreatment;

@Repository
public interface TypeOfTreatmentRepository extends JpaRepository<TypeOfTreatment,Integer > {

}
