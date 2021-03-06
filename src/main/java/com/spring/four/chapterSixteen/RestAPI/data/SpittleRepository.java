package com.spring.four.chapterSixteen.RestAPI.data;


import com.spring.four.chapterSixteen.RestAPI.domain.Spittle;

import java.util.List;

public interface SpittleRepository {

  List<Spittle> findRecentSpittles();

  List<Spittle> findSpittles(long max, int count);
  
  Spittle findOne(long id);

  Spittle save(Spittle spittle);

}
