package student.hackthon.team15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import student.hackthon.team15.dao.TestImpl;
import student.hackthon.team15.entity.BudgetEntity;
import student.hackthon.team15.entity.ExpensesEntity;
import student.hackthon.team15.entity.productPerson;

import java.util.List;



@RestController
public class TestController {
    @Autowired
    private TestImpl test;

    @PutMapping(value="/sum", consumes={"application/json","application/xml"})
    public ResponseEntity modifyBudget(@RequestBody productPerson p) {

            test.findAll(p);
            return ResponseEntity.ok().build();

    }


    @DeleteMapping("/pollution/delete/{id}")
    public ResponseEntity deletePollutionById(@PathVariable("id")String id){
        test.dele(id);
        return ResponseEntity.ok().build();
    }

}
