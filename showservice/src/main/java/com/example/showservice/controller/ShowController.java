package com.example.showservice.controller;

import com.example.showservice.model.Show;
import com.example.showservice.service.ShowService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/shows")
public class ShowController {

    private final ShowService showService;

    public ShowController(ShowService showService) {
        this.showService = showService;
    }

    // Endpoint to add a new show
    @PostMapping
    public ResponseEntity<Show> createShow(@RequestBody Show show) {
        Show savedShow = showService.addShow(show);
        return ResponseEntity.ok(savedShow);
    }

    // Endpoint to retrieve a show by ID
    @GetMapping("/{id}")
    public ResponseEntity<Show> getShow(@PathVariable Long id) {
        Optional<Show> show = showService.getShowById(id);
        return show.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Endpoint to list all shows
    @GetMapping
    public ResponseEntity<List<Show>> getShows() {
        List<Show> shows = showService.getAllShows();
        return ResponseEntity.ok(shows);
    }
}
