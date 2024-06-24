package com.example.menue;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

/*

Menue:ma3neta ka2eme
Menue:3ande majmo3a mn l anwa3 ana 7a rakez 3ala naw3en 2aw tlete

1-2awl nou3 howe l options menue l bekoun mawjoud 3ala l action bar l data le feh ma3 l 3 ponts le fo2 ba3d bel 2edafe lal eshya l mawjoude 3al action bar metl search w 8ayra
so l options menue howe l menue le 5as bel action bar

2-nou3 tene howe l context mnue howe menue met3le2 b context m3yan b seyak mo3ayan ya3ne 3omrak jarbt tokbous da8ta tawele 3ala button 2am tetl3lk menue tawele feha 5eyarat feek tokbous 3ala aye wa7de fehoun 2aw bas tkoun b goggle w tokbous 3ala nous m3ayan da8ta tawele 2am yetl3lk copy text hawde 3ebra 3an context menue

3-nou3 telet l action mode a7yenan b application google btetd8t da8ta tawele 3ala 3osnour 2am byetl3lk shreet ya3ne l action bar berou7 w byeje shreet jdeed b2albo delete,edit...aye she tene

4-nou3 rabe3 l poupup menue

5-nou3 l 5ames dialog kamen

6-nou3 l sedes navigation drawer



2awl sha8le lama ta3ml l menue l 3anaser l b2alb l menue feek ta3mela bel xml w ba3d heek tet3emal ma3a bel java ta3mela inflate ya3ne keef l costume addapter bta3mel tasmem w ba3den bta3ml elo inflate nafs she


first step:resourses->rightclick->newresourcefile type menue->














             */








public class Options_Menue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //ba3d ma 5alsna tasmem l option menue hala2 bade et3emal ma3o code
        //3ande 2 function b life cycle badna net3mel ma3oun 3ashen net3ml ma3 l menue

        //2awl she ana bas kont 2a3ml aye she textview,button kont 2a3ml 5otwteen
        //2awl she na3mel inflate lal 3onsour tene she net7akm feh bel attribute ta3elo


        //l mnue nafs she 5otwten 2awl she na3mlo inflate tene sha8le 2a3ml mo3leje bas et3ml ma3o



        //l bta3ml 3mlyet enshe2 lal options menue heye function b life cycle call back la7ala btestad3a esma  public boolean onCreateOptionsMenu(Menu menu) { mn 5elela ba3ml create lal options menue btrejae3 boolean iza raj3t true ya3ne l option menue na3ml crate ela b naje7 falue ya3ne ma n3ml ela create lal options menue iza kenet false ya3ne l menue mesh 7a tezhar 3andak

    }
    //keef ba3ml inflate keef keen 3ande layoutinflater houn 3ande menueinflater
    //ba3ml object mn l menue inflater:MenuInflater menuInflater
    //w 3ande method jehze btjblak l mnue le b2lab l activity ya3ne object mn lmenueinflater 3ashen ta3ml inflate lal menue ta3elak 3lee  esmagetMenuInflater()
    //getMenuInflater():hayde nafs she ta3et layoutinflater.from....etc bas hay de8re btjblak Menueinflater object
    //getmenueinflater:return menueinflater object which can then inflate your menues
    //bas bel version l jdeede batalo y3arfo variable MenuInflater inflater
    //saro de8re getMenuInflater().inflatate(....)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        //ba3den hala2 badak ta3ml inflate lal menue le 3mlto hounek
        // menuInflater.inflate(2awl sha8le l menue le badak ta3mlo inflate fasle tene parameter l menue le badak trakeb 3lee hala2 howe b function l oncrate byeb3tlk l meneue ta3el l activity le howe l action bar ya3ne btjblk hay l method l actionbar w btjeblk l mnue l joweto w btrkeb 3lee heed l mneue le 3mlto enta)
        menuInflater.inflate(R.menu.option_menue,menu);

        //or getMenuInflater().inflate(R.menu.option_menue,menu);
        return true;

    }

    //hala2 ana iza bade bas okbous 3ala item b2alb l menue t7awlo 3ala screen jdede
    // best3ml kamen method b2alb l life cycle esma  onOptionsItemSelected kamen mawjoude b life cycle
    //hyde l method bas tekbous 3ala item b2alb l meenue la7ala la7 testad3a w teb3at ma3a l object mn menueitem le enta kabst 3lee ya3ne bas yen3amal call byeb3tlk ma3a l item le nkabs 3lee b object
    //w kamen btrej3 true bas eno nkabs 3lyha

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
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

    }
