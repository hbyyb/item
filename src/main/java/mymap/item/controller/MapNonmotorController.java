package mymap.item.controller;

import mymap.item.entity.MapNonmotor;
import mymap.item.service.impl.MapNonmotorServiceImpl;
import mymap.item.vo.MapNonmotorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class MapNonmotorController {
    @Autowired
    MapNonmotorServiceImpl mapNonmotorService;
    @RequestMapping("/hellow")
     String hellow(){
        return "hellow";
    }
    @GetMapping("/list")
   int mylist(){
        MapNonmotor mapNonmotor = new MapNonmotor();
//        long b=1;
        mapNonmotor.setNonmotorAddress("南宁2");
        mapNonmotor.setNonmotorArea(1);
        mapNonmotor.setNonmotorLaborCompany("ali");
        mapNonmotor.setNonmotorName("qingxiuxu");
        mapNonmotor.setNonmotorLat(new BigDecimal("116.404"));
        mapNonmotor.setNonmotorLng(new BigDecimal("39.915"));
//        mapNonmotor.setNonmotorId(b);
        int a=mapNonmotorService.mapnonmotorinsert(mapNonmotor);
//
        return a;
    }
}
