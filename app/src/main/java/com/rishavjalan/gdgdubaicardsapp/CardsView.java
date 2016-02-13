package com.rishavjalan.gdgdubaicardsapp;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by rishavjalan on 13/02/16.
 */
public class CardsView {

   RecyclerView cardsViewRecyclerView;
   ArrayList<NowCard> nowCards;

   public CardsView(RecyclerView cardsViewRecyclerView, ArrayList<NowCard> nowCards) {
      this.cardsViewRecyclerView = cardsViewRecyclerView;
      this.nowCards = nowCards;
      bindAdapter();
   }

   public void bindAdapter() {
      this.cardsViewRecyclerView.setAdapter(new CardsViewAdapter());
      this.cardsViewRecyclerView.setLayoutManager(new LinearLayoutManager(cardsViewRecyclerView.getContext()));
   }

   class CardsViewAdapter extends RecyclerView.Adapter<NowCardViewHolder> {


      @Override
      public NowCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.now_card, null);

      //   NowCardViewHolder viewHolder = new CustomViewHolder(view);

         return new NowCardViewHolder(View.inflate(parent.getContext(), R.layout.now_card, null));

      }

      @Override
      public void onBindViewHolder(NowCardViewHolder holder, int position) {
         holder.update(nowCards.get(position));
      }

      @Override
      public int getItemCount() {
         return nowCards.size();

      }
   }

   class NowCardViewHolder extends RecyclerView.ViewHolder {
      TextView title, content;

      public NowCardViewHolder(View itemView) {
         super(itemView);
         this.title = (TextView) itemView.findViewById(R.id.title);
         this.content = (TextView) itemView.findViewById(R.id.content);
      }

      public void update(NowCard card) {
         this.title.setText(card.getTitle());
         this.content.setText(card.getContent());

      }
   }
}
