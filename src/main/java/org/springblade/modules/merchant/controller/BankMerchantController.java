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
package  org.springblade.modules.merchant.controller;

import io.swagger.annotations.Api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import javax.validation.Valid;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import com.baomidou.mybatisplus.core.metadata.IPage;
import  org.springblade.modules.merchant.entity.BankMerchant;
import  org.springblade.modules.merchant.vo.BankMerchantVO;
import  org.springblade.modules.merchant.wrapper.BankMerchantWrapper;
import  org.springblade.modules.merchant.service.IBankMerchantService;
import org.springblade.core.boot.ctrl.BladeController;

/**
 * 银行对接商户信息 控制器
 *
 * @author Blade
 * @since 2022-01-17
 */
@RestController
@AllArgsConstructor
@RequestMapping("bank_merchant/bankmerchant")
@Api(value = "银行对接商户信息", tags = "银行对接商户信息接口")
public class BankMerchantController extends BladeController {

	private IBankMerchantService bankMerchantService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入bankMerchant")
	public R<BankMerchantVO> detail(BankMerchant bankMerchant) {
		BankMerchant detail = bankMerchantService.getOne(Condition.getQueryWrapper(bankMerchant));
		return R.data(BankMerchantWrapper.build().entityVO(detail));
	}

	/**
	 * 分页 银行对接商户信息
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入bankMerchant")
	public R<IPage<BankMerchantVO>> list(BankMerchant bankMerchant, Query query) {
		IPage<BankMerchant> pages = bankMerchantService.page(Condition.getPage(query), Condition.getQueryWrapper(bankMerchant));
		return R.data(BankMerchantWrapper.build().pageVO(pages));
	}


	/**
	 * 自定义分页 银行对接商户信息
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入bankMerchant")
	public R<IPage<BankMerchantVO>> page(BankMerchantVO bankMerchant, Query query) {
		IPage<BankMerchantVO> pages = bankMerchantService.selectBankMerchantPage(Condition.getPage(query), bankMerchant);
		return R.data(pages);
	}

	/**
	 * 新增 银行对接商户信息
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入bankMerchant")
	public R save(@Valid @RequestBody BankMerchant bankMerchant) {
		return R.status(bankMerchantService.save(bankMerchant));
	}

	/**
	 * 修改 银行对接商户信息
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入bankMerchant")
	public R update(@Valid @RequestBody BankMerchant bankMerchant) {
		return R.status(bankMerchantService.updateById(bankMerchant));
	}

	/**
	 * 新增或修改 银行对接商户信息
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入bankMerchant")
	public R submit(@Valid @RequestBody BankMerchant bankMerchant) {
		return R.status(bankMerchantService.saveOrUpdate(bankMerchant));
	}

	
	/**
	 * 删除 银行对接商户信息
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 7)
	@ApiOperation(value = "逻辑删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(bankMerchantService.deleteLogic(Func.toLongList(ids)));
	}

	
}
