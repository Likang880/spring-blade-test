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
package org.springblade.module.controller;

import io.swagger.annotations.Api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;

import javax.media.*;
import javax.validation.Valid;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.Func;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.module.entity.BankEntityAccount;
import org.springblade.module.vo.BankEntityAccountVO;
import org.springblade.module.service.IBankEntityAccountService;
import org.springblade.core.boot.ctrl.BladeController;

import java.io.File;
import java.io.IOException;

/**
 *  控制器
 *
 * @author Blade
 * @since 2022-03-30
 */
@RestController
@AllArgsConstructor
@RequestMapping("bankEntity/bankentityaccount")
@Api(value = "", tags = "接口")
public class BankEntityAccountController extends BladeController {

	private IBankEntityAccountService bankEntityAccountService;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入bankEntityAccount")
	public R<BankEntityAccount> detail(BankEntityAccount bankEntityAccount) {
		BankEntityAccount detail = bankEntityAccountService.getOne(Condition.getQueryWrapper(bankEntityAccount));
		return R.data(detail);
	}

	/**
	 * 分页
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入bankEntityAccount")
	public R<IPage<BankEntityAccount>> list(BankEntityAccount bankEntityAccount, Query query) {
		IPage<BankEntityAccount> pages = bankEntityAccountService.page(Condition.getPage(query), Condition.getQueryWrapper(bankEntityAccount));
		return R.data(pages);
	}

	/**
	 * 自定义分页
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入bankEntityAccount")
	public R<IPage<BankEntityAccountVO>> page(BankEntityAccountVO bankEntityAccount, Query query) {
		IPage<BankEntityAccountVO> pages = bankEntityAccountService.selectBankEntityAccountPage(Condition.getPage(query), bankEntityAccount);
		return R.data(pages);
	}

	/**
	 * 新增
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入bankEntityAccount")
	public R save(@Valid @RequestBody BankEntityAccount bankEntityAccount) {
		return R.status(bankEntityAccountService.save(bankEntityAccount));
	}

	/**
	 * 修改
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入bankEntityAccount")
	public R update(@Valid @RequestBody BankEntityAccount bankEntityAccount) {
		return R.status(bankEntityAccountService.updateById(bankEntityAccount));
	}

	/**
	 * 新增或修改
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入bankEntityAccount")
	public R submit(@Valid @RequestBody BankEntityAccount bankEntityAccount) {
		return R.status(bankEntityAccountService.saveOrUpdate(bankEntityAccount));
	}


	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(bankEntityAccountService.removeByIds(Func.toLongList(ids)));
	}

}
