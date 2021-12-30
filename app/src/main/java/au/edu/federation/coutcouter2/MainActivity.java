package au.edu.federation.coutcouter2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView editText1,editText2;
    private String message1;
    private String message2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        //声明一个编辑框和布局文件中id为edit_message的编辑框链接起来。
        editText1 = (EditText) findViewById(R.id.edit1);
        editText2 = (EditText) findViewById(R.id.edit2);
        //把编辑框获取的文本赋值给String类型的message
        message1 = editText1.getText().toString();
        message2 = editText2.getText().toString();

        //给message起一个名字，并传给另一个activity
        intent.putExtra("message1", message1);
        intent.putExtra("message2", message2);
        //启动意图
        startActivity(intent);
    }
}