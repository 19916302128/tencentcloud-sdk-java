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

public class UserWorkloadGroup extends AbstractModel {

    /**
    * test
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * normal
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WorkloadGroupName")
    @Expose
    private String WorkloadGroupName;

    /**
     * Get test
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName test
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set test
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName test
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get normal
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WorkloadGroupName normal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWorkloadGroupName() {
        return this.WorkloadGroupName;
    }

    /**
     * Set normal
注意：此字段可能返回 null，表示取不到有效值。
     * @param WorkloadGroupName normal
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkloadGroupName(String WorkloadGroupName) {
        this.WorkloadGroupName = WorkloadGroupName;
    }

    public UserWorkloadGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserWorkloadGroup(UserWorkloadGroup source) {
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.WorkloadGroupName != null) {
            this.WorkloadGroupName = new String(source.WorkloadGroupName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "WorkloadGroupName", this.WorkloadGroupName);

    }
}

