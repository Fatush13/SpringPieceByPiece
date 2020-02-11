package controller;

import POJO.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @GetMapping("/student")
    public ModelAndView student() {
        return new ModelAndView("student", "command", new Student());
    }

    @PostMapping("/addStudent")
    public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
        model.addAttribute("id", student.getId());
        model.addAttribute("age", student.getAge());
        model.addAttribute("name", student.getName());

        return "result";
    }
}
