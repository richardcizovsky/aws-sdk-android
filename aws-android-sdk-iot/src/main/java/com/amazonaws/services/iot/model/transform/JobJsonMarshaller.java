/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Job
 */
class JobJsonMarshaller {

    public void marshall(Job job, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (job.getJobArn() != null) {
            String jobArn = job.getJobArn();
            jsonWriter.name("jobArn");
            jsonWriter.value(jobArn);
        }
        if (job.getJobId() != null) {
            String jobId = job.getJobId();
            jsonWriter.name("jobId");
            jsonWriter.value(jobId);
        }
        if (job.getTargetSelection() != null) {
            String targetSelection = job.getTargetSelection();
            jsonWriter.name("targetSelection");
            jsonWriter.value(targetSelection);
        }
        if (job.getStatus() != null) {
            String status = job.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        if (job.getForceCanceled() != null) {
            Boolean forceCanceled = job.getForceCanceled();
            jsonWriter.name("forceCanceled");
            jsonWriter.value(forceCanceled);
        }
        if (job.getReasonCode() != null) {
            String reasonCode = job.getReasonCode();
            jsonWriter.name("reasonCode");
            jsonWriter.value(reasonCode);
        }
        if (job.getComment() != null) {
            String comment = job.getComment();
            jsonWriter.name("comment");
            jsonWriter.value(comment);
        }
        if (job.getTargets() != null) {
            java.util.List<String> targets = job.getTargets();
            jsonWriter.name("targets");
            jsonWriter.beginArray();
            for (String targetsItem : targets) {
                if (targetsItem != null) {
                    jsonWriter.value(targetsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (job.getDescription() != null) {
            String description = job.getDescription();
            jsonWriter.name("description");
            jsonWriter.value(description);
        }
        if (job.getPresignedUrlConfig() != null) {
            PresignedUrlConfig presignedUrlConfig = job.getPresignedUrlConfig();
            jsonWriter.name("presignedUrlConfig");
            PresignedUrlConfigJsonMarshaller.getInstance().marshall(presignedUrlConfig, jsonWriter);
        }
        if (job.getJobExecutionsRolloutConfig() != null) {
            JobExecutionsRolloutConfig jobExecutionsRolloutConfig = job
                    .getJobExecutionsRolloutConfig();
            jsonWriter.name("jobExecutionsRolloutConfig");
            JobExecutionsRolloutConfigJsonMarshaller.getInstance().marshall(
                    jobExecutionsRolloutConfig, jsonWriter);
        }
        if (job.getAbortConfig() != null) {
            AbortConfig abortConfig = job.getAbortConfig();
            jsonWriter.name("abortConfig");
            AbortConfigJsonMarshaller.getInstance().marshall(abortConfig, jsonWriter);
        }
        if (job.getCreatedAt() != null) {
            java.util.Date createdAt = job.getCreatedAt();
            jsonWriter.name("createdAt");
            jsonWriter.value(createdAt);
        }
        if (job.getLastUpdatedAt() != null) {
            java.util.Date lastUpdatedAt = job.getLastUpdatedAt();
            jsonWriter.name("lastUpdatedAt");
            jsonWriter.value(lastUpdatedAt);
        }
        if (job.getCompletedAt() != null) {
            java.util.Date completedAt = job.getCompletedAt();
            jsonWriter.name("completedAt");
            jsonWriter.value(completedAt);
        }
        if (job.getJobProcessDetails() != null) {
            JobProcessDetails jobProcessDetails = job.getJobProcessDetails();
            jsonWriter.name("jobProcessDetails");
            JobProcessDetailsJsonMarshaller.getInstance().marshall(jobProcessDetails, jsonWriter);
        }
        if (job.getTimeoutConfig() != null) {
            TimeoutConfig timeoutConfig = job.getTimeoutConfig();
            jsonWriter.name("timeoutConfig");
            TimeoutConfigJsonMarshaller.getInstance().marshall(timeoutConfig, jsonWriter);
        }
        if (job.getNamespaceId() != null) {
            String namespaceId = job.getNamespaceId();
            jsonWriter.name("namespaceId");
            jsonWriter.value(namespaceId);
        }
        if (job.getJobTemplateArn() != null) {
            String jobTemplateArn = job.getJobTemplateArn();
            jsonWriter.name("jobTemplateArn");
            jsonWriter.value(jobTemplateArn);
        }
        if (job.getJobExecutionsRetryConfig() != null) {
            JobExecutionsRetryConfig jobExecutionsRetryConfig = job.getJobExecutionsRetryConfig();
            jsonWriter.name("jobExecutionsRetryConfig");
            JobExecutionsRetryConfigJsonMarshaller.getInstance().marshall(jobExecutionsRetryConfig,
                    jsonWriter);
        }
        if (job.getDocumentParameters() != null) {
            java.util.Map<String, String> documentParameters = job.getDocumentParameters();
            jsonWriter.name("documentParameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> documentParametersEntry : documentParameters
                    .entrySet()) {
                String documentParametersValue = documentParametersEntry.getValue();
                if (documentParametersValue != null) {
                    jsonWriter.name(documentParametersEntry.getKey());
                    jsonWriter.value(documentParametersValue);
                }
            }
            jsonWriter.endObject();
        }
        if (job.getIsConcurrent() != null) {
            Boolean isConcurrent = job.getIsConcurrent();
            jsonWriter.name("isConcurrent");
            jsonWriter.value(isConcurrent);
        }
        if (job.getSchedulingConfig() != null) {
            SchedulingConfig schedulingConfig = job.getSchedulingConfig();
            jsonWriter.name("schedulingConfig");
            SchedulingConfigJsonMarshaller.getInstance().marshall(schedulingConfig, jsonWriter);
        }
        if (job.getScheduledJobRollouts() != null) {
            java.util.List<ScheduledJobRollout> scheduledJobRollouts = job
                    .getScheduledJobRollouts();
            jsonWriter.name("scheduledJobRollouts");
            jsonWriter.beginArray();
            for (ScheduledJobRollout scheduledJobRolloutsItem : scheduledJobRollouts) {
                if (scheduledJobRolloutsItem != null) {
                    ScheduledJobRolloutJsonMarshaller.getInstance().marshall(
                            scheduledJobRolloutsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static JobJsonMarshaller instance;

    public static JobJsonMarshaller getInstance() {
        if (instance == null)
            instance = new JobJsonMarshaller();
        return instance;
    }
}
