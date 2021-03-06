/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.sencha.shared.client.fx;

public enum Easing {

	EASE("ease"), LINEAR("linear"), EASE_IN("ease-in"), EASE_OUT("ease-out"), EASE_IN_OUT(
			"ease-in-out"), BOUNCE_OUT("bounceOut"), ELASTIC_IN("elasticIn"), ELASTIC_OUT(
			"elastic_out");

	private Easing(String theme) {
		this.value = theme;
	}

	private String value;

	public String getValue() {
		return this.value;
	}
}
