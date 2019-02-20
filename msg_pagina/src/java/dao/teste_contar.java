/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author jardel.sewo
 */
public class teste_contar {

    public String ListarImpressora(String ip) throws SQLException, InterruptedException {

        //String ok = "ok";
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        //System.out.println( sdf.format(cal.getTime()) );
        
        String retorno = ip + " executou em : " + sdf.format(cal.getTime()) ;
        
        TimeUnit.SECONDS.sleep(2);
        
        return retorno;
        
    }
}
