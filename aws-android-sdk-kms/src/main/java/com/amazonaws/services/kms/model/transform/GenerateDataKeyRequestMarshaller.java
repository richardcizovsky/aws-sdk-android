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

package com.amazonaws.services.kms.model.transform;

import static com.amazonaws.util.StringUtils.UTF8;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import android.text.TextUtils;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kms.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

/**
 * JSON request marshaller for GenerateDataKeyRequest
 */
public class GenerateDataKeyRequestMarshaller implements
        Marshaller<Request<GenerateDataKeyRequest>, GenerateDataKeyRequest> {

    public Request<GenerateDataKeyRequest> marshall(GenerateDataKeyRequest generateDataKeyRequest) {
        if (generateDataKeyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(GenerateDataKeyRequest)");
        }

        Request<GenerateDataKeyRequest> request = new DefaultRequest<GenerateDataKeyRequest>(
                generateDataKeyRequest, "AWSKMS");
        String target = "TrentService.GenerateDataKey";
        request.addHeader("X-Amz-Target", target);
        request.setHttpMethod(HttpMethodName.POST);

        String uriResourcePath = "/";
        request.setResourcePath(uriResourcePath);
        try {
            StringWriter stringWriter = new StringWriter();
            AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
            jsonWriter.beginObject();

            if (generateDataKeyRequest.getKeyId() != null) {
                String keyId = generateDataKeyRequest.getKeyId();
                jsonWriter.name("KeyId");
                jsonWriter.value(keyId);
            }
            if (generateDataKeyRequest.getEncryptionContext() != null) {
                java.util.Map<String, String> encryptionContext = generateDataKeyRequest
                        .getEncryptionContext();
                jsonWriter.name("EncryptionContext");
                jsonWriter.beginObject();
                for (java.util.Map.Entry<String, String> encryptionContextEntry : encryptionContext
                        .entrySet()) {
                    String encryptionContextValue = encryptionContextEntry.getValue();
                    if (encryptionContextValue != null) {
                        jsonWriter.name(encryptionContextEntry.getKey());
                        jsonWriter.value(encryptionContextValue);
                    }
                }
                jsonWriter.endObject();
            }
            if (generateDataKeyRequest.getNumberOfBytes() != null) {
                Integer numberOfBytes = generateDataKeyRequest.getNumberOfBytes();
                jsonWriter.name("NumberOfBytes");
                jsonWriter.value(numberOfBytes);
            }
            if (generateDataKeyRequest.getKeySpec() != null) {
                String keySpec = generateDataKeyRequest.getKeySpec();
                jsonWriter.name("KeySpec");
                jsonWriter.value(keySpec);
            }
            if (generateDataKeyRequest.getGrantTokens() != null) {
                java.util.List<String> grantTokens = generateDataKeyRequest.getGrantTokens();
                jsonWriter.name("GrantTokens");
                jsonWriter.beginArray();
                for (String grantTokensItem : grantTokens) {
                    if (grantTokensItem != null) {
                        jsonWriter.value(grantTokensItem);
                    }
                }
                jsonWriter.endArray();
            }
            if (generateDataKeyRequest.getRecipient() != null) {
                RecipientInfo recipient = generateDataKeyRequest.getRecipient();
                jsonWriter.name("Recipient");
                RecipientInfoJsonMarshaller.getInstance().marshall(recipient, jsonWriter);
            }

            jsonWriter.endObject();
            jsonWriter.close();
            String snippet = stringWriter.toString();
            byte[] content = snippet.getBytes(UTF8);
            request.setContent(new StringInputStream(snippet));
            request.addHeader("Content-Length", Integer.toString(content.length));
        } catch (Throwable t) {
            throw new AmazonClientException(
                    "Unable to marshall request to JSON: " + t.getMessage(), t);
        }
        if (!request.getHeaders().containsKey("Content-Type")) {
            request.addHeader("Content-Type", "application/x-amz-json-1.1");
        }

        return request;
    }
}
