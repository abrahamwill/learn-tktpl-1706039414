package id.ac.ui.cs.mobileprogramming.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.ui.cs.mobileprogramming.helloworld.R;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("cpp_code");
    }

    public native String simplefun();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView text = findViewById(R.id.text);
        text.setText(simplefun());

    }




}