package in.aakash.restapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aakash.restapi.entity.ExpenseEntity;

/**
 * JPA repository for Expense resource
 * @author Bushan SC
 * */
public interface ExpenseRepository extends JpaRepository<ExpenseEntity, Long> {

    /**
     * It will find the single expense from database
     * @param expenseId
     * @return Optional
     * */
    Optional<ExpenseEntity> findByExpenseId(String expenseId);

    List<ExpenseEntity> findByOwnerId(Long id);

    Optional<ExpenseEntity> findByOwnerIdAndExpenseId(Long id, String expenseId);
}
