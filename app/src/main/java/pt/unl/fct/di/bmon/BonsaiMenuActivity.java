package pt.unl.fct.di.bmon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BonsaiMenuActivity extends AppCompatActivity {

    Button addBonsaiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonsai_menu2);

        addBonsaiButton = findViewById(R.id.addButton);

        addBonsaiButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                int tempLow = Integer.parseInt(((TextView)findViewById(R.id.tempLowField)).getText().toString());
                int tempHigh = Integer.parseInt(((TextView)findViewById(R.id.tempHighField)).getText().toString());
                int humLow = Integer.parseInt(((TextView)findViewById(R.id.humLowField)).getText().toString());
                int humHigh = Integer.parseInt(((TextView)findViewById(R.id.humHighField)).getText().toString());
                int lumLow = Integer.parseInt(((TextView)findViewById(R.id.lumLowField)).getText().toString());
                int lumHigh = Integer.parseInt(((TextView)findViewById(R.id.lumHighField)).getText().toString());
                int moistLow = Integer.parseInt(((TextView)findViewById(R.id.moistLowField)).getText().toString());
                int moistHigh = Integer.parseInt(((TextView)findViewById(R.id.moistHighField)).getText().toString());

                // TODO: Talk to Firebase to create new bonsai instance

            }
        });
    }


}