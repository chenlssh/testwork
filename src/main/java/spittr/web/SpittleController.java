package spittr.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spittr.Spittle;
import spittr.data.SpittleRepository;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by admin on 2018-03-03.
 */
@Controller
@RequestMapping(value="/spittles")
public class SpittleController {

    private static final String MAX_LONG_AS_STRING = "999999999";
    private SpittleRepository spittleRepository;

    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

//    @RequestMapping(method = GET)
//    public String spittles(Model model){
//        System.out.println("i'm coming spittleController....");
//        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE,20));
//        return "spittles";
//    }
    @RequestMapping(method = GET)
    public String spittles(
            @RequestParam(value = "max",
                           defaultValue = MAX_LONG_AS_STRING) long max,
            @RequestParam(value = "count",defaultValue = "20") int count,Model model){
        System.out.println(max+":::::::"+count);
        model.addAttribute(spittleRepository.findSpittles(max,count));  //默认键值为“spittleList”
        return "spittles";
    }

    @RequestMapping(value="/show/{spittleId}",method = GET)                          //占位符要用“{}”括起来
    public String spittle(@PathVariable("spittleId") long spittleId,Model model){    //注解关键字：@PathVariable
        System.out.println("占位符传参spittleId:....."+spittleId);
        model.addAttribute("spittleList",spittleRepository.findOneSpittle(spittleId));
        return "spittles";
    }
}


