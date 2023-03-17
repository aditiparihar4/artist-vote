package poc.artistvote.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "artist")

public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int artist_id;
	@Column(length=50, nullable = false)
	private String artist_label;
	@Column(length=50, nullable = false)
	private String artist_name;
	@Column(length=100, nullable = false)
	private String artist_description;
	@Column(name= "is_active", columnDefinition = "tinyint(1) default true")
	private Boolean is_active = true;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp create_date;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name = "update_date", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE\n" +
			"CURRENT_TIMESTAMP")
	private Timestamp update_date;
	@Transient
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
	public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public Timestamp getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Timestamp create_date) {
		this.create_date = create_date;
	}
	public Timestamp getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
	}

}
