package spittr.data.impl;

import org.springframework.stereotype.Component;
import spittr.data.SpittleRepository;
import spittr.model.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by admin on 2018-03-08.
 */
@Component
public class SpittleSH implements SpittleRepository {
    public List<Spittle> findSpittles(long max, int count) {
                List<Spittle> spittleList = new ArrayList<Spittle>();
        for(int i = 0; i < count; i++){
            spittleList.add(new Spittle("SpittleSH"+i,new Date()));
        }
        return spittleList;
    }

    public Spittle findOneSpittle(long spittleId){
        return new Spittle("SpittleSH"+spittleId,new Date());
    }
}
