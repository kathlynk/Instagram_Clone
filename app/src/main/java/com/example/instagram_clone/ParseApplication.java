package com.example.instagram_clone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("ri3xdMwwIWXBRS8Cc4qtjaBRItc8RkXup032OOKf")
                .clientKey("ReTAtNwekKO6WMcco7U5L8Id9t5LCPqjuob1tgNB")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
