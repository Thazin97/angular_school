package com.example.angularschool.api;


import com.example.angularschool.ds.CourseDto;
import com.example.angularschool.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class ApiCourseController {

    @Autowired
    private CourseService courseService;

    //@CrossOrigin(value = "http:")
    @GetMapping("/courses")
    public ResponseEntity<List<CourseDto>> listCourse() {
        return ResponseEntity.ok(courseService.findAllCourse());
    }
}

