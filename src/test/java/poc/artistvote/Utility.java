package poc.artistvote;

import poc.artistvote.entity.Artist;
import poc.artistvote.entity.Vote;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Utility {

    public static Artist buildTestArtist(){
        Artist artist = new Artist();
        artist.setArtist_id(3);
        artist.setArtist_name("Test Artist");
        artist.setArtist_label("test");
        artist.setArtist_description("Test");
        artist.setIs_active(true);
        artist.setVote_count("10");
        artist.setCreate_date(Timestamp.valueOf(LocalDateTime.now()));
        artist.setUpdate_date(Timestamp.valueOf(LocalDateTime.now()));
        return artist;
    }
    public static Artist buildTestArtist1(){
        Artist artist = new Artist();
        artist.setArtist_id(3);
        artist.setArtist_name("Test");
        artist.setArtist_label("test");
        return artist;
    }

    public static Vote buildTestVote(){
        Vote vote = new Vote();
        vote.setArtist_id(3);
        LocalDateTime date =  java.time.LocalDateTime.now();
        vote.setCreate_date(Timestamp.valueOf(date));
        vote.setUpdate_date(Timestamp.valueOf(date));
        return vote;
    }
}
