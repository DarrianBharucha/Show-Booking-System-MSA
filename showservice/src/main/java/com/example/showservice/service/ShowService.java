package com.example.showservice.service;



import com.example.showservice.model.Show;
import com.example.showservice.repository.ShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShowService {

    private final ShowRepository showRepository;

    public ShowService(ShowRepository showRepository) {
        this.showRepository = showRepository;
    }

    // Create or add a new show
    public Show addShow(Show show) {
        return showRepository.save(show);
    }

    // Retrieve a show by its ID
    public Optional<Show> getShowById(Long id) {
        return showRepository.findById(id);
    }

    // Retrieve all shows
    public List<Show> getAllShows() {
        return showRepository.findAll();
    }
}
