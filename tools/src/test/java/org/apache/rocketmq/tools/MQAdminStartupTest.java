package org.apache.rocketmq.tools;

import org.apache.rocketmq.common.MixAll;
import org.apache.rocketmq.tools.command.MQAdminStartup;
import org.junit.Test;

import java.util.Objects;

public class MQAdminStartupTest {

    @Test
    public void testTopicList(){
        //PS:（例）获取TopicList
        System.setProperty(MixAll.ROCKETMQ_HOME_PROPERTY, Objects.requireNonNull(MQAdminStartupTest.class.getResource("/"))
                .getPath().replace("tools/target/test-classes/","deploy"));
        MQAdminStartup.main(new String[] {"topicList","-n","127.0.0.1:9876"});
    }

    @Test
    public void testQueryMsgByOffset(){
        //PS:（例）获取TopicList
        System.setProperty(MixAll.ROCKETMQ_HOME_PROPERTY, Objects.requireNonNull(MQAdminStartupTest.class.getResource("/"))
                .getPath().replace("tools/target/test-classes/","deploy"));
        MQAdminStartup.main("queryMsgByOffset -b broker-a -i 0 -o 0 -t TopicTest -n 127.0.0.1:9876".split(" "));
    }

    @Test
    public void testTopicRoute(){
        //PS:（例）获取TopicList
        System.setProperty(MixAll.ROCKETMQ_HOME_PROPERTY, Objects.requireNonNull(MQAdminStartupTest.class.getResource("/"))
                .getPath().replace("tools/target/test-classes/","deploy"));
        MQAdminStartup.main("topicRoute -t TopicTest -n 127.0.0.1:9876".split(" "));
    }

}
