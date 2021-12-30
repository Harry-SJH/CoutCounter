package au.edu.federation.coutcouter2;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private String message3,message4;
    private TextView text2,text3,score1,score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        Bundle bd= getIntent().getExtras();

        int score1 =bd.getInt("score1");
        int score2 =bd.getInt("score2");

        message3 = intent.getStringExtra("message1");
        message4 = intent.getStringExtra("message2");
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        TextView tvscore1 = (TextView)findViewById(R.id.score1);
        TextView tvscore2 = (TextView)findViewById(R.id.score2);
        text2.setText(message3);
        text3.setText(message4);
        tvscore1.setText(score1+"");
        tvscore2.setText(score2+"");

    }
}