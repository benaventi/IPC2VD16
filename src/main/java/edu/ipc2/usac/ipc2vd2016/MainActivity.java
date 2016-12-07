package edu.ipc2.usac.ipc2vd2016;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private boolean textSet =false;
    public void onClick1(View v) {
        TextView text1 = (TextView) findViewById(R.id.text1);
        if (!textSet){
            text1.setText("Bonjour tout le monde");
        }else {text1.setText("");}


    }

    public void onClick2(View v){
        this.finishActivity(1);
    }

    public void onClick3(View v){
        //This will whos a toast
        Toast.makeText(this,"This is a Toast", Toast.LENGTH_LONG );
    }
    public void onClick4(View v){
        //This will whos a toast
        TextView text1 = (TextView) findViewById(R.id.text1);
        text1.setText("Good bye");

    }
}
