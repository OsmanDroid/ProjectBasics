package osmandroid.basictools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import osmandroid.project_basics.Task;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button2);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Task.FollowOnTwitter(MainActivity.this,"","");


            }
        });

    }
}
