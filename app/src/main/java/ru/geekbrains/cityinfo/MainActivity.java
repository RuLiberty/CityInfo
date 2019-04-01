package ru.geekbrains.cityinfo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

//Главная активити
public class MainActivity extends Activity implements PublishGetter {

    private Publisher publisher = new Publisher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        publisher.subscribe((CoatOfArmsFragment)getFragmentManager().findFragmentById(R.id.coat_of_arms));
    }

    @Override
    protected void onStop() {
        super.onStop();
        publisher.unsubscribeAll();
    }

    @Override
    public Publisher getPublisher() {
        return publisher;
    }
}
