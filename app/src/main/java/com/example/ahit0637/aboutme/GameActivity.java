package com.example.ahit0637.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class GameActivity extends AppCompatActivity
{
    private Button next2;
    private Button previous2;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        next2 = (Button) findViewById(R.id.Next2);
        previous2 = (Button) findViewById(R.id.Previous2);

        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_game, menu);
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
        next2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), SpaceActivity.class);
                startActivityForResult(myIntent, 0);
                //previous screen
                //Intent myIntent = new Intent();
                //setResult(RESULT_OK, myIntent);
                //finish();
            }


        });
        previous2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), Me.class);
                startActivityForResult(myIntent, 0);
                //previous screen
                //Intent myIntent = new Intent();
                //setResult(RESULT_OK, myIntent);
                //finish();
            }


        });
    }
}
