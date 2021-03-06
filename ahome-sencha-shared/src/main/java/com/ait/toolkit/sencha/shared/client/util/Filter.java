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
package com.ait.toolkit.sencha.shared.client.util;

import java.util.ArrayList;
import java.util.List;

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;

/**
 * Represents a single grouper that can be applied to a Store
 */
public class Filter extends JsObject {

	public Filter() {
		jsObj = JsoHelper.createObject();
	}

	public Filter(JavaScriptObject obj) {
		jsObj = obj;
	}

	public Filter(String property, String value) {
		jsObj = create(property, value);
	}

	public Filter(FilterConfig config) {
		jsObj = createPeer(config.getJsObj());
	}

	public void setDisabled(boolean value) {
		JsoHelper.setAttribute(jsObj, "disabled", value);
	}

	public boolean isDisabled() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "disabled");
	}

	public native void setFilterFn(FilterFunction fn)/*-{
		var f = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		f
				.setFilterFn($entry(function(item) {
					var model = @com.ait.toolkit.data.client.BaseModel::new(Lcom/google/gwt/core/client/JavaScriptObject;)(item);
					return fn.@com.ait.toolkit.sencha.shared.client.util.FilterFunction::onFilter(Lcom/ait/toolkit/data/client/BaseModel;)(model);
				}));
	}-*/;

	public native void setValue(String value)/*-{
		var f = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		f.setValue(value);
	}-*/;

	public native void setValue(JavaScriptObject value)/*-{
		var f = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		f.setValue(value);
	}-*/;

	public static JsArray<JavaScriptObject> fromList(List<Filter> filters) {
		JsArray<JavaScriptObject> values = JsArray.createArray().cast();
		for (Filter filter : filters) {
			values.push(filter.getJsObj());
		}
		return values;
	}

	public static List<Filter> fromJsArray(JavaScriptObject array) {
		List<Filter> toReturn = new ArrayList<Filter>();
		int size = JsoHelper.getArrayLength(array);
		for (int i = 0; i < size; i++) {
			JavaScriptObject peer = JsoHelper
					.getValueFromJavaScriptObjectArray(array, i);
			toReturn.add(new Filter(peer));
		}
		return toReturn;
	}

	private native JavaScriptObject create(String prop, String v)/*-{
		return new $wnd.Ext.util.Filter({
			property : prop,
			value : v
		});
	}-*/;

	private native JavaScriptObject createPeer(JavaScriptObject config)/*-{
		return new $wnd.Ext.util.Filter(config);
	}-*/;

}
