/*******************************************************************************
 * Copyright 2012 Apigee Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.security.shiro.principals;

import java.util.UUID;

import org.usergrid.management.UserInfo;

public abstract class UserPrincipal extends PrincipalIdentifier {

	protected final UserInfo user;
	protected final UUID applicationId;

	public UserPrincipal(UUID applicationId, UserInfo user) {
		this.applicationId = applicationId;
		this.user = user;
	}

	public UUID getApplicationId() {
		return applicationId;
	}

	@Override
	public UserInfo getUser() {
		return user;
	}

	@Override
	public boolean isDisabled() {
		if (user != null) {
			return user.isDisabled();
		}
		return false;
	}

	@Override
	public boolean isActivated() {
		if (user != null) {
			return user.isActivated();
		}
		return true;
	}




  /**
   * Must always return the id in the format of appid/userid for cache purposes
   * @return
   */
	@Override
	public String toString() {
    return new StringBuilder("appuser/").append(applicationId).append("/").append(user.getUuid()).toString();
	}

}
