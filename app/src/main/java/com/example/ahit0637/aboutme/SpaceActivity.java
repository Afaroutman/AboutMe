package com.example.ahit0637.aboutme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SpaceActivity extends AppCompatActivity
{
    private Button next3;
    private Button previous3;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_space);

        next3 = (Button) findViewById(R.id.thirdButton);
        previous3 = (Button) findViewById(R.id.Previous3);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_space, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void setupListeners()
    {
        next3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), FamilyActivity.class);
                startActivityForResult(myIntent, 0);
                //previous screen
                //Intent myIntent = new Intent();
                //setResult(RESULT_OK, myIntent);
                //finish();
            }


        });
        previous3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), GameActivity.class);
                startActivityForResult(myIntent, 0);
                //previous screen
                //Intent myIntent = new Intent();
                //setResult(RESULT_OK, myIntent);
                //finish();
            }


        });
    }
}
