package poc.artistvote.entity;

public class ArtistVoteRequest {

    public String artist_label;
    public String create_time;
	public String getArtist_label() {
		return artist_label;
	}
	public void setArtist_label(String artist_label) {
		this.artist_label = artist_label;
	}
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}

}
