package in.aakash.restapi.repository;

import in.aakash.restapi.entity.ExpenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

}
