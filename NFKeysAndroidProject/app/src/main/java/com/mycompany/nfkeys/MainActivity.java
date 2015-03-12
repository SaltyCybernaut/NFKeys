package com.mycompany.nfkeys;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.nfc.NfcAdapter;
import android.content.Intent;
import android.provider.Settings;

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

    public void enableNFC(View view)
    {
        if (!NfcAdapter.getDefaultAdapter(this).isEnabled())
            startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS));

        else
        {
            AlertDialog.Builder message = new AlertDialog.Builder(this);
            message.setMessage("NFC is already enabled.");
            AlertDialog alert = message.create();
            alert.show();
        }
    }
}
