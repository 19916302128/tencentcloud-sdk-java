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
package com.tencentcloudapi.tione.v20211111;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tione.v20211111.models.*;

public class TioneClient extends AbstractClient{
    private static String endpoint = "tione.tencentcloudapi.com";
    private static String service = "tione";
    private static String version = "2021-11-11";
    
    public TioneClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public TioneClient(Credential credential, String region, ClientProfile profile) {
        super(TioneClient.endpoint, TioneClient.version, credential, region, profile);
    }

    /**
     *该接口支持与自行部署的大模型的聊天。
     * @param req ChatCompletionRequest
     * @return ChatCompletionResponse
     * @throws TencentCloudSDKException
     */
    public ChatCompletionResponse ChatCompletion(ChatCompletionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ChatCompletion", ChatCompletionResponse.class);
    }

    /**
     *批量创建模型加速任务
     * @param req CreateBatchModelAccTasksRequest
     * @return CreateBatchModelAccTasksResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchModelAccTasksResponse CreateBatchModelAccTasks(CreateBatchModelAccTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBatchModelAccTasks", CreateBatchModelAccTasksResponse.class);
    }

    /**
     *创建跑批任务
     * @param req CreateBatchTaskRequest
     * @return CreateBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateBatchTaskResponse CreateBatchTask(CreateBatchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateBatchTask", CreateBatchTaskResponse.class);
    }

    /**
     *创建数据集
     * @param req CreateDatasetRequest
     * @return CreateDatasetResponse
     * @throws TencentCloudSDKException
     */
    public CreateDatasetResponse CreateDataset(CreateDatasetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateDataset", CreateDatasetResponse.class);
    }

    /**
     *用于创建、发布一个新的模型服务
     * @param req CreateModelServiceRequest
     * @return CreateModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateModelServiceResponse CreateModelService(CreateModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateModelService", CreateModelServiceResponse.class);
    }

    /**
     *创建Notebook
     * @param req CreateNotebookRequest
     * @return CreateNotebookResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookResponse CreateNotebook(CreateNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebook", CreateNotebookResponse.class);
    }

    /**
     *保存镜像
     * @param req CreateNotebookImageRequest
     * @return CreateNotebookImageResponse
     * @throws TencentCloudSDKException
     */
    public CreateNotebookImageResponse CreateNotebookImage(CreateNotebookImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateNotebookImage", CreateNotebookImageResponse.class);
    }

    /**
     *保存优化模型
     * @param req CreateOptimizedModelRequest
     * @return CreateOptimizedModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateOptimizedModelResponse CreateOptimizedModel(CreateOptimizedModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateOptimizedModel", CreateOptimizedModelResponse.class);
    }

    /**
     *导入模型
     * @param req CreateTrainingModelRequest
     * @return CreateTrainingModelResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingModelResponse CreateTrainingModel(CreateTrainingModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrainingModel", CreateTrainingModelResponse.class);
    }

    /**
     *创建模型训练任务
     * @param req CreateTrainingTaskRequest
     * @return CreateTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public CreateTrainingTaskResponse CreateTrainingTask(CreateTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "CreateTrainingTask", CreateTrainingTaskResponse.class);
    }

    /**
     *删除跑批任务
     * @param req DeleteBatchTaskRequest
     * @return DeleteBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBatchTaskResponse DeleteBatchTask(DeleteBatchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteBatchTask", DeleteBatchTaskResponse.class);
    }

    /**
     *删除数据集
     * @param req DeleteDatasetRequest
     * @return DeleteDatasetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDatasetResponse DeleteDataset(DeleteDatasetRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteDataset", DeleteDatasetResponse.class);
    }

    /**
     *删除模型加速任务
     * @param req DeleteModelAccelerateTaskRequest
     * @return DeleteModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelAccelerateTaskResponse DeleteModelAccelerateTask(DeleteModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelAccelerateTask", DeleteModelAccelerateTaskResponse.class);
    }

    /**
     *根据服务id删除模型服务
     * @param req DeleteModelServiceRequest
     * @return DeleteModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceResponse DeleteModelService(DeleteModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelService", DeleteModelServiceResponse.class);
    }

    /**
     *根据服务组id删除服务组下所有模型服务
     * @param req DeleteModelServiceGroupRequest
     * @return DeleteModelServiceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteModelServiceGroupResponse DeleteModelServiceGroup(DeleteModelServiceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteModelServiceGroup", DeleteModelServiceGroupResponse.class);
    }

    /**
     *删除Notebook
     * @param req DeleteNotebookRequest
     * @return DeleteNotebookResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookResponse DeleteNotebook(DeleteNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotebook", DeleteNotebookResponse.class);
    }

    /**
     *删除notebook镜像保存记录
     * @param req DeleteNotebookImageRecordRequest
     * @return DeleteNotebookImageRecordResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNotebookImageRecordResponse DeleteNotebookImageRecord(DeleteNotebookImageRecordRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteNotebookImageRecord", DeleteNotebookImageRecordResponse.class);
    }

    /**
     *删除模型
     * @param req DeleteTrainingModelRequest
     * @return DeleteTrainingModelResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingModelResponse DeleteTrainingModel(DeleteTrainingModelRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrainingModel", DeleteTrainingModelResponse.class);
    }

    /**
     *删除模型版本
     * @param req DeleteTrainingModelVersionRequest
     * @return DeleteTrainingModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingModelVersionResponse DeleteTrainingModelVersion(DeleteTrainingModelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrainingModelVersion", DeleteTrainingModelVersionResponse.class);
    }

    /**
     *删除训练任务
     * @param req DeleteTrainingTaskRequest
     * @return DeleteTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrainingTaskResponse DeleteTrainingTask(DeleteTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DeleteTrainingTask", DeleteTrainingTaskResponse.class);
    }

    /**
     *列举API
     * @param req DescribeAPIConfigsRequest
     * @return DescribeAPIConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAPIConfigsResponse DescribeAPIConfigs(DescribeAPIConfigsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeAPIConfigs", DescribeAPIConfigsResponse.class);
    }

    /**
     *查询跑批任务
     * @param req DescribeBatchTaskRequest
     * @return DescribeBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTaskResponse DescribeBatchTask(DescribeBatchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchTask", DescribeBatchTaskResponse.class);
    }

    /**
     *查询跑批实例列表
     * @param req DescribeBatchTaskInstancesRequest
     * @return DescribeBatchTaskInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTaskInstancesResponse DescribeBatchTaskInstances(DescribeBatchTaskInstancesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchTaskInstances", DescribeBatchTaskInstancesResponse.class);
    }

    /**
     *批量预测任务列表信息
     * @param req DescribeBatchTasksRequest
     * @return DescribeBatchTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBatchTasksResponse DescribeBatchTasks(DescribeBatchTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBatchTasks", DescribeBatchTasksResponse.class);
    }

    /**
     *查询资源组节点列表
     * @param req DescribeBillingResourceGroupRequest
     * @return DescribeBillingResourceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceGroupResponse DescribeBillingResourceGroup(DescribeBillingResourceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceGroup", DescribeBillingResourceGroupResponse.class);
    }

    /**
     *查询资源组详情
     * @param req DescribeBillingResourceGroupsRequest
     * @return DescribeBillingResourceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceGroupsResponse DescribeBillingResourceGroups(DescribeBillingResourceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceGroups", DescribeBillingResourceGroupsResponse.class);
    }

    /**
     *查询资源组节点运行中的任务
     * @param req DescribeBillingResourceInstanceRunningJobsRequest
     * @return DescribeBillingResourceInstanceRunningJobsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingResourceInstanceRunningJobsResponse DescribeBillingResourceInstanceRunningJobs(DescribeBillingResourceInstanceRunningJobsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingResourceInstanceRunningJobs", DescribeBillingResourceInstanceRunningJobsResponse.class);
    }

    /**
     *本接口(DescribeBillingSpecs)用于查询计费项列表
     * @param req DescribeBillingSpecsRequest
     * @return DescribeBillingSpecsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingSpecsResponse DescribeBillingSpecs(DescribeBillingSpecsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingSpecs", DescribeBillingSpecsResponse.class);
    }

    /**
     *本接口(DescribeBillingSpecsPrice)用于查询按量计费计费项价格。
     * @param req DescribeBillingSpecsPriceRequest
     * @return DescribeBillingSpecsPriceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBillingSpecsPriceResponse DescribeBillingSpecsPrice(DescribeBillingSpecsPriceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeBillingSpecsPrice", DescribeBillingSpecsPriceResponse.class);
    }

    /**
     *查询结构化数据集详情
     * @param req DescribeDatasetDetailStructuredRequest
     * @return DescribeDatasetDetailStructuredResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetDetailStructuredResponse DescribeDatasetDetailStructured(DescribeDatasetDetailStructuredRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasetDetailStructured", DescribeDatasetDetailStructuredResponse.class);
    }

    /**
     *查询非结构化数据集详情
     * @param req DescribeDatasetDetailUnstructuredRequest
     * @return DescribeDatasetDetailUnstructuredResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetDetailUnstructuredResponse DescribeDatasetDetailUnstructured(DescribeDatasetDetailUnstructuredRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasetDetailUnstructured", DescribeDatasetDetailUnstructuredResponse.class);
    }

    /**
     *查询数据集列表
     * @param req DescribeDatasetsRequest
     * @return DescribeDatasetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDatasetsResponse DescribeDatasets(DescribeDatasetsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeDatasets", DescribeDatasetsResponse.class);
    }

    /**
     *获取任务式建模训练任务，Notebook，在线服务和批量预测任务的事件API
     * @param req DescribeEventsRequest
     * @return DescribeEventsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeEventsResponse DescribeEvents(DescribeEventsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeEvents", DescribeEventsResponse.class);
    }

    /**
     *查询推理镜像模板
     * @param req DescribeInferTemplatesRequest
     * @return DescribeInferTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInferTemplatesResponse DescribeInferTemplates(DescribeInferTemplatesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeInferTemplates", DescribeInferTemplatesResponse.class);
    }

    /**
     *查询最近上报的训练自定义指标
     * @param req DescribeLatestTrainingMetricsRequest
     * @return DescribeLatestTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLatestTrainingMetricsResponse DescribeLatestTrainingMetrics(DescribeLatestTrainingMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLatestTrainingMetrics", DescribeLatestTrainingMetricsResponse.class);
    }

    /**
     *获取任务式建模训练任务，Notebook，在线服务和批量预测任务的日志API
     * @param req DescribeLogsRequest
     * @return DescribeLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLogsResponse DescribeLogs(DescribeLogsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeLogs", DescribeLogsResponse.class);
    }

    /**
     *查询模型加速引擎版本列表
     * @param req DescribeModelAccEngineVersionsRequest
     * @return DescribeModelAccEngineVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccEngineVersionsResponse DescribeModelAccEngineVersions(DescribeModelAccEngineVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelAccEngineVersions", DescribeModelAccEngineVersionsResponse.class);
    }

    /**
     *查询模型优化任务详情
     * @param req DescribeModelAccelerateTaskRequest
     * @return DescribeModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateTaskResponse DescribeModelAccelerateTask(DescribeModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelAccelerateTask", DescribeModelAccelerateTaskResponse.class);
    }

    /**
     *查询模型加速任务列表
     * @param req DescribeModelAccelerateTasksRequest
     * @return DescribeModelAccelerateTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateTasksResponse DescribeModelAccelerateTasks(DescribeModelAccelerateTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelAccelerateTasks", DescribeModelAccelerateTasksResponse.class);
    }

    /**
     *模型加速之后的模型版本列表
     * @param req DescribeModelAccelerateVersionsRequest
     * @return DescribeModelAccelerateVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelAccelerateVersionsResponse DescribeModelAccelerateVersions(DescribeModelAccelerateVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelAccelerateVersions", DescribeModelAccelerateVersionsResponse.class);
    }

    /**
     *查询单个服务
     * @param req DescribeModelServiceRequest
     * @return DescribeModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceResponse DescribeModelService(DescribeModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelService", DescribeModelServiceResponse.class);
    }

    /**
     *展示服务的调用信息
     * @param req DescribeModelServiceCallInfoRequest
     * @return DescribeModelServiceCallInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceCallInfoResponse DescribeModelServiceCallInfo(DescribeModelServiceCallInfoRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceCallInfo", DescribeModelServiceCallInfoResponse.class);
    }

    /**
     *查询单个服务组
     * @param req DescribeModelServiceGroupRequest
     * @return DescribeModelServiceGroupResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceGroupResponse DescribeModelServiceGroup(DescribeModelServiceGroupRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceGroup", DescribeModelServiceGroupResponse.class);
    }

    /**
     *列举在线推理服务组
     * @param req DescribeModelServiceGroupsRequest
     * @return DescribeModelServiceGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceGroupsResponse DescribeModelServiceGroups(DescribeModelServiceGroupsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceGroups", DescribeModelServiceGroupsResponse.class);
    }

    /**
     *展示服务的历史版本
     * @param req DescribeModelServiceHistoryRequest
     * @return DescribeModelServiceHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceHistoryResponse DescribeModelServiceHistory(DescribeModelServiceHistoryRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceHistory", DescribeModelServiceHistoryResponse.class);
    }

    /**
     *用于查询模型服务能否开启热更新
     * @param req DescribeModelServiceHotUpdatedRequest
     * @return DescribeModelServiceHotUpdatedResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServiceHotUpdatedResponse DescribeModelServiceHotUpdated(DescribeModelServiceHotUpdatedRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServiceHotUpdated", DescribeModelServiceHotUpdatedResponse.class);
    }

    /**
     *查询多个服务
     * @param req DescribeModelServicesRequest
     * @return DescribeModelServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelServicesResponse DescribeModelServices(DescribeModelServicesRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeModelServices", DescribeModelServicesResponse.class);
    }

    /**
     *Notebook详情
     * @param req DescribeNotebookRequest
     * @return DescribeNotebookResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookResponse DescribeNotebook(DescribeNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebook", DescribeNotebookResponse.class);
    }

    /**
     *查询镜像kernel
     * @param req DescribeNotebookImageKernelsRequest
     * @return DescribeNotebookImageKernelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookImageKernelsResponse DescribeNotebookImageKernels(DescribeNotebookImageKernelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookImageKernels", DescribeNotebookImageKernelsResponse.class);
    }

    /**
     *查看notebook镜像保存记录
     * @param req DescribeNotebookImageRecordsRequest
     * @return DescribeNotebookImageRecordsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebookImageRecordsResponse DescribeNotebookImageRecords(DescribeNotebookImageRecordsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebookImageRecords", DescribeNotebookImageRecordsResponse.class);
    }

    /**
     *Notebook列表
     * @param req DescribeNotebooksRequest
     * @return DescribeNotebooksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNotebooksResponse DescribeNotebooks(DescribeNotebooksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeNotebooks", DescribeNotebooksResponse.class);
    }

    /**
     *训练框架列表
     * @param req DescribeTrainingFrameworksRequest
     * @return DescribeTrainingFrameworksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingFrameworksResponse DescribeTrainingFrameworks(DescribeTrainingFrameworksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingFrameworks", DescribeTrainingFrameworksResponse.class);
    }

    /**
     *查询训练自定义指标
     * @param req DescribeTrainingMetricsRequest
     * @return DescribeTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingMetricsResponse DescribeTrainingMetrics(DescribeTrainingMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingMetrics", DescribeTrainingMetricsResponse.class);
    }

    /**
     *查询模型版本
     * @param req DescribeTrainingModelVersionRequest
     * @return DescribeTrainingModelVersionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelVersionResponse DescribeTrainingModelVersion(DescribeTrainingModelVersionRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingModelVersion", DescribeTrainingModelVersionResponse.class);
    }

    /**
     *模型版本列表
     * @param req DescribeTrainingModelVersionsRequest
     * @return DescribeTrainingModelVersionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelVersionsResponse DescribeTrainingModelVersions(DescribeTrainingModelVersionsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingModelVersions", DescribeTrainingModelVersionsResponse.class);
    }

    /**
     *模型列表
     * @param req DescribeTrainingModelsRequest
     * @return DescribeTrainingModelsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingModelsResponse DescribeTrainingModels(DescribeTrainingModelsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingModels", DescribeTrainingModelsResponse.class);
    }

    /**
     *训练任务详情
     * @param req DescribeTrainingTaskRequest
     * @return DescribeTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskResponse DescribeTrainingTask(DescribeTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTask", DescribeTrainingTaskResponse.class);
    }

    /**
     *训练任务pod列表
     * @param req DescribeTrainingTaskPodsRequest
     * @return DescribeTrainingTaskPodsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTaskPodsResponse DescribeTrainingTaskPods(DescribeTrainingTaskPodsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTaskPods", DescribeTrainingTaskPodsResponse.class);
    }

    /**
     *训练任务列表
     * @param req DescribeTrainingTasksRequest
     * @return DescribeTrainingTasksResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrainingTasksResponse DescribeTrainingTasks(DescribeTrainingTasksRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "DescribeTrainingTasks", DescribeTrainingTasksResponse.class);
    }

    /**
     *用于更新模型服务
     * @param req ModifyModelServiceRequest
     * @return ModifyModelServiceResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServiceResponse ModifyModelService(ModifyModelServiceRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelService", ModifyModelServiceResponse.class);
    }

    /**
     *增量更新在线推理服务的部分配置，不更新的配置项不需要传入
     * @param req ModifyModelServicePartialConfigRequest
     * @return ModifyModelServicePartialConfigResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelServicePartialConfigResponse ModifyModelServicePartialConfig(ModifyModelServicePartialConfigRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyModelServicePartialConfig", ModifyModelServicePartialConfigResponse.class);
    }

    /**
     *修改Notebook
     * @param req ModifyNotebookRequest
     * @return ModifyNotebookResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotebookResponse ModifyNotebook(ModifyNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotebook", ModifyNotebookResponse.class);
    }

    /**
     *修改Notebook标签
     * @param req ModifyNotebookTagsRequest
     * @return ModifyNotebookTagsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNotebookTagsResponse ModifyNotebookTags(ModifyNotebookTagsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyNotebookTags", ModifyNotebookTagsResponse.class);
    }

    /**
     *更新推理服务组流量分配
     * @param req ModifyServiceGroupWeightsRequest
     * @return ModifyServiceGroupWeightsResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceGroupWeightsResponse ModifyServiceGroupWeights(ModifyServiceGroupWeightsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "ModifyServiceGroupWeights", ModifyServiceGroupWeightsResponse.class);
    }

    /**
     *上报训练自定义指标
     * @param req PushTrainingMetricsRequest
     * @return PushTrainingMetricsResponse
     * @throws TencentCloudSDKException
     */
    public PushTrainingMetricsResponse PushTrainingMetrics(PushTrainingMetricsRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "PushTrainingMetrics", PushTrainingMetricsResponse.class);
    }

    /**
     *重启模型加速任务
     * @param req RestartModelAccelerateTaskRequest
     * @return RestartModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public RestartModelAccelerateTaskResponse RestartModelAccelerateTask(RestartModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "RestartModelAccelerateTask", RestartModelAccelerateTaskResponse.class);
    }

    /**
     *这是一个供您体验大模型聊天的接口。
     * @param req SendChatMessageRequest
     * @return SendChatMessageResponse
     * @throws TencentCloudSDKException
     */
    public SendChatMessageResponse SendChatMessage(SendChatMessageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "SendChatMessage", SendChatMessageResponse.class);
    }

    /**
     *启动Notebook
     * @param req StartNotebookRequest
     * @return StartNotebookResponse
     * @throws TencentCloudSDKException
     */
    public StartNotebookResponse StartNotebook(StartNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartNotebook", StartNotebookResponse.class);
    }

    /**
     *启动模型训练任务
     * @param req StartTrainingTaskRequest
     * @return StartTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public StartTrainingTaskResponse StartTrainingTask(StartTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StartTrainingTask", StartTrainingTaskResponse.class);
    }

    /**
     *停止跑批任务
     * @param req StopBatchTaskRequest
     * @return StopBatchTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopBatchTaskResponse StopBatchTask(StopBatchTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopBatchTask", StopBatchTaskResponse.class);
    }

    /**
     *停止保存镜像
     * @param req StopCreatingImageRequest
     * @return StopCreatingImageResponse
     * @throws TencentCloudSDKException
     */
    public StopCreatingImageResponse StopCreatingImage(StopCreatingImageRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopCreatingImage", StopCreatingImageResponse.class);
    }

    /**
     *停止模型加速任务
     * @param req StopModelAccelerateTaskRequest
     * @return StopModelAccelerateTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopModelAccelerateTaskResponse StopModelAccelerateTask(StopModelAccelerateTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopModelAccelerateTask", StopModelAccelerateTaskResponse.class);
    }

    /**
     *停止Notebook
     * @param req StopNotebookRequest
     * @return StopNotebookResponse
     * @throws TencentCloudSDKException
     */
    public StopNotebookResponse StopNotebook(StopNotebookRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopNotebook", StopNotebookResponse.class);
    }

    /**
     *停止模型训练任务
     * @param req StopTrainingTaskRequest
     * @return StopTrainingTaskResponse
     * @throws TencentCloudSDKException
     */
    public StopTrainingTaskResponse StopTrainingTask(StopTrainingTaskRequest req) throws TencentCloudSDKException{
        req.setSkipSign(false);
        return this.internalRequest(req, "StopTrainingTask", StopTrainingTaskResponse.class);
    }

}
