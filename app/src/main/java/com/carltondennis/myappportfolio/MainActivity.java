package com.carltondennis.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    private Button mSpotifyStreamerButton;
    private Button mScoresAppButton;
    private Button mLibraryAppButton;
    private Button mBuildItBiggerButton;
    private Button mXyzReaderButton;
    private Button mCapstoneButton;
    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSpotifyStreamerButton = (Button) findViewById(R.id.spotify_streamer_button);
        mScoresAppButton = (Button) findViewById(R.id.scores_app_button);
        mLibraryAppButton = (Button) findViewById(R.id.library_app_button);
        mBuildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        mXyzReaderButton = (Button) findViewById(R.id.xyz_reader_button);
        mCapstoneButton = (Button) findViewById(R.id.capstone_button);

        setupButton(mSpotifyStreamerButton, R.string.spotify_streamer);
        setupButton(mScoresAppButton, R.string.scores_app);
        setupButton(mLibraryAppButton, R.string.library_app);
        setupButton(mBuildItBiggerButton, R.string.build_it_bigger);
        setupButton(mXyzReaderButton, R.string.xyz_reader);
        setupButton(mCapstoneButton, R.string.capstone);
    }

    private void setupButton(Button button, final int stringResource) {
        final String message = getString(R.string.button_message, getString(stringResource));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mAppToast != null) {
                    mAppToast.cancel();
                }

                mAppToast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
                mAppToast.show();
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
