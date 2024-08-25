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
package com.tencentcloudapi.lcic.v20220817.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleStreamInfo extends AbstractModel {

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopTime")
    @Expose
    private Long StopTime;

    /**
    * 总时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * 文件格式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileFormat")
    @Expose
    private String FileFormat;

    /**
    * 流url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordUrl")
    @Expose
    private String RecordUrl;

    /**
    * 流大小
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordSize")
    @Expose
    private Long RecordSize;

    /**
    * 流ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VideoId")
    @Expose
    private String VideoId;

    /**
    * 流类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Role")
    @Expose
    private String Role;

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStopTime() {
        return this.StopTime;
    }

    /**
     * Set 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopTime(Long StopTime) {
        this.StopTime = StopTime;
    }

    /**
     * Get 总时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Duration 总时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set 总时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Duration 总时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get 文件格式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileFormat 文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileFormat() {
        return this.FileFormat;
    }

    /**
     * Set 文件格式
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileFormat 文件格式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileFormat(String FileFormat) {
        this.FileFormat = FileFormat;
    }

    /**
     * Get 流url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordUrl 流url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordUrl() {
        return this.RecordUrl;
    }

    /**
     * Set 流url
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordUrl 流url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordUrl(String RecordUrl) {
        this.RecordUrl = RecordUrl;
    }

    /**
     * Get 流大小
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordSize 流大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRecordSize() {
        return this.RecordSize;
    }

    /**
     * Set 流大小
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordSize 流大小
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordSize(Long RecordSize) {
        this.RecordSize = RecordSize;
    }

    /**
     * Get 流ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VideoId 流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVideoId() {
        return this.VideoId;
    }

    /**
     * Set 流ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VideoId 流ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    /**
     * Get 流类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Role 流类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRole() {
        return this.Role;
    }

    /**
     * Set 流类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Role 流类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRole(String Role) {
        this.Role = Role;
    }

    public SingleStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SingleStreamInfo(SingleStreamInfo source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.StopTime != null) {
            this.StopTime = new Long(source.StopTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.FileFormat != null) {
            this.FileFormat = new String(source.FileFormat);
        }
        if (source.RecordUrl != null) {
            this.RecordUrl = new String(source.RecordUrl);
        }
        if (source.RecordSize != null) {
            this.RecordSize = new Long(source.RecordSize);
        }
        if (source.VideoId != null) {
            this.VideoId = new String(source.VideoId);
        }
        if (source.Role != null) {
            this.Role = new String(source.Role);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "StopTime", this.StopTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "FileFormat", this.FileFormat);
        this.setParamSimple(map, prefix + "RecordUrl", this.RecordUrl);
        this.setParamSimple(map, prefix + "RecordSize", this.RecordSize);
        this.setParamSimple(map, prefix + "VideoId", this.VideoId);
        this.setParamSimple(map, prefix + "Role", this.Role);

    }
}

