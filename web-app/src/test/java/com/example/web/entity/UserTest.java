package com.example.web.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * {@link User}のテストクラスです。
 */
class UserTest {

	@Test
	@DisplayName("各項目のsetter/getterの確認")
	void test() {
		// テスト値
		Long id = 1L;
		String name = "テスト太郎";
		String address = "東京都新宿区1-2-3";
		String phone = "0120-1234-1234";
		Date updateDate = new Date();
		Date createDate = new Date();
		Date deleteDate = new Date();

		// 値のセット
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAddress(address);
		user.setPhone(phone);
		user.setUpdateDate(updateDate);
		user.setCreateDate(createDate);
		user.setDeleteDate(deleteDate);

		// 値の検証
		assertEquals(id, user.getId());
		assertEquals(name, user.getName());
		assertEquals(address, user.getAddress());
		assertEquals(phone, user.getPhone());
		assertEquals(updateDate, user.getUpdateDate());
		assertEquals(createDate, user.getCreateDate());
		assertEquals(deleteDate, user.getDeleteDate());

	}

}
