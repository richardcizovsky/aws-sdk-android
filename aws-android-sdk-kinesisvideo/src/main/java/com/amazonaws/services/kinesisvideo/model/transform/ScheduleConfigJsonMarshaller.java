/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.kinesisvideo.model.transform;

import com.amazonaws.services.kinesisvideo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ScheduleConfig
 */
class ScheduleConfigJsonMarshaller {

    public void marshall(ScheduleConfig scheduleConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduleConfig.getScheduleExpression() != null) {
            String scheduleExpression = scheduleConfig.getScheduleExpression();
            jsonWriter.name("ScheduleExpression");
            jsonWriter.value(scheduleExpression);
        }
        if (scheduleConfig.getDurationInSeconds() != null) {
            Integer durationInSeconds = scheduleConfig.getDurationInSeconds();
            jsonWriter.name("DurationInSeconds");
            jsonWriter.value(durationInSeconds);
        }
        jsonWriter.endObject();
    }

    private static ScheduleConfigJsonMarshaller instance;

    public static ScheduleConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleConfigJsonMarshaller();
        return instance;
    }
}
