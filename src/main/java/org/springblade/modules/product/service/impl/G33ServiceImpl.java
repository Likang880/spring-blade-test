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
package org.springblade.modules.product.service.impl;

import org.springblade.modules.product.dto.G33DTO;
import org.springblade.modules.product.entity.G33;
import org.springblade.modules.product.vo.G33VO;
import org.springblade.modules.product.mapper.G33Mapper;
import org.springblade.modules.product.service.IG33Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.List;

/**
 *  服务实现类
 *
 * @author Blade
 * @since 2021-08-10
 */
@Service
public class G33ServiceImpl extends ServiceImpl<G33Mapper, G33> implements IG33Service {

	@Override
	public IPage<G33VO> selectG33Page(IPage<G33VO> page, G33VO g33) {
		return page.setRecords(baseMapper.selectG33Page(page, g33));
	}

	@Override
	public IPage<G33> selectG33Query(IPage<G33> page, G33DTO g33DTO) {
		return page.setRecords(baseMapper.selectG33Query(page, g33DTO));
	}

}
