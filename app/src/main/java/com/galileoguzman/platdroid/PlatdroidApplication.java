package com.galileoguzman.platdroid;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by galileoguzman on 23/06/15.
 */
public class PlatdroidApplication extends Application{

    public void onCreate() {

        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "xBCjEXeDGNhbhgDMOoDcd8cWvzWAH2mfS23oBrhX", "tsLtyHtyjPHW3mJvvSrKyw9ibevskxlhc3945Bms");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }
}
