package com.example.yls.wuziqigame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private Wuziqipanel wuziqipanel;
    private Button btn_CreateGame;
    private TextView txt_Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wuziqipanel = (Wuziqipanel) findViewById(R.id.View_wuziqi);
        btn_CreateGame = (Button) findViewById(R.id.btn_CreateGame);
        btn_CreateGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wuziqipanel.start();
            }
        });
        txt_Result = (TextView) findViewById(R.id.txt_Result);
    }
}
