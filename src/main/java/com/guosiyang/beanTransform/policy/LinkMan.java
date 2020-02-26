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
 *         &lt;element ref="{}LinkManName"/>
 *         &lt;element ref="{}LinkRelationToAppnt"/>
 *         &lt;element ref="{}MobilePhone"/>
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
    "linkManName",
    "linkRelationToAppnt",
    "mobilePhone"
})
@XmlRootElement(name = "LinkMan")
public class LinkMan {

    @XmlElement(name = "LinkManName", required = true)
    protected String linkManName;
    @XmlElement(name = "LinkRelationToAppnt", required = true)
    protected String linkRelationToAppnt;
    @XmlElement(name = "MobilePhone", required = true)
    protected String mobilePhone;

    /**
     * 获取linkManName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkManName() {
        return linkManName;
    }

    /**
     * 设置linkManName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkManName(String value) {
        this.linkManName = value;
    }

    /**
     * 获取linkRelationToAppnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkRelationToAppnt() {
        return linkRelationToAppnt;
    }

    /**
     * 设置linkRelationToAppnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkRelationToAppnt(String value) {
        this.linkRelationToAppnt = value;
    }

    /**
     * 获取mobilePhone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * 设置mobilePhone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

}
