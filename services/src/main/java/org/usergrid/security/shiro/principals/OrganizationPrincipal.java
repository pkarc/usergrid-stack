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

import org.usergrid.management.OrganizationInfo;

public class OrganizationPrincipal extends PrincipalIdentifier {

	final OrganizationInfo organization;

	public OrganizationPrincipal(OrganizationInfo organization) {
		this.organization = organization;
	}

	public OrganizationInfo getOrganization() {
		return organization;
	}

	@Override
	public String toString() {
		return organization.getUuid().toString();
	}
}
