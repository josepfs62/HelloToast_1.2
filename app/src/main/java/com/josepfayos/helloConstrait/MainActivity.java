package com.josepfayos.helloConstrait;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public int i=0;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView ViewContador = (TextView)findViewById(R.id.show_count);

        View sumar = findViewById(R.id.count);
        sumar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int pulsar = motionEvent.getAction();
                switch (pulsar){
                    case (MotionEvent.ACTION_DOWN):
                        i++;
                        ViewContador.setText(String.valueOf(i));
                        return true;
                    default:
                        return false;
                }
            }
            
        });
        View toast = findViewById(R.id.button_toast);
        toast.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int pulsar = motionEvent.getAction();
                switch (pulsar){
                    case (MotionEvent.ACTION_DOWN):
                        Toast.makeText(getApplicationContext(), "El número es:" + i, Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}