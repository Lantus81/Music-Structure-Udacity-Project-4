package com.akristic.www.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        TextView mTracksTextView = (TextView) findViewById(R.id.main_text_button_tracks);
        TextView mAlbumsTextView = (TextView) findViewById(R.id.main_text_button_albums);
        TextView mPlayListTextView = (TextView) findViewById(R.id.main_text_button_playlist);
        /*
          Set onClick events for all Activities
         */
        mTracksTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StoreActivity.this, TracksActivity.class);
                startActivity(intent);
            }
        });
        mAlbumsTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StoreActivity.this, AlbumsActivity.class);
                startActivity(intent);
            }
        });
        mPlayListTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (StoreActivity.this, PlayListsActivity.class);
                startActivity(intent);
            }
        });
    }
}
