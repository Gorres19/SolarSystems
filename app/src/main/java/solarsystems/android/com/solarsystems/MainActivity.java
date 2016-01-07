package solarsystems.android.com.solarsystems;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Spinner Planets;
    private ImageView solar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Planets = (Spinner) findViewById(R.id.PlanetSpinner);
        Planets.setOnItemSelectedListener(this);
        addItemsOnPlanets();
        solar = (ImageView) findViewById(R.id.imageView);
    }

    public void addItemsOnPlanets(){
        List<String> list = new ArrayList<String>();
        list.add("Mercury");
        list.add("Venus");
        list.add("Earth");
        list.add("Mars");
        list.add("Jupiter");
        list.add("Saturn");
        list.add("Uranus");
        list.add("Neptune");

        // Mao ni ang mka pa kita sa list og images
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Planets.setAdapter(dataAdapter);

    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        int position = Planets.getSelectedItemPosition();

        switch (position){
            case 0:
                solar.setImageResource(R.drawable.mercury);
                break;
            case 1:
                solar.setImageResource(R.drawable.venus);
                break;
            case 2:
                solar.setImageResource(R.drawable.earth);
                break;
            case 3:
                solar.setImageResource(R.drawable.mars);
                break;
            case 4:
                solar.setImageResource(R.drawable.jupiter);
                break;
            case 5:
                solar.setImageResource(R.drawable.saturn);
                break;
            case 6:
                solar.setImageResource(R.drawable.uranus);
                break;
            case 7:
                solar.setImageResource(R.drawable.neptune);
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}