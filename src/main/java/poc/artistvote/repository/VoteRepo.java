package poc.artistvote.repository;

import poc.artistvote.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VoteRepo extends JpaRepository<Vote, Integer>  {

    @Query("SELECT t FROM Vote t WHERE t.artist_id = ?1")
    List<Vote> findvotes(int artist_id);


}
