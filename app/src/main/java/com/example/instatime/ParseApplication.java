package com.example.instatime;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("oKNSQ0n0QMRAxwPl8jaoGq9IqXdq3ixMaVuP6urt")
                .clientKey("xGaw51k6LnJS3l5kzpdiAKucBYrzeG7IKEtVwlMR")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }

}
