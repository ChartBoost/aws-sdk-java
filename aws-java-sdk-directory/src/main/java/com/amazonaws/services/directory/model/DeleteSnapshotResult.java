/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of the DeleteSnapshot operation.
 * </p>
 */
public class DeleteSnapshotResult implements Serializable, Cloneable {

    /**
     * The identifier of the directory snapshot that was deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     */
    private String snapshotId;

    /**
     * The identifier of the directory snapshot that was deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     *
     * @return The identifier of the directory snapshot that was deleted.
     */
    public String getSnapshotId() {
        return snapshotId;
    }
    
    /**
     * The identifier of the directory snapshot that was deleted.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     *
     * @param snapshotId The identifier of the directory snapshot that was deleted.
     */
    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }
    
    /**
     * The identifier of the directory snapshot that was deleted.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^s-[0-9a-f]{10}$<br/>
     *
     * @param snapshotId The identifier of the directory snapshot that was deleted.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeleteSnapshotResult withSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSnapshotId() != null) sb.append("SnapshotId: " + getSnapshotId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeleteSnapshotResult == false) return false;
        DeleteSnapshotResult other = (DeleteSnapshotResult)obj;
        
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null) return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false) return false; 
        return true;
    }
    
    @Override
    public DeleteSnapshotResult clone() {
        try {
            return (DeleteSnapshotResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    