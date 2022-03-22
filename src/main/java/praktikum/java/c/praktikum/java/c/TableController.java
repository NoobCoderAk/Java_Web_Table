/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.java.c.praktikum.java.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;





@Controller
public class TableController {
    @RequestMapping("/dataKTP")
    //@ResponseBody
    public String getTable(Model tiki){
        String result = "Data KTP";
        tiki.addAttribute("expedisi", result);
        
        //StudentData data = new StudentData();
       
        ArrayList<List<String>> data = new ArrayList<>();
        
        data.add(0,Arrays.asList("001","0859231234","Gabek","Sleman"));
        data.add(1,Arrays.asList("002","0859231245","Dodit","Palembang"));
        data.add(2,Arrays.asList("003","0859238976","Irwan","Mataram"));
        data.add(3,Arrays.asList("004","0859238066","Hendra","Selong"));
        data.add(4,Arrays.asList("005","0859238772","Imam","Selong"));
        data.add(5,Arrays.asList("006","0859238054","Tono","Mataram"));
        data.add(6,Arrays.asList("007","0859238776","Soni","Surabaya"));
        data.add(7,Arrays.asList("008","0859238897","Peter","Palembang"));
        data.add(8,Arrays.asList("009","0859238234","Dani","Sleman"));
        data.add(9,Arrays.asList("010","0859238098","Anto","Selong"));
        data.add(10,Arrays.asList("011","0859238223","Herry","Palembang"));
        data.add(11,Arrays.asList("012","0859238770","Ilham","Surabaya"));
        data.add(12,Arrays.asList("013","0859238110","Wahyu","Mataram"));
        data.add(13,Arrays.asList("014","0859238552","Putri","Palembang"));
        data.add(14,Arrays.asList("015","0859238212","Vanesa","Surabaya"));
        data.add(15,Arrays.asList("016","0859238424","Tio","Selong"));
        data.add(16,Arrays.asList("017","0859238565","Adit","Sleman"));
        data.add(17,Arrays.asList("018","0859238331","Wiwin","Palembang"));
        data.add(18,Arrays.asList("019","0859238880","Patisa","Surabaya"));
        data.add(19,Arrays.asList("020","0859238141","Cindy","Mataram"));
        
        
        
        
        tiki.addAttribute("dataKTP", data);
        
        return "tableviewer";
        
    }
}

