package com.revengemission.schedule.jobs;

/**
 * Created by zhang wanchao on 17-7-9.
 */

import com.revengemission.schedule.service.HelloService;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.Map;

@Component
public class HelloJob implements Job {


    @Autowired
    HelloService helloService;


    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

        String jobName = jobExecutionContext.getJobDetail().getKey().getName();
        System.out.println("jobName =" + jobName);
        Map<String, Object> parameter = jobExecutionContext.getMergedJobDataMap();
        System.out.println("Job execute result :" + helloService.sayHello(parameter));
        System.out.println(new Date() + ": doing other things..." + Thread.currentThread().getId());
    }
}
