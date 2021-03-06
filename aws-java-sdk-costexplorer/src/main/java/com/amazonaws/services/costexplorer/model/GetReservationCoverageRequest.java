/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * You can query for how much of your instance usage was covered by a reservation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetReservationCoverage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetReservationCoverageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start and end dates of the period for which you want to retrieve data about reservation coverage. You can
     * retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * You can group the data by the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<GroupDefinition> groupBy;
    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     * <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or <code>DAILY</code>.
     * </p>
     */
    private String granularity;
    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following dimensions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations, but
     * only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there are multiple
     * values for a dimension, they are OR'd together.
     * </p>
     */
    private Expression filter;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The start and end dates of the period for which you want to retrieve data about reservation coverage. You can
     * retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates of the period for which you want to retrieve data about reservation coverage. You
     *        can retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is
     *        inclusive, but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code>
     *        and <code>end</code> is <code>2017-05-01</code>, then the cost and usage data is retrieved from
     *        <code>2017-01-01</code> up to and including <code>2017-04-30</code> but not including
     *        <code>2017-05-01</code>.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The start and end dates of the period for which you want to retrieve data about reservation coverage. You can
     * retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @return The start and end dates of the period for which you want to retrieve data about reservation coverage. You
     *         can retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is
     *         inclusive, but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code>
     *         and <code>end</code> is <code>2017-05-01</code>, then the cost and usage data is retrieved from
     *         <code>2017-01-01</code> up to and including <code>2017-04-30</code> but not including
     *         <code>2017-05-01</code>.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The start and end dates of the period for which you want to retrieve data about reservation coverage. You can
     * retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is inclusive,
     * but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code>
     * is <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates of the period for which you want to retrieve data about reservation coverage. You
     *        can retrieve data for a maximum of 13 months-the last 12 months and the current month. The start date is
     *        inclusive, but the end date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code>
     *        and <code>end</code> is <code>2017-05-01</code>, then the cost and usage data is retrieved from
     *        <code>2017-01-01</code> up to and including <code>2017-04-30</code> but not including
     *        <code>2017-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * You can group the data by the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * 
     * @return You can group the data by the following attributes. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TENANCY
     *         </p>
     *         </li>
     */

    public java.util.List<GroupDefinition> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * You can group the data by the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        You can group the data by the following attributes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY
     *        </p>
     *        </li>
     */

    public void setGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<GroupDefinition>(groupBy);
    }

    /**
     * <p>
     * You can group the data by the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        You can group the data by the following attributes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageRequest withGroupBy(GroupDefinition... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<GroupDefinition>(groupBy.length));
        }
        for (GroupDefinition ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * You can group the data by the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * 
     * @param groupBy
     *        You can group the data by the following attributes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageRequest withGroupBy(java.util.Collection<GroupDefinition> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     * <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or <code>DAILY</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     *        <code>DAILY</code>.</p>
     *        <p>
     *        If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't
     *        set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     *        <code>DAILY</code>.
     * @see Granularity
     */

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     * <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or <code>DAILY</code>.
     * </p>
     * 
     * @return The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     *         <code>DAILY</code>.</p>
     *         <p>
     *         If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't
     *         set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     *         <code>DAILY</code>.
     * @see Granularity
     */

    public String getGranularity() {
        return this.granularity;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     * <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or <code>DAILY</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     *        <code>DAILY</code>.</p>
     *        <p>
     *        If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't
     *        set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     *        <code>DAILY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetReservationCoverageRequest withGranularity(String granularity) {
        setGranularity(granularity);
        return this;
    }

    /**
     * <p>
     * The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     * <code>DAILY</code>.
     * </p>
     * <p>
     * If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't set, the
     * response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or <code>DAILY</code>.
     * </p>
     * 
     * @param granularity
     *        The granularity of the AWS cost data for the reservation. Valid values are <code>MONTHLY</code> and
     *        <code>DAILY</code>.</p>
     *        <p>
     *        If <code>GroupBy</code> is set, <code>Granularity</code> can't be set. If <code>Granularity</code> isn't
     *        set, the response object doesn't include the <code>Granularity</code>, either <code>MONTHLY</code> or
     *        <code>DAILY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Granularity
     */

    public GetReservationCoverageRequest withGranularity(Granularity granularity) {
        this.granularity = granularity.toString();
        return this;
    }

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following dimensions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations, but
     * only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there are multiple
     * values for a dimension, they are OR'd together.
     * </p>
     * 
     * @param filter
     *        Filters utilization data by dimensions. You can filter by the following dimensions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations,
     *        but only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there
     *        are multiple values for a dimension, they are OR'd together.
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following dimensions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations, but
     * only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there are multiple
     * values for a dimension, they are OR'd together.
     * </p>
     * 
     * @return Filters utilization data by dimensions. You can filter by the following dimensions.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         AZ
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         INSTANCE_TYPE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         LINKED_ACCOUNT
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PLATFORM
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         REGION
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         TENANCY
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations,
     *         but only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there
     *         are multiple values for a dimension, they are OR'd together.
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * <p>
     * Filters utilization data by dimensions. You can filter by the following dimensions.
     * </p>
     * <ul>
     * <li>
     * <p>
     * AZ
     * </p>
     * </li>
     * <li>
     * <p>
     * INSTANCE_TYPE
     * </p>
     * </li>
     * <li>
     * <p>
     * LINKED_ACCOUNT
     * </p>
     * </li>
     * <li>
     * <p>
     * PLATFORM
     * </p>
     * </li>
     * <li>
     * <p>
     * REGION
     * </p>
     * </li>
     * <li>
     * <p>
     * TENANCY
     * </p>
     * </li>
     * </ul>
     * <p>
     * <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations, but
     * only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there are multiple
     * values for a dimension, they are OR'd together.
     * </p>
     * 
     * @param filter
     *        Filters utilization data by dimensions. You can filter by the following dimensions.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        AZ
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        INSTANCE_TYPE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        LINKED_ACCOUNT
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        PLATFORM
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        REGION
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        TENANCY
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <code>GetReservationCoverage</code> uses the same <code>Expression</code> object as the other operations,
     *        but only <code>AND</code> is supported among each dimension. You can nest only one level deep. If there
     *        are multiple values for a dimension, they are OR'd together.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *         call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetReservationCoverageRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getGranularity() != null)
            sb.append("Granularity: ").append(getGranularity()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetReservationCoverageRequest == false)
            return false;
        GetReservationCoverageRequest other = (GetReservationCoverageRequest) obj;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getGranularity() == null ^ this.getGranularity() == null)
            return false;
        if (other.getGranularity() != null && other.getGranularity().equals(this.getGranularity()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getGranularity() == null) ? 0 : getGranularity().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetReservationCoverageRequest clone() {
        return (GetReservationCoverageRequest) super.clone();
    }

}
