package com.example.four.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Server {

    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public BigDecimal getServerPrice() {
        return serverPrice;
    }

    public void setServerPrice(BigDecimal serverPrice) {
        this.serverPrice = serverPrice;
    }

    public String getServerPlace() {
        return serverPlace;
    }

    public void setServerPlace(String serverPlace) {
        this.serverPlace = serverPlace;
    }

    public String getServerDescription() {
        return serverDescription;
    }

    public void setServerDescription(String serverDescription) {
        this.serverDescription = serverDescription;
    }

    public String getServerIcon() {
        return serverIcon;
    }

    public void setServerIcon(String serverIcon) {
        this.serverIcon = serverIcon;
    }

    public String getServerRemark() {
        return serverRemark;
    }

    public void setServerRemark(String serverRemark) {
        this.serverRemark = serverRemark;
    }

    public Integer getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(Integer serverStatus) {
        this.serverStatus = serverStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Server(Integer serverStatus) {
        this.serverStatus = serverStatus;
    }

    public Server(String serverId) {
        this.serverId = serverId;
    }

    public Server() {
    }

    /**??????ID**/
    private String serverId;

    /**????????????**/
    private String serverName;

    /**????????????**/
    private BigDecimal serverPrice;

    /**????????????**/
    private String serverPlace;

    /**??????**/
    private String serverDescription;

    /**?????????**/
    private String serverIcon;

    /**??????**/
    private String serverRemark;

    /**????????????**/
    private Integer serverStatus;

    /**????????????**/
    private Integer userId;

    /**????????????**/
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date createTime;

    @Override
    public String toString() {
        return "Server{" +
                "serverId='" + serverId + '\'' +
                ", serverName='" + serverName + '\'' +
                ", serverPrice=" + serverPrice +
                ", serverPlace='" + serverPlace + '\'' +
                ", serverDescription='" + serverDescription + '\'' +
                ", serverIcon='" + serverIcon + '\'' +
                ", serverRemark='" + serverRemark + '\'' +
                ", serverStatus=" + serverStatus +
                ", userId=" + userId +
                ", createTime=" + createTime +
                '}';
    }
}
