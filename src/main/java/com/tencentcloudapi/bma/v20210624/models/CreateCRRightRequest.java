/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.bma.v20210624.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCRRightRequest extends AbstractModel{

    /**
    * 已存证的作品ID
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 侵权链接
    */
    @SerializedName("TortUrl")
    @Expose
    private String TortUrl;

    /**
    * 侵权标题
    */
    @SerializedName("TortTitle")
    @Expose
    private String TortTitle;

    /**
    * 侵权平台
    */
    @SerializedName("TortPlat")
    @Expose
    private String TortPlat;

    /**
    * 发函结果回调地址
    */
    @SerializedName("RightUrl")
    @Expose
    private String RightUrl;

    /**
    * x
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * x
    */
    @SerializedName("ValidStartDate")
    @Expose
    private String ValidStartDate;

    /**
    * x
    */
    @SerializedName("ValidEndDate")
    @Expose
    private String ValidEndDate;

    /**
    * x
    */
    @SerializedName("CommFileUrl")
    @Expose
    private String CommFileUrl;

    /**
    * x
    */
    @SerializedName("CommValidStartDate")
    @Expose
    private String CommValidStartDate;

    /**
    * x
    */
    @SerializedName("CommValidEndDate")
    @Expose
    private String CommValidEndDate;

    /**
    * x
    */
    @SerializedName("HomeFileUrl")
    @Expose
    private String HomeFileUrl;

    /**
    * x
    */
    @SerializedName("HomeValidStartDate")
    @Expose
    private String HomeValidStartDate;

    /**
    * x
    */
    @SerializedName("HomeValidEndDate")
    @Expose
    private String HomeValidEndDate;

    /**
    * x
    */
    @SerializedName("IsProducer")
    @Expose
    private String IsProducer;

    /**
     * Get 已存证的作品ID 
     * @return WorkId 已存证的作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 已存证的作品ID
     * @param WorkId 已存证的作品ID
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 侵权链接 
     * @return TortUrl 侵权链接
     */
    public String getTortUrl() {
        return this.TortUrl;
    }

    /**
     * Set 侵权链接
     * @param TortUrl 侵权链接
     */
    public void setTortUrl(String TortUrl) {
        this.TortUrl = TortUrl;
    }

    /**
     * Get 侵权标题 
     * @return TortTitle 侵权标题
     */
    public String getTortTitle() {
        return this.TortTitle;
    }

    /**
     * Set 侵权标题
     * @param TortTitle 侵权标题
     */
    public void setTortTitle(String TortTitle) {
        this.TortTitle = TortTitle;
    }

    /**
     * Get 侵权平台 
     * @return TortPlat 侵权平台
     */
    public String getTortPlat() {
        return this.TortPlat;
    }

    /**
     * Set 侵权平台
     * @param TortPlat 侵权平台
     */
    public void setTortPlat(String TortPlat) {
        this.TortPlat = TortPlat;
    }

    /**
     * Get 发函结果回调地址 
     * @return RightUrl 发函结果回调地址
     */
    public String getRightUrl() {
        return this.RightUrl;
    }

    /**
     * Set 发函结果回调地址
     * @param RightUrl 发函结果回调地址
     */
    public void setRightUrl(String RightUrl) {
        this.RightUrl = RightUrl;
    }

    /**
     * Get x 
     * @return FileUrl x
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set x
     * @param FileUrl x
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get x 
     * @return ValidStartDate x
     */
    public String getValidStartDate() {
        return this.ValidStartDate;
    }

    /**
     * Set x
     * @param ValidStartDate x
     */
    public void setValidStartDate(String ValidStartDate) {
        this.ValidStartDate = ValidStartDate;
    }

    /**
     * Get x 
     * @return ValidEndDate x
     */
    public String getValidEndDate() {
        return this.ValidEndDate;
    }

    /**
     * Set x
     * @param ValidEndDate x
     */
    public void setValidEndDate(String ValidEndDate) {
        this.ValidEndDate = ValidEndDate;
    }

    /**
     * Get x 
     * @return CommFileUrl x
     */
    public String getCommFileUrl() {
        return this.CommFileUrl;
    }

    /**
     * Set x
     * @param CommFileUrl x
     */
    public void setCommFileUrl(String CommFileUrl) {
        this.CommFileUrl = CommFileUrl;
    }

    /**
     * Get x 
     * @return CommValidStartDate x
     */
    public String getCommValidStartDate() {
        return this.CommValidStartDate;
    }

    /**
     * Set x
     * @param CommValidStartDate x
     */
    public void setCommValidStartDate(String CommValidStartDate) {
        this.CommValidStartDate = CommValidStartDate;
    }

    /**
     * Get x 
     * @return CommValidEndDate x
     */
    public String getCommValidEndDate() {
        return this.CommValidEndDate;
    }

    /**
     * Set x
     * @param CommValidEndDate x
     */
    public void setCommValidEndDate(String CommValidEndDate) {
        this.CommValidEndDate = CommValidEndDate;
    }

    /**
     * Get x 
     * @return HomeFileUrl x
     */
    public String getHomeFileUrl() {
        return this.HomeFileUrl;
    }

    /**
     * Set x
     * @param HomeFileUrl x
     */
    public void setHomeFileUrl(String HomeFileUrl) {
        this.HomeFileUrl = HomeFileUrl;
    }

    /**
     * Get x 
     * @return HomeValidStartDate x
     */
    public String getHomeValidStartDate() {
        return this.HomeValidStartDate;
    }

    /**
     * Set x
     * @param HomeValidStartDate x
     */
    public void setHomeValidStartDate(String HomeValidStartDate) {
        this.HomeValidStartDate = HomeValidStartDate;
    }

    /**
     * Get x 
     * @return HomeValidEndDate x
     */
    public String getHomeValidEndDate() {
        return this.HomeValidEndDate;
    }

    /**
     * Set x
     * @param HomeValidEndDate x
     */
    public void setHomeValidEndDate(String HomeValidEndDate) {
        this.HomeValidEndDate = HomeValidEndDate;
    }

    /**
     * Get x 
     * @return IsProducer x
     */
    public String getIsProducer() {
        return this.IsProducer;
    }

    /**
     * Set x
     * @param IsProducer x
     */
    public void setIsProducer(String IsProducer) {
        this.IsProducer = IsProducer;
    }

    public CreateCRRightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateCRRightRequest(CreateCRRightRequest source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.TortUrl != null) {
            this.TortUrl = new String(source.TortUrl);
        }
        if (source.TortTitle != null) {
            this.TortTitle = new String(source.TortTitle);
        }
        if (source.TortPlat != null) {
            this.TortPlat = new String(source.TortPlat);
        }
        if (source.RightUrl != null) {
            this.RightUrl = new String(source.RightUrl);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.ValidStartDate != null) {
            this.ValidStartDate = new String(source.ValidStartDate);
        }
        if (source.ValidEndDate != null) {
            this.ValidEndDate = new String(source.ValidEndDate);
        }
        if (source.CommFileUrl != null) {
            this.CommFileUrl = new String(source.CommFileUrl);
        }
        if (source.CommValidStartDate != null) {
            this.CommValidStartDate = new String(source.CommValidStartDate);
        }
        if (source.CommValidEndDate != null) {
            this.CommValidEndDate = new String(source.CommValidEndDate);
        }
        if (source.HomeFileUrl != null) {
            this.HomeFileUrl = new String(source.HomeFileUrl);
        }
        if (source.HomeValidStartDate != null) {
            this.HomeValidStartDate = new String(source.HomeValidStartDate);
        }
        if (source.HomeValidEndDate != null) {
            this.HomeValidEndDate = new String(source.HomeValidEndDate);
        }
        if (source.IsProducer != null) {
            this.IsProducer = new String(source.IsProducer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "TortUrl", this.TortUrl);
        this.setParamSimple(map, prefix + "TortTitle", this.TortTitle);
        this.setParamSimple(map, prefix + "TortPlat", this.TortPlat);
        this.setParamSimple(map, prefix + "RightUrl", this.RightUrl);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "ValidStartDate", this.ValidStartDate);
        this.setParamSimple(map, prefix + "ValidEndDate", this.ValidEndDate);
        this.setParamSimple(map, prefix + "CommFileUrl", this.CommFileUrl);
        this.setParamSimple(map, prefix + "CommValidStartDate", this.CommValidStartDate);
        this.setParamSimple(map, prefix + "CommValidEndDate", this.CommValidEndDate);
        this.setParamSimple(map, prefix + "HomeFileUrl", this.HomeFileUrl);
        this.setParamSimple(map, prefix + "HomeValidStartDate", this.HomeValidStartDate);
        this.setParamSimple(map, prefix + "HomeValidEndDate", this.HomeValidEndDate);
        this.setParamSimple(map, prefix + "IsProducer", this.IsProducer);

    }
}
