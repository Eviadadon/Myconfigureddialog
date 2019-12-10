package com.example.myconfigureddialog ;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.myconfigureddialog.MainActivity;
import com.example.myconfigureddialog.R;

public class creditssss extends AppCompatActivity {


    /**
     * return to main activity
     * @param menu
     * @return
     */
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menu) {
        String st = menu.getTitle().toString();
        if ((st.equals("buttons"))) {
            Intent si = new Intent(this, MainActivity.class);
            startActivity(si);
        }


        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditssss);
    }
}