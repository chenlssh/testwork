package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spittle;

import java.util.List;

/**
 * Created by admin on 2018-02-05.
 */

public interface SpittleRepository {
    List<Spittle>  findSpittles(long max,int count);
    Spittle findOneSpittle(long spittleId);
}