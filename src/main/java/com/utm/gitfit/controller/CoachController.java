package com.utm.gitfit.controller;

import com.utm.gitfit.dto.CoachDto;
import com.utm.gitfit.dto.UserDtoRequest;
import com.utm.gitfit.model.response.CoachResponse;
import com.utm.gitfit.service.CoachService;
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
@RequestMapping("/coaches")
public class CoachController {
    private final CoachService coachService;

    @GetMapping
    public List<CoachResponse> findAll() {
        return coachService.findAll();
    }

    @GetMapping("{id}")
    public CoachResponse findById(@PathVariable long id) {
        return coachService.findById(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> create(@Valid @RequestBody CoachDto coachDto) {
        CoachResponse savedCoach = coachService.save(coachDto);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(savedCoach.getId());

        return ResponseEntity.status(HttpStatus.CREATED)
                .location(uri)
                .body(savedCoach);
    }

    @PostMapping("/save/{id}")
    public ResponseEntity<?> update(@PathVariable long id, @Valid @RequestBody CoachDto coachDto) {
        CoachResponse updatedCoach = coachService.update(id, coachDto);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(updatedCoach.getId());

        return ResponseEntity.status(HttpStatus.OK)
                .location(uri)
                .body(updatedCoach);
    }

    @PostMapping(value = "/{id}/addClients")
    public ResponseEntity<?> addClients(@PathVariable long id, @Valid @RequestBody List<UserDtoRequest> clientRequests) {
        CoachResponse updatedCoach = coachService.addClients(id, clientRequests);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(updatedCoach.getId());

        return ResponseEntity.status(HttpStatus.OK)
                .location(uri)
                .body(updatedCoach);
    }

    @PostMapping(value = "/{id}/removeClients")
    public ResponseEntity<?> removeClients(@PathVariable long id, @Valid @RequestBody List<UserDtoRequest> clientRequests) {
        CoachResponse updatedCoach = coachService.removeClients(id, clientRequests);

        URI uri = MvcUriComponentsBuilder.fromController(getClass())
                .path("/{id}")
                .build(updatedCoach.getId());

        return ResponseEntity.status(HttpStatus.OK)
                .location(uri)
                .body(updatedCoach);
    }
}
