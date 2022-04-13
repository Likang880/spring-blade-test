/**
 * Copyright (c) 2018-2028, Chill Zhuang 庄骞 (smallchill@163.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package  org.springblade.modules.merchant.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import org.springblade.core.mp.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 银行对接商户信息实体类
 *
 * @author Blade
 * @since 2022-01-17
 */
@Data
@TableName("blade_bank_merchant")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "BankMerchant对象", description = "银行对接商户信息")
public class BankMerchant extends BaseEntity {

    private static final long serialVersionUID = 1L;

  private Long id;
    /**
     * 资金类型:  CASE/涉案金 BAIL/保证金
     */
    @ApiModelProperty(value = "资金类型:  CASE/涉案金 BAIL/保证金")
    private String feeType;
    /**
     * 实体主帐户账号
     */
    @ApiModelProperty(value = "实体主帐户账号")
    private String account;
    /**
     * 实体主账户户名
     */
    @ApiModelProperty(value = "实体主账户户名")
    private String accountName;
    /**
     * 对接的商户AppID
     */
    @ApiModelProperty(value = "对接的商户AppID")
    private String bankMerchantAppId;
    /**
     * 银行API接口地址
     */
    @ApiModelProperty(value = "银行API接口地址")
    private String bankApiUrl;
    /**
     * 报表系统"定义的银行业务线版本代表值。0-外联平台；1-企业现金管理直连；2-智慧政法1.0；3-智慧政法2.0
     */
    @ApiModelProperty(value = "报表系统定义的银行业务线版本代表值。0-外联平台；1-企业现金管理直连；2-智慧政法1.0；3-智慧政法2.0")
    private Integer bankBizVersion;
    /**
     * 银行名称
     */
    @ApiModelProperty(value = "银行名称")
    private String bankName;
    /**
     * 银行的发卡机构代码
     */
    @ApiModelProperty(value = "银行的发卡机构代码")
    private String bankCode;
    /**
     * 扩展信息
     */
    @ApiModelProperty(value = "扩展信息")
    private String extendInfo;


}
