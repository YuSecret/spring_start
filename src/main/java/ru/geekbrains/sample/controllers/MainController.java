package ru.geekbrains.sample.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ru.geekbrains.sample.dto.Student;

@Controller
public class MainController {

   @GetMapping("/")
   public String getIndexPage() {
      return "index";
   }

    @GetMapping("/student")
    public String getStudentPage() {
        //чтобы вывести список студентов нужно добавить бин StudentsRepository положить данные в Model
        return "student";
    }

    @GetMapping("/students")
    public String getStudentsPage() {
        //чтобы вывести список студентов нужно добавить бин StudentsRepository положить данные в Model
        return "students";
    }

    @PostMapping("/student")
    public String sendForm(@ModelAttribute Student student) {
        System.out.println(student);
        return "redirect:/";
    }

}