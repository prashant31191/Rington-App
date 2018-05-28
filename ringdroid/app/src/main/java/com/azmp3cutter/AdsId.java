package com.azmp3cutter;

import java.util.Random;

/**
 * Created by prashant.chovatiya on 3/13/2018.
 */

public class AdsId {
    public static String[] ADS_BNR_1 = {
            "ca-app-pub-4346653435295459/5086489197",
            "ca-app-pub-4346653435295459/7918867795",

            "ca-app-pub-4346653435295459/1566170291",
            "ca-app-pub-4346653435295459/3665720024",

            "ca-app-pub-4346653435295459/5086489197",
            "ca-app-pub-4346653435295459/7918867795",

            "ca-app-pub-4346653435295459/1566170291",
            "ca-app-pub-4346653435295459/3665720024"
    };


    public static String[] ADS_INT_1 = {
            "ca-app-pub-4346653435295459/9439122581",
            "ca-app-pub-4346653435295459/2366733182",
            "ca-app-pub-4346653435295459/9439122581",
            "ca-app-pub-4346653435295459/2366733182"
    };


    public static String getRandomBanner() {


        Random r = new Random();
        int randomNumber = r.nextInt(ADS_BNR_1.length);

        return ADS_BNR_1[randomNumber];
    }

    public static String getRandomInt() {

        Random r = new Random();
        int randomNumber = r.nextInt(ADS_INT_1.length);

        return ADS_INT_1[randomNumber];
    }
}
