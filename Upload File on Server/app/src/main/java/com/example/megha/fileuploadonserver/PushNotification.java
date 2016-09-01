package com.example.megha.fileuploadonserver;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by megha on 31/08/16.
 */
public class PushNotification extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //Initializing firebase
        Firebase.setAndroidContext(getApplicationContext());
    }
}
