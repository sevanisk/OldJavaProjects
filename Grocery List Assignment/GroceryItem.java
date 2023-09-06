//Sophia Evanisko
//5/24/19


import java.util.*;
import java.io.*;

public class GroceryItem
{
   private String myBrand, myName;
   private double myPrice;

   public GroceryItem (String name)
   {
      this.myName = name;
      this.myBrand = "Any";
      this.myPrice = 0.0;
   }

   public GroceryItem (String name, String brand)
   {
      this.myName = name;
      this.myBrand = brand;
      this.myPrice = 0;
   }
   
   public String getName()
   {
      return this.myName;
   }
   
   public String getBrand()
   {
      return this.myBrand;
   }
   
   public void setName(String newName)
   {
      this.myName = newName;
   }
   
   public void setBrand(String newBrand)
   {
      this.myBrand = newBrand;
   }

}

class GroceryList
{
   private double distance;
   private List<GroceryItem> items;
   private List<String> stores;
   private Map<GroceryItem, StoreLocation> prices;
   
   public GroceryList()
   {
      items = new ArrayList<GroceryItem>();
      stores = new ArrayList<String>();
      this.prices = new TreeMap<GroceryItem, StoreLocation>();
      this.distance = 0;
   }
      
   // public GroceryList(List<GroceryItem> it, List<String> stores)
   // {
      // this.items = it;
      // this.stores = stores;
      // this.prices = new TreeMap<GroceryItem, Integer>();
      // this.distance = 0;
   // }
//    
   // public GroceryList(List<GroceryItem> it, List<String> stores, double distance)
   // {
      // this.items = it;
      // this.stores = stores;
      // this.prices = new TreeMap<GroceryItem, Integer>();
      // this.distance = distance;
   // }
   
   public List<GroceryItem> getItems()
   {
      return this.items;
   }
   public List<String> getStores()
   {
      return this.stores;
   }
   public Map<GroceryItem, StoreLocation> getPrices()
   {
      return this.prices;
   }
   public double getDistance()
   {
      return this.distance;
   }
   
   public void addItem(GroceryItem g)
   {
      items.add(g);
   }
   public void addStore(String s)
   {
      stores.add(s);
   }
   public void setDistance(double dist)
   {
      this.distance = dist;
   }


   public void findPrices()
   {
   
      for(int i = 0; i < items.size(); i++)
         for(int s = 0; s < stores.size(); s++)
         {
         
         
         }
   
   
   }
}

