/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.service;

import java.util.List;

import com.vip.pallas.bean.UserModel;

public interface UserService {
	
	UserModel findById(Long id);
	
	void createOrUpdateUser(UserModel user);
	
	UserModel findByAuthenticationCode(String username, String password);
	
	void deleteUserById(Long id);
	
	int queryCountBykeywords(String keywords);
	
	List<UserModel> queryByKeywords(String keywords, Integer page, Integer size);
}