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
package  org.springblade.modules.merchant.service.impl;

import  org.springblade.modules.merchant.entity.BankMerchant;
import  org.springblade.modules.merchant.vo.BankMerchantVO;
import  org.springblade.modules.merchant.mapper.BankMerchantMapper;
import  org.springblade.modules.merchant.service.IBankMerchantService;
import org.springblade.core.mp.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

/**
 * 银行对接商户信息 服务实现类
 *
 * @author Blade
 * @since 2022-01-17
 */
@Service
public class BankMerchantServiceImpl extends BaseServiceImpl<BankMerchantMapper, BankMerchant> implements IBankMerchantService {

	@Override
	public IPage<BankMerchantVO> selectBankMerchantPage(IPage<BankMerchantVO> page, BankMerchantVO bankMerchant) {
		return page.setRecords(baseMapper.selectBankMerchantPage(page, bankMerchant));
	}

}
