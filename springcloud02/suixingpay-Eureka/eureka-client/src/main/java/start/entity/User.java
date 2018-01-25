/**
 * All rights Reserved, Designed By Suixingpay.
 *
 * @author: 程志祥<cheng_zx@suixingpay.com>
 * @date: 2018/1/24
 * @Copyright: ©2017 Suixingpay. All rights reserved.
 * 注意：本内容仅限于随行付支付有限公司内部传阅，禁止外泄以及用于其他的商业用途。
 */
package start.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: 程志祥<15610554031@163.com>
 * @date: 2018/1/24 下午5:45
 * @version: V1.0
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String id;
    private int age;
    private Date date;

    private Children children;
    private List list;
    private Set set;
    private Map map;

}
