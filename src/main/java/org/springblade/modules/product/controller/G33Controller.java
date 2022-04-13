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
package org.springblade.modules.product.controller;

import io.swagger.annotations.Api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import javax.validation.Valid;

import org.springblade.core.mp.support.Condition;
import org.springblade.core.mp.support.Query;
import org.springblade.core.tool.api.R;
import org.springblade.core.tool.utils.CollectionUtil;
import org.springblade.core.tool.utils.Func;
import org.springblade.core.tool.utils.StringUtil;
import org.springblade.modules.product.dto.G33DTO;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springblade.modules.product.entity.G33;
import org.springblade.modules.product.vo.G33VO;
import org.springblade.modules.product.wrapper.G33Wrapper;
import org.springblade.modules.product.service.IG33Service;
import org.springblade.core.boot.ctrl.BladeController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *  控制器
 *
 * @author Blade
 * @since 2021-08-10
 */
@RestController
@AllArgsConstructor
@RequestMapping("product/g33")
@Api(value = "", tags = "接口")
public class G33Controller extends BladeController {

	private final IG33Service g33Service;

	/**
	 * 详情
	 */
	@GetMapping("/detail")
	@ApiOperationSupport(order = 1)
	@ApiOperation(value = "详情", notes = "传入g33")
	public R<G33VO> detail(G33 g33) {
		G33 detail = g33Service.getOne(Condition.getQueryWrapper(g33));
		return R.data(G33Wrapper.build().entityVO(detail));
	}

	/**
	 * 分页
	 */
	@GetMapping("/list")
	@ApiOperationSupport(order = 2)
	@ApiOperation(value = "分页", notes = "传入g33")
	public R<IPage<G33VO>> list(G33DTO g33, Query query) {
		if (StringUtil.isNotBlank(g33.getType())) {
			 g33.setTypes(Arrays.asList(g33.getType().split(",")));
		}
		IPage<G33> pages = g33Service.selectG33Query(Condition.getPage(query),g33);
		return R.data(G33Wrapper.build().pageVO(pages));
	}


	/**
	 * 自定义分页
	 */
	@GetMapping("/page")
	@ApiOperationSupport(order = 3)
	@ApiOperation(value = "分页", notes = "传入g33")
	public R<IPage<G33VO>> page(G33VO g33, Query query) {
		IPage<G33VO> pages = g33Service.selectG33Page(Condition.getPage(query), g33);
		return R.data(pages);
	}

	/**
	 * 新增
	 */
	@PostMapping("/save")
	@ApiOperationSupport(order = 4)
	@ApiOperation(value = "新增", notes = "传入g33")
	public R save(@Valid @RequestBody G33 g33) {
		return R.status(g33Service.save(g33));
	}

	/**
	 * 修改
	 */
	@PostMapping("/update")
	@ApiOperationSupport(order = 5)
	@ApiOperation(value = "修改", notes = "传入g33")
	public R update(@Valid @RequestBody G33 g33) {
		return R.status(g33Service.updateById(g33));
	}

	/**
	 * 新增或修改
	 */
	@PostMapping("/submit")
	@ApiOperationSupport(order = 6)
	@ApiOperation(value = "新增或修改", notes = "传入g33")
	public R submit(@Valid @RequestBody G33 g33) {
		return R.status(g33Service.saveOrUpdate(g33));
	}


	/**
	 * 删除
	 */
	@PostMapping("/remove")
	@ApiOperationSupport(order = 8)
	@ApiOperation(value = "删除", notes = "传入ids")
	public R remove(@ApiParam(value = "主键集合", required = true) @RequestParam String ids) {
		return R.status(g33Service.removeByIds(Func.toLongList(ids)));
	}


}
