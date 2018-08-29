package com.revengemission.schedule;

import com.revengemission.schedule.config.QuartzManager;
import com.revengemission.schedule.jobs.HelloJob;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhang wanchao on 17-7-9.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuartzTest {

    public static String JOB_NAME = "myJob";
    public static String JOB_GROUP_NAME = "group_myJob";
    public static String TRIGGER_NAME = "myJob";
    public static String TRIGGER_GROUP_NAME = "group_myJob";

    @Autowired
    QuartzManager quartzManager;

    @Test
    @Ignore
    public void formatDate() {
        SimpleDateFormat cron = new SimpleDateFormat("ss mm HH dd MM ? yyyy");
        System.out.println(cron.format(new Date()));
    }

    @Test
    @Ignore
    public void testQuartz() {
        try {
            System.out.println("【系统启动】开始(每1分钟输出一次)...");
            Map<String, Object> parameterData = new HashMap<>();
            parameterData.put("parameter1", "111");
            parameterData.put("parameter2", "定时发送");
            quartzManager.addJob(JOB_NAME, JOB_GROUP_NAME, TRIGGER_NAME, TRIGGER_GROUP_NAME, HelloJob.class, "0 * * * * ? 2018", parameterData);

            while (quartzManager.countJobs() > 0) {
                System.out.println("job count " + quartzManager.countJobs());
                Thread.sleep(60000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
