package com.example.ahit0637.aboutme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Me extends AppCompatActivity
{
    private Button next1;
    private Button previous1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_me);


        next1 = (Button) findViewById(R.id.Next1);
        previous1= (Button) findViewById(R.id.Previous1);


        setupListeners();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_me, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
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
    public void setupListeners()
    {
        next1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View buttonView)
            {
                Intent myIntent = new Intent(buttonView.getContext(), GameActivity.class);

                startActivityForResult(myIntent, 0);

            }


        });
        previous1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View buttonView) {
                Intent myIntent = new Intent(buttonView.getContext(), FutureActivity.class);

                startActivityForResult(myIntent, 0);

            }


        });

    }
}
