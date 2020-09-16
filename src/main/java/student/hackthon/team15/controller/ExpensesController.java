package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import student.hackthon.team15.entity.CategoriesEntity;
import student.hackthon.team15.entity.ExpensesEntity;
import student.hackthon.team15.entity.productPerson;
import student.hackthon.team15.service.ExpensesService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpensesController {

    @Autowired
    private ExpensesService expensesService;

    @GetMapping(value="/details", produces={"application/json","application/xml"})
    public List<ExpensesEntity> getAllExpenses() {
        return expensesService.getAllExpenses();
    }

    @GetMapping(value="/category_details", produces={"application/json","application/xml"})
    public List<CategoriesEntity> getAllCategories() {
        return expensesService.getAllCategories();
    }

    @PutMapping(value="/modify_expense", consumes={"application/json","application/xml"})
    public ResponseEntity modifyBudget(@RequestBody ExpensesEntity expensesEntity) {
        expensesService.modifyExpenses(expensesEntity);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/add_expense", consumes={"application/json","application/xml"})
    public ResponseEntity addBudget(@RequestBody ExpensesEntity expensesEntity) {
        expensesService.addItemsToExpenses(expensesEntity);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete_expense/{id}")
    public ResponseEntity deleteExpenseById(@PathVariable("id")String id){
        expensesService.deleteExpensebyId(id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value="/delete_expense", consumes={"application/json","application/xml"})
    public ResponseEntity deleteExpense(@RequestBody ExpensesEntity item) {
        expensesService.deleteExpense(item);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/category_add", consumes={"application/json","application/xml"})
    public ResponseEntity addItemToCategory(@RequestBody CategoriesEntity item) {
        expensesService.addItemsToCategory(item);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/category_modify", consumes={"application/json","application/xml"})
    public ResponseEntity modifyItemToCategory(@RequestBody CategoriesEntity item) {
        expensesService.modifyItemInCategories(item);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value="/category_delete", consumes={"application/json","application/xml"})
    public ResponseEntity deleteCategory(@RequestBody CategoriesEntity item) {
        expensesService.deleteItemInCategories(item);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/category/delete/{id}")
    public ResponseEntity deleteCategoryById(@PathVariable("id")String id){
        expensesService.deleteItemInCategoriesbyId(id);
        return ResponseEntity.ok().build();
    }

}
