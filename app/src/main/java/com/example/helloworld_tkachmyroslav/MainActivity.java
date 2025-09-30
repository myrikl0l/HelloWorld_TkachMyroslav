package com.example.helloworld_tkachmyroslav;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView DemoLabel; // - global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.DemoLabel = findViewById(R.id.DemoLabel);
        Button changeColor = findViewById(R.id.changeColorTextClick);
        Button changeBackColor = findViewById(R.id.changeBackColorClick);

        changeColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DemoLabel.setTextColor(Color.BLUE);
            }


        });
        changeBackColor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DemoLabel.setBackgroundColor(Color.RED);
            }


        });


        //just some text
    }

    public void ChangeText(View view) {
        //TextView DemoLabel =findViewById(R.id.DemoLabel);
        DemoLabel.setText("Hello! (Text was Changed)");
    }




    public void ChangeColor(View view) {

    }
}