package com.example.app13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {
	
	@Autowired
	private AddressRepository addressRepository;
	@PostMapping
	public ResponseEntity<Address>save(@RequestBody Address person){
		return ResponseEntity.ok(addressRepository.save(person));
	}
	public ResponseEntity<Iterable<Address>>list(){
		return ResponseEntity.ok(addressRepository.findAll());
	}

}

/*
 first post person
 {
 "id":1,
 "firstName":"abc",
 "lastName":"xyz"
 }
 
 then post the address
 {
 "id":1,
 "houseNo":"123/M",
 "streetName":"BTM",
 "person":{
 "id":1
   }
 }
 
  {
 "id":1,
 "firstName":"abc",
 "lastName":"xyz"
 "address": {
         "id":1,
          "houseNo":"123/M",
          "streetName":"BTM",
          "person":{
           "id":1
        }
    }
 }
 
 */
