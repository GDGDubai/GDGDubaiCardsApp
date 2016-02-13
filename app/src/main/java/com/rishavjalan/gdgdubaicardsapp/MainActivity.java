package com.rishavjalan.gdgdubaicardsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
      Fresco.initialize(this);

      Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
      init();


   }

   protected void init(){
      initView();
   }

   protected void initView(){
      initToolbar();
      initCardsView();
    //  initFab();
   }
   protected void initToolbar(){
      Toolbar toolbar =(Toolbar)findViewById(R.id.toolbar);
      setSupportActionBar(toolbar);
   }

   protected void initCardsView(){
      ArrayList<NowCard> nowCards = new ArrayList<>();
      nowCards.add(new NowCard("GDG Design Session","Served on a bed by the pool, or on a terrace with views of the Dubai Fountain, Burj Khalifa or famous Marina, brunching outdoors brings the holiday vibe to a weekend. These places in the city make great use of the sunny weather by giving diners the option of having their food and drink al fresco. So who says doing brunch means being holed up in the dark for 3+ hours? It may not quite qualify as ‘exploring the outdoors’ but our list helps you get close to it if brunch is your kind of weekend activity.\n"));
      nowCards.add(new NowCard("GDG Design Session 2","Served on a bed by the pool, or on a terrace with views of the Dubai Fountain, Burj Khalifa or famous Marina, brunching outdoors brings the holiday vibe to a weekend. These places in the city make great use of the sunny weather by giving diners the option of having their food and drink al fresco. So who says doing brunch means being holed up in the dark for 3+ hours? It may not quite qualify as ‘exploring the outdoors’ but our list helps you get close to it if brunch is your kind of weekend activity.\n"));
      nowCards.add(new NowCard("GDG Design Session 3","Served on a bed by the pool, or on a terrace with views of the Dubai Fountain, Burj Khalifa or famous Marina, brunching outdoors brings the holiday vibe to a weekend. These places in the city make great use of the sunny weather by giving diners the option of having their food and drink al fresco. So who says doing brunch means being holed up in the dark for 3+ hours? It may not quite qualify as ‘exploring the outdoors’ but our list helps you get close to it if brunch is your kind of weekend activity.\n"));
      nowCards.add(new NowCard("GDG Design Session 4","Served on a bed by the pool, or on a terrace with views of the Dubai Fountain, Burj Khalifa or famous Marina, brunching outdoors brings the holiday vibe to a weekend. These places in the city make great use of the sunny weather by giving diners the option of having their food and drink al fresco. So who says doing brunch means being holed up in the dark for 3+ hours? It may not quite qualify as ‘exploring the outdoors’ but our list helps you get close to it if brunch is your kind of weekend activity.\n"));
      new CardsView((RecyclerView)findViewById(R.id.cardsView),nowCards);
   }
   protected void initFab(){
      FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
      fab.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                 .setAction("Action", null).show();
         }
      });
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
}
