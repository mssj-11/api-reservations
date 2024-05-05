package com.mss.springboot.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mss.springboot.web.app.dto.ReservationDTO;


@RestController
@RequestMapping("/reservation")
public class ReservationController {
	
	
	
	/*========= ENDPOINTS =========*/
	@GetMapping
	public ResponseEntity<List<ReservationDTO>> getReservations(){// LIST reservations
		List<ReservationDTO> response = new ArrayList<>();
		response.add(new ReservationDTO());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ReservationDTO> getReservationsById(@PathVariable Long id){// FILTER by ID reservation
		ReservationDTO response = new ReservationDTO();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<ReservationDTO> save(@RequestBody ReservationDTO reservation){// CREATE reservation
		ReservationDTO response = new ReservationDTO();
		return new ResponseEntity<>(response, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ReservationDTO> update(@PathVariable Long id, @RequestBody ReservationDTO reservation){// UPDATE reservation by ID
		ReservationDTO response = new ReservationDTO();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){// DELETE reservation by ID
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
}