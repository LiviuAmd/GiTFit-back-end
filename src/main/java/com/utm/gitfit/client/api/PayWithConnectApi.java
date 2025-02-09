/*
 * Salt Edge Payment Initiation API
 * API Reference for services
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@saltedge.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.utm.gitfit.client.api;

import com.google.gson.reflect.TypeToken;
import com.utm.gitfit.client.*;
import com.utm.gitfit.client.model.PaymentTokenRequestBody;
import com.utm.gitfit.client.model.PaymentTokenResponse;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PayWithConnectApi {
    private ApiClient apiClient;

    public PayWithConnectApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PayWithConnectApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for paymentsConnectPost
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call paymentsConnectPostCall(PaymentTokenRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/payments/connect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "app_id", "secret" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call paymentsConnectPostValidateBeforeCall(PaymentTokenRequestBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = paymentsConnectPostCall(body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Pay with Connect
     * The easiest way to initiate payments using Salt Edge API is to use Salt Edge Connect, which handles all the authentication interaction with the user. After you will execute the request you will receive a &#x60;connect_url&#x60; field, which you need to redirect the user to in order to process with the payment flow. 
     * @param body  (optional)
     * @return PaymentTokenResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PaymentTokenResponse paymentsConnectPost(PaymentTokenRequestBody body) throws ApiException {
        ApiResponse<PaymentTokenResponse> resp = paymentsConnectPostWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Pay with Connect
     * The easiest way to initiate payments using Salt Edge API is to use Salt Edge Connect, which handles all the authentication interaction with the user. After you will execute the request you will receive a &#x60;connect_url&#x60; field, which you need to redirect the user to in order to process with the payment flow. 
     * @param body  (optional)
     * @return ApiResponse&lt;PaymentTokenResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PaymentTokenResponse> paymentsConnectPostWithHttpInfo(PaymentTokenRequestBody body) throws ApiException {
        com.squareup.okhttp.Call call = paymentsConnectPostValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<PaymentTokenResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Pay with Connect (asynchronously)
     * The easiest way to initiate payments using Salt Edge API is to use Salt Edge Connect, which handles all the authentication interaction with the user. After you will execute the request you will receive a &#x60;connect_url&#x60; field, which you need to redirect the user to in order to process with the payment flow. 
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call paymentsConnectPostAsync(PaymentTokenRequestBody body, final ApiCallback<PaymentTokenResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = paymentsConnectPostValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PaymentTokenResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
