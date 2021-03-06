/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "ip_address", schema = "cattle")
public interface IpAddress extends Serializable {

    /**
     * Setter for <code>cattle.ip_address.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.ip_address.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.ip_address.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cattle.ip_address.name</code>.
     */
    @Column(name = "name", length = 255)
    public String getName();

    /**
     * Setter for <code>cattle.ip_address.account_id</code>.
     */
    public void setAccountId(Long value);

    /**
     * Getter for <code>cattle.ip_address.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    public Long getAccountId();

    /**
     * Setter for <code>cattle.ip_address.kind</code>.
     */
    public void setKind(String value);

    /**
     * Getter for <code>cattle.ip_address.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    public String getKind();

    /**
     * Setter for <code>cattle.ip_address.uuid</code>.
     */
    public void setUuid(String value);

    /**
     * Getter for <code>cattle.ip_address.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    public String getUuid();

    /**
     * Setter for <code>cattle.ip_address.description</code>.
     */
    public void setDescription(String value);

    /**
     * Getter for <code>cattle.ip_address.description</code>.
     */
    @Column(name = "description", length = 1024)
    public String getDescription();

    /**
     * Setter for <code>cattle.ip_address.state</code>.
     */
    public void setState(String value);

    /**
     * Getter for <code>cattle.ip_address.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    public String getState();

    /**
     * Setter for <code>cattle.ip_address.created</code>.
     */
    public void setCreated(Date value);

    /**
     * Getter for <code>cattle.ip_address.created</code>.
     */
    @Column(name = "created")
    public Date getCreated();

    /**
     * Setter for <code>cattle.ip_address.removed</code>.
     */
    public void setRemoved(Date value);

    /**
     * Getter for <code>cattle.ip_address.removed</code>.
     */
    @Column(name = "removed")
    public Date getRemoved();

    /**
     * Setter for <code>cattle.ip_address.remove_time</code>.
     */
    public void setRemoveTime(Date value);

    /**
     * Getter for <code>cattle.ip_address.remove_time</code>.
     */
    @Column(name = "remove_time")
    public Date getRemoveTime();

    /**
     * Setter for <code>cattle.ip_address.data</code>.
     */
    public void setData(Map<String,Object> value);

    /**
     * Getter for <code>cattle.ip_address.data</code>.
     */
    @Column(name = "data", length = 16777215)
    public Map<String,Object> getData();

    /**
     * Setter for <code>cattle.ip_address.address</code>.
     */
    public void setAddress(String value);

    /**
     * Getter for <code>cattle.ip_address.address</code>.
     */
    @Column(name = "address", length = 255)
    public String getAddress();

    /**
     * Setter for <code>cattle.ip_address.subnet_id</code>.
     */
    public void setSubnetId(Long value);

    /**
     * Getter for <code>cattle.ip_address.subnet_id</code>.
     */
    @Column(name = "subnet_id", precision = 19)
    public Long getSubnetId();

    /**
     * Setter for <code>cattle.ip_address.network_id</code>.
     */
    public void setNetworkId(Long value);

    /**
     * Getter for <code>cattle.ip_address.network_id</code>.
     */
    @Column(name = "network_id", precision = 19)
    public Long getNetworkId();

    /**
     * Setter for <code>cattle.ip_address.is_public</code>.
     */
    public void setIsPublic(Boolean value);

    /**
     * Getter for <code>cattle.ip_address.is_public</code>.
     */
    @Column(name = "is_public", nullable = false, precision = 1)
    public Boolean getIsPublic();

    /**
     * Setter for <code>cattle.ip_address.role</code>.
     */
    public void setRole(String value);

    /**
     * Getter for <code>cattle.ip_address.role</code>.
     */
    @Column(name = "role", length = 128)
    public String getRole();

    /**
     * Setter for <code>cattle.ip_address.hostname</code>.
     */
    public void setHostname(String value);

    /**
     * Getter for <code>cattle.ip_address.hostname</code>.
     */
    @Column(name = "hostname", length = 255)
    public String getHostname();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface IpAddress
     */
    public void from(io.cattle.platform.core.model.IpAddress from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface IpAddress
     */
    public <E extends io.cattle.platform.core.model.IpAddress> E into(E into);
}
