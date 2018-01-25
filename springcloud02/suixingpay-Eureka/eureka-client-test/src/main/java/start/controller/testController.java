/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/10
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package start.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import start.Feign.FeignService;

/**
 * @description:
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/10 下午5:16
 * @version: V1.0
 */

@RestController
@Slf4j
public class testController {


    @Autowired
    private FeignService feignService;

    @RequestMapping("/testController2")
    public String testCon2() {

        log.info(feignService.testCon());

        return feignService.testCon();
    }

}
