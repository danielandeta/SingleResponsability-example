/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucion.rsp;

/**
 *
 * @author DELL
 */
public class PlainTextPrinter implements Printer {


    @Override
    public void printPage(int page) {
        System.out.println(page);
    }

    
}
