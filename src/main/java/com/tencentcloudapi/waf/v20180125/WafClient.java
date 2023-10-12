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
package com.tencentcloudapi.waf.v20180125;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.waf.v20180125.models.*;

public class WafClient extends AbstractClient{
    private static String endpoint = "waf.tencentcloudapi.com";
    private static String service = "waf";
    private static String version = "2018-01-25";
    
    public WafClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public WafClient(Credential credential, String region, ClientProfile profile) {
        super(WafClient.endpoint, WafClient.version, credential, region, profile);
    }

    /**
     *添加防篡改url
     * @param req AddAntiFakeUrlRequest
     * @return AddAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public AddAntiFakeUrlResponse AddAntiFakeUrl(AddAntiFakeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAntiFakeUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddAntiFakeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAntiFakeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加信息防泄漏规则
     * @param req AddAntiInfoLeakRulesRequest
     * @return AddAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public AddAntiInfoLeakRulesResponse AddAntiInfoLeakRules(AddAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddAntiInfoLeakRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddAntiInfoLeakRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddAntiInfoLeakRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加访问控制（自定义策略）
     * @param req AddCustomRuleRequest
     * @return AddCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomRuleResponse AddCustomRule(AddCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCustomRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加精准白名单规则
     * @param req AddCustomWhiteRuleRequest
     * @return AddCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddCustomWhiteRuleResponse AddCustomWhiteRule(AddCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddCustomWhiteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddCustomWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddCustomWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *增加域名规则白名单
     * @param req AddDomainWhiteRuleRequest
     * @return AddDomainWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public AddDomainWhiteRuleResponse AddDomainWhiteRule(AddDomainWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddDomainWhiteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddDomainWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddDomainWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加SaaS型WAF防护域名
     * @param req AddSpartaProtectionRequest
     * @return AddSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public AddSpartaProtectionResponse AddSpartaProtection(AddSpartaProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddSpartaProtectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<AddSpartaProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "AddSpartaProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于创建访问日志导出
     * @param req CreateAccessExportRequest
     * @return CreateAccessExportResponse
     * @throws TencentCloudSDKException
     */
    public CreateAccessExportResponse CreateAccessExport(CreateAccessExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAccessExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateAccessExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateAccessExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf中添加防护域名
     * @param req CreateHostRequest
     * @return CreateHostResponse
     * @throws TencentCloudSDKException
     */
    public CreateHostResponse CreateHost(CreateHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<CreateHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于删除访问日志导出
     * @param req DeleteAccessExportRequest
     * @return DeleteAccessExportResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAccessExportResponse DeleteAccessExport(DeleteAccessExportRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAccessExportResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAccessExportResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAccessExport");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除防篡改url
     * @param req DeleteAntiFakeUrlRequest
     * @return DeleteAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAntiFakeUrlResponse DeleteAntiFakeUrl(DeleteAntiFakeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAntiFakeUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAntiFakeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAntiFakeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *信息防泄漏删除规则
     * @param req DeleteAntiInfoLeakRuleRequest
     * @return DeleteAntiInfoLeakRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAntiInfoLeakRuleResponse DeleteAntiInfoLeakRule(DeleteAntiInfoLeakRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAntiInfoLeakRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAntiInfoLeakRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAntiInfoLeakRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除攻击日志下载任务记录
     * @param req DeleteAttackDownloadRecordRequest
     * @return DeleteAttackDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAttackDownloadRecordResponse DeleteAttackDownloadRecord(DeleteAttackDownloadRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAttackDownloadRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteAttackDownloadRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteAttackDownloadRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf  CC V2 Delete接口
     * @param req DeleteCCRuleRequest
     * @return DeleteCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCCRuleResponse DeleteCCRule(DeleteCCRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCCRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCCRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCCRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除自定义规则
     * @param req DeleteCustomRuleRequest
     * @return DeleteCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomRuleResponse DeleteCustomRule(DeleteCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除精准白名单规则
     * @param req DeleteCustomWhiteRuleRequest
     * @return DeleteCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomWhiteRuleResponse DeleteCustomWhiteRule(DeleteCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomWhiteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCustomWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteCustomWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除域名规则白名单
     * @param req DeleteDomainWhiteRulesRequest
     * @return DeleteDomainWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDomainWhiteRulesResponse DeleteDomainWhiteRules(DeleteDomainWhiteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDomainWhiteRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDomainWhiteRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDomainWhiteRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除访问日志下载记录
     * @param req DeleteDownloadRecordRequest
     * @return DeleteDownloadRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDownloadRecordResponse DeleteDownloadRecord(DeleteDownloadRecordRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDownloadRecordResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDownloadRecordResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDownloadRecord");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除CLB-WAF防护域名
支持批量操作
     * @param req DeleteHostRequest
     * @return DeleteHostResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHostResponse DeleteHost(DeleteHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf IP黑白名单Delete接口
     * @param req DeleteIpAccessControlRequest
     * @return DeleteIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DeleteIpAccessControlResponse DeleteIpAccessControl(DeleteIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteIpAccessControlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除CC攻击的session设置
     * @param req DeleteSessionRequest
     * @return DeleteSessionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSessionResponse DeleteSession(DeleteSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Saas型WAF删除防护域名
     * @param req DeleteSpartaProtectionRequest
     * @return DeleteSpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSpartaProtectionResponse DeleteSpartaProtection(DeleteSpartaProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSpartaProtectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteSpartaProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteSpartaProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取访问日志导出列表
     * @param req DescribeAccessExportsRequest
     * @return DescribeAccessExportsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessExportsResponse DescribeAccessExports(DescribeAccessExportsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessExportsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessExportsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessExports");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于访问日志的快速分析
     * @param req DescribeAccessFastAnalysisRequest
     * @return DescribeAccessFastAnalysisResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessFastAnalysisResponse DescribeAccessFastAnalysis(DescribeAccessFastAnalysisRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessFastAnalysisResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessFastAnalysisResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessFastAnalysis");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于访问日志柱状趋势图
     * @param req DescribeAccessHistogramRequest
     * @return DescribeAccessHistogramResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessHistogramResponse DescribeAccessHistogram(DescribeAccessHistogramRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessHistogramResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessHistogramResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessHistogram");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于获取访问日志索引配置信息
     * @param req DescribeAccessIndexRequest
     * @return DescribeAccessIndexResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccessIndexResponse DescribeAccessIndex(DescribeAccessIndexRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccessIndexResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAccessIndexResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAccessIndex");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防篡改url
     * @param req DescribeAntiFakeRulesRequest
     * @return DescribeAntiFakeRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiFakeRulesResponse DescribeAntiFakeRules(DescribeAntiFakeRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAntiFakeRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAntiFakeRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAntiFakeRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防篡改url
     * @param req DescribeAntiFakeUrlRequest
     * @return DescribeAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiFakeUrlResponse DescribeAntiFakeUrl(DescribeAntiFakeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAntiFakeUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAntiFakeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAntiFakeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *老接口已经不再使用。

获取信息防泄漏规则列表
     * @param req DescribeAntiInfoLeakRulesRequest
     * @return DescribeAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiInfoLeakRulesResponse DescribeAntiInfoLeakRules(DescribeAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAntiInfoLeakRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAntiInfoLeakRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAntiInfoLeakRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *取得信息防泄漏规则列表
     * @param req DescribeAntiInfoLeakageRulesRequest
     * @return DescribeAntiInfoLeakageRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAntiInfoLeakageRulesResponse DescribeAntiInfoLeakageRules(DescribeAntiInfoLeakageRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAntiInfoLeakageRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAntiInfoLeakageRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAntiInfoLeakageRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *攻击总览
     * @param req DescribeAttackOverviewRequest
     * @return DescribeAttackOverviewResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAttackOverviewResponse DescribeAttackOverview(DescribeAttackOverviewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAttackOverviewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAttackOverviewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAttackOverview");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接口已废弃

描述WAF自动封禁IP详情,对齐自动封堵状态
     * @param req DescribeAutoDenyIPRequest
     * @return DescribeAutoDenyIPResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAutoDenyIPResponse DescribeAutoDenyIP(DescribeAutoDenyIPRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAutoDenyIPResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAutoDenyIPResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeAutoDenyIP");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf 多域名ip黑白名单查询
     * @param req DescribeBatchIpAccessControlRequest
     * @return DescribeBatchIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchIpAccessControlResponse DescribeBatchIpAccessControl(DescribeBatchIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBatchIpAccessControlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBatchIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeBatchIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf  CC V2 Query接口
     * @param req DescribeCCRuleRequest
     * @return DescribeCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCRuleResponse DescribeCCRule(DescribeCCRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据多条件查询CC规则
     * @param req DescribeCCRuleListRequest
     * @return DescribeCCRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCCRuleListResponse DescribeCCRuleList(DescribeCCRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCCRuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCCRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCCRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取证书的检查结果
     * @param req DescribeCertificateVerifyResultRequest
     * @return DescribeCertificateVerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertificateVerifyResultResponse DescribeCertificateVerifyResult(DescribeCertificateVerifyResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertificateVerifyResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertificateVerifyResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCertificateVerifyResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Saas型WAF接入查询加密套件信息
     * @param req DescribeCiphersDetailRequest
     * @return DescribeCiphersDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCiphersDetailResponse DescribeCiphersDetail(DescribeCiphersDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCiphersDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCiphersDetailResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCiphersDetail");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防护配置中的访问控制策略列表
     * @param req DescribeCustomRuleListRequest
     * @return DescribeCustomRuleListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomRuleListResponse DescribeCustomRuleList(DescribeCustomRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomRuleListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防护配置中的精准白名单策略列表
     * @param req DescribeCustomWhiteRuleRequest
     * @return DescribeCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomWhiteRuleResponse DescribeCustomWhiteRule(DescribeCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomWhiteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCustomWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeCustomWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名概况
     * @param req DescribeDomainCountInfoRequest
     * @return DescribeDomainCountInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainCountInfoResponse DescribeDomainCountInfo(DescribeDomainCountInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainCountInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainCountInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainCountInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取一个clbwaf域名详情
     * @param req DescribeDomainDetailsClbRequest
     * @return DescribeDomainDetailsClbResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainDetailsClbResponse DescribeDomainDetailsClb(DescribeDomainDetailsClbRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainDetailsClbResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainDetailsClbResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainDetailsClb");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询单个saaswaf域名详情
     * @param req DescribeDomainDetailsSaasRequest
     * @return DescribeDomainDetailsSaasResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainDetailsSaasResponse DescribeDomainDetailsSaas(DescribeDomainDetailsSaasRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainDetailsSaasResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainDetailsSaasResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainDetailsSaas");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *拉取域名的防护规则列表
     * @param req DescribeDomainRulesRequest
     * @return DescribeDomainRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainRulesResponse DescribeDomainRules(DescribeDomainRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取添加域名操作的结果
     * @param req DescribeDomainVerifyResultRequest
     * @return DescribeDomainVerifyResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainVerifyResultResponse DescribeDomainVerifyResult(DescribeDomainVerifyResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainVerifyResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainVerifyResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainVerifyResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取域名的规则白名单
     * @param req DescribeDomainWhiteRulesRequest
     * @return DescribeDomainWhiteRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainWhiteRulesResponse DescribeDomainWhiteRules(DescribeDomainWhiteRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainWhiteRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainWhiteRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomainWhiteRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户所有域名的详细信息
     * @param req DescribeDomainsRequest
     * @return DescribeDomainsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDomainsResponse DescribeDomains(DescribeDomainsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDomainsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDomainsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDomains");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取发现域名列表接口
     * @param req DescribeFindDomainListRequest
     * @return DescribeFindDomainListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFindDomainListResponse DescribeFindDomainList(DescribeFindDomainListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFindDomainListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFindDomainListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFindDomainList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取waf流量访问趋势
     * @param req DescribeFlowTrendRequest
     * @return DescribeFlowTrendResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowTrendResponse DescribeFlowTrend(DescribeFlowTrendRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowTrendResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFlowTrendResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFlowTrend");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf获取防护域名详情
     * @param req DescribeHostRequest
     * @return DescribeHostResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostResponse DescribeHost(DescribeHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *添加域名的首先验证是否购买了套餐，是否没有达到购买套餐的限制，域名是否已经添加
     * @param req DescribeHostLimitRequest
     * @return DescribeHostLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostLimitResponse DescribeHostLimit(DescribeHostLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHostLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf中获取防护域名列表
     * @param req DescribeHostsRequest
     * @return DescribeHostsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHostsResponse DescribeHosts(DescribeHostsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHostsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeHostsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeHosts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户所有实例的详细信息
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeInstances");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf ip黑白名单查询
     * @param req DescribeIpAccessControlRequest
     * @return DescribeIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpAccessControlResponse DescribeIpAccessControl(DescribeIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpAccessControlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf  IP封堵状态查询
     * @param req DescribeIpHitItemsRequest
     * @return DescribeIpHitItemsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpHitItemsResponse DescribeIpHitItems(DescribeIpHitItemsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpHitItemsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeIpHitItemsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeIpHitItems");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查看防护对象列表
     * @param req DescribeObjectsRequest
     * @return DescribeObjectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeObjectsResponse DescribeObjects(DescribeObjectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeObjectsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeObjectsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeObjects");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询业务和攻击概要趋势
     * @param req DescribePeakPointsRequest
     * @return DescribePeakPointsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakPointsResponse DescribePeakPoints(DescribePeakPointsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePeakPointsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePeakPointsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePeakPoints");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取业务和攻击概览峰值
     * @param req DescribePeakValueRequest
     * @return DescribePeakValueResponse
     * @throws TencentCloudSDKException
     */
    public DescribePeakValueResponse DescribePeakValue(DescribePeakValueRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePeakValueResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePeakValueResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePeakValue");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取防护状态以及生效的实例id
     * @param req DescribePolicyStatusRequest
     * @return DescribePolicyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribePolicyStatusResponse DescribePolicyStatus(DescribePolicyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePolicyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePolicyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePolicyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取Saas型WAF防护端口列表
     * @param req DescribePortsRequest
     * @return DescribePortsResponse
     * @throws TencentCloudSDKException
     */
    public DescribePortsResponse DescribePorts(DescribePortsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribePortsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribePortsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribePorts");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取各个模块具体的规格限制
     * @param req DescribeRuleLimitRequest
     * @return DescribeRuleLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuleLimitResponse DescribeRuleLimit(DescribeRuleLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuleLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuleLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeRuleLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf 会话定义查询接口
     * @param req DescribeSessionRequest
     * @return DescribeSessionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSessionResponse DescribeSession(DescribeSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询用户TLS版本
     * @param req DescribeTlsVersionRequest
     * @return DescribeTlsVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTlsVersionResponse DescribeTlsVersion(DescribeTlsVersionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTlsVersionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTlsVersionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTlsVersion");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在CDC场景下，负载均衡型WAF的添加、编辑域名配置的时候，需要展示CDC负载均衡型WAF（cdc-clb-waf)支持的地域列表，通过DescribeUserCdcClbWafRegions既可以获得当前对客户已经开放的地域列表
     * @param req DescribeUserCdcClbWafRegionsRequest
     * @return DescribeUserCdcClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserCdcClbWafRegionsResponse DescribeUserCdcClbWafRegions(DescribeUserCdcClbWafRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserCdcClbWafRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserCdcClbWafRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserCdcClbWafRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *在负载均衡型WAF的添加、编辑域名配置的时候，需要展示负载均衡型WAF（clb-waf)支持的地域列表，通过DescribeUserClbWafRegions既可以获得当前对客户已经开放的地域列表
     * @param req DescribeUserClbWafRegionsRequest
     * @return DescribeUserClbWafRegionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserClbWafRegionsResponse DescribeUserClbWafRegions(DescribeUserClbWafRegionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserClbWafRegionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserClbWafRegionsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserClbWafRegions");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询saas和clb的域名信息
     * @param req DescribeUserDomainInfoRequest
     * @return DescribeUserDomainInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserDomainInfoResponse DescribeUserDomainInfo(DescribeUserDomainInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserDomainInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserDomainInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserDomainInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取用户特征规则列表
     * @param req DescribeUserSignatureRuleRequest
     * @return DescribeUserSignatureRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUserSignatureRuleResponse DescribeUserSignatureRule(DescribeUserSignatureRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUserSignatureRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeUserSignatureRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeUserSignatureRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据过滤条件查询VIP信息
     * @param req DescribeVipInfoRequest
     * @return DescribeVipInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVipInfoResponse DescribeVipInfo(DescribeVipInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVipInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeVipInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeVipInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *返回ip惩罚规则详细信息
     * @param req DescribeWafAutoDenyRulesRequest
     * @return DescribeWafAutoDenyRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafAutoDenyRulesResponse DescribeWafAutoDenyRules(DescribeWafAutoDenyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafAutoDenyRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafAutoDenyRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafAutoDenyRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述WAF自动封禁模块详情
     * @param req DescribeWafAutoDenyStatusRequest
     * @return DescribeWafAutoDenyStatusResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafAutoDenyStatusResponse DescribeWafAutoDenyStatus(DescribeWafAutoDenyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafAutoDenyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafAutoDenyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafAutoDenyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取负载均衡绑定的WAF信息，可以根据租户负载均衡实例ID、负载均衡监听器ID、负载均衡的域名信息来查询对应绑定的 Waf的状态信息。
查询的范围：负载均衡实例ID、负载均衡实例ID+监听器ID、负载均衡实例ID+监听器ID+域名。
可能的错误码：ResourceNotFound（没有找到对应的资源）、UnsupportedRegion（目前clb-waf只支持北京、广州、上海、成都、重庆、香港地域）。

     * @param req DescribeWafInfoRequest
     * @return DescribeWafInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafInfoResponse DescribeWafInfo(DescribeWafInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafInfoResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafInfoResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafInfo");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述WAF威胁情报封禁模块配置详情
     * @param req DescribeWafThreatenIntelligenceRequest
     * @return DescribeWafThreatenIntelligenceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeWafThreatenIntelligenceResponse DescribeWafThreatenIntelligence(DescribeWafThreatenIntelligenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeWafThreatenIntelligenceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeWafThreatenIntelligenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeWafThreatenIntelligence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *刷新防篡改url
     * @param req FreshAntiFakeUrlRequest
     * @return FreshAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public FreshAntiFakeUrlResponse FreshAntiFakeUrl(FreshAntiFakeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<FreshAntiFakeUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<FreshAntiFakeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "FreshAntiFakeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *计费资源购买、续费下单接口
     * @param req GenerateDealsAndPayNewRequest
     * @return GenerateDealsAndPayNewResponse
     * @throws TencentCloudSDKException
     */
    public GenerateDealsAndPayNewResponse GenerateDealsAndPayNew(GenerateDealsAndPayNewRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateDealsAndPayNewResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GenerateDealsAndPayNewResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GenerateDealsAndPayNew");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询下载攻击日志任务记录列表
     * @param req GetAttackDownloadRecordsRequest
     * @return GetAttackDownloadRecordsResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackDownloadRecordsResponse GetAttackDownloadRecords(GetAttackDownloadRecordsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAttackDownloadRecordsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAttackDownloadRecordsResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAttackDownloadRecords");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *生成攻击日志的产生时间柱状图
     * @param req GetAttackHistogramRequest
     * @return GetAttackHistogramResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackHistogramResponse GetAttackHistogram(GetAttackHistogramRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAttackHistogramResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAttackHistogramResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAttackHistogram");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *按照条件查询展示攻击总次数
     * @param req GetAttackTotalCountRequest
     * @return GetAttackTotalCountResponse
     * @throws TencentCloudSDKException
     */
    public GetAttackTotalCountResponse GetAttackTotalCount(GetAttackTotalCountRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetAttackTotalCountResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetAttackTotalCountResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetAttackTotalCount");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取套餐实例的弹性qps上限
     * @param req GetInstanceQpsLimitRequest
     * @return GetInstanceQpsLimitResponse
     * @throws TencentCloudSDKException
     */
    public GetInstanceQpsLimitResponse GetInstanceQpsLimit(GetInstanceQpsLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetInstanceQpsLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<GetInstanceQpsLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetInstanceQpsLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于修改访问日志保存期限及大字段是否存储
     * @param req ModifyAccessPeriodRequest
     * @return ModifyAccessPeriodResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAccessPeriodResponse ModifyAccessPeriod(ModifyAccessPeriodRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAccessPeriodResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAccessPeriodResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAccessPeriod");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑防篡改url
     * @param req ModifyAntiFakeUrlRequest
     * @return ModifyAntiFakeUrlResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiFakeUrlResponse ModifyAntiFakeUrl(ModifyAntiFakeUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAntiFakeUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAntiFakeUrlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAntiFakeUrl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换防篡改开关
     * @param req ModifyAntiFakeUrlStatusRequest
     * @return ModifyAntiFakeUrlStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiFakeUrlStatusResponse ModifyAntiFakeUrlStatus(ModifyAntiFakeUrlStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAntiFakeUrlStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAntiFakeUrlStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAntiFakeUrlStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *信息防泄漏切换规则开关
     * @param req ModifyAntiInfoLeakRuleStatusRequest
     * @return ModifyAntiInfoLeakRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiInfoLeakRuleStatusResponse ModifyAntiInfoLeakRuleStatus(ModifyAntiInfoLeakRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAntiInfoLeakRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAntiInfoLeakRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAntiInfoLeakRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑信息防泄漏规则
     * @param req ModifyAntiInfoLeakRulesRequest
     * @return ModifyAntiInfoLeakRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAntiInfoLeakRulesResponse ModifyAntiInfoLeakRules(ModifyAntiInfoLeakRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAntiInfoLeakRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAntiInfoLeakRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAntiInfoLeakRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *api分析页面开关
     * @param req ModifyApiAnalyzeStatusRequest
     * @return ModifyApiAnalyzeStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyApiAnalyzeStatusResponse ModifyApiAnalyzeStatus(ModifyApiAnalyzeStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyApiAnalyzeStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyApiAnalyzeStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyApiAnalyzeStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改防护域名的地域封禁状态
     * @param req ModifyAreaBanStatusRequest
     * @return ModifyAreaBanStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAreaBanStatusResponse ModifyAreaBanStatus(ModifyAreaBanStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAreaBanStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyAreaBanStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyAreaBanStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Bot_V2 bot总开关更新
     * @param req ModifyBotStatusRequest
     * @return ModifyBotStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBotStatusResponse ModifyBotStatus(ModifyBotStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBotStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyBotStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyBotStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑自定义规则
     * @param req ModifyCustomRuleRequest
     * @return ModifyCustomRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleResponse ModifyCustomRule(ModifyCustomRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或禁用访问控制（自定义策略）
     * @param req ModifyCustomRuleStatusRequest
     * @return ModifyCustomRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomRuleStatusResponse ModifyCustomRuleStatus(ModifyCustomRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *编辑精准白名单
     * @param req ModifyCustomWhiteRuleRequest
     * @return ModifyCustomWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomWhiteRuleResponse ModifyCustomWhiteRule(ModifyCustomWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomWhiteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *开启或禁用精准白名单
     * @param req ModifyCustomWhiteRuleStatusRequest
     * @return ModifyCustomWhiteRuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomWhiteRuleStatusResponse ModifyCustomWhiteRuleStatus(ModifyCustomWhiteRuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomWhiteRuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyCustomWhiteRuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyCustomWhiteRuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换ipv6开关
     * @param req ModifyDomainIpv6StatusRequest
     * @return ModifyDomainIpv6StatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainIpv6StatusResponse ModifyDomainIpv6Status(ModifyDomainIpv6StatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainIpv6StatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainIpv6StatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainIpv6Status");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改某一条规则
     * @param req ModifyDomainWhiteRuleRequest
     * @return ModifyDomainWhiteRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainWhiteRuleResponse ModifyDomainWhiteRule(ModifyDomainWhiteRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainWhiteRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainWhiteRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainWhiteRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改域名列表的访问日志开关
     * @param req ModifyDomainsCLSStatusRequest
     * @return ModifyDomainsCLSStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDomainsCLSStatusResponse ModifyDomainsCLSStatus(ModifyDomainsCLSStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDomainsCLSStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDomainsCLSStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyDomainsCLSStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf编辑防护域名配置
     * @param req ModifyHostRequest
     * @return ModifyHostResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostResponse ModifyHost(ModifyHostRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHost");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf 设置防护域名的流量模式
     * @param req ModifyHostFlowModeRequest
     * @return ModifyHostFlowModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostFlowModeResponse ModifyHostFlowMode(ModifyHostFlowModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostFlowModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostFlowModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHostFlowMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf设置防护域名防护状态
     * @param req ModifyHostModeRequest
     * @return ModifyHostModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostModeResponse ModifyHostMode(ModifyHostModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHostMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *clb-waf 设置防护域名WAF开关
支持批量操作。
     * @param req ModifyHostStatusRequest
     * @return ModifyHostStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHostStatusResponse ModifyHostStatus(ModifyHostStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHostStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyHostStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyHostStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例的QPS弹性计费开关
     * @param req ModifyInstanceElasticModeRequest
     * @return ModifyInstanceElasticModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceElasticModeResponse ModifyInstanceElasticMode(ModifyInstanceElasticModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceElasticModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceElasticModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceElasticMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例的名称
     * @param req ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceNameResponse ModifyInstanceName(ModifyInstanceNameRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceNameResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceNameResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceName");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置套餐实例的弹性qps上限
     * @param req ModifyInstanceQpsLimitRequest
     * @return ModifyInstanceQpsLimitResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceQpsLimitResponse ModifyInstanceQpsLimit(ModifyInstanceQpsLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceQpsLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceQpsLimitResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceQpsLimit");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改实例的自动续费开关
     * @param req ModifyInstanceRenewFlagRequest
     * @return ModifyInstanceRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public ModifyInstanceRenewFlagResponse ModifyInstanceRenewFlag(ModifyInstanceRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyInstanceRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyInstanceRenewFlagResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyInstanceRenewFlag");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置某个domain下基础安全模块的开关
     * @param req ModifyModuleStatusRequest
     * @return ModifyModuleStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModuleStatusResponse ModifyModuleStatus(ModifyModuleStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModuleStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModuleStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyModuleStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改防护对象
     * @param req ModifyObjectRequest
     * @return ModifyObjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyObjectResponse ModifyObject(ModifyObjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyObjectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyObjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyObject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *waf斯巴达-waf开关
     * @param req ModifyProtectionStatusRequest
     * @return ModifyProtectionStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProtectionStatusResponse ModifyProtectionStatus(ModifyProtectionStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProtectionStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProtectionStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProtectionStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改域名配置
     * @param req ModifySpartaProtectionRequest
     * @return ModifySpartaProtectionResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpartaProtectionResponse ModifySpartaProtection(ModifySpartaProtectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySpartaProtectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySpartaProtectionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySpartaProtection");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置waf防护状态
     * @param req ModifySpartaProtectionModeRequest
     * @return ModifySpartaProtectionModeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySpartaProtectionModeResponse ModifySpartaProtectionMode(ModifySpartaProtectionModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySpartaProtectionModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifySpartaProtectionModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifySpartaProtectionMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户防护规则等级
     * @param req ModifyUserLevelRequest
     * @return ModifyUserLevelResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserLevelResponse ModifyUserLevel(ModifyUserLevelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserLevelResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserLevelResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserLevel");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改用户防护规则，开启关闭具体的某条规则
     * @param req ModifyUserSignatureRuleRequest
     * @return ModifyUserSignatureRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyUserSignatureRuleResponse ModifyUserSignatureRule(ModifyUserSignatureRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyUserSignatureRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyUserSignatureRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyUserSignatureRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改ip惩罚规则
     * @param req ModifyWafAutoDenyRulesRequest
     * @return ModifyWafAutoDenyRulesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafAutoDenyRulesResponse ModifyWafAutoDenyRules(ModifyWafAutoDenyRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWafAutoDenyRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWafAutoDenyRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWafAutoDenyRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置WAF自动封禁模块状态
     * @param req ModifyWafAutoDenyStatusRequest
     * @return ModifyWafAutoDenyStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafAutoDenyStatusResponse ModifyWafAutoDenyStatus(ModifyWafAutoDenyStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWafAutoDenyStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWafAutoDenyStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWafAutoDenyStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *配置WAF威胁情报封禁模块详情
     * @param req ModifyWafThreatenIntelligenceRequest
     * @return ModifyWafThreatenIntelligenceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWafThreatenIntelligenceResponse ModifyWafThreatenIntelligence(ModifyWafThreatenIntelligenceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWafThreatenIntelligenceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWafThreatenIntelligenceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWafThreatenIntelligence");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *设置域名的webshell状态。
     * @param req ModifyWebshellStatusRequest
     * @return ModifyWebshellStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyWebshellStatusResponse ModifyWebshellStatus(ModifyWebshellStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyWebshellStatusResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyWebshellStatusResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyWebshellStatus");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建搜索下载攻击日志任务，使用CLS新版本的搜索下载getlog接口
     * @param req PostAttackDownloadTaskRequest
     * @return PostAttackDownloadTaskResponse
     * @throws TencentCloudSDKException
     */
    public PostAttackDownloadTaskResponse PostAttackDownloadTask(PostAttackDownloadTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PostAttackDownloadTaskResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<PostAttackDownloadTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PostAttackDownloadTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *刷新接入检查的结果，后台会生成接入检查任务
     * @param req RefreshAccessCheckResultRequest
     * @return RefreshAccessCheckResultResponse
     * @throws TencentCloudSDKException
     */
    public RefreshAccessCheckResultResponse RefreshAccessCheckResult(RefreshAccessCheckResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefreshAccessCheckResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<RefreshAccessCheckResultResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "RefreshAccessCheckResult");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口用于搜索WAF访问日志
     * @param req SearchAccessLogRequest
     * @return SearchAccessLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAccessLogResponse SearchAccessLog(SearchAccessLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchAccessLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SearchAccessLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchAccessLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *新版本CLS接口存在参数变化，query改成了query_string支持lucence语法接口搜索查询。
     * @param req SearchAttackLogRequest
     * @return SearchAttackLogResponse
     * @throws TencentCloudSDKException
     */
    public SearchAttackLogResponse SearchAttackLog(SearchAttackLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchAttackLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SearchAttackLogResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchAttackLog");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换域名的规则开关
     * @param req SwitchDomainRulesRequest
     * @return SwitchDomainRulesResponse
     * @throws TencentCloudSDKException
     */
    public SwitchDomainRulesResponse SwitchDomainRules(SwitchDomainRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchDomainRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchDomainRulesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchDomainRules");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *切换弹性的开关
     * @param req SwitchElasticModeRequest
     * @return SwitchElasticModeResponse
     * @throws TencentCloudSDKException
     */
    public SwitchElasticModeResponse SwitchElasticMode(SwitchElasticModeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SwitchElasticModeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<SwitchElasticModeResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SwitchElasticMode");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf  CC V2 Upsert接口
     * @param req UpsertCCRuleRequest
     * @return UpsertCCRuleResponse
     * @throws TencentCloudSDKException
     */
    public UpsertCCRuleResponse UpsertCCRule(UpsertCCRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpsertCCRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpsertCCRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpsertCCRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf IP黑白名单Upsert接口
     * @param req UpsertIpAccessControlRequest
     * @return UpsertIpAccessControlResponse
     * @throws TencentCloudSDKException
     */
    public UpsertIpAccessControlResponse UpsertIpAccessControl(UpsertIpAccessControlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpsertIpAccessControlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpsertIpAccessControlResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpsertIpAccessControl");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *Waf  会话定义 Upsert接口
     * @param req UpsertSessionRequest
     * @return UpsertSessionResponse
     * @throws TencentCloudSDKException
     */
    public UpsertSessionResponse UpsertSession(UpsertSessionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpsertSessionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                Type type = new TypeToken<JsonResponseModel<UpsertSessionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpsertSession");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
