package com.example.alertdialog30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlertDialog = findViewById(R.id.buttonShowDialog);

        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] arrayAnimals = {"Meo","Ca","Voi","Heo","Ngua"};
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Có tin thông báo mới")
                                .setIcon(R.mipmap.ic_launcher)
                                .setCancelable(false)
                                .setSingleChoiceItems(arrayAnimals, -1, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, arrayAnimals[which], Toast.LENGTH_SHORT).show();
                                    }
                                });

                builder.show();

            }
        });
    }
}
