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
package com.ait.toolkit.sencha.shared.client.core;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Creates a regular expression object for matching text according to a pattern.
 * <p>
 * When using the constructor function, the normal string escape rules
 * (preceding special characters with \ when included in a string) are
 * necessary.
 */
public class RegExp extends JsObject {

	/**
	 * Constructs a new REgular Expression.
	 * 
	 * @param re
	 *            the regular expression String
	 */
	public RegExp(String re) {
		jsObj = create(re);
	}

	private native JavaScriptObject create(String re) /*-{
		return new $wnd.RegExp(re);
	}-*/;
}
