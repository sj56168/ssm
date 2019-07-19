package cn.jason.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by 我不管我最帅 on 2018/10/10.
 * `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
 `proCode` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '供应商编码',
 `proName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '供应商名称',
 `proDesc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '供应商详细描述',
 `proContact` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '供应商联系人',
 `proPhone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '联系电话',
 `proAddress` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '地址',
 `proFax` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '传真',
 `createdBy` bigint(20) DEFAULT NULL COMMENT '创建者（userId）',
 `creationDate` datetime DEFAULT NULL COMMENT '创建时间',
 `modifyDate` datetime DEFAULT NULL COMMENT '更新时间',
 `modifyBy` bigint(20) DEFAULT NULL COMMENT '更新者（userId）',
 */
public class Provider {
    private Integer id; //主键ID
    private String proCode;//供应商编码
    private String proName;//供应商名称
    private String proDesc;//供应商详细描述
    private String proContact;//供应商联系人
    private String proPhone;//联系电话
    private String proAddress;//地址
    private String proFax;//传真
    private Integer createdBy;//创建者
    private Date creationDate;//创建时间
    private Date modifyDate;//更新时间
    private Integer modifyBy;//更新者
    private List<Bill> bill;//一对多查询

    public List<Bill> getBill() {
        return bill;
    }

    public void setBill(List<Bill> bill) {
        this.bill = bill;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDesc() {
        return proDesc;
    }

    public void setProDesc(String proDesc) {
        this.proDesc = proDesc;
    }

    public String getProContact() {
        return proContact;
    }

    public void setProContact(String proContact) {
        this.proContact = proContact;
    }

    public String getProPhone() {
        return proPhone;
    }

    public void setProPhone(String proPhone) {
        this.proPhone = proPhone;
    }

    public String getProAddress() {
        return proAddress;
    }

    public void setProAddress(String proAddress) {
        this.proAddress = proAddress;
    }

    public String getProFax() {
        return proFax;
    }

    public void setProFax(String proFax) {
        this.proFax = proFax;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Override
    public String toString() {
        return "Provider{" +
                  "id=" + id +
                  ", proCode='" + proCode + '\'' +
                  ", proName='" + proName + '\'' +
                  ", proDesc='" + proDesc + '\'' +
                  ", proContact='" + proContact + '\'' +
                  ", proPhone='" + proPhone + '\'' +
                  ", proAddress='" + proAddress + '\'' +
                  ", proFax='" + proFax + '\'' +
                  ", createdBy=" + createdBy +
                  ", creationDate=" + creationDate +
                  ", modifyDate=" + modifyDate +
                  ", modifyBy=" + modifyBy +
                  ", bill=" + bill +
                  '}';
    }
}
