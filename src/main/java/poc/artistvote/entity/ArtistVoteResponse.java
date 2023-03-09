package poc.artistvote.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ArtistVoteResponse {

    public String message;
    public LocalDateTime date;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
