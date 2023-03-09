package poc.artistvote.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "artist")

public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int artist_id;
    private String artist_label;
    private String artist_name;
    private String artist_description;
	private int is_active;
    private Date create_date;
    private Date update_date;
    
    private String vote_count;
    public int getArtist_id() {
		return artist_id;
	}
	public void setArtist_id(int artist_id) {
		this.artist_id = artist_id;
	}
	public String getArtist_label() {
		return artist_label;
	}
	public void setArtist_label(String artist_label) {
		this.artist_label = artist_label;
	}
	public String getArtist_name() {
		return artist_name;
	}
	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}
	public String getArtist_description() {
		return artist_description;
	}
	public void setArtist_description(String artist_description) {
		this.artist_description = artist_description;
	}
	public String getVote_count() {
		return vote_count;
	}
	public void setVote_count(String vote_count) {
		this.vote_count = vote_count;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

}
