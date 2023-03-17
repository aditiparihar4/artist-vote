package poc.artistvote.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import poc.artistvote.entity.Vote;
import poc.artistvote.repository.VoteRepo;
import poc.artistvote.service.VoteService;

@Component
public class VoteServiceImpl implements VoteService {
    @Autowired
    VoteRepo voteRepo;
    @Override
    public Vote addVote(Vote vote) {
        voteRepo.save(vote);
        return vote;
    }

    @Override
    public long countVote(int artist_id) {
        return voteRepo.findvotes(artist_id);
    }
}
