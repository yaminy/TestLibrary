package com.kasra.examplelibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.kasra.testlibrary.YaminLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,YaminLibrary.arithmeticMean(2,4)+" ",Toast.LENGTH_LONG).show();
    }
}
