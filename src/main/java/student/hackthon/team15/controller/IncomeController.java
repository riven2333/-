package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.IncomeEntity;
import student.hackthon.team15.service.IncomeService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    IncomeService incomeService;

    @GetMapping(value="/details", produces={"application/json","application/xml"})
    public List<IncomeEntity> getAllIncomes() {
        return incomeService.getIncomesList();
    }

    @PutMapping(value="/add_income", consumes={"application/json","application/xml"})
    public ResponseEntity<IncomeEntity> addItemToCategory(@RequestBody IncomeEntity item) {
        incomeService.addIncome(item);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value="/delete_income", consumes={"application/json","application/xml"})
    public ResponseEntity<IncomeEntity> deleteItemToCategory(@RequestBody IncomeEntity item) {
        incomeService.deleteIncome(item);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/modify_income", consumes={"application/json","application/xml"})
    public ResponseEntity<IncomeEntity> updateItemToCategory(@RequestBody IncomeEntity item) {
        incomeService.updateIncome(item);
        return ResponseEntity.ok().build();
    }

}
