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
package  org.springblade.modules.merchant.mapper;

import  org.springblade.modules.merchant.entity.BankMerchant;
import  org.springblade.modules.merchant.vo.BankMerchantVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 * 银行对接商户信息 Mapper 接口
 *
 * @author Blade
 * @since 2022-01-17
 */
public interface BankMerchantMapper extends BaseMapper<BankMerchant> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param bankMerchant
	 * @return
	 */
	List<BankMerchantVO> selectBankMerchantPage(IPage page, BankMerchantVO bankMerchant);

}
