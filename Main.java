/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping.list;

/**
 *
 * @author Filda
 */
public class ShoppingList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int cena = 0;
        if (args.length != 0) {
            for (String i : args) {
                switch (i) {
                    case "0":System.out.println("Red Bull energy drink");cena += 34;  
                    case "1":System.out.println("Malboro cigu");cena += 125;  
                    case "2":System.out.println("Branik");cena += 32;
                    case "3":System.out.println("Pikao");cena += 200;    
                    case "4":System.out.println("Golf");cena += 45; 
                    case "5":System.out.println("Potratová pilulka Christian");cena += 700; 
                    case "6":System.out.println("CBD");cena += 230;
                    default:
                        
                }
            }
            System.out.println(cena+" CZK");
        } else {
            System.out.println("1 Cerveneho byka " + "2 cigy malbora" + "3 Branu v petce" + "3 pikao" +  "4 bagetku golfika" + "5 Christiana "+ "6 CBD ");
           
        }

    }

}
