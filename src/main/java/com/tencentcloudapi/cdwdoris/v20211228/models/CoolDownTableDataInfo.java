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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoolDownTableDataInfo extends AbstractModel {

    /**
    * 列：DatabaseName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DatabaseName")
    @Expose
    private String DatabaseName;

    /**
    * 列：TableName
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 列：Size
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 列：RemoteSize
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteSize")
    @Expose
    private String RemoteSize;

    /**
     * Get 列：DatabaseName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DatabaseName 列：DatabaseName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDatabaseName() {
        return this.DatabaseName;
    }

    /**
     * Set 列：DatabaseName
注意：此字段可能返回 null，表示取不到有效值。
     * @param DatabaseName 列：DatabaseName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDatabaseName(String DatabaseName) {
        this.DatabaseName = DatabaseName;
    }

    /**
     * Get 列：TableName
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TableName 列：TableName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 列：TableName
注意：此字段可能返回 null，表示取不到有效值。
     * @param TableName 列：TableName
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 列：Size
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size 列：Size
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 列：Size
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size 列：Size
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 列：RemoteSize
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteSize 列：RemoteSize
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteSize() {
        return this.RemoteSize;
    }

    /**
     * Set 列：RemoteSize
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteSize 列：RemoteSize
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteSize(String RemoteSize) {
        this.RemoteSize = RemoteSize;
    }

    public CoolDownTableDataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoolDownTableDataInfo(CoolDownTableDataInfo source) {
        if (source.DatabaseName != null) {
            this.DatabaseName = new String(source.DatabaseName);
        }
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.RemoteSize != null) {
            this.RemoteSize = new String(source.RemoteSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DatabaseName", this.DatabaseName);
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "RemoteSize", this.RemoteSize);

    }
}

