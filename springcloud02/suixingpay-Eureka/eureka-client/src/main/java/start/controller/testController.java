/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/10
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @description:
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/10 下午5:16
 * @version: V1.0
 */

@Controller
public class testController {

    @GetMapping("/testController")
    public String testCon() {
        return "test";
    }


    @GetMapping("/testajax")
    @ResponseBody
    public String testajax(String[] lists) {

        Arrays.stream(lists).forEach((a) -> System.out.println(a));

        Arrays.stream(lists).sorted((a,b) -> a.compareTo(b));

        //Arrays.stream(lists).collect(Collectors.toMap())
        return "success";
    }



}
