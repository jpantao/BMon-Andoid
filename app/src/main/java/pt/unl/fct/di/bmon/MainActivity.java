package pt.unl.fct.di.bmon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    FloatingActionButton addFloatingActionButton;

    DatabaseReference rootReference = FirebaseDatabase.getInstance().getReference();
    //DatabaseReference treesReference = rootReference.child();


    ArrayList<Bonsai> trees = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.main_listView);
        addFloatingActionButton = findViewById(R.id.main_add_floatingActionButton);

        MainArrayAdapter adapter = new MainArrayAdapter(this, trees);
        listView.setAdapter(adapter);

        addFloatingActionButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switchActivities();
            }
        });
    }


    protected void switchActivities() {
        Intent switchActivityIntent = new Intent(this, BonsaiMenuActivity.class);
        startActivity(switchActivityIntent);
    }
}