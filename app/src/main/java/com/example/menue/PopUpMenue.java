package com.example.menue;

import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PopUpMenue extends AppCompatActivity {

    Button popup;
    PopupMenu popupMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up_menue);
        popup = findViewById(R.id.button_popup);
        //popupmenue howe bas tekbous 3ala aye view kabse wa7de mesh kabse tawele fa byetl3lk menue
        //bta3ml opbject meno 2awl parameter context tene parameter l l view le badak bas tokbous 3lee yetl3 l menue 7edo

        popupMenu=new PopupMenu(this,popup);

//        popupMenu.getMenuInflater():btjblak object mn l menue inflater 3ashen ta3ml inflate lal menue ta3elak 3lee
        //ba3den bt3ml inflate lal menue le ana 3mlto 3leee
        //inflater badna n7ot l menue le 3mlto b2alb l popupmenue
        //2awl parameter howe l menue le 2ana 3mlto tene parameter howe diifult menue kona ne7na abl parameter ta3el l activity bel optionmenue,context keen yeb3tle le mneue b function w ana 7oto
        //bas hala2 ana bade ta3el l popupmneu diffult ta3el l popupmenue popupMenu.getMenu()
        //ma ana fo2 3mlt popup menue object w heed l pop menue elo menue fa ana bade 7ot l meneue ta3ele b2albo la heed l menue mesh b2alb l action bar
        popupMenu.getMenuInflater().inflate(R.menu.option_menue,popupMenu.getMenu());
        /*or
        MenuInflater menuInflater=popupMenu.getMenuInflater();
        menuInflater.inflate(R.menu.option_menue,popupMenu.getMenu());*/
        popup.setOnClickListener(v->{
            //houn eno bas tekbous 3ala button fa btlae3 l menue
            popupMenu.show();
        });

        //iza bade etfe3l ma3o lal popupmenue mn 5elel method  popupMenu.setOnMenuItemClickListener btrej3 true iza kabst 3lee w btrej3 false iza la2

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.menue_notification) {
                    Toast.makeText(getBaseContext(), "notification", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (item.getItemId()==R.id.menue_setting) {
                    Toast.makeText(getBaseContext(), "setting", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (item.getItemId()==R.id.menue_about) {
                    Toast.makeText(getBaseContext(), "about", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if (item.getItemId()==R.id.blutoth) {
                    Toast.makeText(getBaseContext(), "bluttoth", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;


            }
        });



    }

}