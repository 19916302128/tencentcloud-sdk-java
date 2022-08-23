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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWebManagedRulesLogRequest extends AbstractModel{

    /**
    * 起始时间。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页拉取的最大返回结果数。最大值：1000。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 分页拉取的起始页号。最小值：1。
    */
    @SerializedName("PageNo")
    @Expose
    private Long PageNo;

    /**
    * 站点集合，不填默认选择全部站点。
    */
    @SerializedName("ZoneIds")
    @Expose
    private String [] ZoneIds;

    /**
    * 域名集合，不填默认选择全部子域名。
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 筛选条件，取值有：
<li>attackType ：攻击类型 ；</li>
<li>riskLevel ：风险等级 ；</li>
<li>action ：执行动作（处置方式） ；</li>
<li>ruleId ：规则id ；</li>
<li>sipCountryCode ：ip所在国家 ；</li>
<li>attackIp ：攻击ip ；</li>
<li>oriDomain ：被攻击的子域名 ；</li>
<li>eventId ：事件id ；</li>
<li>ua ：用户代理 ；</li>
<li>requestMethod ：请求方法 ；</li>
<li>uri ：统一资源标识符 。</li>
    */
    @SerializedName("QueryCondition")
    @Expose
    private QueryCondition [] QueryCondition;

    /**
    * 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 起始时间。 
     * @return StartTime 起始时间。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间。
     * @param StartTime 起始时间。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。 
     * @return EndTime 结束时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。
     * @param EndTime 结束时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 分页拉取的最大返回结果数。最大值：1000。 
     * @return PageSize 分页拉取的最大返回结果数。最大值：1000。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 分页拉取的最大返回结果数。最大值：1000。
     * @param PageSize 分页拉取的最大返回结果数。最大值：1000。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 分页拉取的起始页号。最小值：1。 
     * @return PageNo 分页拉取的起始页号。最小值：1。
     */
    public Long getPageNo() {
        return this.PageNo;
    }

    /**
     * Set 分页拉取的起始页号。最小值：1。
     * @param PageNo 分页拉取的起始页号。最小值：1。
     */
    public void setPageNo(Long PageNo) {
        this.PageNo = PageNo;
    }

    /**
     * Get 站点集合，不填默认选择全部站点。 
     * @return ZoneIds 站点集合，不填默认选择全部站点。
     */
    public String [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set 站点集合，不填默认选择全部站点。
     * @param ZoneIds 站点集合，不填默认选择全部站点。
     */
    public void setZoneIds(String [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get 域名集合，不填默认选择全部子域名。 
     * @return Domains 域名集合，不填默认选择全部子域名。
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名集合，不填默认选择全部子域名。
     * @param Domains 域名集合，不填默认选择全部子域名。
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
    }

    /**
     * Get 筛选条件，取值有：
<li>attackType ：攻击类型 ；</li>
<li>riskLevel ：风险等级 ；</li>
<li>action ：执行动作（处置方式） ；</li>
<li>ruleId ：规则id ；</li>
<li>sipCountryCode ：ip所在国家 ；</li>
<li>attackIp ：攻击ip ；</li>
<li>oriDomain ：被攻击的子域名 ；</li>
<li>eventId ：事件id ；</li>
<li>ua ：用户代理 ；</li>
<li>requestMethod ：请求方法 ；</li>
<li>uri ：统一资源标识符 。</li> 
     * @return QueryCondition 筛选条件，取值有：
<li>attackType ：攻击类型 ；</li>
<li>riskLevel ：风险等级 ；</li>
<li>action ：执行动作（处置方式） ；</li>
<li>ruleId ：规则id ；</li>
<li>sipCountryCode ：ip所在国家 ；</li>
<li>attackIp ：攻击ip ；</li>
<li>oriDomain ：被攻击的子域名 ；</li>
<li>eventId ：事件id ；</li>
<li>ua ：用户代理 ；</li>
<li>requestMethod ：请求方法 ；</li>
<li>uri ：统一资源标识符 。</li>
     */
    public QueryCondition [] getQueryCondition() {
        return this.QueryCondition;
    }

    /**
     * Set 筛选条件，取值有：
<li>attackType ：攻击类型 ；</li>
<li>riskLevel ：风险等级 ；</li>
<li>action ：执行动作（处置方式） ；</li>
<li>ruleId ：规则id ；</li>
<li>sipCountryCode ：ip所在国家 ；</li>
<li>attackIp ：攻击ip ；</li>
<li>oriDomain ：被攻击的子域名 ；</li>
<li>eventId ：事件id ；</li>
<li>ua ：用户代理 ；</li>
<li>requestMethod ：请求方法 ；</li>
<li>uri ：统一资源标识符 。</li>
     * @param QueryCondition 筛选条件，取值有：
<li>attackType ：攻击类型 ；</li>
<li>riskLevel ：风险等级 ；</li>
<li>action ：执行动作（处置方式） ；</li>
<li>ruleId ：规则id ；</li>
<li>sipCountryCode ：ip所在国家 ；</li>
<li>attackIp ：攻击ip ；</li>
<li>oriDomain ：被攻击的子域名 ；</li>
<li>eventId ：事件id ；</li>
<li>ua ：用户代理 ；</li>
<li>requestMethod ：请求方法 ；</li>
<li>uri ：统一资源标识符 。</li>
     */
    public void setQueryCondition(QueryCondition [] QueryCondition) {
        this.QueryCondition = QueryCondition;
    }

    /**
     * Get 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。 
     * @return Area 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     * @param Area 数据归属地区，取值有：
<li>overseas ：全球（除中国大陆地区）数据 ；</li>
<li>mainland ：中国大陆地区数据 。</li>不填默认查询overseas。
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public DescribeWebManagedRulesLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWebManagedRulesLogRequest(DescribeWebManagedRulesLogRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNo != null) {
            this.PageNo = new Long(source.PageNo);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new String[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new String(source.ZoneIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.QueryCondition != null) {
            this.QueryCondition = new QueryCondition[source.QueryCondition.length];
            for (int i = 0; i < source.QueryCondition.length; i++) {
                this.QueryCondition[i] = new QueryCondition(source.QueryCondition[i]);
            }
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamArrayObj(map, prefix + "QueryCondition.", this.QueryCondition);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

