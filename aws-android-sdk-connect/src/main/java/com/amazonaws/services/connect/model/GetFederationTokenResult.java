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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

public class GetFederationTokenResult implements Serializable {
    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     */
    private Credentials credentials;

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     */
    private String signInUrl;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     */
    private String userArn;

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String userId;

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     *
     * @return <p>
     *         The credentials to use for federation.
     *         </p>
     */
    public Credentials getCredentials() {
        return credentials;
    }

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     *
     * @param credentials <p>
     *            The credentials to use for federation.
     *            </p>
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials to use for federation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param credentials <p>
     *            The credentials to use for federation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     *
     * @return <p>
     *         The URL to sign into the user's instance.
     *         </p>
     */
    public String getSignInUrl() {
        return signInUrl;
    }

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     *
     * @param signInUrl <p>
     *            The URL to sign into the user's instance.
     *            </p>
     */
    public void setSignInUrl(String signInUrl) {
        this.signInUrl = signInUrl;
    }

    /**
     * <p>
     * The URL to sign into the user's instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param signInUrl <p>
     *            The URL to sign into the user's instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenResult withSignInUrl(String signInUrl) {
        this.signInUrl = signInUrl;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the user.
     *         </p>
     */
    public String getUserArn() {
        return userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     *
     * @param userArn <p>
     *            The Amazon Resource Name (ARN) of the user.
     *            </p>
     */
    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param userArn <p>
     *            The Amazon Resource Name (ARN) of the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenResult withUserArn(String userArn) {
        this.userArn = userArn;
        return this;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The identifier for the user.
     *         </p>
     */
    public String getUserId() {
        return userId;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p>
     *            The identifier for the user.
     *            </p>
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The identifier for the user.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param userId <p>
     *            The identifier for the user.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetFederationTokenResult withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCredentials() != null)
            sb.append("Credentials: " + getCredentials() + ",");
        if (getSignInUrl() != null)
            sb.append("SignInUrl: " + getSignInUrl() + ",");
        if (getUserArn() != null)
            sb.append("UserArn: " + getUserArn() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getSignInUrl() == null) ? 0 : getSignInUrl().hashCode());
        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFederationTokenResult == false)
            return false;
        GetFederationTokenResult other = (GetFederationTokenResult) obj;

        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null
                && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getSignInUrl() == null ^ this.getSignInUrl() == null)
            return false;
        if (other.getSignInUrl() != null
                && other.getSignInUrl().equals(this.getSignInUrl()) == false)
            return false;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }
}
