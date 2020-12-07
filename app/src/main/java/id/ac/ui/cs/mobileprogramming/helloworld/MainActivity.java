package id.ac.ui.cs.mobileprogramming.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import id.ac.ui.cs.mobileprogramming.helloworld.R;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("cpp_code");
    }

    public native String simplefun(String text);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method

        Button change = findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView text = findViewById(R.id.text);
                EditText form = findViewById(R.id.form);
                text.setText(simplefun(form.getText().toString()));
            }
        });



    }




}