package com.rishavjalan.gdgdubaicardsapp;

import android.net.Uri;

/**
 * Created by rishavjalan on 13/02/16.
 */
public class NowCard
{
   private String title;
   private String content;

   public String getImageUrl() {
      return imageUrl;
   }

   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   public String getContent() {
      return content;
   }

   public NowCard(String title, String content, String imageUrl) {
      this.title = title;
      this.content = content;
      this.imageUrl = imageUrl;
   }

   public NowCard(String title, String content) {
      this.title = title;
      this.content = content;
      this.imageUrl="https://raw.githubusercontent.com/facebook/fresco/gh-pages/static/fresco-logo.png";
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   private String imageUrl="ic_launcher";
}
