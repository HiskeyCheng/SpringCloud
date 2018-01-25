/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/10
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package start.Feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.ws.rs.GET;

/**
 * @description:
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/10 下午5:23
 * @version: V1.0
 */
@FeignClient(name = "eureka-provider")
public interface FeignService {

    @GetMapping("/testController")
    String testCon();
}
