package account;

import media.*;
import java.util.ArrayList;

public class User {
	private Profile profile;

	private ArrayList<Playlist> playlists;
	private ArrayList<Media> requested;
	private ArrayList<Podcast> following;

	public User(Profile profile) {
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public ArrayList<Playlist> getPlaylists() {
		return playlists;
	}

	public void setPlaylists(ArrayList<Playlist> playlists) {
		this.playlists = playlists;
	}

	public ArrayList<Media> getRequested() {
		return requested;
	}

	public void setRequested(ArrayList<Media> requested) {
		this.requested = requested;
	}

	public ArrayList<Podcast> getFollowing() {
		return following;
	}

	public void setFollowing(ArrayList<Podcast> following) {
		this.following = following;
	}

	// Behaviors
	@Override
	public String toString() {
		// Returns the state of this object

		String str = "This user has profile with info: ";
		return str;
	}
}