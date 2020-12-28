package com.anonimodiabo.seekbarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SeekBar seekBar;
    Button btnAdd, btnMinus;
    TextView value;
   public static String seekbarvalue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = findViewById(R.id.seekbar);
        value = findViewById(R.id.value);
        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                value.setText(progress + "/100");
                seekbarvalue = String.valueOf(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "SeekBar Value: " + seekbarvalue, Toast.LENGTH_SHORT).show();

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = seekBar.getProgress();
                for (int i = 0; i <= 1; i++) {
                    seekBar.setProgress(index + 1);

                }
                //jugaad
                seekbarvalue = String.valueOf(index+1);
                Toast.makeText(MainActivity.this, "SeekBar Value: " + seekbarvalue, Toast.LENGTH_SHORT).show();

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int index = seekBar.getProgress();
                for (int i = 0; i <= 1; i++) {
                    seekBar.setProgress(index - 1);
                }
                //jugaad
                seekbarvalue = String.valueOf(index-1);
                Toast.makeText(MainActivity.this, "SeekBar Value: " + seekbarvalue, Toast.LENGTH_SHORT).show();

            }
        });


    }

}
