package poc.artistvote.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import poc.artistvote.entity.Vote;

public interface VoteRepo extends JpaRepository<Vote, Integer>  {
    @Query("SELECT COUNT(*)  FROM Vote t WHERE t.artist_id = ?1")
    long findvotes(int artist_id);


}
