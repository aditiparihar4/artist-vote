package poc.artistvote.service;

import poc.artistvote.entity.Artist;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ArtistService {

    Optional<Artist> getArtist(int artist_id);
    List<Artist> getArtistByLabel(String artist_Label);
    List<Artist> getAllArtist();

}
