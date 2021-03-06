package com.example.andeladeveloper.githuberr.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Fred Adewole on 12/03/2018.
 */
public class GithubUser implements Parcelable {

    /**
     *
     */
    @SerializedName("login")
    private final String username;
    /**
     *
     */
    @SerializedName("avatar_url")
    private final String avatar;
    /**
     *
     */
    @SerializedName("organizations_url")
    private final String organisation;
    /**
     *
     */
    @SerializedName("repos_url")
    private final String repos;

    /**
     * Instantiates a new Github users.
     *
     * @param in the in
     */
    protected GithubUser(Parcel in) {
        username = in.readString();
        avatar = in.readString();
        organisation = in.readString();
        repos = in.readString();
    }

    /**
     * Gets avatar.
     *
     * @return the avatar
     */
    public String getAvatar() {

        return avatar;
    }

    /**
     * Gets username.
     *
     * @return the username
     */
    public String getUsername() {

        return username;
    }

    /**
     * Gets organisaton.
     *
     * @return the organisaton
     */
    public String getOrganisaton() {

        return organisation;
    }

    /**
     * Gets repos.
     *
     * @return the repos
     */
    public String getRepos() {

        return repos;
    }

    /**
     *
     * @return 0
     */
    @Override
    public int describeContents() {

        return 0;
    }

    /**
     *
     * @param dest
     * @param flags
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(avatar);
        dest.writeString(organisation);
        dest.writeString(repos);
    }

    /**
     * The constant CREATOR.
     */
    public static final Creator<GithubUser> CREATOR = new Creator<GithubUser>() {
        @Override
        public GithubUser createFromParcel(Parcel in) {

            return new GithubUser(in);
        }

        @Override
        public GithubUser[] newArray(int size) {

            return new GithubUser[size];
        }
    };
}
