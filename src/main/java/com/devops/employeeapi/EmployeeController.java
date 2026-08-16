package com.devops.employeeapi;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.List;
 
@RestController
public class EmployeeController {
 
    @GetMapping("/employees")
    public List<String> employees() {
        return List.of(
                "Rahul - DevOps",
                "Priya - QA",
                "Anil - Cloud"
        );
    }
}