/*
 * Copyright 2016 Game Server Services, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package io.gs2.gacha.control;

import org.json.JSONObject;
import java.util.List;
import io.gs2.gacha.model.*;
import io.gs2.gacha.Gs2Gacha;
import io.gs2.control.Gs2UserRequest;

/**
 * @author Game Server Services, Inc.
 */
@SuppressWarnings("serial")
public class DoGachaRequest extends Gs2UserRequest<DoGachaRequest> {

	public static class Constant extends Gs2Gacha.Constant {
		public static final String FUNCTION = "DoGacha";
	}

	/** ガチャプールの名前を指定します。 */
	private String gachaPoolName;

	/** ガチャの名前を指定します。 */
	private String gachaName;

	/** コンテキストデータ */
	private String context;


	/**
	 * ガチャプールの名前を指定します。を取得
	 *
	 * @return ガチャプールの名前を指定します。
	 */
	public String getGachaPoolName() {
		return gachaPoolName;
	}

	/**
	 * ガチャプールの名前を指定します。を設定
	 *
	 * @param gachaPoolName ガチャプールの名前を指定します。
	 */
	public void setGachaPoolName(String gachaPoolName) {
		this.gachaPoolName = gachaPoolName;
	}

	/**
	 * ガチャプールの名前を指定します。を設定
	 *
	 * @param gachaPoolName ガチャプールの名前を指定します。
	 * @return this
	 */
	public DoGachaRequest withGachaPoolName(String gachaPoolName) {
		setGachaPoolName(gachaPoolName);
		return this;
	}

	/**
	 * ガチャの名前を指定します。を取得
	 *
	 * @return ガチャの名前を指定します。
	 */
	public String getGachaName() {
		return gachaName;
	}

	/**
	 * ガチャの名前を指定します。を設定
	 *
	 * @param gachaName ガチャの名前を指定します。
	 */
	public void setGachaName(String gachaName) {
		this.gachaName = gachaName;
	}

	/**
	 * ガチャの名前を指定します。を設定
	 *
	 * @param gachaName ガチャの名前を指定します。
	 * @return this
	 */
	public DoGachaRequest withGachaName(String gachaName) {
		setGachaName(gachaName);
		return this;
	}

	/**
	 * コンテキストデータを取得
	 *
	 * @return コンテキストデータ
	 */
	public String getContext() {
		return context;
	}

	/**
	 * コンテキストデータを設定
	 *
	 * @param context コンテキストデータ
	 */
	public void setContext(String context) {
		this.context = context;
	}

	/**
	 * コンテキストデータを設定
	 *
	 * @param context コンテキストデータ
	 * @return this
	 */
	public DoGachaRequest withContext(String context) {
		setContext(context);
		return this;
	}

}