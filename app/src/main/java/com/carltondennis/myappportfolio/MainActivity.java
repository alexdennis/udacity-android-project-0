package com.carltondennis.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button spotifyStreamerButton;
    private Button scoresAppButton;
    private Button libraryAppButton;
    private Button buildItBiggerButton;
    private Button xyzReaderButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spotifyStreamerButton = (Button) findViewById(R.id.spotify_streamer_button);
        scoresAppButton = (Button) findViewById(R.id.scores_app_button);
        libraryAppButton = (Button) findViewById(R.id.library_app_button);
        buildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        xyzReaderButton = (Button) findViewById(R.id.xyz_reader_button);
        capstoneButton = (Button) findViewById(R.id.capstone_button);

        setupButton(spotifyStreamerButton, R.string.spotify_streamer);
        setupButton(scoresAppButton, R.string.scores_app);
        setupButton(libraryAppButton, R.string.library_app);
        setupButton(buildItBiggerButton, R.string.build_it_bigger);
        setupButton(xyzReaderButton, R.string.xyz_reader);
        setupButton(capstoneButton, R.string.capstone);
    }

    private void setupButton(Button button, final int stringResource) {
        final String message = getString(R.string.button_message, getString(stringResource));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                (Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT)).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
