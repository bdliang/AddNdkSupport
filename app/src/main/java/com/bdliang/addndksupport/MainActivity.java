package com.bdliang.addndksupport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.bdliang.mylib.MyLib;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.tv_info);
        StringBuilder builder = new StringBuilder("The Sum is ::")
                .append(new MyLib().add(2, 3));
        textView.setText(builder.toString());
    }
}
