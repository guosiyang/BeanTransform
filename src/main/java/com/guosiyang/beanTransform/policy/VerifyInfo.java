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
 *         &lt;element ref="{}AgentCode"/>
 *         &lt;element ref="{}ApplyDate"/>
 *         &lt;element ref="{}RiskList"/>
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
    "agentCode",
    "applyDate",
    "riskList"
})
@XmlRootElement(name = "VerifyInfo")
public class VerifyInfo {

    @XmlElement(name = "AgentCode", required = true)
    protected String agentCode;
    @XmlElement(name = "ApplyDate", required = true)
    protected String applyDate;
    @XmlElement(name = "RiskList", required = true)
    protected RiskList riskList;

    /**
     * ��ȡagentCode���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * ����agentCode���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * ��ȡapplyDate���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getApplyDate() {
        return applyDate;
    }

    /**
     * ����applyDate���Ե�ֵ��
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setApplyDate(String value) {
        this.applyDate = value;
    }

    /**
     * ��ȡriskList���Ե�ֵ��
     *
     * @return
     *     possible object is
     *     {@link RiskList }
     *
     */
    public RiskList getRiskList() {
        return riskList;
    }

    /**
     * ����riskList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link RiskList }
     *     
     */
    public void setRiskList(RiskList value) {
        this.riskList = value;
    }

}
