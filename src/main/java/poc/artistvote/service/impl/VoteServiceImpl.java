package poc.artistvote.service.impl;

import poc.artistvote.entity.Vote;
import poc.artistvote.repository.VoteRepo;
import poc.artistvote.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

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
        List<Vote> voteList =  voteRepo.findvotes(artist_id);
        return voteList.size();
    }




}
