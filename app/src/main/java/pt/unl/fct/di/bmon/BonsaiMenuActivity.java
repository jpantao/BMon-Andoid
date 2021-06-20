package pt.unl.fct.di.bmon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BonsaiMenuActivity extends AppCompatActivity {

    Button addBonsaiButton;
    DatabaseReference mRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bonsai_menu2);

        addBonsaiButton = findViewById(R.id.addButton);

        addBonsaiButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                mRef = FirebaseDatabase.getInstance().getReference();

            }
        });
    }


}