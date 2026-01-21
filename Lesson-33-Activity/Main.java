class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem item1 = new CartItem("Laptop", 999.99, 1, true);
    CartItem item2 = new CartItem("Bread", 4.50, 2, false);
    CartItem item3 = new CartItem("Headphones", 79.99, 1, true);

    if (item1.onSale) print(item1.itemName + " $" + item1.getItemPrice());
    if (item2.onSale) print(item2.itemName + " $" + item2.getItemPrice());
    if (item3.onSale) print(item3.itemName + " $" + item3.getItemPrice());

    double subtotal = 
        item1.getItemPrice() * item1.quantity +
        item2.getItemPrice() * item2.quantity +
        item3.getItemPrice() * item3.quantity;

    double tax = subtotal * 0.08675;
    double total = subtotal + tax;

    print("Subtotal: $" + subtotal);
    print("Tax (8.675%): $" + tax);
    print("Total: $" + total);
  }


  
    
  }