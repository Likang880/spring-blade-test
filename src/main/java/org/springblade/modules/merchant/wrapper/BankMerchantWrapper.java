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
package  org.springblade.modules.merchant.wrapper;

import org.springblade.core.mp.support.BaseEntityWrapper;
import org.springblade.core.tool.utils.BeanUtil;
import  org.springblade.modules.merchant.entity.BankMerchant;
import  org.springblade.modules.merchant.vo.BankMerchantVO;

/**
 * 银行对接商户信息包装类,返回视图层所需的字段
 *
 * @author Blade
 * @since 2022-01-17
 */
public class BankMerchantWrapper extends BaseEntityWrapper<BankMerchant, BankMerchantVO>  {

    public static BankMerchantWrapper build() {
        return new BankMerchantWrapper();
    }

	@Override
	public BankMerchantVO entityVO(BankMerchant bankMerchant) {
		BankMerchantVO bankMerchantVO = BeanUtil.copy(bankMerchant, BankMerchantVO.class);

		return bankMerchantVO;
	}

}
