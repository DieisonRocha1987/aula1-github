/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas_udemy;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author dieis
 */
public class ManipulandoData {
    
    public static void main(String[] args) {
        
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        System.out.println(sdf.format(d));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);//adicionando 4 horas a mais, add o que programador quiser
        d = cal.getTime();
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1+cal.get(Calendar.MONTH);
        
         System.out.println(sdf.format(d));
         System.out.println("Minutos " + minutos);
         System.out.println("Mês " + mes);
    }
    
}
