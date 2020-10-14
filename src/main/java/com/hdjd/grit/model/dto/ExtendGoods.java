package com.hdjd.grit.model.dto;

import com.hdjd.grit.model.pojo.Goods;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "ExtenGoods", description = "商品扩展模型")
public class ExtendGoods implements Serializable {
    @ApiModelProperty("购买的商品")
    private Goods goods;
    @ApiModelProperty("购买商品的数量")
    private Float num;
}
