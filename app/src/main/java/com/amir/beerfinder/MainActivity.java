package com.amir.beerfinder;

import android.app.Activity;
import android.os.Bundle;
import android.util.StringBuilderPrinter;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSelectedBeer(View view){
        Spinner colors = (Spinner) findViewById(R.id.colors);
        TextView tender = (TextView) findViewById(R.id.tender);
        String beerId = String.valueOf(colors.getSelectedItem());
        List<String> drinkList = Cutter.getBeerType(beerId);
        StringBuilder builder = new StringBuilder();
        for (String b: drinkList) {
            builder.append(b).append("\n");
        }
        tender.setText(builder);

    }
}
