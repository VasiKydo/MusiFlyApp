package gr.uth.musifly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //To koumpi me to addNewSong
    public void handleClick1(View view) {
        Intent intent = new Intent (this, AddNewSong.class);
        startActivity(intent);
    }

   //To koumpi me to addNewPlaylist
    public void handleClick2(View view) {
        Intent intent = new Intent (this, AddNewPlaylist.class);
        startActivity(intent);

    }
}
