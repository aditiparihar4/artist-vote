package poc.artistvote.controller;

import org.apache.commons.lang3.StringUtils;
import poc.artistvote.entity.Artist;
import poc.artistvote.entity.ArtistVoteRequest;
import poc.artistvote.entity.ArtistVoteResponse;
import poc.artistvote.entity.Vote;
import poc.artistvote.exception.ArtistNotFoundException;
import poc.artistvote.service.ArtistService;
import poc.artistvote.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
public class ArtistVoteController {

    @Autowired
    ArtistService artistService;

    @Autowired
    VoteService voteService;

    @GetMapping("/show_all")
    public List<Artist> getAllArtistDetails(){
        List<Artist> artistList = artistService.getAllArtist();
        artistList.forEach(p->p.setVote_count(String.valueOf(voteService.countVote(p.getArtist_id()))));
        return artistList;
    }

    @GetMapping("/get_artist/{artist_label}")
    public List<Artist> getArtistDetailByLabel(@PathVariable String artist_label){
        List<Artist> artistList = artistService.getArtistByLabel(artist_label.trim().toLowerCase());
        System.out.println("artistList : "+ artistList);
        if(CollectionUtils.isEmpty(artistList))
            throw new ArtistNotFoundException("artist_label - " + artist_label);

        Artist artist = artistList.get(0);
        artist.setVote_count(String.valueOf(voteService.countVote(artist.getArtist_id())));
        return artistList;
    }

    @PostMapping("/add_vote")
    public ResponseEntity<ArtistVoteResponse> addVote(@RequestBody ArtistVoteRequest vote){
        if(Objects.isNull(vote) || StringUtils.isEmpty(vote.getArtist_label())){
            return new ResponseEntity<>(createResponse("Invalid Request"), HttpStatus.BAD_REQUEST);
        }
        List<Artist> artist = artistService.getArtistByLabel(vote.getArtist_label());
        if(artist.isEmpty())
            throw new ArtistNotFoundException("artist_label - " + vote.getArtist_label());
        voteService.addVote(createVote(vote.getArtist_label(), artist));
        return new ResponseEntity<>(createResponse("Success"), HttpStatus.OK);
    }

    private Vote createVote(String artist_label, List<Artist> artist) {
		Vote newVote = new Vote();
        newVote.setArtist_id(artist.get(0).getArtist_id());
        newVote.setCreate_date(Timestamp.valueOf(java.time.LocalDateTime.now()));
        newVote.setUpdate_date(Timestamp.valueOf(java.time.LocalDateTime.now()));
		return newVote;
	}

    public ArtistVoteResponse createResponse(String message){
        ArtistVoteResponse response = new ArtistVoteResponse();
        response.setMessage(message);
        response.setDate(java.time.LocalDateTime.now());
        return response;
    }


}
