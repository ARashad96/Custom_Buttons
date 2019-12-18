package com.arashad96.andoriddeveloperadvancedkit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Custom_ButtonsandListview extends AppCompatActivity {
    Button github;
    Button info;
    Button ovalbtn;
    Button rectbtn;
    ListView list;
    ArrayList customlist = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_custom__buttons);

        list = findViewById(R.id.customlist);

        customlist.add("1");
        customlist.add("2");
        customlist.add("3");
        customlist.add("4");
        customlist.add("5");
        customlist.add("6");
        customlist.add("7");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.listview_text, customlist);
        list.setAdapter(adapter);

        ovalbtn = findViewById(R.id.ovalbtn);
        ovalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Custom_ButtonsandListview.this, "I am oval button", Toast.LENGTH_SHORT).show();
            }
        });
        rectbtn = findViewById(R.id.rectbtn);
        rectbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Custom_ButtonsandListview.this, "I am Rectangular button", Toast.LENGTH_SHORT).show();
            }
        });
        github = findViewById(R.id.github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ARashad96/Custom_ButtonsandListview"));
                startActivity(intent);
            }
        });
        info = findViewById(R.id.info);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new android.app.AlertDialog.Builder(Custom_ButtonsandListview.this)
                        .setIcon(R.drawable.profile)
                        .setTitle("App info")
                        .setMessage("This app is showing how to create custom buttons with variety of layouts using buttons, ,toast, textview, xml and linearlayout.")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        })
                        .show();
            }
        });
    }
}
