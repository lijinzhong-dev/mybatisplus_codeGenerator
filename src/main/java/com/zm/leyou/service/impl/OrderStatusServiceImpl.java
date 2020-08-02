package com.zm.leyou.service.impl;

import com.zm.leyou.entity.OrderStatus;
import com.zm.leyou.mapper.OrderStatusMapper;
import com.zm.leyou.service.IOrderStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单状态表 服务实现类
 * </p>
 *
 * @author lijinzhong
 * @since 2020-08-02
 */
@Service
public class OrderStatusServiceImpl extends ServiceImpl<OrderStatusMapper, OrderStatus> implements IOrderStatusService {

}
