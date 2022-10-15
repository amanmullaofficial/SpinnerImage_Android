package in.codingtimes.spinner_image_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView);

        String[] arraySpinner = getResources().getStringArray(R.array.images);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,arraySpinner);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("UseCompatLoadingForDrawables")
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i)
                {
                    case 0:{
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.mrrobot));
                        break;
                    }
                    case 1:{
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.lucifer));
                        break;
                    }
                    case 2:{
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.paulwalker));
                        break;
                    }
                    case 3:{
                        imageView.setImageDrawable(getResources().getDrawable(R.drawable.supra));
                        break;
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}