package com.example.lessons13menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // ================ MENU begin ================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("File");
        menu.add("View");
        menu.add("Options");
        menu.add("About");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }
    // ================ MENU end ================

    // Определять нажатый пункт меню по тексту – это не самый лучший вариант.
    // Далее будем делать это по ID. Но для этого надо немного по другому создавать меню.
}