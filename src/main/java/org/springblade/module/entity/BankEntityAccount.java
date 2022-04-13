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
package org.springblade.module.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 实体类
 *
 * @author Blade
 * @since 2022-03-30
 */
@Data
@TableName("blade_bank_entity_account")
@ApiModel(value = "BankEntityAccount对象", description = "BankEntityAccount对象")
public class BankEntityAccount implements Serializable {

    private static final long serialVersionUID = 1L;

  private Long id;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
    /**
     * 创建用户
     */
    @ApiModelProperty(value = "创建用户")
    private Long createUser;
    /**
     * 创建部门
     */
    @ApiModelProperty(value = "创建部门")
    private Long createDept;
    /**
     * 修改时间
     */
    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;
    /**
     * 修改用户
     */
    @ApiModelProperty(value = "修改用户")
    private Long updateUser;
    /**
     * 绑定状态  0未启用 1启用
     */
    @ApiModelProperty(value = "绑定状态  0未启用 1启用")
    private Integer status;
    /**
     * 是否删除 0 正常 1 删除
     */
    @ApiModelProperty(value = "是否删除 0 正常 1 删除")
    private Integer isDeleted;
    /**
     * 类型   MOF_ACCOUNT/国库账户    TENANT_HOST_ACCOUNT/ 租户主机账户
     */
    @ApiModelProperty(value = "类型   MOF_ACCOUNT/国库账户    TENANT_HOST_ACCOUNT/ 租户主机账户")
    private String accountType;
    /**
     * 账户类型   CASE 涉案金  BAIL 保证金
     */
    @ApiModelProperty(value = "账户类型   CASE 涉案金  BAIL 保证金")
    private String feeType;
    /**
     * 账户
     */
    @ApiModelProperty(value = "账户")
    private String account;
    /**
     * 户名
     */
    @ApiModelProperty(value = "户名")
    private String accountName;
    /**
     * 开户行
     */
    @ApiModelProperty(value = "开户行")
    private String accountOpening;
    /**
     * 账户余额
     */
    @ApiModelProperty(value = "账户余额")
    private Long accountBalance;
    /**
     * 开户日期
     */
    @ApiModelProperty(value = "开户日期")
    private LocalDate openDate;


}
