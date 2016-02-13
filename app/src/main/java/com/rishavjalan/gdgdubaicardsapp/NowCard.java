package com.rishavjalan.gdgdubaicardsapp;

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

   public NowCard(String title, String content) {
      this.title = title;
      this.content = content;
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

   private String imageUrl;
}
