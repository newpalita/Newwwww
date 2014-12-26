package com.example.palita.itsnotthatdifficult;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void doNothing(View v){
        Log.v("MainActivity", "Did nothing lol");
        TextView myTextView = (TextView) findViewById(R.id.text2);
        myTextView.setText("Did Nothing!");
    }

    public void doNothing2(View v){
        EditText myEditText = (EditText) findViewById(R.id.editText1);
        String input = myEditText.getText().toString();

        TextView myTextView = (TextView) findViewById(R.id.text1);
        myTextView.setText(input);
    }
}
