package com.akristic.www.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums);

        TextView mTracksTextView = (TextView) findViewById(R.id.main_text_button_tracks);
        TextView mPlayListTextView = (TextView) findViewById(R.id.main_text_button_playlist);
        TextView mStoreTextView = (TextView) findViewById(R.id.main_text_button_store);
        /*
          Set onClick events for all Activities
         */
        mTracksTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent (AlbumsActivity.this, TracksActivity.class);
                startActivity(intent);
            }
        });
        mPlayListTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, PlayListsActivity.class);
                startActivity(intent);
            }
        });
        mStoreTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlbumsActivity.this, StoreActivity.class);
                startActivity(intent);
            }
        });
    }
}
