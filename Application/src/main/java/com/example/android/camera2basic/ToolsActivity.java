package com.example.android.camera2basic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Switch;

public class ToolsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);


        ImageButton camera_back = (ImageButton) findViewById(R.id.camera_back);
        final Switch switch_take_one = (Switch) findViewById(R.id.startOne);


        camera_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch_take_one.isChecked())
                    Camera2BasicFragment.start_one = true;
                else
                    Camera2BasicFragment.start_one = false;
                finish();
            }
        });


    }
}
