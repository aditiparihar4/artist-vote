package poc.artistvote.service;

import poc.artistvote.entity.Vote;
import org.springframework.stereotype.Service;


@Service
public interface VoteService {

    Vote addVote(Vote vote);

   long countVote(int artist_id);
}
