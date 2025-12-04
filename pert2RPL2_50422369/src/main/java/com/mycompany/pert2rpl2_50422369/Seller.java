/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pert2rpl2_50422369;

/**
 *
 * @author daffa azzachrie
 */
public class Seller extends User {
    private String product;
    
    public void addproduct(String productName){
    
        System.out.println("seller menggunakan produk : "+ productName);
        this.product = productName;
    }
}

