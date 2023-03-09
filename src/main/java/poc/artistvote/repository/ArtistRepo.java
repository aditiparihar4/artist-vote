package poc.artistvote.repository;

import poc.artistvote.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArtistRepo extends JpaRepository<Artist,Integer> {

    @Query("SELECT t FROM Artist t WHERE t.artist_label = ?1")
    List<Artist> findArtistBylabel(String artist_id);

}
