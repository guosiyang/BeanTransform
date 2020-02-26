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
 *         &lt;element ref="{}DutyCode"/>
 *         &lt;element ref="{}Prem"/>
 *         &lt;element ref="{}Amnt"/>
 *         &lt;element ref="{}InsuYearFlag"/>
 *         &lt;element ref="{}InsuYear"/>
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
    "dutyCode",
    "prem",
    "amnt",
    "insuYearFlag",
    "insuYear"
})
@XmlRootElement(name = "Duty")
public class Duty {

    @XmlElement(name = "DutyCode", required = true)
    protected String dutyCode;
    @XmlElement(name = "Prem", required = true)
    protected String prem;
    @XmlElement(name = "Amnt", required = true)
    protected String amnt;
    @XmlElement(name = "InsuYearFlag", required = true)
    protected String insuYearFlag;
    @XmlElement(name = "InsuYear", required = true)
    protected String insuYear;

    /**
     * ��ȡdutyCode���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * ����dutyCode���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * ��ȡprem���Ե�ֵ��
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
     * ����prem���Ե�ֵ��
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
     * ��ȡamnt���Ե�ֵ��
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
     * ����amnt���Ե�ֵ��
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
     * ��ȡinsuYearFlag���Ե�ֵ��
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
     * ����insuYearFlag���Ե�ֵ��
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
     * ��ȡinsuYear���Ե�ֵ��
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
     * ����insuYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuYear(String value) {
        this.insuYear = value;
    }

}
