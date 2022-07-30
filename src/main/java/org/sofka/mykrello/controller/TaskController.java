package org.sofka.mykrello.controller;

import org.sofka.mykrello.model.domain.TaskDomain;
//import javax.print.attribute.standard.Media;
import org.sofka.mykrello.model.service.TaskService;
import org.sofka.mykrello.utilities.MyResponseUtility;
//import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(value = "*")
@RestController
public class TaskController {

	@Autowired
	private MyResponseUtility response;

	@Autowired
	private TaskService taskService;

	@GetMapping(path = "/api/v1/task/{idTask}")
	public ResponseEntity<MyResponseUtility> getTaskById(@PathVariable Integer idTask) {
		System.out.println("id ==================== " + idTask);
		response.data = taskService.findById(idTask);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PostMapping(path = "/api/v1/task")
	public ResponseEntity<MyResponseUtility> create(@RequestBody TaskDomain task) {
		response.data = taskService.create(task);
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
}
