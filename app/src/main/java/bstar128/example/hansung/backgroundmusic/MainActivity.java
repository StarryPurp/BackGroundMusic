package bstar128.example.hansung.backgroundmusic;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Switch switchmusic;
    MediaPlayer musicp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchmusic=(Switch) findViewById(R.id.switch_use);
        musicp=MediaPlayer.create(this,R.raw.reverse);
        switchmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(switchmusic.isChecked()){
                    musicp.start();
                }
                else{
                    musicp.pause();
                }
            }
        });
    }
    @Override
    protected void onStop() {
        super.onStop();
        musicp.stop();
    }
}
