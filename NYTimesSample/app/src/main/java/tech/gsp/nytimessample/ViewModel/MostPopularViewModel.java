package tech.gsp.nytimessample.ViewModel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;
import android.arch.lifecycle.LiveData;

import java.util.List;

import tech.gsp.nytimessample.Model.Blog;
import tech.gsp.nytimessample.Model.BlogRepository;

public class MostPopularViewModel extends AndroidViewModel
{
    private BlogRepository mostPopularRepository;

    public MostPopularViewModel(@NonNull Application application) {
        super(application);
        mostPopularRepository = new BlogRepository(application);
    }

    public LiveData<List<Blog>> getAllBlog() {
        return mostPopularRepository.getMutableLiveData();
    }


}
