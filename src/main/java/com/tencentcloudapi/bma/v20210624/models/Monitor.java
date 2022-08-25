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

public class Monitor extends AbstractModel{

    /**
    * 作品ID
    */
    @SerializedName("WorkId")
    @Expose
    private Long WorkId;

    /**
    * 作品名称
    */
    @SerializedName("WorkName")
    @Expose
    private String WorkName;

    /**
    * 作品内容类型 01-视频 02-音频 03-文本 04-图片
    */
    @SerializedName("WorkType")
    @Expose
    private String WorkType;

    /**
    * 侵权平台数量
    */
    @SerializedName("TortPlatNum")
    @Expose
    private Long TortPlatNum;

    /**
    * 侵权链接数量
    */
    @SerializedName("TortURLNum")
    @Expose
    private Long TortURLNum;

    /**
    * 监测时间
    */
    @SerializedName("MonitorTime")
    @Expose
    private String MonitorTime;

    /**
    * 0-待监测 1-监测中 2-不监测 3-暂停监测
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 作品类型
    */
    @SerializedName("WorkCategory")
    @Expose
    private String WorkCategory;

    /**
    * xx
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * xx
    */
    @SerializedName("MonitorNote")
    @Expose
    private String MonitorNote;

    /**
     * Get 作品ID 
     * @return WorkId 作品ID
     */
    public Long getWorkId() {
        return this.WorkId;
    }

    /**
     * Set 作品ID
     * @param WorkId 作品ID
     */
    public void setWorkId(Long WorkId) {
        this.WorkId = WorkId;
    }

    /**
     * Get 作品名称 
     * @return WorkName 作品名称
     */
    public String getWorkName() {
        return this.WorkName;
    }

    /**
     * Set 作品名称
     * @param WorkName 作品名称
     */
    public void setWorkName(String WorkName) {
        this.WorkName = WorkName;
    }

    /**
     * Get 作品内容类型 01-视频 02-音频 03-文本 04-图片 
     * @return WorkType 作品内容类型 01-视频 02-音频 03-文本 04-图片
     */
    public String getWorkType() {
        return this.WorkType;
    }

    /**
     * Set 作品内容类型 01-视频 02-音频 03-文本 04-图片
     * @param WorkType 作品内容类型 01-视频 02-音频 03-文本 04-图片
     */
    public void setWorkType(String WorkType) {
        this.WorkType = WorkType;
    }

    /**
     * Get 侵权平台数量 
     * @return TortPlatNum 侵权平台数量
     */
    public Long getTortPlatNum() {
        return this.TortPlatNum;
    }

    /**
     * Set 侵权平台数量
     * @param TortPlatNum 侵权平台数量
     */
    public void setTortPlatNum(Long TortPlatNum) {
        this.TortPlatNum = TortPlatNum;
    }

    /**
     * Get 侵权链接数量 
     * @return TortURLNum 侵权链接数量
     */
    public Long getTortURLNum() {
        return this.TortURLNum;
    }

    /**
     * Set 侵权链接数量
     * @param TortURLNum 侵权链接数量
     */
    public void setTortURLNum(Long TortURLNum) {
        this.TortURLNum = TortURLNum;
    }

    /**
     * Get 监测时间 
     * @return MonitorTime 监测时间
     */
    public String getMonitorTime() {
        return this.MonitorTime;
    }

    /**
     * Set 监测时间
     * @param MonitorTime 监测时间
     */
    public void setMonitorTime(String MonitorTime) {
        this.MonitorTime = MonitorTime;
    }

    /**
     * Get 0-待监测 1-监测中 2-不监测 3-暂停监测 
     * @return MonitorStatus 0-待监测 1-监测中 2-不监测 3-暂停监测
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 0-待监测 1-监测中 2-不监测 3-暂停监测
     * @param MonitorStatus 0-待监测 1-监测中 2-不监测 3-暂停监测
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 作品类型 
     * @return WorkCategory 作品类型
     */
    public String getWorkCategory() {
        return this.WorkCategory;
    }

    /**
     * Set 作品类型
     * @param WorkCategory 作品类型
     */
    public void setWorkCategory(String WorkCategory) {
        this.WorkCategory = WorkCategory;
    }

    /**
     * Get xx 
     * @return InsertTime xx
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set xx
     * @param InsertTime xx
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get xx 
     * @return MonitorNote xx
     */
    public String getMonitorNote() {
        return this.MonitorNote;
    }

    /**
     * Set xx
     * @param MonitorNote xx
     */
    public void setMonitorNote(String MonitorNote) {
        this.MonitorNote = MonitorNote;
    }

    public Monitor() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Monitor(Monitor source) {
        if (source.WorkId != null) {
            this.WorkId = new Long(source.WorkId);
        }
        if (source.WorkName != null) {
            this.WorkName = new String(source.WorkName);
        }
        if (source.WorkType != null) {
            this.WorkType = new String(source.WorkType);
        }
        if (source.TortPlatNum != null) {
            this.TortPlatNum = new Long(source.TortPlatNum);
        }
        if (source.TortURLNum != null) {
            this.TortURLNum = new Long(source.TortURLNum);
        }
        if (source.MonitorTime != null) {
            this.MonitorTime = new String(source.MonitorTime);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.WorkCategory != null) {
            this.WorkCategory = new String(source.WorkCategory);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.MonitorNote != null) {
            this.MonitorNote = new String(source.MonitorNote);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkId", this.WorkId);
        this.setParamSimple(map, prefix + "WorkName", this.WorkName);
        this.setParamSimple(map, prefix + "WorkType", this.WorkType);
        this.setParamSimple(map, prefix + "TortPlatNum", this.TortPlatNum);
        this.setParamSimple(map, prefix + "TortURLNum", this.TortURLNum);
        this.setParamSimple(map, prefix + "MonitorTime", this.MonitorTime);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "WorkCategory", this.WorkCategory);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "MonitorNote", this.MonitorNote);

    }
}
