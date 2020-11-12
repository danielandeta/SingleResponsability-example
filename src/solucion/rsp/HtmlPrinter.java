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
public class HtmlPrinter implements Printer {

    public void printPage(int page) {
        System.out.println("<div style='single-page'>" + page);
    }
}
