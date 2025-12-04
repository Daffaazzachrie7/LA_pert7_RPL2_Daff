/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pert2rpl2_50422369;

/**
 *
 * @author daffa azzachrie
 */
public class Pert2RPL2_50422369 {

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.logout();
        
        Buyer buyer = new Buyer();
        buyer.login();
        buyer.logout();
        
        Seller seller = new Seller();
        seller.addproduct("Lerbu");
        
        Admin admin = new Admin();
        admin.login();
        admin.manageUser();
        admin.logout();

    }
}
