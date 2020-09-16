package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import student.hackthon.team15.entity.BudgetEntity;
import student.hackthon.team15.service.BudgetService;

import java.util.List;

@RestController
@RequestMapping("/budget")
public class BudgetController {
    @Autowired
    BudgetService budgetService;

    @GetMapping(value="/details", produces={"application/json","application/xml"})
    public List<BudgetEntity> getAllBudget() {
        return budgetService.getAllBudget();
    }

    @PutMapping(value="/modify", consumes={"application/json","application/xml"})
    public ResponseEntity modifyBudget(@RequestBody BudgetEntity item) {
        if (!budgetService.ifContainsBudget(item))
            return ResponseEntity.notFound().build();
        else {
            budgetService.modifyBudget(item);
            return ResponseEntity.ok().build();
        }
    }

    @PutMapping(value="/add", consumes={"application/json","application/xml"})
    public ResponseEntity deleteBudget(@RequestBody BudgetEntity item) {
         budgetService.addBudget(item);
         return ResponseEntity.ok().build();
    }

    @DeleteMapping(value="/delete", consumes={"application/json","application/xml"})
    public ResponseEntity addBudget(@RequestBody BudgetEntity item) {
        budgetService.deleteBudget(item);
        return ResponseEntity.ok().build();
    }

}
