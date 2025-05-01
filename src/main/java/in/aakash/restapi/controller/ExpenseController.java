package in.aakash.restapi.controller;

import in.aakash.restapi.dto.ExpenseDTO;
import in.aakash.restapi.io.ExpenseResponse;
import in.aakash.restapi.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;


import java.util.List;

//import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

@RestController
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;
    private final ModelMapper modelMapper;

    @GetMapping("/expenses")
    public List<ExpenseResponse> getExpenses(){
        //call the service method
        List<ExpenseDTO> list  = expenseService.getAllExpenses();
        //convert the Expense DTO to Expense Response
        List<ExpenseResponse> res = list.stream().map(expenseDTO -> mapToExpenseResponse(expenseDTO)).collect(Collectors.toList());
        //return the response
        return res;
    }

    private ExpenseResponse mapToExpenseResponse(ExpenseDTO expenseDTO) {
        return modelMapper.map(expenseDTO, ExpenseResponse.class);
    }

    @GetMapping("/")
    public String getHome(){
        return "Working on it";
    }


}
