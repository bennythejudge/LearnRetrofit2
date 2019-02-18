package android.benedetto.com.learnretrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostApi {
        String BASE_URL = "https://jsonplaceholder.typicode.com";
//    String BASE_URL = "https://app.sysdigcloud.com/api/events";

    @GET("posts")
    Call<List<Post>> getPosts();
}
