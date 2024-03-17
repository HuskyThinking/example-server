package com.husky.busi.service.impl;

import com.husky.busi.service.IDealMsgBaseTrigger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Axin
 * @version 1.0
 * @description: TODO
 * @date 2024/3/16 9:30
 */
@Slf4j
@Service
public class DealMsgBaseTrigger implements IDealMsgBaseTrigger {

    @Override
    public void execute(Object ob, String headDto) throws Exception {
        log.info("执行逻辑---------");
        executeBuss("1","1","1");
    }

    protected String executeBuss(Object ob, String bussId, String headDto) throws Exception {
        log.info("执行业务逻辑");
        return null;
    }
}
