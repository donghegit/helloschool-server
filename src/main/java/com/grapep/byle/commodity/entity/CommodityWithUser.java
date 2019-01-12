package com.grapep.byle.commodity.entity;

import com.grapep.byle.user.entity.User;
import lombok.Data;

@Data
public class CommodityWithUser extends CommodityWithBLOBs {
    private User user;
}
