package com.example.secondapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class DialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialogs);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Dialogs");
    }

    public void datePicker(View view) {
        MaterialDatePicker.Builder datePicker = MaterialDatePicker.Builder.datePicker();
        datePicker.setTitleText("Select date");
        MaterialDatePicker builder = datePicker.build();
        builder.show(getSupportFragmentManager(), "tag");
    }

    public void simpleDialog(View view) {
        String[] items = new String[]{"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

        MaterialAlertDialogBuilder dialogBuilder = new MaterialAlertDialogBuilder(this);
        dialogBuilder.setTitle("Title");
        dialogBuilder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {

                Log.e("simpleDialog", items[which] + " is clicked");
            }
        });
        dialogBuilder.show();
    }

    public void singleChoiceDialog(View view) {
        String[] items = new String[]{"Item 1", "Item 2", "Item 3"};

        MaterialAlertDialogBuilder dialogBuilder = new MaterialAlertDialogBuilder(this);
        dialogBuilder.setTitle("Title");
        dialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Log.e("singleChoiceDialog", "Cancel is clicked");
            }
        });
        dialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Log.e("singleChoiceDialog", "OK is clicked");
            }
        });
        dialogBuilder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Log.e("singleChoiceDialog", items[which] + " is clicked");
            }
        });
        dialogBuilder.show();
    }

    public void alertDialog(View view) {
        MaterialAlertDialogBuilder dialogBuilder = new MaterialAlertDialogBuilder(this);
        dialogBuilder.setTitle("Title");
        dialogBuilder.setMessage("Supporting text");
        dialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Log.e("simpleDialog", "Cancel is clicked");
                dialogInterface.dismiss();
            }
        });
        dialogBuilder.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Log.e("simpleDialog", "Decline is clicked");
            }
        });
        dialogBuilder.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Log.e("simpleDialog", "Accept is clicked");
            }
        });
        dialogBuilder.show();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


    public void buttenToTabActiviOnCklick(View view) {
        Intent intent = new Intent(this, TabActivity.class);
        startActivity(intent);
    }
}