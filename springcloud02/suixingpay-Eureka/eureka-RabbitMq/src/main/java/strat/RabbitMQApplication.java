package strat; /**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/17
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/17 下午2:28
 * @version: V1.0
 */
@Slf4j
@SpringBootApplication
//@EnableBinding({Sink.class, Source.class})
public class RabbitMQApplication  implements CommandLineRunner {

   /* @Autowired
    @Qualifier("output")
    MessageChannel output;*/

    public static void main(String[] args) {
        SpringApplication.run(RabbitMQApplication.class, args);
    }


    /*@StreamListener(Sink.INPUT)
    public void input(Message<String> message) {
        System.out.println("一般监听收到：" + message.getPayload());
    }*/


    @Override
    public void run(String... strings) throws Exception {
        // 字符串类型发送MQ
        System.out.println("字符串信息发送");
       // output.send(MessageBuilder.withPayload("大家好, 我是output").build());
    }




}







