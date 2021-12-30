package au.edu.federation.coutcouter2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    private String message1,message2;
    private TextView textView1,textView2;
    private Button button;
    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        message1 = intent.getStringExtra("message1");
        message2 = intent.getStringExtra("message2");

        //把布局文件中的文本框和textview链接起来
        textView1 = (TextView) findViewById(R.id.text1);
        //在 textview 中显示出来 message textView.setText(message);
        textView1.setText(message1);
        textView2 = (TextView) findViewById(R.id.text2);
        //在 textview 中显示出来 message textView.setText(message);
        textView2.setText(message2);

        TextView scoreView1 = findViewById(R.id.score1);
        TextView scoreView2 = findViewById(R.id.score2);

        if(savedInstanceState!=null){
            score1 = savedInstanceState.getInt("score1");
            score2 = savedInstanceState.getInt("score2");
            scoreView1.setText(String.valueOf(score1));
            scoreView2.setText(String.valueOf(score2));
        }

        button = findViewById(R.id.button8);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle1 = new Bundle();
                bundle1.putInt("score1", score1);
                bundle1.putInt("score2", score2);

                Intent intent1 = new Intent();
                intent1.putExtras(bundle1);
                intent1.putExtra("message1", message1);
                intent1.putExtra("message2", message2);
                intent1.setClass(MainActivity2.this,MainActivity3.class);
                startActivity(intent1);
            }
        });
    }

    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);

        savedInstanceState.putInt("score1",score1);
        savedInstanceState.putInt("score2",score2);
    }

    public void button7(View v) {
        score1 = 0;
        score2 = 0;
        TeamA(score1);
        TeamB(score2);
    }

    public void TeamA(int score) {
        TextView scoreView1 = findViewById(R.id.score1);
        scoreView1.setText(String.valueOf(score));
    }

    public void button1(View v) {
        score1 += 3;
        TeamA(score1);
    }

    public void button2(View v) {
        score1 += 2;
        TeamA(score1);
    }

    public void button3(View v) {
        score1 += 1;
        TeamA(score1);
    }

    public void TeamB(int score) {
        TextView scoreView2 = findViewById(R.id.score2);
        scoreView2.setText(String.valueOf(score));
    }

    public void button4(View v) {
        score2 += 3;
        TeamB(score2);
    }

    public void button5(View v) {
        score2 += 2;
        TeamB(score2);
    }

    public void button6(View v) {
        score2 += 1;
        TeamB(score2);
    }
}