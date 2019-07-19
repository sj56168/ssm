package cn.jason.pojo;

import java.util.Date;

/**
 * Created by 我不管我最帅 on 2018/9/26.
 *
 *   `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
 `billCode` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '账单编码',
 `productName` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品名称',
 `productDesc` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品描述',
 `productUnit` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '商品单位',
 `productCount` decimal(20,2) DEFAULT NULL COMMENT '商品数量',
 `totalPrice` decimal(20,2) DEFAULT NULL COMMENT '商品总额',
 `isPayment` int(10) DEFAULT NULL COMMENT '是否支付（1：未支付 2：已支付）',
 `createdBy` bigint(20) DEFAULT NULL COMMENT '创建者（userId）',
 `creationDate` datetime DEFAULT NULL COMMENT '创建时间',
 `modifyBy` bigint(20) DEFAULT NULL COMMENT '更新者（userId）',
 `modifyDate` datetime DEFAULT NULL COMMENT '更新时间',
 `providerId` int(20) DEFAULT NULL COMMENT '供应商ID',
 */
public class Bill {
    private int id;//主键ID
    private String billCode;//账单编码
    private String productName;//商品名称
    private String productDesc;//商品描述
    private String productUnit;//商品单位
    private String productCount;//商品数量
    private int    totalPrice;//商品总额
    private int    isPayment;//是否支付（1：未支付 2：已支付
    private String createdBy;//创建者
    private Date creationDate;//创建时间
    private Date modifyBy;//更新者
    private Date modifyDate;//
   private int providerId;//供应商ID
    Provider provider;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public String getProductUnit() {
        return productUnit;
    }

    public void setProductUnit(String productUnit) {
        this.productUnit = productUnit;
    }

    public String getProductCount() {
        return productCount;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIsPayment() {
        return isPayment;
    }

    public void setIsPayment(int isPayment) {
        this.isPayment = isPayment;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Date modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    @Override
    public String toString() {
        return "Bill{" +
                  "id=" + id +
                  ", billCode='" + billCode + '\'' +
                  ", productName='" + productName + '\'' +
                  ", productDesc='" + productDesc + '\'' +
                  ", productUnit='" + productUnit + '\'' +
                  ", productCount='" + productCount + '\'' +
                  ", totalPrice=" + totalPrice +
                  ", isPayment=" + isPayment +
                  ", createdBy='" + createdBy + '\'' +
                  ", creationDate=" + creationDate +
                  ", modifyBy=" + modifyBy +
                  ", modifyDate=" + modifyDate +
                  ", providerId=" + providerId +
                  ", provider=" + provider +
                  '}';
    }
}
