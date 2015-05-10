package com.tutorial.jolpai.custom_layout_rtl;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.TextView;


public class MainActivity extends Activity {
    private R2L customLayout;
    private Typeface typeface;
    private String msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customLayout = (R2L) this.findViewById(R.id.cl);
        typeface = Typeface.createFromAsset(getAssets(), "font/TRADO.TTF");

        msg = "Hello My Name Is Tanim Reja I am Android Developer. Thank You Sir.. What Can I Do For You? Oh Thanks .. You Did Great Job."
                + "  My Name Is Tanim Reja I am Android Developer. Thank You Sir.. What Can I Do For You? Oh Thanks";

        String[] arrayWhitespace = msg.split("\\s+");
        String name;
        int len = arrayWhitespace.length;

        for (int i = 0; i < len; i++) {

            TextView normalShapeTextView = new TextView(this);
            TextView emptyTextView = new TextView(this);
            customLayout.addView(normalShapeTextView);
            normalShapeTextView.setText(arrayWhitespace[i]);
            normalShapeTextView.setTypeface(typeface, Typeface.NORMAL);
            normalShapeTextView.setTextSize(28);
            normalShapeTextView.setTextColor(Color.RED);

            if (i != arrayWhitespace.length - 1) {
                customLayout.addView(emptyTextView);
                emptyTextView.setText(" ");
                emptyTextView.setTextSize(20);
                emptyTextView.setTextColor(Color.GREEN);
            }
        }

    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
