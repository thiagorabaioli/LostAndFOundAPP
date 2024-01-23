package dev.tfr.laf.controllers;

import dev.tfr.laf.dto.LostUserDTO;
import dev.tfr.laf.services.LostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.text.ParseException;

@RestController
@RequestMapping(value="/losts")
public class LostController {

    @Autowired
    private LostService service;


    @GetMapping
    public ResponseEntity<Page<LostUserDTO>> findAll(Pageable pageable){
        Page<LostUserDTO> dto = service.findAll(pageable);
        return ResponseEntity.ok(dto);

    }

    @PostMapping
    public ResponseEntity<LostUserDTO> insert (@RequestBody LostUserDTO dto) {
        dto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }

}
