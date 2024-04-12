package com.husky.task;

import com.xxl.job.core.handler.annotation.XxlJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class XxlJobSampleHandler {

    @XxlJob("demoJobHandler")
    public void demoJobHandler() {
        log.info("XXL-JOB, Hello World.");
    }

}
