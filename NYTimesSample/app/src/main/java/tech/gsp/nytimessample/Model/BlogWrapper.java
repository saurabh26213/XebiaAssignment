
package tech.gsp.nytimessample.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BlogWrapper {

    @SerializedName("results")
    private List<Blog> mData;
    @SerializedName("num_results")
    private String mNumResults;
    @SerializedName("copyright")
    private String mCopyright;
    @SerializedName("status")
    private String mStatus;

    public List<Blog> getBlog() {
        return mData;
    }

    public void setBlog(List<Blog> data) {
        mData = data;
    }

    public String getNumResult() {
        return mNumResults;
    }

    public void setNumResult(String numresult) {
        mNumResults = numresult;
    }

    public String getStatus() {
        return mStatus;
    }

    public void setStatus(String status) {
        mStatus = status;
    }

}
