/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/CreateDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, the
     * default "postgres" database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB cluster is created. If this parameter is
     * not specified, no database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     */
    private String dBName;
    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 10 to 6144.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to 4096
     * (Express Edition and Web Edition)
     * </p>
     */
    private Integer allocatedStorage;
    /**
     * <p>
     * The compute and memory capacity of the DB instance. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     */
    private String dBInstanceClass;
    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;
    /**
     * <p>
     * The name for the master database user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the name for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 128 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 30 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String masterUsername;
    /**
     * <p>
     * The password for the master database user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the password for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dBSecurityGroups;
    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> vpcSecurityGroupIds;
    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in. For information on regions and
     * Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     */
    private String dBSubnetGroupName;
    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     */
    private String preferredMaintenanceWindow;
    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default
     * DBParameterGroup for the specified engine will be used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     */
    private String dBParameterGroupName;
    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;
    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time blocks
     * available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     */
    private String preferredBackupWindow;
    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the
     * MultiAZ parameter is set to true.
     * </p>
     */
    private Boolean multiAZ;
    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * The following are the database engines and major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     * eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.1.19</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.1.14</code> (supported in all regions except us-east-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>10.0.28</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.24</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2016</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2014</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions except
     * ca-central-1 and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2012</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2008 R2</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.7.17</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.16</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.11</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.6.35</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.34</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.29</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.54</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.53</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 12c</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 11g</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engineVersion;
    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;
    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;
    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be an
     * integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your <code>Iops</code>
     * value can be 2000, 3000, 4000, or 5000.
     * </p>
     */
    private Integer iops;
    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;
    /**
     * <p>
     * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.
     * </p>
     */
    private String characterSetName;
    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b> false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     */
    private Boolean publiclyAccessible;

    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     */
    private String dBClusterIdentifier;
    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;
    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     */
    private String tdeCredentialPassword;
    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean storageEncrypted;
    /**
     * <p>
     * The KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you
     * can use the KMS key alias instead of the ARN for the KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     * <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the
     * default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS
     * region.
     * </p>
     */
    private String kmsKeyId;
    /**
     * <p>
     * Specify the Active Directory Domain to create the instance in.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     */
    private Boolean copyTagsToSnapshot;
    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     */
    private Integer monitoringInterval;
    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling">
     * Setting Up and Enabling Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     */
    private String monitoringRoleArn;
    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     */
    private String domainIAMRoleName;
    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     */
    private Integer promotionTier;
    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts; otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;

    /**
     * Default constructor for CreateDBInstanceRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public CreateDBInstanceRequest() {
    }

    /**
     * Constructs a new CreateDBInstanceRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the database instance.
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *        increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 10 to 6144.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to
     *        4096 (Express Edition and Web Edition)
     * @param dBInstanceClass
     *        The compute and memory capacity of the DB instance. Note that not all instance classes are available in
     *        all regions for all DB engines.
     *        </p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * @param engine
     *        The name of the database engine to be used for this instance.
     *        </p>
     *        <p>
     *        Not every database engine is available for every AWS region.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     * @param masterUsername
     *        The name for the master database user.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You specify the name for the master database user when you create your DB cluster.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 128 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 30 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 63 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @param masterUserPassword
     *        The password for the master database user. Can be any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You specify the password for the master database user when you create your DB cluster.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     */
    public CreateDBInstanceRequest(String dBInstanceIdentifier, Integer allocatedStorage, String dBInstanceClass, String engine, String masterUsername,
            String masterUserPassword) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        setAllocatedStorage(allocatedStorage);
        setDBInstanceClass(dBInstanceClass);
        setEngine(engine);
        setMasterUsername(masterUsername);
        setMasterUserPassword(masterUserPassword);
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, the
     * default "postgres" database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB cluster is created. If this parameter is
     * not specified, no database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter is not specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter is not specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter is not specified,
     *        the default "postgres" database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits
     *        (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     *        <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for
     *        <code>DBName</code>.
     *        </p>
     *        <p>
     *        Default: <code>ORCL</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be longer than 8 characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Not applicable. Must be null.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the primary instance of the DB cluster is created. If this
     *        parameter is not specified, no database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     */

    public void setDBName(String dBName) {
        this.dBName = dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, the
     * default "postgres" database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB cluster is created. If this parameter is
     * not specified, no database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * 
     * @return The meaning of this parameter differs according to the database engine you use.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is created. If this parameter is not specified,
     *         no database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is created. If this parameter is not specified,
     *         no database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is created. If this parameter is not specified,
     *         the default "postgres" database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 63 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits
     *         (0-9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default
     *         value <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for
     *         <code>DBName</code>.
     *         </p>
     *         <p>
     *         Default: <code>ORCL</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Cannot be longer than 8 characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Not applicable. Must be null.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the primary instance of the DB cluster is created. If this
     *         parameter is not specified, no database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a word reserved by the specified database engine
     *         </p>
     *         </li>
     */

    public String getDBName() {
        return this.dBName;
    }

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine you use.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, no
     * database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If this parameter is not specified, the
     * default "postgres" database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     * <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for <code>DBName</code>
     * .
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Cannot be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB cluster is created. If this parameter is
     * not specified, no database is created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBName
     *        The meaning of this parameter differs according to the database engine you use.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter is not specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter is not specified, no
     *        database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the DB instance is created. If this parameter is not specified,
     *        the default "postgres" database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 63 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must begin with a letter or an underscore. Subsequent characters can be letters, underscores, or digits
     *        (0-9).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        The Oracle System ID (SID) of the created DB instance. If you specify <code>null</code>, the default value
     *        <code>ORCL</code> is used. You can't specify the string NULL, or any other reserved word, for
     *        <code>DBName</code>.
     *        </p>
     *        <p>
     *        Default: <code>ORCL</code>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Cannot be longer than 8 characters
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Not applicable. Must be null.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        The name of the database to create when the primary instance of the DB cluster is created. If this
     *        parameter is not specified, no database is created in the DB instance.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain 1 to 64 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a word reserved by the specified database engine
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBName(String dBName) {
        setDBName(dBName);
        return this;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @return The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>mydbinstance</code>
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The DB instance identifier. This parameter is stored as a lowercase string.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>mydbinstance</code>
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The DB instance identifier. This parameter is stored as a lowercase string.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must contain from 1 to 63 alphanumeric characters or hyphens (1 to 15 for SQL Server).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Example: <code>mydbinstance</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 10 to 6144.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to 4096
     * (Express Edition and Web Edition)
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the database instance.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *        increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 10 to 6144.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to
     *        4096 (Express Edition and Web Edition)
     */

    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 10 to 6144.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to 4096
     * (Express Edition and Web Edition)
     * </p>
     * 
     * @return The amount of storage (in gigabytes) to be initially allocated for the database instance.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *         increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must be an integer from 5 to 6144.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints: Must be an integer from 5 to 6144.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must be an integer from 5 to 6144.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints: Must be an integer from 10 to 6144.
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to
     *         4096 (Express Edition and Web Edition)
     */

    public Integer getAllocatedStorage() {
        return this.allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gigabytes) to be initially allocated for the database instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database increases,
     * though you are only charged for the space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 5 to 6144.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 10 to 6144.
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to 4096
     * (Express Edition and Web Edition)
     * </p>
     * 
     * @param allocatedStorage
     *        The amount of storage (in gigabytes) to be initially allocated for the database instance.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. Aurora cluster volumes automatically grow as the amount of data in your database
     *        increases, though you are only charged for the space that you use in an Aurora cluster volume.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 5 to 6144.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 10 to 6144.
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must be an integer from 200 to 4096 (Standard Edition and Enterprise Edition) or from 20 to
     *        4096 (Express Edition and Web Edition)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
        setAllocatedStorage(allocatedStorage);
        return this;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the DB instance. Note that not all instance classes are available in
     *        all regions for all DB engines.</p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     */

    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * 
     * @return The compute and memory capacity of the DB instance. Note that not all instance classes are available in
     *         all regions for all DB engines.</p>
     *         <p>
     *         Valid Values:
     *         <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     */

    public String getDBInstanceClass() {
        return this.dBInstanceClass;
    }

    /**
     * <p>
     * The compute and memory capacity of the DB instance. Note that not all instance classes are available in all
     * regions for all DB engines.
     * </p>
     * <p>
     * Valid Values:
     * <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * </p>
     * 
     * @param dBInstanceClass
     *        The compute and memory capacity of the DB instance. Note that not all instance classes are available in
     *        all regions for all DB engines.</p>
     *        <p>
     *        Valid Values:
     *        <code>db.t1.micro | db.m1.small | db.m1.medium | db.m1.large | db.m1.xlarge | db.m2.xlarge |db.m2.2xlarge | db.m2.4xlarge | db.m3.medium | db.m3.large | db.m3.xlarge | db.m3.2xlarge | db.m4.large | db.m4.xlarge | db.m4.2xlarge | db.m4.4xlarge | db.m4.10xlarge | db.r3.large | db.r3.xlarge | db.r3.2xlarge | db.r3.4xlarge | db.r3.8xlarge | db.t2.micro | db.t2.small | db.t2.medium | db.t2.large</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        setDBInstanceClass(dBInstanceClass);
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The name of the database engine to be used for this instance. </p>
     *        <p>
     *        Not every database engine is available for every AWS region.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     */

    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the database engine to be used for this instance. </p>
     *         <p>
     *         Not every database engine is available for every AWS region.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aurora</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web</code>
     *         </p>
     *         </li>
     */

    public String getEngine() {
        return this.engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engine
     *        The name of the database engine to be used for this instance. </p>
     *        <p>
     *        Not every database engine is available for every AWS region.
     *        </p>
     *        <p>
     *        Valid Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>aurora</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mariadb</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>mysql</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se1</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>oracle-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>postgres</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ee</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-se</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-ex</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>sqlserver-web</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEngine(String engine) {
        setEngine(engine);
        return this;
    }

    /**
     * <p>
     * The name for the master database user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the name for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 128 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 30 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master database user.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You specify the name for the master database user when you create your DB cluster.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 128 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 30 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 63 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     */

    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The name for the master database user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the name for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 128 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 30 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name for the master database user.</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. You specify the name for the master database user when you create your DB cluster.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 128 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 16 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 30 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 63 alphanumeric characters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     */

    public String getMasterUsername() {
        return this.masterUsername;
    }

    /**
     * <p>
     * The name for the master database user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the name for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 128 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 16 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 30 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 63 alphanumeric characters.
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param masterUsername
     *        The name for the master database user.</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You specify the name for the master database user when you create your DB cluster.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 128 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 16 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 30 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 63 alphanumeric characters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be a reserved word for the chosen database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMasterUsername(String masterUsername) {
        setMasterUsername(masterUsername);
        return this;
    }

    /**
     * <p>
     * The password for the master database user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the password for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. Can be any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You specify the password for the master database user when you create your DB cluster.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the password for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @return The password for the master database user. Can be any printable ASCII character except "/",
     *         """, or "@".</p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. You specify the password for the master database user when you create your DB cluster.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 30 characters.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master database user. Can be any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You specify the password for the master database user when you create your DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master database user. Can be any printable ASCII character except "/",
     *        """, or "@".</p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Not applicable. You specify the password for the master database user when you create your DB cluster.
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Microsoft SQL Server</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     *        </p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 41 characters.
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 30 characters.
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Constraints: Must contain from 8 to 128 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     * 
     * @return A list of DB security groups to associate with this DB instance.</p>
     *         <p>
     *         Default: The default DB security group for the database engine.
     */

    public java.util.List<String> getDBSecurityGroups() {
        if (dBSecurityGroups == null) {
            dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dBSecurityGroups;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default DB security group for the database engine.
     */

    public void setDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        if (dBSecurityGroups == null) {
            this.dBSecurityGroups = null;
            return;
        }

        this.dBSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups);
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBSecurityGroups(java.util.Collection)} or {@link #withDBSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default DB security group for the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
        if (this.dBSecurityGroups == null) {
            setDBSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(dBSecurityGroups.length));
        }
        for (String ele : dBSecurityGroups) {
            this.dBSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of DB security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default DB security group for the database engine.
     * </p>
     * 
     * @param dBSecurityGroups
     *        A list of DB security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default DB security group for the database engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBSecurityGroups(java.util.Collection<String> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @return A list of EC2 VPC security groups to associate with this DB instance.</p>
     *         <p>
     *         Default: The default EC2 VPC security group for the DB subnet group's VPC.
     */

    public java.util.List<String> getVpcSecurityGroupIds() {
        if (vpcSecurityGroupIds == null) {
            vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     */

    public void setVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        if (vpcSecurityGroupIds == null) {
            this.vpcSecurityGroupIds = null;
            return;
        }

        this.vpcSecurityGroupIds = new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds);
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVpcSecurityGroupIds(java.util.Collection)} or {@link #withVpcSecurityGroupIds(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
        if (this.vpcSecurityGroupIds == null) {
            setVpcSecurityGroupIds(new com.amazonaws.internal.SdkInternalList<String>(vpcSecurityGroupIds.length));
        }
        for (String ele : vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of EC2 VPC security groups to associate with this DB instance.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * </p>
     * 
     * @param vpcSecurityGroupIds
     *        A list of EC2 VPC security groups to associate with this DB instance.</p>
     *        <p>
     *        Default: The default EC2 VPC security group for the DB subnet group's VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withVpcSecurityGroupIds(java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in. For information on regions and
     * Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone that the database instance will be created in. For information on regions and
     *        Availability Zones, see <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>. </p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     *        </p>
     *        <p>
     *        Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     *        <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in. For information on regions and
     * Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     * 
     * @return The EC2 Availability Zone that the database instance will be created in. For information on regions and
     *         Availability Zones, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>. </p>
     *         <p>
     *         Default: A random, system-chosen Availability Zone in the endpoint's region.
     *         </p>
     *         <p>
     *         Example: <code>us-east-1d</code>
     *         </p>
     *         <p>
     *         Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     *         <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The EC2 Availability Zone that the database instance will be created in. For information on regions and
     * Availability Zones, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html">Regions
     * and Availability Zones</a>.
     * </p>
     * <p>
     * Default: A random, system-chosen Availability Zone in the endpoint's region.
     * </p>
     * <p>
     * Example: <code>us-east-1d</code>
     * </p>
     * <p>
     * Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     * <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     * </p>
     * 
     * @param availabilityZone
     *        The EC2 Availability Zone that the database instance will be created in. For information on regions and
     *        Availability Zones, see <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *        >Regions and Availability Zones</a>. </p>
     *        <p>
     *        Default: A random, system-chosen Availability Zone in the endpoint's region.
     *        </p>
     *        <p>
     *        Example: <code>us-east-1d</code>
     *        </p>
     *        <p>
     *        Constraint: The AvailabilityZone parameter cannot be specified if the MultiAZ parameter is set to
     *        <code>true</code>. The specified Availability Zone must be in the same region as the current endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB instance.</p>
     *        <p>
     *        If there is no DB subnet group, then it is a non-VPC DB instance.
     */

    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     * 
     * @return A DB subnet group to associate with this DB instance.</p>
     *         <p>
     *         If there is no DB subnet group, then it is a non-VPC DB instance.
     */

    public String getDBSubnetGroupName() {
        return this.dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     * 
     * @param dBSubnetGroupName
     *        A DB subnet group to associate with this DB instance.</p>
     *        <p>
     *        If there is no DB subnet group, then it is a non-VPC DB instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        setDBSubnetGroupName(dBSubnetGroupName);
        return this;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB Instance
     *        Maintenance</a>. </p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a
     *        random day of the week. To see the time blocks available, see <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting
     *        the Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     */

    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @return The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB Instance
     *         Maintenance</a>. </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a
     *         random day of the week. To see the time blocks available, see <a
     *         href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html">
     *         Adjusting the Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     *         </p>
     *         <p>
     *         Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *         </p>
     *         <p>
     *         Constraints: Minimum 30-minute window.
     */

    public String getPreferredMaintenanceWindow() {
        return this.preferredMaintenanceWindow;
    }

    /**
     * <p>
     * The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB
     * Instance Maintenance</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a random day
     * of the week. To see the time blocks available, see <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting the
     * Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     * 
     * @param preferredMaintenanceWindow
     *        The weekly time range during which system maintenance can occur, in Universal Coordinated Time (UTC). For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.DBMaintenance.html">DB Instance
     *        Maintenance</a>. </p>
     *        <p>
     *        Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *        </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour block of time per region, occurring on a
     *        random day of the week. To see the time blocks available, see <a
     *        href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/AdjustingTheMaintenanceWindow.html"> Adjusting
     *        the Preferred Maintenance Window</a> in the <i>Amazon RDS User Guide.</i>
     *        </p>
     *        <p>
     *        Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun
     *        </p>
     *        <p>
     *        Constraints: Minimum 30-minute window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        setPreferredMaintenanceWindow(preferredMaintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default
     * DBParameterGroup for the specified engine will be used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the
     *        default DBParameterGroup for the specified engine will be used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     */

    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default
     * DBParameterGroup for the specified engine will be used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the
     *         default DBParameterGroup for the specified engine will be used.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 alphanumeric characters
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         First character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     */

    public String getDBParameterGroupName() {
        return this.dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the default
     * DBParameterGroup for the specified engine will be used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 alphanumeric characters
     * </p>
     * </li>
     * <li>
     * <p>
     * First character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * 
     * @param dBParameterGroupName
     *        The name of the DB parameter group to associate with this DB instance. If this argument is omitted, the
     *        default DBParameterGroup for the specified engine will be used.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be 1 to 255 alphanumeric characters
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        First character must be a letter
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot end with a hyphen or contain two consecutive hyphens
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        setDBParameterGroupName(dBParameterGroupName);
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. Setting this parameter to a positive number
     *        enables backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 0 to 35
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be set to 0 if the DB instance is a source to Read Replicas
     *        </p>
     *        </li>
     */

    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @return The number of days for which automated backups are retained. Setting this parameter to a positive number
     *         enables backups. Setting this parameter to 0 disables automated backups.</p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be a value from 0 to 35
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Cannot be set to 0 if the DB instance is a source to Read Replicas
     *         </p>
     *         </li>
     */

    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this parameter to a positive number enables
     * backups. Setting this parameter to 0 disables automated backups.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Cannot be set to 0 if the DB instance is a source to Read Replicas
     * </p>
     * </li>
     * </ul>
     * 
     * @param backupRetentionPeriod
     *        The number of days for which automated backups are retained. Setting this parameter to a positive number
     *        enables backups. Setting this parameter to 0 disables automated backups.</p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be a value from 0 to 35
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Cannot be set to 0 if the DB instance is a source to Read Replicas
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        setBackupRetentionPeriod(backupRetentionPeriod);
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time blocks
     * available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html"
     *        >DB Instance Backups</a>. </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time
     *        blocks available, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     *        > Adjusting the Preferred DB Instance Maintenance Window</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Times should be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     */

    public void setPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time blocks
     * available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The daily time range during which automated backups are created if automated backups are enabled, using
     *         the <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html"
     *         >DB Instance Backups</a>. </p>
     *         <p>
     *         Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time
     *         blocks available, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     *         > Adjusting the Preferred DB Instance Maintenance Window</a>.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be in the format <code>hh24:mi-hh24:mi</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Times should be in Universal Coordinated Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must not conflict with the preferred maintenance window.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be at least 30 minutes.
     *         </p>
     *         </li>
     */

    public String getPreferredBackupWindow() {
        return this.preferredBackupWindow;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html">DB
     * Instance Backups</a>.
     * </p>
     * <p>
     * Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time blocks
     * available, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a>.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be in the format <code>hh24:mi-hh24:mi</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Times should be in Universal Coordinated Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Must not conflict with the preferred maintenance window.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be at least 30 minutes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param preferredBackupWindow
     *        The daily time range during which automated backups are created if automated backups are enabled, using
     *        the <code>BackupRetentionPeriod</code> parameter. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Overview.BackingUpAndRestoringAmazonRDSInstances.html"
     *        >DB Instance Backups</a>. </p>
     *        <p>
     *        Default: A 30-minute window selected at random from an 8-hour block of time per region. To see the time
     *        blocks available, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     *        > Adjusting the Preferred DB Instance Maintenance Window</a>.
     *        </p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Must be in the format <code>hh24:mi-hh24:mi</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Times should be in Universal Coordinated Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must not conflict with the preferred maintenance window.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Must be at least 30 minutes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        setPreferredBackupWindow(preferredBackupWindow);
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: <code>1521</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *        <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * 
     * @return The port number on which the database accepts connections.</p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: <code>5432</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Default: <code>1521</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Default: <code>1433</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>, <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     * <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * 
     * @param port
     *        The port number on which the database accepts connections.</p>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <p>
     *        Default: <code>5432</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        <b>Oracle</b>
     *        </p>
     *        <p>
     *        Default: <code>1521</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        <b>SQL Server</b>
     *        </p>
     *        <p>
     *        Default: <code>1433</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code> except for <code>1434</code>, <code>3389</code>, <code>47001</code>,
     *        <code>49152</code>, and <code>49152</code> through <code>49156</code>.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <p>
     *        Default: <code>3306</code>
     *        </p>
     *        <p>
     *        Valid Values: <code>1150-65535</code>
     *        </p>
     *        <p>
     *        Type: Integer
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the
     * MultiAZ parameter is set to true.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if
     *        the MultiAZ parameter is set to true.
     */

    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the
     * MultiAZ parameter is set to true.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to true.
     */

    public Boolean getMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the
     * MultiAZ parameter is set to true.
     * </p>
     * 
     * @param multiAZ
     *        Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if
     *        the MultiAZ parameter is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        setMultiAZ(multiAZ);
        return this;
    }

    /**
     * <p>
     * Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if the
     * MultiAZ parameter is set to true.
     * </p>
     * 
     * @return Specifies if the DB instance is a Multi-AZ deployment. You cannot set the AvailabilityZone parameter if
     *         the MultiAZ parameter is set to true.
     */

    public Boolean isMultiAZ() {
        return this.multiAZ;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * The following are the database engines and major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     * eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.1.19</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.1.14</code> (supported in all regions except us-east-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>10.0.28</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.24</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2016</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2014</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions except
     * ca-central-1 and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2012</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2008 R2</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.7.17</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.16</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.11</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.6.35</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.34</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.29</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.54</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.53</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 12c</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 11g</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        The following are the database engines and major and minor versions that are available with Amazon RDS.
     *        Not every database engine is available for every AWS region.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     *        eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>10.1.19</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.1.14</code> (supported in all regions except us-east-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>10.0.28</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.0.24</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2016</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2014</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions
     *        except ca-central-1 and eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2012</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2008 R2</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.7.17</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.7.16</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.7.11</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.6.35</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.34</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.29</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.5.54</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.5.53</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.5.46</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle 12c</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle 11g</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     *        </p>
     *        </li>
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * The following are the database engines and major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     * eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.1.19</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.1.14</code> (supported in all regions except us-east-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>10.0.28</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.24</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2016</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2014</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions except
     * ca-central-1 and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2012</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2008 R2</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.7.17</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.16</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.11</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.6.35</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.34</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.29</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.54</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.53</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 12c</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 11g</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The version number of the database engine to use.</p>
     *         <p>
     *         The following are the database engines and major and minor versions that are available with Amazon RDS.
     *         Not every database engine is available for every AWS region.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     *         eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>10.1.19</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>10.1.14</code> (supported in all regions except us-east-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p/>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>10.0.28</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>10.0.24</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Microsoft SQL Server 2016</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Microsoft SQL Server 2014</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions
     *         except ca-central-1 and eu-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Microsoft SQL Server 2012</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *         ca-central-1, and eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *         ca-central-1, and eu-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Microsoft SQL Server 2008 R2</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *         ca-central-1, and eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *         ca-central-1, and eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *         ca-central-1, and eu-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>5.7.17</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.7.16</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.7.11</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p/>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>5.6.35</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.34</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.29</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *         eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2,
     *         ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *         eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2,
     *         ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2,
     *         ca-central-1, eu-west-2)
     *         </p>
     *         </li>
     *         </ul>
     *         <p/>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>5.5.54</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.5.53</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>5.5.46</code> (supported in all AWS regions)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle 12c</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *         us-gov-west-1)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle 11g</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     *         </p>
     *         </li>
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * The following are the database engines and major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     * eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.1.19</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.1.14</code> (supported in all regions except us-east-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>10.0.28</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.24</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2016</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2014</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions except
     * ca-central-1 and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2012</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server 2008 R2</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1,
     * and eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2, ca-central-1, and
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>5.7.17</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.16</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.11</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.6.35</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.34</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.29</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     * eu-west-2)
     * </p>
     * </li>
     * </ul>
     * <p/>
     * <ul>
     * <li>
     * <p>
     * <code>5.5.54</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.53</code> (supported in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>5.5.46</code> (supported in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 12c</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except us-gov-west-1)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle 11g</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param engineVersion
     *        The version number of the database engine to use.</p>
     *        <p>
     *        The following are the database engines and major and minor versions that are available with Amazon RDS.
     *        Not every database engine is available for every AWS region.
     *        </p>
     *        <p>
     *        <b>Amazon Aurora</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Version 5.6 (available in these AWS regions: ap-northeast-1, ap-northeast-2, ap-south-1, ap-southeast-2,
     *        eu-west-1, us-east-1, us-east-2, us-west-2): <code> 5.6.10a</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MariaDB</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>10.1.19</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.1.14</code> (supported in all regions except us-east-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>10.0.28</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.0.24</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.0.17</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2016</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>13.00.4422.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>13.00.2164.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2014</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>12.00.5546.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.00.5000.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.00.4422.0.v1</code> (supported for all editions except Enterprise Edition, and all AWS regions
     *        except ca-central-1 and eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2012</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>11.00.6594.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.00.6020.0.v1</code> (supported for all editions, and all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.00.5058.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.00.2100.60.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Microsoft SQL Server 2008 R2</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>10.50.6529.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.50.6000.34.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>10.50.2789.0.v1</code> (supported for all editions, and all AWS regions except us-east-2,
     *        ca-central-1, and eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>MySQL</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.7.17</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.7.16</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.7.11</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.7.10</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.6.35</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.34</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.29</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.27</code> (supported in all regions except us-east-2, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.23</code> (supported in all regions except us-east-2, ap-south-1, ca-central-1, eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.22</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.21b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.21</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.19b</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.6.19a</code> (supported in all regions except us-east-2, ap-south-1, ap-northeast-2, ca-central-1,
     *        eu-west-2)
     *        </p>
     *        </li>
     *        </ul>
     *        <p/>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>5.5.54</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.5.53</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>5.5.46</code> (supported in all AWS regions)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle 12c</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v8</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v7</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v6</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v5</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v4</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v3</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v2</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>12.1.0.2.v1</code> (supported for EE in all AWS regions, and SE2 in all AWS regions except
     *        us-gov-west-1)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Oracle 11g</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v12</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v11</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v10</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v9</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v8</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v7</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v6</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v5</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v4</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v3</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>11.2.0.4.v1</code> (supported for EE, SE1, and SE, in all AWS regions)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>PostgreSQL</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Version 9.6.x:</b> <code> 9.6.1 | 9.6.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version 9.5.x:</b> <code>9.5.6 | 9.5.4 | 9.5.2</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version 9.4.x:</b> <code>9.4.11 | 9.4.9 | 9.4.7</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version 9.3.x:</b> <code>9.3.16 | 9.3.14 | 9.3.12</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades will be applied automatically to the DB instance during the
     *        maintenance window.</p>
     *        <p>
     *        Default: <code>true</code>
     */

    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates that minor engine upgrades will be applied automatically to the DB instance during the
     *         maintenance window.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean getAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @param autoMinorVersionUpgrade
     *        Indicates that minor engine upgrades will be applied automatically to the DB instance during the
     *        maintenance window.</p>
     *        <p>
     *        Default: <code>true</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        setAutoMinorVersionUpgrade(autoMinorVersionUpgrade);
        return this;
    }

    /**
     * <p>
     * Indicates that minor engine upgrades will be applied automatically to the DB instance during the maintenance
     * window.
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * 
     * @return Indicates that minor engine upgrades will be applied automatically to the DB instance during the
     *         maintenance window.</p>
     *         <p>
     *         Default: <code>true</code>
     */

    public Boolean isAutoMinorVersionUpgrade() {
        return this.autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     */

    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @return License model information for this DB instance.</p>
     *         <p>
     *         Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     */

    public String getLicenseModel() {
        return this.licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     * <code>general-public-license</code>
     * </p>
     * 
     * @param licenseModel
     *        License model information for this DB instance.</p>
     *        <p>
     *        Valid values: <code>license-included</code> | <code>bring-your-own-license</code> |
     *        <code>general-public-license</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withLicenseModel(String licenseModel) {
        setLicenseModel(licenseModel);
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be an
     * integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your <code>Iops</code>
     * value can be 2000, 3000, 4000, or 5000.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.</p>
     *        <p>
     *        Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be
     *        an integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your
     *        <code>Iops</code> value can be 2000, 3000, 4000, or 5000.
     */

    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be an
     * integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your <code>Iops</code>
     * value can be 2000, 3000, 4000, or 5000.
     * </p>
     * 
     * @return The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *         instance.</p>
     *         <p>
     *         Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be
     *         an integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your
     *         <code>Iops</code> value can be 2000, 3000, 4000, or 5000.
     */

    public Integer getIops() {
        return this.iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     * instance.
     * </p>
     * <p>
     * Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be an
     * integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your <code>Iops</code>
     * value can be 2000, 3000, 4000, or 5000.
     * </p>
     * 
     * @param iops
     *        The amount of Provisioned IOPS (input/output operations per second) to be initially allocated for the DB
     *        instance.</p>
     *        <p>
     *        Constraints: Must be a multiple between 3 and 10 of the storage amount for the DB instance. Must also be
     *        an integer multiple of 1000. For example, if the size of your DB instance is 500 GB, then your
     *        <code>Iops</code> value can be 2000, 3000, 4000, or 5000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withIops(Integer iops) {
        setIops(iops);
        return this;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        Indicates that the DB instance should be associated with the specified option group.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *        option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *        instance
     */

    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @return Indicates that the DB instance should be associated with the specified option group.</p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *         option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *         instance
     */

    public String getOptionGroupName() {
        return this.optionGroupName;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an option
     * group, and that option group cannot be removed from a DB instance once it is associated with a DB instance
     * </p>
     * 
     * @param optionGroupName
     *        Indicates that the DB instance should be associated with the specified option group.</p>
     *        <p>
     *        Permanent options, such as the TDE option for Oracle Advanced Security TDE, cannot be removed from an
     *        option group, and that option group cannot be removed from a DB instance once it is associated with a DB
     *        instance
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withOptionGroupName(String optionGroupName) {
        setOptionGroupName(optionGroupName);
        return this;
    }

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.
     * </p>
     * 
     * @param characterSetName
     *        For supported engines, indicates that the DB instance should be associated with the specified
     *        CharacterSet.
     */

    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.
     * </p>
     * 
     * @return For supported engines, indicates that the DB instance should be associated with the specified
     *         CharacterSet.
     */

    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be associated with the specified CharacterSet.
     * </p>
     * 
     * @param characterSetName
     *        For supported engines, indicates that the DB instance should be associated with the specified
     *        CharacterSet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withCharacterSetName(String characterSetName) {
        setCharacterSetName(characterSetName);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b> false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *        instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *        specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *        <p>
     *        Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *        list shows the default behavior in each case.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Default VPC:</b> true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VPC:</b> false
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *        been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as
     *        part of the request and the PubliclyAccessible value has not been set, the DB instance will be private.
     */

    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b> false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *         instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *         <p>
     *         Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *         list shows the default behavior in each case.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Default VPC:</b> true
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VPC:</b> false
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *         been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been set, the DB instance will be
     *         private.
     */

    public Boolean getPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b> false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @param publiclyAccessible
     *        Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *        instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *        specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *        <p>
     *        Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *        list shows the default behavior in each case.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Default VPC:</b> true
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>VPC:</b> false
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *        been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as
     *        part of the request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        setPubliclyAccessible(publiclyAccessible);
        return this;
    }

    /**
     * <p>
     * Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing instance
     * with a publicly resolvable DNS name, which resolves to a public IP address. A value of false specifies an
     * internal instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether a VPC has been requested or not. The following list
     * shows the default behavior in each case.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Default VPC:</b> true
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>VPC:</b> false
     * </p>
     * </li>
     * </ul>
     * <p>
     * If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not been
     * set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified as part of the
     * request and the PubliclyAccessible value has not been set, the DB instance will be private.
     * </p>
     * 
     * @return Specifies the accessibility options for the DB instance. A value of true specifies an Internet-facing
     *         instance with a publicly resolvable DNS name, which resolves to a public IP address. A value of false
     *         specifies an internal instance with a DNS name that resolves to a private IP address.</p>
     *         <p>
     *         Default: The default behavior varies depending on whether a VPC has been requested or not. The following
     *         list shows the default behavior in each case.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Default VPC:</b> true
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>VPC:</b> false
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If no DB subnet group has been specified as part of the request and the PubliclyAccessible value has not
     *         been set, the DB instance will be publicly accessible. If a specific DB subnet group has been specified
     *         as part of the request and the PubliclyAccessible value has not been set, the DB instance will be
     *         private.
     */

    public Boolean isPubliclyAccessible() {
        return this.publiclyAccessible;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The identifier of the DB cluster that the instance will belong to.</p>
     *        <p>
     *        For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     *        </p>
     *        <p>
     *        Type: String
     */

    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @return The identifier of the DB cluster that the instance will belong to.</p>
     *         <p>
     *         For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     *         </p>
     *         <p>
     *         Type: String
     */

    public String getDBClusterIdentifier() {
        return this.dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     * </p>
     * <p>
     * Type: String
     * </p>
     * 
     * @param dBClusterIdentifier
     *        The identifier of the DB cluster that the instance will belong to.</p>
     *        <p>
     *        For information on creating a DB cluster, see <a>CreateDBCluster</a>.
     *        </p>
     *        <p>
     *        Type: String
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        setDBClusterIdentifier(dBClusterIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.</p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     * 
     * @return Specifies the storage type to be associated with the DB instance.</p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise
     *         <code>standard</code>
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * </p>
     * 
     * @param storageType
     *        Specifies the storage type to be associated with the DB instance.</p>
     *        <p>
     *        Valid values: <code>standard | gp2 | io1</code>
     *        </p>
     *        <p>
     *        If you specify <code>io1</code>, you must also include a value for the <code>Iops</code> parameter.
     *        </p>
     *        <p>
     *        Default: <code>io1</code> if the <code>Iops</code> parameter is specified; otherwise <code>standard</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the Key Store with which to associate the instance for TDE encryption.
     */

    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @return The ARN from the Key Store with which to associate the instance for TDE encryption.
     */

    public String getTdeCredentialArn() {
        return this.tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the Key Store with which to associate the instance for TDE encryption.
     * </p>
     * 
     * @param tdeCredentialArn
     *        The ARN from the Key Store with which to associate the instance for TDE encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
        setTdeCredentialArn(tdeCredentialArn);
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the Key Store in order to access the device.
     */

    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     * 
     * @return The password for the given ARN from the Key Store in order to access the device.
     */

    public String getTdeCredentialPassword() {
        return this.tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the Key Store in order to access the device.
     * </p>
     * 
     * @param tdeCredentialPassword
     *        The password for the given ARN from the Key Store in order to access the device.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        setTdeCredentialPassword(tdeCredentialPassword);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.</p>
     *        <p>
     *        Default: false
     */

    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.</p>
     *         <p>
     *         Default: false
     */

    public Boolean getStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param storageEncrypted
     *        Specifies whether the DB instance is encrypted.</p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withStorageEncrypted(Boolean storageEncrypted) {
        setStorageEncrypted(storageEncrypted);
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB instance is encrypted.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Specifies whether the DB instance is encrypted.</p>
     *         <p>
     *         Default: false
     */

    public Boolean isStorageEncrypted() {
        return this.storageEncrypted;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you
     * can use the KMS key alias instead of the ARN for the KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     * <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the
     * default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS
     * region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted DB instance.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *        instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.
     *        </p>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     *        <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the
     *        default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *        each AWS region.
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you
     * can use the KMS key alias instead of the ARN for the KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     * <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the
     * default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS
     * region.
     * </p>
     * 
     * @return The KMS key identifier for an encrypted DB instance.</p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating
     *         a DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *         instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.
     *         </p>
     *         <p>
     *         If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     *         <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account has a different default encryption key
     *         for each AWS region.
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * The KMS key identifier for an encrypted DB instance.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a DB
     * instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB instance, then you
     * can use the KMS key alias instead of the ARN for the KM encryption key.
     * </p>
     * <p>
     * If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     * <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the
     * default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS
     * region.
     * </p>
     * 
     * @param kmsKeyId
     *        The KMS key identifier for an encrypted DB instance.</p>
     *        <p>
     *        The KMS key identifier is the Amazon Resource Name (ARN) for the KMS encryption key. If you are creating a
     *        DB instance with the same AWS account that owns the KMS encryption key used to encrypt the new DB
     *        instance, then you can use the KMS key alias instead of the ARN for the KM encryption key.
     *        </p>
     *        <p>
     *        If the <code>StorageEncrypted</code> parameter is true, and you do not specify a value for the
     *        <code>KmsKeyId</code> parameter, then Amazon RDS will use your default encryption key. AWS KMS creates the
     *        default encryption key for your AWS account. Your AWS account has a different default encryption key for
     *        each AWS region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
        return this;
    }

    /**
     * <p>
     * Specify the Active Directory Domain to create the instance in.
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory Domain to create the instance in.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specify the Active Directory Domain to create the instance in.
     * </p>
     * 
     * @return Specify the Active Directory Domain to create the instance in.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specify the Active Directory Domain to create the instance in.
     * </p>
     * 
     * @param domain
     *        Specify the Active Directory Domain to create the instance in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *        is false.
     */

    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *         is false.
     */

    public Boolean getCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @param copyTagsToSnapshot
     *        True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *        is false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        setCopyTagsToSnapshot(copyTagsToSnapshot);
        return this;
    }

    /**
     * <p>
     * True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default is
     * false.
     * </p>
     * 
     * @return True to copy all tags from the DB instance to snapshots of the DB instance; otherwise false. The default
     *         is false.
     */

    public Boolean isCopyTagsToSnapshot() {
        return this.copyTagsToSnapshot;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @return The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *         instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *         a value other than 0.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     */

    public Integer getMonitoringInterval() {
        return this.monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB instance. To
     * disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to a value
     * other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * 
     * @param monitoringInterval
     *        The interval, in seconds, between points when Enhanced Monitoring metrics are collected for the DB
     *        instance. To disable collecting Enhanced Monitoring metrics, specify 0. The default is 0.</p>
     *        <p>
     *        If <code>MonitoringRoleArn</code> is specified, then you must also set <code>MonitoringInterval</code> to
     *        a value other than 0.
     *        </p>
     *        <p>
     *        Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        setMonitoringInterval(monitoringInterval);
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling">
     * Setting Up and Enabling Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For
     *        example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *        >Setting Up and Enabling Enhanced Monitoring</a>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     */

    public void setMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling">
     * Setting Up and Enabling Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @return The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For
     *         example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *         role, go to <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *         >Setting Up and Enabling Enhanced Monitoring</a>.</p>
     *         <p>
     *         If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *         <code>MonitoringRoleArn</code> value.
     */

    public String getMonitoringRoleArn() {
        return this.monitoringRoleArn;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring role, go to <a
     * href="http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling">
     * Setting Up and Enabling Enhanced Monitoring</a>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     * <code>MonitoringRoleArn</code> value.
     * </p>
     * 
     * @param monitoringRoleArn
     *        The ARN for the IAM role that permits RDS to send enhanced monitoring metrics to CloudWatch Logs. For
     *        example, <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on creating a monitoring
     *        role, go to <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *        >Setting Up and Enabling Enhanced Monitoring</a>.</p>
     *        <p>
     *        If <code>MonitoringInterval</code> is set to a value other than 0, then you must supply a
     *        <code>MonitoringRoleArn</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        setMonitoringRoleArn(monitoringRoleArn);
        return this;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.
     */

    public void setDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @return Specify the name of the IAM role to be used when making API calls to the Directory Service.
     */

    public String getDomainIAMRoleName() {
        return this.domainIAMRoleName;
    }

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param domainIAMRoleName
     *        Specify the name of the IAM role to be used when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        setDomainIAMRoleName(domainIAMRoleName);
        return this;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a>. </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
     */

    public void setPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @return A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *         failure of the existing primary instance. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance"
     *         > Fault Tolerance for an Aurora DB Cluster</a>. </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid Values: 0 - 15
     */

    public Integer getPromotionTier() {
        return this.promotionTier;
    }

    /**
     * <p>
     * A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a failure
     * of the existing primary instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance">
     * Fault Tolerance for an Aurora DB Cluster</a>.
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     * 
     * @param promotionTier
     *        A value that specifies the order in which an Aurora Replica is promoted to the primary instance after a
     *        failure of the existing primary instance. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Aurora.Managing.html#Aurora.Managing.FaultTolerance"
     *        > Fault Tolerance for an Aurora DB Cluster</a>. </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid Values: 0 - 15
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withPromotionTier(Integer promotionTier) {
        setPromotionTier(promotionTier);
        return this;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *        >Microsoft SQL Server</a>.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * 
     * @return The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     *         "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *         >Microsoft SQL Server</a>.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     * "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * 
     * @param timezone
     *        The time zone of the DB instance. The time zone parameter is currently supported only by <a href=
     *        "http://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *        >Microsoft SQL Server</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts; otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts;
     *        otherwise false. </p>
     *        <p>
     *        You can enable IAM database authentication for the following database engines:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts; otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts;
     *         otherwise false. </p>
     *         <p>
     *         You can enable IAM database authentication for the following database engines:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts; otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param enableIAMDatabaseAuthentication
     *        True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts;
     *        otherwise false. </p>
     *        <p>
     *        You can enable IAM database authentication for the following database engines:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For MySQL 5.6, minor version 5.6.34 or higher
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For MySQL 5.7, minor version 5.7.16 or higher
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDBInstanceRequest withEnableIAMDatabaseAuthentication(Boolean enableIAMDatabaseAuthentication) {
        setEnableIAMDatabaseAuthentication(enableIAMDatabaseAuthentication);
        return this;
    }

    /**
     * <p>
     * True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts; otherwise
     * false.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database engines:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For MySQL 5.6, minor version 5.6.34 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For MySQL 5.7, minor version 5.7.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return True to enable mapping of AWS Identity and Access Management (IAM) accounts to database accounts;
     *         otherwise false. </p>
     *         <p>
     *         You can enable IAM database authentication for the following database engines:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For MySQL 5.6, minor version 5.6.34 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For MySQL 5.7, minor version 5.7.16 or higher
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isEnableIAMDatabaseAuthentication() {
        return this.enableIAMDatabaseAuthentication;
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
        if (getDBName() != null)
            sb.append("DBName: ").append(getDBName()).append(",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: ").append(getAllocatedStorage()).append(",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: ").append(getDBInstanceClass()).append(",");
        if (getEngine() != null)
            sb.append("Engine: ").append(getEngine()).append(",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: ").append(getMasterUsername()).append(",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getDBSecurityGroups() != null)
            sb.append("DBSecurityGroups: ").append(getDBSecurityGroups()).append(",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: ").append(getVpcSecurityGroupIds()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: ").append(getDBSubnetGroupName()).append(",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: ").append(getPreferredMaintenanceWindow()).append(",");
        if (getDBParameterGroupName() != null)
            sb.append("DBParameterGroupName: ").append(getDBParameterGroupName()).append(",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: ").append(getBackupRetentionPeriod()).append(",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: ").append(getPreferredBackupWindow()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: ").append(getMultiAZ()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getAutoMinorVersionUpgrade() != null)
            sb.append("AutoMinorVersionUpgrade: ").append(getAutoMinorVersionUpgrade()).append(",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: ").append(getLicenseModel()).append(",");
        if (getIops() != null)
            sb.append("Iops: ").append(getIops()).append(",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: ").append(getOptionGroupName()).append(",");
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: ").append(getCharacterSetName()).append(",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: ").append(getPubliclyAccessible()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: ").append(getDBClusterIdentifier()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: ").append(getTdeCredentialArn()).append(",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: ").append(getTdeCredentialPassword()).append(",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: ").append(getStorageEncrypted()).append(",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: ").append(getKmsKeyId()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: ").append(getCopyTagsToSnapshot()).append(",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: ").append(getMonitoringInterval()).append(",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: ").append(getMonitoringRoleArn()).append(",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: ").append(getDomainIAMRoleName()).append(",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: ").append(getPromotionTier()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: ").append(getEnableIAMDatabaseAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDBInstanceRequest == false)
            return false;
        CreateDBInstanceRequest other = (CreateDBInstanceRequest) obj;
        if (other.getDBName() == null ^ this.getDBName() == null)
            return false;
        if (other.getDBName() != null && other.getDBName().equals(this.getDBName()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null && other.getMasterUsername().equals(this.getMasterUsername()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getDBSecurityGroups() == null ^ this.getDBSecurityGroups() == null)
            return false;
        if (other.getDBSecurityGroups() != null && other.getDBSecurityGroups().equals(this.getDBSecurityGroups()) == false)
            return false;
        if (other.getVpcSecurityGroupIds() == null ^ this.getVpcSecurityGroupIds() == null)
            return false;
        if (other.getVpcSecurityGroupIds() != null && other.getVpcSecurityGroupIds().equals(this.getVpcSecurityGroupIds()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getPreferredMaintenanceWindow() == null ^ this.getPreferredMaintenanceWindow() == null)
            return false;
        if (other.getPreferredMaintenanceWindow() != null && other.getPreferredMaintenanceWindow().equals(this.getPreferredMaintenanceWindow()) == false)
            return false;
        if (other.getDBParameterGroupName() == null ^ this.getDBParameterGroupName() == null)
            return false;
        if (other.getDBParameterGroupName() != null && other.getDBParameterGroupName().equals(this.getDBParameterGroupName()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
            return false;
        if (other.getPreferredBackupWindow() == null ^ this.getPreferredBackupWindow() == null)
            return false;
        if (other.getPreferredBackupWindow() != null && other.getPreferredBackupWindow().equals(this.getPreferredBackupWindow()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getMultiAZ() == null ^ this.getMultiAZ() == null)
            return false;
        if (other.getMultiAZ() != null && other.getMultiAZ().equals(this.getMultiAZ()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAutoMinorVersionUpgrade() == null ^ this.getAutoMinorVersionUpgrade() == null)
            return false;
        if (other.getAutoMinorVersionUpgrade() != null && other.getAutoMinorVersionUpgrade().equals(this.getAutoMinorVersionUpgrade()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getOptionGroupName() == null ^ this.getOptionGroupName() == null)
            return false;
        if (other.getOptionGroupName() != null && other.getOptionGroupName().equals(this.getOptionGroupName()) == false)
            return false;
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
            return false;
        if (other.getPubliclyAccessible() == null ^ this.getPubliclyAccessible() == null)
            return false;
        if (other.getPubliclyAccessible() != null && other.getPubliclyAccessible().equals(this.getPubliclyAccessible()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null)
            return false;
        if (other.getTdeCredentialPassword() != null && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false)
            return false;
        if (other.getStorageEncrypted() == null ^ this.getStorageEncrypted() == null)
            return false;
        if (other.getStorageEncrypted() != null && other.getStorageEncrypted().equals(this.getStorageEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getCopyTagsToSnapshot() == null ^ this.getCopyTagsToSnapshot() == null)
            return false;
        if (other.getCopyTagsToSnapshot() != null && other.getCopyTagsToSnapshot().equals(this.getCopyTagsToSnapshot()) == false)
            return false;
        if (other.getMonitoringInterval() == null ^ this.getMonitoringInterval() == null)
            return false;
        if (other.getMonitoringInterval() != null && other.getMonitoringInterval().equals(this.getMonitoringInterval()) == false)
            return false;
        if (other.getMonitoringRoleArn() == null ^ this.getMonitoringRoleArn() == null)
            return false;
        if (other.getMonitoringRoleArn() != null && other.getMonitoringRoleArn().equals(this.getMonitoringRoleArn()) == false)
            return false;
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(this.getEnableIAMDatabaseAuthentication()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBName() == null) ? 0 : getDBName().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getDBSecurityGroups() == null) ? 0 : getDBSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getPreferredMaintenanceWindow() == null) ? 0 : getPreferredMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getDBParameterGroupName() == null) ? 0 : getDBParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getPreferredBackupWindow() == null) ? 0 : getPreferredBackupWindow().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getAutoMinorVersionUpgrade() == null) ? 0 : getAutoMinorVersionUpgrade().hashCode());
        hashCode = prime * hashCode + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getEnableIAMDatabaseAuthentication() == null) ? 0 : getEnableIAMDatabaseAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public CreateDBInstanceRequest clone() {
        return (CreateDBInstanceRequest) super.clone();
    }

}
