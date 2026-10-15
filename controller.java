package com.example.test.controller;

import com.example.test.entity.entity;
import com.example.test.repository.repository;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins="*")
public class controller {
	
	@Autowired repository Repository;
	
	@GetMapping
	public List<entity> getAllentity(){
		return this.Repository.findAll();
	}
	
	@GetMapping("/{id}")
	public entity getentity(@PathVariable(value="id") Long entityId) {
		return this.Repository.findById(entityId).orElseThrow();
	}
	
	@PostMapping
	public entity createentity(@RequestBody entity entity) {
		return this.Repository.save(entity);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<entity> deleteentity(@PathVariable("id") Long entityId){
		entity ex=this.Repository.findById(entityId).orElseThrow();
		this.Repository.delete(ex);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/{id}")
	public entity updateentity(@RequestBody entity entity, @PathVariable(value="id") Long entityid) {
		entity ex=this.Repository.findById(entityid).orElseThrow();
		ex.setName(entity.getName());
		ex.setPhone(entity.getPhone());
		ex.setEmail(entity.getEmail());
		ex.setAddress(entity.getAddress());
		return this.Repository.save(ex);
		
	}

}
