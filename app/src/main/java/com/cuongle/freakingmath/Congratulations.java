package com.cuongle.freakingmath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Congratulations extends AppCompatActivity implements View.OnClickListener {
    TextView text_true,text_false;

    ImageView btn_play_again,btn_play_continue;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congratulations);
        initView();
    }

    private void initView() {


        try {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
            Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
            r.play();
        } catch (Exception e) {
            e.printStackTrace();
        }


        Intent intent = getIntent();
        String soDung = intent.getStringExtra("RESULT_TRUE");
        String soSai = intent.getStringExtra("RESULT_FALSE");

        text_true = findViewById(R.id.text_true);
        text_false = findViewById(R.id.text_false);
        text_true.setText("Số câu đúng: " + soDung);
        text_false.setText("Số câu sai: " + soSai);

        btn_play_again = findViewById(R.id.btn_play_again);
        btn_play_continue = findViewById(R.id.btn_play_continue);
        btn_play_again.setOnClickListener(this);
        btn_play_continue.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        intent = new Intent(this,PlayActivity.class);
        switch (v.getId()){
            case R.id.btn_play_again:
                startActivity(intent);
                finish();

                break;
            case R.id.btn_play_continue:
                startActivity(intent);
                finish();
                break;

            default:
                break;
        }
    }
}
