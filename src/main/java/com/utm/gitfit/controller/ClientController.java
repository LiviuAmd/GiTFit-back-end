package com.utm.gitfit.controller;

import com.utm.gitfit.dto.ClientDto;
import com.utm.gitfit.dto.UserDtoRequest;
import com.utm.gitfit.model.response.ClientResponse;
import com.utm.gitfit.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/clients")
public class ClientController {
    private final ClientService clientService;

    @GetMapping
    public List<ClientResponse> findAll() {
        return clientService.findAll();
    }

    @GetMapping("{id}")
    public ClientResponse findById(@PathVariable long id) {
        return clientService.findById(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> create(@Valid @RequestBody ClientDto clientDto) {
        ClientResponse savedClient = clientService.save(clientDto);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(savedClient.getId());

        return ResponseEntity.status(HttpStatus.CREATED)
                .location(uri)
                .body(savedClient);
    }

    @PostMapping("/save/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @Valid @RequestBody ClientDto clientDto) {
        ClientResponse updatedClient = clientService.update(id, clientDto);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(updatedClient.getId());

        return ResponseEntity.status(HttpStatus.OK)
                .location(uri)
                .body(updatedClient);
    }

    @PostMapping(value = "/{id}/addCoach")
    public ResponseEntity<?> addCoach(@PathVariable long id, @Valid @RequestBody UserDtoRequest coachRequest) {
        ClientResponse updatedClient = clientService.addCoach(id, coachRequest);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(updatedClient.getId());

        return ResponseEntity.status(HttpStatus.OK)
                .location(uri)
                .body(updatedClient);
    }

    @PostMapping(value = "/{id}/removeCoach")
    public ResponseEntity<?> removeCoach(@PathVariable long id) {
        ClientResponse updatedClient = clientService.removeCoach(id);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(updatedClient.getId());

        return ResponseEntity.status(HttpStatus.OK)
                .location(uri)
                .body(updatedClient);
    }
}
