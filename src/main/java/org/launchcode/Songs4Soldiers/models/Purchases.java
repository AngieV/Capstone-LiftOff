package org.launchcode.Songs4Soldiers.models;

import org.launchcode.Songs4Soldiers.data.UserRepository;

import java.util.Date;

public class Purchases {

    private int userid;

    private String itemName;

    private int itemQty;

    private Date datePurchased;

    public Purchases(int userID, String itemName, int itemQty, Date datePurchased) {
        this.userid = userID;
        this.itemName = itemName;
        this.itemQty = itemQty;
        this.datePurchased = datePurchased;
    }

}
