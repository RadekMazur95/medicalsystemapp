package pl.wsbproject.medicalsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wsbproject.medicalsystem.model.Examination;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ExaminationRepository extends JpaRepository<Examination, Integer> {

    List<Examination> findByExaminationDateContaining(LocalDate examinationDate);

}
