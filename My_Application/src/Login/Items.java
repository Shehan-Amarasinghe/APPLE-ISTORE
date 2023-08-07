package Login;

public class Items {

       private String itemCode;
   private String itemName;
   private int itemPrice;
   private String itemType; 
    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemPrice
     */
    public int getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
  
public void add_items(Items obj){
    
    String itemsString =obj.getItemCode()+" " +obj.getItemName()+" "+obj.getItemType()+" "+obj.getItemPrice();
    
      DBConnection d2 = new DBConnection();
      d2.makeConnection(itemsString ,"sam.txt");
      
}
    
}
