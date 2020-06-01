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
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Có tin thông báo mới")
                                .setMessage("Có phiên bản cập nhật")
                                .setIcon(R.mipmap.ic_launcher)
                                .setCancelable(false)
                                .setPositiveButton("Có", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, "Nút có", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setNegativeButton("Không", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, "Nút không", Toast.LENGTH_SHORT).show();
                                    }
                                })
                                .setNeutralButton("Hủy", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Toast.makeText(MainActivity.this, "Nút hủy", Toast.LENGTH_SHORT).show();
                                    }
                                });
                builder.show();

            }
        });
    }
}
