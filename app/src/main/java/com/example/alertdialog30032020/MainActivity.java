package com.example.alertdialog30032020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mBtnAlertDialog,mBtnCustomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnAlertDialog = findViewById(R.id.buttonShowDialog);
        mBtnCustomDialog = findViewById(R.id.buttonDialog);

        mBtnAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String[] arrayAnimals = {"Meo","Ca","Voi","Heo","Ngua"};
                boolean[] arrayChoose = {false,false,false,false,false};
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(MainActivity.this)
                                .setTitle("Có tin thông báo mới")
                                .setIcon(R.mipmap.ic_launcher)
                                .setCancelable(false)
                                .setMultiChoiceItems(arrayAnimals, arrayChoose, new DialogInterface.OnMultiChoiceClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                                        if (isChecked){
                                            Toast.makeText(MainActivity.this, "Đã chọn", Toast.LENGTH_SHORT).show();
                                        }else{
                                            Toast.makeText(MainActivity.this, "Bỏ chọn", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });


                builder.show();

            }
        });

        mBtnCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialog_connection);

                dialog.show();
            }
        });
    }
}
