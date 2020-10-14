package com.hdjd.grit.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hdjd.grit.model.dto.ExtendGoods;
import com.hdjd.grit.model.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {
}
