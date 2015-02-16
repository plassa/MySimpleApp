package com.ich.plassa.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class SimpleDisplayActivity extends ActionBarActivity {

    // EditText field
    private EditText etWords;  // currently null
    // private <type> <id>;
    private TextView tvLabel;  // null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // creates the Layout in memory
        setContentView(R.layout.activity_simple_display);  // associates the java with the XML
        // Views are crested in teh layout
        // Find reference to those views
        etWords = (EditText) findViewById(R.id.etWords);
        // <id> = (<type>) findViewById(R.id.<id>);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_simple_display, menu);
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
    // Fired when the button is clicked
    public void onSubmit(View view) {
        // Get the value from the text field (whatever was typed into the text field)
        String fieldValue = etWords.getText().toString();
        // Set the value into the label (TextView)
        tvLabel.setText(fieldValue);
        // Display the value as a click alert
        Toast.makeText(this, fieldValue, Toast.LENGTH_SHORT).show();
    }
}
