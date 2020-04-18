package com.example.progressbarseekbar25022020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    ProgressBar mProgressBar;
    SeekBar mSeekbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mProgressBar = findViewById(R.id.progressbar);
//
//        CountDownTimer countDownTimer = new CountDownTimer(1000 , 1000) {
//            @Override
//            public void onTick(long l) {
//                if (mProgressBar.getProgress() >= 100){
//                    mProgressBar.setProgress(0);
//                }
//                mProgressBar.setProgress(mProgressBar.getProgress() + 10);
//            }
//
//            @Override
//            public void onFinish() {
//                this.start();
//            }
//        };
//        countDownTimer.start();
        mSeekbar = findViewById(R.id.seekbar);
        mSeekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Toast.makeText(MainActivity.this, i + "", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
