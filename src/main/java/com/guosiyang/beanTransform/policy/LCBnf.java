//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.14 时间 05:38:13 PM CST 
//


package com.guosiyang.beanTransform.policy;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}BnfType"/>
 *         &lt;element ref="{}BnfGrade"/>
 *         &lt;element ref="{}BnfNo"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}Sex"/>
 *         &lt;element ref="{}Birthday"/>
 *         &lt;element ref="{}IDType"/>
 *         &lt;element ref="{}IDNo"/>
 *         &lt;element ref="{}IDValidDate"/>
 *         &lt;element ref="{}BnfLot"/>
 *         &lt;element ref="{}RelaToInsured"/>
 *         &lt;element ref="{}AddressNo"/>
 *         &lt;element ref="{}NativePlace"/>
 *         &lt;element ref="{}RelationToAppnt"/>
 *         &lt;element ref="{}OccupationDesc"/>
 *         &lt;element ref="{}AddressType"/>
 *         &lt;element ref="{}HomeAddress"/>
 *         &lt;element ref="{}ZoneCode"/>
 *         &lt;element ref="{}FixPhone"/>
 *         &lt;element ref="{}Mobile"/>
 *         &lt;element ref="{}AccName"/>
 *         &lt;element ref="{}BankCode"/>
 *         &lt;element ref="{}BankAccNo"/>
 *         &lt;element ref="{}BnfEntrustNo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bnfType",
    "bnfGrade",
    "bnfNo",
    "name",
    "sex",
    "birthday",
    "idType",
    "idNo",
    "idValidDate",
    "bnfLot",
    "relaToInsured",
    "addressNo",
    "nativePlace",
    "relationToAppnt",
    "occupationDesc",
    "addressType",
    "homeAddress",
    "zoneCode",
    "fixPhone",
    "mobile",
    "accName",
    "bankCode",
    "bankAccNo",
    "bnfEntrustNo"
})
@XmlRootElement(name = "LCBnf")
public class LCBnf {

    @XmlElement(name = "BnfType", required = true)
    protected String bnfType;
    @XmlElement(name = "BnfGrade", required = true)
    protected String bnfGrade;
    @XmlElement(name = "BnfNo", required = true)
    protected String bnfNo;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Sex", required = true)
    protected String sex;
    @XmlElement(name = "Birthday", required = true)
    protected String birthday;
    @XmlElement(name = "IDType", required = true)
    protected String idType;
    @XmlElement(name = "IDNo", required = true)
    protected String idNo;
    @XmlElement(name = "IDValidDate", required = true)
    protected String idValidDate;
    @XmlElement(name = "BnfLot", required = true)
    protected String bnfLot;
    @XmlElement(name = "RelaToInsured", required = true)
    protected String relaToInsured;
    @XmlElement(name = "AddressNo", required = true)
    protected String addressNo;
    @XmlElement(name = "NativePlace", required = true)
    protected String nativePlace;
    @XmlElement(name = "RelationToAppnt", required = true)
    protected String relationToAppnt;
    @XmlElement(name = "OccupationDesc", required = true)
    protected String occupationDesc;
    @XmlElement(name = "AddressType", required = true)
    protected String addressType;
    @XmlElement(name = "HomeAddress", required = true)
    protected HomeAddress homeAddress;
    @XmlElement(name = "ZoneCode", required = true)
    protected String zoneCode;
    @XmlElement(name = "FixPhone", required = true)
    protected String fixPhone;
    @XmlElement(name = "Mobile", required = true)
    protected String mobile;
    @XmlElement(name = "AccName", required = true)
    protected String accName;
    @XmlElement(name = "BankCode", required = true)
    protected String bankCode;
    @XmlElement(name = "BankAccNo", required = true)
    protected String bankAccNo;
    @XmlElement(name = "BnfEntrustNo", required = true)
    protected String bnfEntrustNo;

    /**
     * 获取bnfType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfType() {
        return bnfType;
    }

    /**
     * 设置bnfType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfType(String value) {
        this.bnfType = value;
    }

    /**
     * 获取bnfGrade属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfGrade() {
        return bnfGrade;
    }

    /**
     * 设置bnfGrade属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfGrade(String value) {
        this.bnfGrade = value;
    }

    /**
     * 获取bnfNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfNo() {
        return bnfNo;
    }

    /**
     * 设置bnfNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfNo(String value) {
        this.bnfNo = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * 获取birthday属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置birthday属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * 获取idType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * 设置idType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * 获取idNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNo() {
        return idNo;
    }

    /**
     * 设置idNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNo(String value) {
        this.idNo = value;
    }

    /**
     * 获取idValidDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDValidDate() {
        return idValidDate;
    }

    /**
     * 设置idValidDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDValidDate(String value) {
        this.idValidDate = value;
    }

    /**
     * 获取bnfLot属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfLot() {
        return bnfLot;
    }

    /**
     * 设置bnfLot属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfLot(String value) {
        this.bnfLot = value;
    }

    /**
     * 获取relaToInsured属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaToInsured() {
        return relaToInsured;
    }

    /**
     * 设置relaToInsured属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaToInsured(String value) {
        this.relaToInsured = value;
    }

    /**
     * 获取addressNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNo() {
        return addressNo;
    }

    /**
     * 设置addressNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNo(String value) {
        this.addressNo = value;
    }

    /**
     * 获取nativePlace属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativePlace() {
        return nativePlace;
    }

    /**
     * 设置nativePlace属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativePlace(String value) {
        this.nativePlace = value;
    }

    /**
     * 获取relationToAppnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToAppnt() {
        return relationToAppnt;
    }

    /**
     * 设置relationToAppnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToAppnt(String value) {
        this.relationToAppnt = value;
    }

    /**
     * 获取occupationDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationDesc() {
        return occupationDesc;
    }

    /**
     * 设置occupationDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationDesc(String value) {
        this.occupationDesc = value;
    }

    /**
     * 获取addressType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * 设置addressType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * 获取homeAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HomeAddress }
     *     
     */
    public HomeAddress getHomeAddress() {
        return homeAddress;
    }

    /**
     * 设置homeAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HomeAddress }
     *     
     */
    public void setHomeAddress(HomeAddress value) {
        this.homeAddress = value;
    }

    /**
     * 获取zoneCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneCode() {
        return zoneCode;
    }

    /**
     * 设置zoneCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneCode(String value) {
        this.zoneCode = value;
    }

    /**
     * 获取fixPhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixPhone() {
        return fixPhone;
    }

    /**
     * 设置fixPhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixPhone(String value) {
        this.fixPhone = value;
    }

    /**
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取accName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccName() {
        return accName;
    }

    /**
     * 设置accName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccName(String value) {
        this.accName = value;
    }

    /**
     * 获取bankCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 设置bankCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankCode(String value) {
        this.bankCode = value;
    }

    /**
     * 获取bankAccNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccNo() {
        return bankAccNo;
    }

    /**
     * 设置bankAccNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccNo(String value) {
        this.bankAccNo = value;
    }

    /**
     * 获取bnfEntrustNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBnfEntrustNo() {
        return bnfEntrustNo;
    }

    /**
     * 设置bnfEntrustNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBnfEntrustNo(String value) {
        this.bnfEntrustNo = value;
    }

}
