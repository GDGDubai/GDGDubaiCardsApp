package com.rishavjalan.gdgdubaicardsapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by rishavjalan on 13/02/16.
 */
public class CardsView {

   RecyclerView cardsViewRecyclerView;
   ArrayList<NowCard> arrayList= new ArrayList<>();
   class CardsViewAdapter extends RecyclerView.Adapter<NowCardViewHolder>{


      @Override
      public NowCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         return null;
      }

      @Override
      public void onBindViewHolder(NowCardViewHolder holder, int position) {

      }

      @Override
      public int getItemCount() {
         return 0;
      }
   }
   class NowCardViewHolder extends RecyclerView.ViewHolder{
      public NowCardViewHolder(View itemView) {
         super(itemView);
      }
   }
}
