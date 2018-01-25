/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/24
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package start.entity;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.*;

/**
 * @description:
 * @author: 程志祥<15610554031@163.com>
 * @date: 2018/1/24 下午5:51
 * @version: V1.0
 */

public class JsonTest {
    public static void main(String[] args) throws IOException {

        // Children对象
        Children children = Children.builder()
                            .id("1")
                            .cname("children01")
                            .num(1)
                            .build();
        List<String> list = new ArrayList<>(5);
        list.add("list01");
        list.add("list02");
        list.add("list03");

        Set<String> set = new HashSet<>(5);
        set.add("set01");
        set.add("set02");
        set.add("set03");

        Map<Object, Object> map = new HashMap<>(5);
        map.put("1","map01");
        map.put("2","map02");
        map.put("3","map03");

        // User对象
        User user = User.builder()
                    .id("1")
                    .name("user01")
                    .age(1)
                    .date(new Date())
                    .children(children)
                    .list(list)
                    .set(set)
                    .map(map)
                    .build();

        //  jackson 的转换器
        ObjectMapper objectMapper = new ObjectMapper();

        // 1. 对象 -> json
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
        /**
         {"name":"user01","id":"1","age":1,"date":1516788284382
         ,"children":{"id":"1","cname":"children01","num":1}
         ,"list":["list01","list02","list03"]
         ,"set":["set02","set03","set01"]
         ,"map":{"1":"map01","2":"map02","3":"map03"}}

         注意：  (1). 日期--长整形
                (2). List、Set会转成数组
         */
        // 2. json-> Map
        Map<Object,Object> map1 =objectMapper.readValue(json, Map.class);
        System.out.println(map1.get("id").getClass().getName());
        System.out.println(map1.get("name").getClass().getName());
        System.out.println(map1.get("date").getClass().getName());
        System.out.println(map1.get("list").getClass().getName());
        System.out.println(map1.get("set").getClass().getName());
        System.out.println(map1.get("map").getClass().getName());
        System.out.println(map1.get("children").getClass().getName());
        /**
         *
         java.lang.String
         java.lang.String
         java.lang.Long
         java.util.ArrayList
         java.util.ArrayList
         java.util.LinkedHashMap
         java.util.LinkedHashMap

         注意： (1). 日期--长整型
               (2). map、子对象 均转换成了LinkedHashMap
               (3). List、Set会转成ArrayList
         *
         */
        // 3. Map -> json
        json = objectMapper.writeValueAsString(map1);
        System.out.println(json);
        /**
         {"name":"user01","id":"1","age":1,"date":1516845608920
         ,"children":{"id":"1","cname":"children01","num":1}
         ,"list":["list01","list02","list03"]
         ,"set":["set02","set03","set01"]
         ,"map":{"1":"map01","2":"map02","3":"map03"}}

         注意： 跟对象->json一样
         *
         */

        // 4. json -> 对象
        User user1 =objectMapper.readValue(json, User.class);
        System.out.println(user1.getAge());
        System.out.println(user1.getChildren().toString());
        System.out.println(user1.getList().toString());
        System.out.println(user1.getSet().toString());
        System.out.println(user1.getMap().toString());
        /**
         1
         Children(id=1, cname=children01, num=1)
         [list01, list02, list03]
         [set02, set03, set01]
         {1=map01, 2=map02, 3=map03}

         注意： 跟原始对象一样
         *
         */

    }
}
