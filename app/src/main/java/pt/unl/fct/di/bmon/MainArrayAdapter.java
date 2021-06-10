package pt.unl.fct.di.bmon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MainArrayAdapter extends ArrayAdapter<Bonsai> {

    public MainArrayAdapter(Context context, ArrayList<Bonsai> bonsaiArrayList){
        super(context, R.layout.list_item, bonsaiArrayList);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        Bonsai b = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView image = convertView.findViewById(R.id.profile_pic);
        TextView bonsaiName = convertView.findViewById(R.id.bonsaiName);

        image.setImageResource(b.imageId);
        bonsaiName.setText(b.name);

        return super.getView(position, convertView, parent);
    }
}
