package poc.artistvote;

import poc.artistvote.entity.Artist;
import poc.artistvote.entity.Vote;

import java.sql.Date;
import java.time.LocalDateTime;

public class Utility {

    public static Artist buildTestArtist(){
        Artist artist = new Artist();
        artist.setArtist_id(3);
        artist.setArtist_name("Test Artist");
        artist.setArtist_label("test");
        artist.setArtist_description("Test");
        artist.setIs_active(1);
        artist.setVote_count("10");
        artist.setCreate_date(Date.valueOf("2023-02-25"));
        artist.setUpdate_date(Date.valueOf("2023-02-25"));
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
        vote.setCreate_date(date);
        vote.setUpdate_date(date);
        return vote;
    }
}
