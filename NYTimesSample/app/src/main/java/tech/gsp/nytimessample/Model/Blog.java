
package tech.gsp.nytimessample.Model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    @SerializedName("title")
    private String mTitle;
    @SerializedName("published_date")
    private String mPublisheddate;
    @SerializedName("source")
    private String mSource;
    @SerializedName("byline")
    private String mByline;
    public String getmByline() {
        return mByline;
    }

    public void setmByline(String mByline) {
        this.mByline = mByline;
    }
    @SerializedName("media")
    private List<MediaData> genreIds = new ArrayList<>();

    public List<MediaData> getGenreIds() {
        return genreIds;
    }

    public void setGenreIds(List<MediaData> genreIds) {
        this.genreIds = genreIds;
    }
    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getPublisheddate() {
        return mPublisheddate;
    }

    public void setPublisheddate(String mPublisheddate) {
        this.mPublisheddate = mPublisheddate;
    }

    public String getSource() {
        return mSource;
    }

    public void setSource(String mSource) {
        this.mSource = mSource;
    }
    public class MediaData{
        @SerializedName("media-metadata")
        public List<MediaBlog> mMediaData;
    }
    public class MediaBlog{
        @SerializedName("url")
        private String mUrl;
        public String getUrl() {
            return mUrl;
        }
        public void setUrl(String mUrl) {
            this.mUrl = mUrl;
        }
    }

}
