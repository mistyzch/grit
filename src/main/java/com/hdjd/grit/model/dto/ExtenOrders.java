package com.hdjd.grit.model.dto;
import com.hdjd.grit.model.pojo.Orders;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import java.io.Serializable;
import java.util.ArrayList;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@ApiModel(value = "ExtenOrders", description = "订单扩展模型")
public class ExtenOrders extends Orders implements Serializable {
    @ApiModelProperty("商品集合，包括商品实体和购买数量")
    ArrayList<ExtendGoods> extendGoods = new ArrayList<>();
}
