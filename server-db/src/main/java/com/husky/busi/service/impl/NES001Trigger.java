package com.husky.busi.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/16 9:32
 */
@Slf4j
@Service("NES001Trigger")
public class NES001Trigger extends DealMsgBaseTrigger{

    @Override
    protected String executeBuss(Object ob, String bussId, String headDto) throws Exception {
        log.info("执行NES001Trigger业务逻辑");
        return "11";
    }
}
