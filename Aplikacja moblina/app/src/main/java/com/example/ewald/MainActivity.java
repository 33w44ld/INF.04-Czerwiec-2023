package com.example.ewald;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private int obecny = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView1 = findViewById(R.id.rozmiar);
        SeekBar seekBarValue = findViewById(R.id.wartosc);
        TextView textView2 = findViewById(R.id.hello);
        Button btn = findViewById(R.id.btn);

        seekBarValue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView1.setText("Rozmiar: " + progress);
                textView2.setTextSize(progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        });

        String[] hello = {"Dzień dobry", "Good morning", "Buenos dias"};

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (obecny == 3) obecny = 0;
                textView2.setText(hello[obecny]);
                obecny++;
            }
        });
    }
}
