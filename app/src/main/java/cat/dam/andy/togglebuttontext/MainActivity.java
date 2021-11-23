package cat.dam.andy.togglebuttontext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView TextIpsum = (TextView) findViewById(R.id.textIpsum);
        Switch CanviarMode = (Switch) findViewById(R.id.DiaNit);
        ToggleButton TextNegrita = (ToggleButton) findViewById(R.id.textEnNegrita);
        RelativeLayout mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);

        //Switch per canviar al mode nit al layout
        CanviarMode.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    TextIpsum.setTextColor(Color.WHITE);
                    TextIpsum.setBackgroundColor(Color.BLACK);
                    CanviarMode.setTextColor(Color.WHITE);
                    mainLayout.setBackgroundColor(Color.BLACK);
                }else{
                    TextIpsum.setTextColor(Color.BLACK);
                    TextIpsum.setBackgroundColor(Color.WHITE);
                    CanviarMode.setTextColor(Color.BLACK);
                    mainLayout.setBackgroundColor(Color.WHITE);
                }

            }
        });

        //ToggleButton en el que convertim el text en negreta
        TextNegrita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextIpsum.setTypeface(Typeface.DEFAULT_BOLD);
            }
        });

    }
}