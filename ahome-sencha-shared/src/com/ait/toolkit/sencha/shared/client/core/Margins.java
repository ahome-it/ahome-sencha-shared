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
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Class that represents the margins of an element.
 */
public class Margins extends JsObject {

	private int top;
	private int left;
	private int right;
	private int bottom;

	/**
	 * Create a new Margins instance.
	 * 
	 * @param top
	 *            the top margin
	 * @param left
	 *            the left margin
	 * @param right
	 *            the right margin
	 * @param bottom
	 *            the bottom margin
	 */
	public Margins(int top, int left, int right, int bottom) {
		this.top = top;
		this.left = left;
		this.right = right;
		this.bottom = bottom;
		jsObj = JavaScriptObject.createObject();
		JsoHelper.setAttribute(jsObj, "top", top);
		JsoHelper.setAttribute(jsObj, "left", left);
		JsoHelper.setAttribute(jsObj, "right", right);
		JsoHelper.setAttribute(jsObj, "bottom", bottom);
	}

	@SuppressWarnings("unused")
	private static Margins instance(JavaScriptObject jsObj) {
		return new Margins(JsoHelper.getAttributeAsInt(jsObj, "top"),
				JsoHelper.getAttributeAsInt(jsObj, "left"),
				JsoHelper.getAttributeAsInt(jsObj, "right"),
				JsoHelper.getAttributeAsInt(jsObj, "bottom"));
	}

	/**
	 * @return the top margin
	 */
	public int getTop() {
		return top;
	}

	/**
	 * @return the left margin
	 */
	public int getLeft() {
		return left;
	}

	/**
	 * @return the right margin
	 */
	public int getRight() {
		return right;
	}

	/**
	 * @return the bottom margin
	 */
	public int getBottom() {
		return bottom;
	}

	/**
	 * Return the margins as a CSS style string.
	 * 
	 * @return margin as style String
	 */
	public String getStyleString() {
		return "margin:" + top + "px " + right + "px " + bottom + "px " + left
				+ "px;";
	}
}
