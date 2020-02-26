//
// 此文件是�? JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成�?
// 请访�? <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式�?, 对此文件的所有修改都将丢失�??
// 生成时间: 2020.01.14 时间 05:38:13 PM CST 
//


package com.guosiyang.beanTransform.policy;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type�� Java �ࡣ
 *
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}TransFlag"/>
 *         &lt;element ref="{}AgencyCode"/>
 *         &lt;element ref="{}TransDate"/>
 *         &lt;element ref="{}TransTime"/>
 *         &lt;element ref="{}BussyType"/>
 *         &lt;element ref="{}SubType"/>
 *         &lt;element ref="{}BussyNo"/>
 *         &lt;element ref="{}ImageFileName"/>
 *         &lt;element ref="{}TransNo"/>
 *         &lt;element ref="{}FunctionFlag"/>
 *         &lt;element ref="{}RegularType"/>
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
    "transFlag",
    "agencyCode",
    "transDate",
    "transTime",
    "bussyType",
    "subType",
    "bussyNo",
    "imageFileName",
    "transNo",
    "functionFlag",
    "regularType"
})
@XmlRootElement(name = "BaseInfo")
public class BaseInfo {

    @XmlElement(name = "TransFlag", required = true)
    protected String transFlag;
    @XmlElement(name = "AgencyCode", required = true)
    protected String agencyCode;
    @XmlElement(name = "TransDate", required = true)
    protected String transDate;
    @XmlElement(name = "TransTime", required = true)
    protected String transTime;
    @XmlElement(name = "BussyType", required = true)
    protected String bussyType;
    @XmlElement(name = "SubType", required = true)
    protected String subType;
    @XmlElement(name = "BussyNo", required = true)
    protected String bussyNo;
    @XmlElement(name = "ImageFileName", required = true)
    protected String imageFileName;
    @XmlElement(name = "TransNo", required = true)
    protected String transNo;
    @XmlElement(name = "FunctionFlag", required = true)
    protected String functionFlag;
    @XmlElement(name = "RegularType", required = true)
    protected String regularType;

    /**
     * ��ȡtransFlag���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransFlag() {
        return transFlag;
    }

    /**
     * ����transFlag���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransFlag(String value) {
        this.transFlag = value;
    }

    /**
     * ��ȡagencyCode���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAgencyCode() {
        return agencyCode;
    }

    /**
     * ����agencyCode���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAgencyCode(String value) {
        this.agencyCode = value;
    }

    /**
     * ��ȡtransDate���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransDate() {
        return transDate;
    }

    /**
     * ����transDate���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransDate(String value) {
        this.transDate = value;
    }

    /**
     * ��ȡtransTime���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransTime() {
        return transTime;
    }

    /**
     * ����transTime���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransTime(String value) {
        this.transTime = value;
    }

    /**
     * ��ȡbussyType���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBussyType() {
        return bussyType;
    }

    /**
     * ����bussyType���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBussyType(String value) {
        this.bussyType = value;
    }

    /**
     * ��ȡsubType���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSubType() {
        return subType;
    }

    /**
     * ����subType���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * ��ȡbussyNo���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBussyNo() {
        return bussyNo;
    }

    /**
     * ����bussyNo���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBussyNo(String value) {
        this.bussyNo = value;
    }

    /**
     * ��ȡimageFileName���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getImageFileName() {
        return imageFileName;
    }

    /**
     * ����imageFileName���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setImageFileName(String value) {
        this.imageFileName = value;
    }

    /**
     * ��ȡtransNo���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTransNo() {
        return transNo;
    }

    /**
     * ����transNo���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTransNo(String value) {
        this.transNo = value;
    }

    /**
     * ��ȡfunctionFlag���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFunctionFlag() {
        return functionFlag;
    }

    /**
     * ����functionFlag���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFunctionFlag(String value) {
        this.functionFlag = value;
    }

    /**
     * ��ȡregularType���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRegularType() {
        return regularType;
    }

    /**
     * ����regularType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularType(String value) {
        this.regularType = value;
    }

}
