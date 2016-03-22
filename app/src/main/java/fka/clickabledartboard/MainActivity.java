package fka.clickabledartboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 * Created by FKA on 21.03.2016.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dartboard dartboard = new Dartboard(this);
        setContentView(dartboard);
    }

}
