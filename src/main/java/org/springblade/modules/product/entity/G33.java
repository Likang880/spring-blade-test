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
package org.springblade.modules.product.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
 * @since 2021-08-10
 */
@Data
@TableName("blade_g33")
@ApiModel(value = "G33对象", description = "G33对象")
public class G33 implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @ApiModelProperty(value = "主键id")
    @TableId(value = "id", type = IdType.AUTO)
  private Long id;
    /**
     * 系列
     */
    @ApiModelProperty(value = "系列")
    private String series;
    /**
     * 物料描述
     */
    @ApiModelProperty(value = "物料描述")
    private String productDescription;
    /**
     * 颜色
     */
    @ApiModelProperty(value = "类型")
    private String type;
    /**
     * 象牙白价格
     */
    @ApiModelProperty(value = "象牙白价格")
    private BigDecimal ivoryPrice;
    /**
     * 香槟金价格
     */
    @ApiModelProperty(value = "香槟金价格")
    private BigDecimal champagneGoldPrice;
    /**
     * 星空灰
     */
    @ApiModelProperty(value = "星空灰")
    private BigDecimal starryGreyPrice;
    /**
     * 黑价格
     */
    @ApiModelProperty(value = "黑价格")
    private BigDecimal blackPrice = new BigDecimal("0.00");
    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private Long creatUser;
    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime creatTime;
    /**
     * 更新人
     */
    @ApiModelProperty(value = "更新人")
    private Long updateUser;
    /**
     * 更新时间
     */
    @ApiModelProperty(value = "更新时间")
    private LocalDateTime updateTime;
    /**
     * 状态
     */
    @ApiModelProperty(value = "状态")
    private Integer status;
    /**
     * 是否删除
     */
    @ApiModelProperty(value = "是否删除")
    private Integer isDeleted;


}
