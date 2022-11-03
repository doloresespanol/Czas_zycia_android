package com.example.czaszycia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int licznik;
    TextView licznikTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Czas_życia","Wywołana metoda onCreate()");
        setContentView(R.layout.activity_main);
        licznikTextView=findViewById(R.id.licznikTekst);
        if(savedInstanceState!=null){
            licznik = savedInstanceState.getInt("Licznik",0);
            licznikTextView.setText(String.valueOf(licznik));

        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Czas_życia","Wywołana metoda onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Czas_życia","Wywołana metoda onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Czas_życia","Wywołana metoda onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Czas_życia","Wywołana metoda onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Czas_życia","Wywołana metoda onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Czas_życia","Wywołana metoda onRestart()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Czas_życia","Wywołana metoda onSaveInstanceState()");
        outState.putInt("Licznik",licznik);
    }

    public void zmniejsz(View view) {
        licznik--;
        licznikTextView.setText(String.valueOf(licznik));
    }

    public void zwieksz(View view) {
        licznik++;
        licznikTextView.setText(String.valueOf(licznik));
    }
}