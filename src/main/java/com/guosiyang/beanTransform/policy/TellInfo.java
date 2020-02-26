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
 *         &lt;element ref="{}TellVersion"/>
 *         &lt;element ref="{}TellCode"/>
 *         &lt;element ref="{}TellObject"/>
 *         &lt;element ref="{}TellContent"/>
 *         &lt;element ref="{}TellRemark"/>
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
    "tellVersion",
    "tellCode",
    "tellObject",
    "tellContent",
    "tellRemark"
})
@XmlRootElement(name = "TellInfo")
public class TellInfo {

    @XmlElement(name = "TellVersion", required = true)
    protected String tellVersion;
    @XmlElement(name = "TellCode", required = true)
    protected String tellCode;
    @XmlElement(name = "TellObject", required = true)
    protected String tellObject;
    @XmlElement(name = "TellContent", required = true)
    protected String tellContent;
    @XmlElement(name = "TellRemark", required = true)
    protected String tellRemark;

    /**
     * 获取tellVersion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellVersion() {
        return tellVersion;
    }

    /**
     * 设置tellVersion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellVersion(String value) {
        this.tellVersion = value;
    }

    /**
     * 获取tellCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellCode() {
        return tellCode;
    }

    /**
     * 设置tellCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellCode(String value) {
        this.tellCode = value;
    }

    /**
     * 获取tellObject属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellObject() {
        return tellObject;
    }

    /**
     * 设置tellObject属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellObject(String value) {
        this.tellObject = value;
    }

    /**
     * 获取tellContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellContent() {
        return tellContent;
    }

    /**
     * 设置tellContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellContent(String value) {
        this.tellContent = value;
    }

    /**
     * 获取tellRemark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellRemark() {
        return tellRemark;
    }

    /**
     * 设置tellRemark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellRemark(String value) {
        this.tellRemark = value;
    }

}
