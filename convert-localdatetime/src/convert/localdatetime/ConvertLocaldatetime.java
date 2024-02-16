/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert.localdatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class ConvertLocaldatetime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
String LocalDateTimes = "2018-07-14T17:45:55.9483536";
LocalDateTime actualfecha= LocalDateTime.now();
	

System.out.println("LocalDateTimes : " + LocalDateTimes);
        System.out.println(".........................");
   
// 1. Parse String to LocalDateTime 
LocalDateTime today = LocalDateTime.parse("2019-03-27T10:15:30");
System.out.println(today);
    }
    
}
