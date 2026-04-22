package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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
        NOTE note1 = new NOTE();
        note1.topic = "Lab3";
        note1.content = "Do and sent lab3 before due time";
        note1.createdate = "22/04/2026";
        note1.displaycontent();

        USER user1 = new USER();
        user1.name = "Krittapong";
        user1.editdate = "22/04/2026";
        user1.createdate = "22/04/2026";
        user1.write();

    }
}
