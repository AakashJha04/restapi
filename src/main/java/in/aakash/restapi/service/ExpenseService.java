package in.aakash.restapi.service;

import in.aakash.restapi.dto.ExpenseDTO;

import java.util.List;

public interface ExpenseService {

    List<ExpenseDTO> getAllExpenses();
}
