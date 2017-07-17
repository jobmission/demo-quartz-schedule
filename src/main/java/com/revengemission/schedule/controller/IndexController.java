package com.revengemission.schedule.controller;

import com.revengemission.schedule.config.QuartzManager;
import com.revengemission.schedule.domain.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhang wanchao on 17-3-13.
 */
@Controller
public class IndexController {

    @Autowired
    QuartzManager quartzManager;

    @RequestMapping(value = {"/", "/index"})
    @ResponseBody
    public ResponseMessage index() {

        ResponseMessage responseMessage = new ResponseMessage();
        //todo do job here,see unit test

        responseMessage.setResponseCode("SUCCESS");
        return responseMessage;
    }

}
