package poc.artistvote.service.impl;

import poc.artistvote.entity.Artist;
import poc.artistvote.repository.ArtistRepo;
import poc.artistvote.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ArtistServiceImpl implements ArtistService {

    @Autowired
    ArtistRepo artistRepo;


    @Override
    public Optional<Artist> getArtist(int artist_id) {
        return artistRepo.findById(artist_id);
    }

    @Override
    public List<Artist> getArtistByLabel(String artist_label) {
        return artistRepo.findArtistBylabel(artist_label);
    }

    @Override
    public List<Artist> getAllArtist() {

        return artistRepo.findAll();
    }

}
