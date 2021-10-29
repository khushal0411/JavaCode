package com.example.task;
import android.os.Handler;
import java.time.LocalTime;

public class Handler  {

    public static void main(String[] args) {
        Handler handler = new Handler();
        final Runnable runnable = new Runnable() {
            public void run() {
                System.out.println(LocalTime.now());
            }
        };
        runnable.run();
        handler.postDelayed(runnable,2000);

    }
}
