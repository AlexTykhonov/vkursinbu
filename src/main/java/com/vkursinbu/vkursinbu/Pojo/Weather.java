package com.vkursinbu.vkursinbu.Pojo;

import java.util.List;

public class Weather {

   private Coord coord;

   private List<Weather_> weather = null;

   private String base;

   private Main main;

   private Integer visibility;

   private Wind wind;

   private Clouds clouds;

   private Integer dt;

   private Sys sys;

   private Integer timezone;

   private Integer id;

   private String name;

   private Integer cod;

   public Coord getCoord() {
       return coord;
   }

   public void setCoord(Coord coord) {
       this.coord = coord;
   }

   public List<Weather_> getWeather() {
       return weather;
   }

   public void setWeather(List<Weather_> weather) {
       this.weather = weather;
   }

   public String getBase() {
       return base;
   }

   public void setBase(String base) {
       this.base = base;
   }

   public Main getMain() {
       return main;
   }

   public void setMain(Main main) {
       this.main = main;
   }

   public Integer getVisibility() {
       return visibility;
   }

   public void setVisibility(Integer visibility) {
       this.visibility = visibility;
   }

   public Wind getWind() {
       return wind;
   }

   public void setWind(Wind wind) {
       this.wind = wind;
   }

   public Clouds getClouds() {
       return clouds;
   }

   public void setClouds(Clouds clouds) {
       this.clouds = clouds;
   }

   public Integer getDt() {
       return dt;
   }

   public void setDt(Integer dt) {
       this.dt = dt;
   }

   public Sys getSys() {
       return sys;
   }

   public void setSys(Sys sys) {
       this.sys = sys;
   }

   public Integer getTimezone() {
       return timezone;
   }

   public void setTimezone(Integer timezone) {
       this.timezone = timezone;
   }

   public Integer getId() {
       return id;
   }

   public void setId(Integer id) {
       this.id = id;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public Integer getCod() {
       return cod;
   }

   public void setCod(Integer cod) {
       this.cod = cod;
   }

}
