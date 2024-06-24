package com.example.menue;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class Context_Menue extends AppCompatActivity {

    Button press_context_menue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_menue);
        press_context_menue=findViewById(R.id.button_context_menue);
        //ba3den btsjel hay l button 3ala l context mneue beste3ml  method esma   registerForContextMenu(); hay l method bte5od view
        registerForContextMenu(press_context_menue);

    }


    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater=getMenuInflater();
        //ba3den hala2 badak ta3ml inflate lal menue le 3mlto hounek
        // menuInflater.inflate(2awl sha8le l menue le badak ta3mlo inflate fasle tene parameter l menue le badak trakeb 3lee hala2 howe b function l oncrate byeb3tlk l meneue ta3el l activity le howe l action bar ya3ne btjblk hay l method l actionbar w btjeblk l mnue l joweto w btrkeb 3lee heed l mneue le 3mlto enta)
        menuInflater.inflate(R.menu.option_menue,menu);

        //or getMenuInflater().inflate(R.menu.option_menue,menu);
    }


    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.menue_notification) {
            Toast.makeText(this, "notification", Toast.LENGTH_SHORT).show();
            return true;
        } else if (item.getItemId()==R.id.menue_setting) {
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId()==R.id.menue_about) {
            Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if (item.getItemId()==R.id.blutoth) {
            Toast.makeText(this, "bluttoth", Toast.LENGTH_SHORT).show();
            return true;
        }
        return false;

    }

    //bhay tare2a 2enta 3mlt context menue bas ma sajlta 3ala 3onour mo3ayan ne7na 2olna eno l context menue bas ted8at da8ta tawele 3ala 3onour byefta7 3andak menue



}