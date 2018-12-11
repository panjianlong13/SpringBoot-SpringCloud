package com.peter.springboot.logback.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.peter.springboot.logback.config.annotation.Log;

import java.time.LocalDateTime;

    /**
    * @ClassName: IndexController
    * @Description: TODO
    * @author Peter Pan
    * @date 2018年12月11日
    *
    */
@RestController
@RequestMapping(value = "/index")
public class IndexController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
    * @Title: index
    * @Description: TODO
    * @author Peter Pan
    * @param @param content
    * @param @return    
    * @return String    
    * @throws
    */
    @Log("首页IndexController")
    @RequestMapping(value="", method= RequestMethod.GET)
    public String index(@RequestParam String content) {
        LocalDateTime localDateTime = LocalDateTime.now();

        LOGGER.trace("请求参数：content:{}", content);
        LOGGER.debug("请求参数：content:{}", content);
        LOGGER.info("请求参数：content:{}", content);
        LOGGER.warn("请求参数：content:{}", content);
        LOGGER.error("请求参数：content:{}", content);

        return localDateTime + ",content:" + content;
    }
}
