package dev.tfr.laf.controllers;

import dev.tfr.laf.dto.UserAPPDTO;
import dev.tfr.laf.services.UserAPPService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserAPPController {

    @Autowired
    private UserAPPService service;

    @GetMapping
    public ResponseEntity<Page<UserAPPDTO>> findAll(Pageable pageable){
        Page<UserAPPDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);
    }
}
