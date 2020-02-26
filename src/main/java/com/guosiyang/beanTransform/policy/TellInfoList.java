//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.01.14 时间 05:38:13 PM CST 
//


package com.guosiyang.beanTransform.policy;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element ref="{}TellInfoSize" minOccurs="0"/>
 *         &lt;element ref="{}TellInfo" maxOccurs="unbounded"/>
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
    "tellInfoSize",
    "tellInfo"
})
@XmlRootElement(name = "TellInfoList")
public class TellInfoList {

    @XmlElement(name = "TellInfoSize")
    protected String tellInfoSize;
    @XmlElement(name = "TellInfo", required = true)
    protected List<TellInfo> tellInfo;

    /**
     * 获取tellInfoSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTellInfoSize() {
        return tellInfoSize;
    }

    /**
     * 设置tellInfoSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTellInfoSize(String value) {
        this.tellInfoSize = value;
    }

    /**
     * Gets the value of the tellInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tellInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTellInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TellInfo }
     * 
     * 
     */
    public List<TellInfo> getTellInfo() {
        if (tellInfo == null) {
            tellInfo = new ArrayList<TellInfo>();
        }
        return this.tellInfo;
    }

}
