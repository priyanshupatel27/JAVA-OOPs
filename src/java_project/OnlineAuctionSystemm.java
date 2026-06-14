package java_project;
import java.util.Scanner;
class Bidder {
    int bidderId;
    String bidderName;

    Bidder(int id, String name) {
        bidderId = id;
        bidderName = name;
    }
}
class Item {
    int itemId;
    String itemName;
    double basePrice;
    double highestBid;
    String highestBidder;

    Item(int id, String name, double price) {
        itemId = id;
        itemName = name;
        basePrice = price;
        highestBid = price;
        highestBidder = "No Bidder";
    }
    void updateBid(Bidder bidder, double bidAmount) {
        if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = bidder.bidderName;
            System.out.println("Bid Accepted");
        } else {
            System.out.println("Bid Rejected");
        }
    }
    void displayResult() {
        System.out.println("\nAuction Ended!");
        System.out.println("Winner: " + highestBidder);
        System.out.println("Final Price: ₹" + highestBid);
    }
}
public class OnlineAuctionSystemm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item item = new Item(1, "Laptop", 50000);

        System.out.println("Item: " + item.itemName);
        System.out.println("Base Price: Rs " + item.basePrice);

        for (int i = 1; i <= 3; i++) {

            System.out.print("\nEnter Bidder ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Bidder Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Bid Amount: Rs ");
            double amount = sc.nextDouble();

            Bidder bidder = new Bidder(id, name);

            item.updateBid(bidder, amount);
        }
        item.displayResult();
    }
}

