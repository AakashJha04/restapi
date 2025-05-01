package in.aakash.restapi.service.impl;

import in.aakash.restapi.dto.ExpenseDTO;
import in.aakash.restapi.entity.ExpenseEntity;
import in.aakash.restapi.repository.ExpenseRepository;
import in.aakash.restapi.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ExpenseDTO> getAllExpenses() {
        List<ExpenseEntity> list = expenseRepository.findAll();
        return list.stream()
                .map(this::mapToExpenseDTO)
                .collect(Collectors.toList());
    }

    private ExpenseDTO mapToExpenseDTO(ExpenseEntity expenseEntity) {
        return modelMapper.map(expenseEntity, ExpenseDTO.class);
    }
}
