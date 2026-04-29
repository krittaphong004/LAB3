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
        TEXTNOTE note = new TEXTNOTE();
        note.topic = "My Note";
        note.content = "This is my note.";
        note.displaycontent();

        CHECKLIST checklist = new CHECKLIST();
        checklist.topic = "My Checklist";
        checklist.items.add("Item 1");
        checklist.items.add("Item 2");
        checklist.items.add("Item 3");
        checklist.displaycontent();

        USERVIP user = new USERVIP();
        user.name = "John Doe";
        user.viplv = "Gold";
        user.discountRate = 0.1;
        user.editdate = "2022-01-01";
        user.createdate = "2022-01-01";
        user.print();

    }
}
