package com.iat.bytemall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iat.bytemall.product.entity.BrandEntity;
import com.iat.bytemall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BytemallProductApplicationTests {
	@Autowired
	BrandService brandService;

	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
//		brandEntity.setDescript("test");
//		brandEntity.setName("huawei");
//		brandService.save(brandEntity);
//		brandEntity.setBrandId(1L);
//		brandEntity.setName("小米");
//		brandService.updateById(brandEntity);
//		System.out.println("保存成功");
		List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>()
		.eq("brand_id",1));
		System.out.println(list.size());
	}

}
