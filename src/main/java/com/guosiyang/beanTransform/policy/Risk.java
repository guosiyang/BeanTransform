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
 *         &lt;element ref="{}PolNo" minOccurs="0"/>
 *         &lt;element ref="{}ProdSetCode" minOccurs="0"/>
 *         &lt;element ref="{}RiskCode"/>
 *         &lt;element ref="{}MainPolNo" minOccurs="0"/>
 *         &lt;element ref="{}MainRiskCode" minOccurs="0"/>
 *         &lt;element ref="{}RiskName" minOccurs="0"/>
 *         &lt;element ref="{}Amnt"/>
 *         &lt;element ref="{}Prem"/>
 *         &lt;element ref="{}Mult" minOccurs="0"/>
 *         &lt;element ref="{}InsuYearFlag" minOccurs="0"/>
 *         &lt;element ref="{}InsuYear" minOccurs="0"/>
 *         &lt;element ref="{}PayIntv" minOccurs="0"/>
 *         &lt;element ref="{}PayEndYearFlag" minOccurs="0"/>
 *         &lt;element ref="{}PayEndYear" minOccurs="0"/>
 *         &lt;element ref="{}GetIntv" minOccurs="0"/>
 *         &lt;element ref="{}GetStartDate" minOccurs="0"/>
 *         &lt;element ref="{}GetYearFlag" minOccurs="0"/>
 *         &lt;element ref="{}GetYear" minOccurs="0"/>
 *         &lt;element ref="{}BonusGetMode" minOccurs="0"/>
 *         &lt;element ref="{}BonusMan" minOccurs="0"/>
 *         &lt;element ref="{}GetMode" minOccurs="0"/>
 *         &lt;element ref="{}GetRate" minOccurs="0"/>
 *         &lt;element ref="{}GetLimit" minOccurs="0"/>
 *         &lt;element ref="{}FQGetMode" minOccurs="0"/>
 *         &lt;element ref="{}GetPeriod" minOccurs="0"/>
 *         &lt;element ref="{}GetPeriodFlag" minOccurs="0"/>
 *         &lt;element ref="{}DelayPeriod" minOccurs="0"/>
 *         &lt;element ref="{}RiskVersion" minOccurs="0"/>
 *         &lt;element ref="{}DutyList" minOccurs="0"/>
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
    "polNo",
    "prodSetCode",
    "riskCode",
    "mainPolNo",
    "mainRiskCode",
    "riskName",
    "amnt",
    "prem",
    "mult",
    "insuYearFlag",
    "insuYear",
    "payIntv",
    "payEndYearFlag",
    "payEndYear",
    "getIntv",
    "getStartDate",
    "getYearFlag",
    "getYear",
    "bonusGetMode",
    "bonusMan",
    "getMode",
    "getRate",
    "getLimit",
    "fqGetMode",
    "getPeriod",
    "getPeriodFlag",
    "delayPeriod",
    "riskVersion",
    "dutyList"
})
@XmlRootElement(name = "Risk")
public class Risk {

    @XmlElement(name = "PolNo")
    protected String polNo;
    @XmlElement(name = "ProdSetCode")
    protected String prodSetCode;
    @XmlElement(name = "RiskCode", required = true)
    protected String riskCode;
    @XmlElement(name = "MainPolNo")
    protected String mainPolNo;
    @XmlElement(name = "MainRiskCode")
    protected String mainRiskCode;
    @XmlElement(name = "RiskName")
    protected String riskName;
    @XmlElement(name = "Amnt", required = true)
    protected String amnt;
    @XmlElement(name = "Prem", required = true)
    protected String prem;
    @XmlElement(name = "Mult")
    protected String mult;
    @XmlElement(name = "InsuYearFlag")
    protected String insuYearFlag;
    @XmlElement(name = "InsuYear")
    protected String insuYear;
    @XmlElement(name = "PayIntv")
    protected String payIntv;
    @XmlElement(name = "PayEndYearFlag")
    protected String payEndYearFlag;
    @XmlElement(name = "PayEndYear")
    protected String payEndYear;
    @XmlElement(name = "GetIntv")
    protected String getIntv;
    @XmlElement(name = "GetStartDate")
    protected String getStartDate;
    @XmlElement(name = "GetYearFlag")
    protected String getYearFlag;
    @XmlElement(name = "GetYear")
    protected String getYear;
    @XmlElement(name = "BonusGetMode")
    protected String bonusGetMode;
    @XmlElement(name = "BonusMan")
    protected String bonusMan;
    @XmlElement(name = "GetMode")
    protected String getMode;
    @XmlElement(name = "GetRate")
    protected String getRate;
    @XmlElement(name = "GetLimit")
    protected String getLimit;
    @XmlElement(name = "FQGetMode")
    protected String fqGetMode;
    @XmlElement(name = "GetPeriod")
    protected String getPeriod;
    @XmlElement(name = "GetPeriodFlag")
    protected String getPeriodFlag;
    @XmlElement(name = "DelayPeriod")
    protected String delayPeriod;
    @XmlElement(name = "RiskVersion")
    protected String riskVersion;
    @XmlElement(name = "DutyList")
    protected DutyList dutyList;

    /**
     * 获取polNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolNo() {
        return polNo;
    }

    /**
     * 设置polNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolNo(String value) {
        this.polNo = value;
    }

    /**
     * 获取prodSetCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProdSetCode() {
        return prodSetCode;
    }

    /**
     * 设置prodSetCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProdSetCode(String value) {
        this.prodSetCode = value;
    }

    /**
     * 获取riskCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskCode() {
        return riskCode;
    }

    /**
     * 设置riskCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskCode(String value) {
        this.riskCode = value;
    }

    /**
     * 获取mainPolNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainPolNo() {
        return mainPolNo;
    }

    /**
     * 设置mainPolNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainPolNo(String value) {
        this.mainPolNo = value;
    }

    /**
     * 获取mainRiskCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMainRiskCode() {
        return mainRiskCode;
    }

    /**
     * 设置mainRiskCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMainRiskCode(String value) {
        this.mainRiskCode = value;
    }

    /**
     * 获取riskName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskName() {
        return riskName;
    }

    /**
     * 设置riskName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskName(String value) {
        this.riskName = value;
    }

    /**
     * 获取amnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmnt() {
        return amnt;
    }

    /**
     * 设置amnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmnt(String value) {
        this.amnt = value;
    }

    /**
     * 获取prem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrem() {
        return prem;
    }

    /**
     * 设置prem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrem(String value) {
        this.prem = value;
    }

    /**
     * 获取mult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMult() {
        return mult;
    }

    /**
     * 设置mult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMult(String value) {
        this.mult = value;
    }

    /**
     * 获取insuYearFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuYearFlag() {
        return insuYearFlag;
    }

    /**
     * 设置insuYearFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuYearFlag(String value) {
        this.insuYearFlag = value;
    }

    /**
     * 获取insuYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuYear() {
        return insuYear;
    }

    /**
     * 设置insuYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuYear(String value) {
        this.insuYear = value;
    }

    /**
     * 获取payIntv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayIntv() {
        return payIntv;
    }

    /**
     * 设置payIntv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayIntv(String value) {
        this.payIntv = value;
    }

    /**
     * 获取payEndYearFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayEndYearFlag() {
        return payEndYearFlag;
    }

    /**
     * 设置payEndYearFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayEndYearFlag(String value) {
        this.payEndYearFlag = value;
    }

    /**
     * 获取payEndYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayEndYear() {
        return payEndYear;
    }

    /**
     * 设置payEndYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayEndYear(String value) {
        this.payEndYear = value;
    }

    /**
     * 获取getIntv属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetIntv() {
        return getIntv;
    }

    /**
     * 设置getIntv属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetIntv(String value) {
        this.getIntv = value;
    }

    /**
     * 获取getStartDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetStartDate() {
        return getStartDate;
    }

    /**
     * 设置getStartDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetStartDate(String value) {
        this.getStartDate = value;
    }

    /**
     * 获取getYearFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetYearFlag() {
        return getYearFlag;
    }

    /**
     * 设置getYearFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetYearFlag(String value) {
        this.getYearFlag = value;
    }

    /**
     * 获取getYear属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetYear() {
        return getYear;
    }

    /**
     * 设置getYear属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetYear(String value) {
        this.getYear = value;
    }

    /**
     * 获取bonusGetMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusGetMode() {
        return bonusGetMode;
    }

    /**
     * 设置bonusGetMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusGetMode(String value) {
        this.bonusGetMode = value;
    }

    /**
     * 获取bonusMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBonusMan() {
        return bonusMan;
    }

    /**
     * 设置bonusMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBonusMan(String value) {
        this.bonusMan = value;
    }

    /**
     * 获取getMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetMode() {
        return getMode;
    }

    /**
     * 设置getMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetMode(String value) {
        this.getMode = value;
    }

    /**
     * 获取getRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetRate() {
        return getRate;
    }

    /**
     * 设置getRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetRate(String value) {
        this.getRate = value;
    }

    /**
     * 获取getLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetLimit() {
        return getLimit;
    }

    /**
     * 设置getLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetLimit(String value) {
        this.getLimit = value;
    }

    /**
     * 获取fqGetMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQGetMode() {
        return fqGetMode;
    }

    /**
     * 设置fqGetMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQGetMode(String value) {
        this.fqGetMode = value;
    }

    /**
     * 获取getPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPeriod() {
        return getPeriod;
    }

    /**
     * 设置getPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPeriod(String value) {
        this.getPeriod = value;
    }

    /**
     * 获取getPeriodFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPeriodFlag() {
        return getPeriodFlag;
    }

    /**
     * 设置getPeriodFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPeriodFlag(String value) {
        this.getPeriodFlag = value;
    }

    /**
     * 获取delayPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayPeriod() {
        return delayPeriod;
    }

    /**
     * 设置delayPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayPeriod(String value) {
        this.delayPeriod = value;
    }

    /**
     * 获取riskVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskVersion() {
        return riskVersion;
    }

    /**
     * 设置riskVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskVersion(String value) {
        this.riskVersion = value;
    }

    /**
     * 获取dutyList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DutyList }
     *     
     */
    public DutyList getDutyList() {
        return dutyList;
    }

    /**
     * 设置dutyList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DutyList }
     *     
     */
    public void setDutyList(DutyList value) {
        this.dutyList = value;
    }

}
