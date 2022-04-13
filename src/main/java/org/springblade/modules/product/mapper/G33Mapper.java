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
package org.springblade.modules.product.mapper;

import org.apache.ibatis.annotations.Param;
import org.springblade.modules.product.dto.G33DTO;
import org.springblade.modules.product.entity.G33;
import org.springblade.modules.product.vo.G33VO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import java.util.List;

/**
 *  Mapper 接口
 *
 * @author Blade
 * @since 2021-08-10
 */
public interface G33Mapper extends BaseMapper<G33> {

	/**
	 * 自定义分页
	 *
	 * @param page
	 * @param g33
	 * @return
	 */
	List<G33VO> selectG33Page(IPage page, G33VO g33);

	/**
	 *
	 * @param page 分页参数
	 * @param g33 查询对象
	 * @return 查询列表集合
	 */
	List<G33> selectG33Query(IPage page, @Param("dto") G33DTO g33);

}
