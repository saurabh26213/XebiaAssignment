package tech.gsp.nytimessample.ViewUI;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.List;

import tech.gsp.nytimessample.Model.Blog;
import tech.gsp.nytimessample.R;

public class BlogAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private static final String TAG = "BlogAdapter";

    private List<Blog> mBlogList;

    public BlogAdapter(List<Blog> blogList) {
        mBlogList = blogList;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(R.layout.most_popular_listitem, parent, false));


    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        if (mBlogList != null && mBlogList.size() > 0) {
            return mBlogList.size();
        } else {
            return 0;
        }
    }

    public class ViewHolder extends BaseViewHolder {

        ImageView ivThumbnail;
        TextView tvTitle;
        TextView tvAuthor;
        TextView tvPublishTime;

        public ViewHolder(View itemView) {
            super(itemView);
            ivThumbnail = itemView.findViewById(R.id.list_image);
            tvTitle = itemView.findViewById(R.id.title);
            tvAuthor = itemView.findViewById(R.id.author);
            tvPublishTime = itemView.findViewById(R.id.publishtime);

        }

        protected void clear() {
            ivThumbnail.setImageDrawable(null);
            tvTitle.setText("");
            tvPublishTime.setText("");
        }

        public void onBind(int position) {
            super.onBind(position);

            final Blog mBlog = mBlogList.get(position);
            String urlPath = mBlog.getGenreIds().get(0).mMediaData.get(0).getUrl();
            if (urlPath != null) {
                Glide.with(itemView.getContext())
                        .load(urlPath)
                        .into(ivThumbnail);
            }

            if (mBlog.getTitle() != null) {
                tvTitle.setText(mBlog.getTitle());
            }

            if (mBlog.getmByline() != null) {
                tvAuthor.setText(mBlog.getmByline());
            }

            if (mBlog.getPublisheddate() != null) {
                tvPublishTime.setText(mBlog.getPublisheddate());
            }
        }
    }
}
