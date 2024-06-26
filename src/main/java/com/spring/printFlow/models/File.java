package com.spring.printFlow.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "files")
public class File {
   @Id
   private String _id;
   private String name;
   private String cusRefId;
   private String type;
   private String status;
   private Long pages;
   private String activity;
   private Double price;
   private long copies;
   private String color;
   private String message;
   private Date createdAt;
   private Date operatedAt;

   public File() {

   }

   public File(String name, String status, String cusRefId,
         String type, long pages, String activity, Double price,
         Long copies, String color, String message) {
      this.name = name;
      this.cusRefId = cusRefId;
      this.type = type;
      this.status = status;
      this.pages = pages;
      this.activity = activity;
      this.price = price;
      this.copies = copies;
      this.color = color;
      this.message = message;
      this.createdAt = new Date();
      this.operatedAt = new Date();
   }

   public String getId() {
      return _id;
   }

   public void setid(String _id) {
      this._id = _id;
   }

   public String getcusRefId() {
      return cusRefId;
   }

   public void setfefId(String cusRefId) {
      this.cusRefId = cusRefId;
   }

   public String getType() {
      return type;
   }

   public void setType(String type) {
      this.type = type;
   }

   public String getname() {
      return name;
   }

   public void setname(String name) {
      this.name = name;
   }

   public String getStatus() {
      return status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public Date getCreatedAt() {
      return createdAt;
   }

   public void setOperatedAt(Date operatedAt) {
      this.operatedAt = operatedAt;
   }

   public Date getOperatedAt() {
      return operatedAt;
   }

   public void setCreatedAt(Date createdAt) {
      this.createdAt = createdAt;
   }

   public Long getpages() {
      return pages;
   }

   public void setpages(Long pages) {
      this.pages = pages;
   }

   public String getActivity() {
      return activity;
   }

   public void setActivity(String activity) {
      this.activity = activity;
   }

   public Double getPrice() {
      return price;
   }

   public Double setPrice(Double price) {
      return this.price = price;
   }

   public Long getCopies() {
      return copies;
   }

   public Long setCopies(Long copies) {
      return copies;
   }

   public String getColor() {
      return color;
   }

   public String setColor(String color) {
      return color;
   }

   public String getMessage() {
      return message;
   }

   public String setMessage(String message) {
      return message;
   }

}