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
 *         &lt;element ref="{}ProposalContNo"/>
 *         &lt;element ref="{}PolApplyDate"/>
 *         &lt;element ref="{}ReceiveDate"/>
 *         &lt;element ref="{}ManageCom"/>
 *         &lt;element ref="{}SaleChnl"/>
 *         &lt;element ref="{}SalesWay"/>
 *         &lt;element ref="{}SalesWaySub"/>
 *         &lt;element ref="{}PoLissuPlat"/>
 *         &lt;element ref="{}BpoFlag"/>
 *         &lt;element ref="{}AgentCode"/>
 *         &lt;element ref="{}AgentState"/>
 *         &lt;element ref="{}AgentName"/>
 *         &lt;element ref="{}AgentBankCode"/>
 *         &lt;element ref="{}AgentCom"/>
 *         &lt;element ref="{}AgentComName"/>
 *         &lt;element ref="{}BankAgent"/>
 *         &lt;element ref="{}BankAgentName"/>
 *         &lt;element ref="{}NewBankAccNo"/>
 *         &lt;element ref="{}NewBankAccName"/>
 *         &lt;element ref="{}NewAccBankCode"/>
 *         &lt;element ref="{}BankAccNo"/>
 *         &lt;element ref="{}BankAccName"/>
 *         &lt;element ref="{}AccBankCode"/>
 *         &lt;element ref="{}PayIntv"/>
 *         &lt;element ref="{}NewPayMode"/>
 *         &lt;element ref="{}PayMode"/>
 *         &lt;element ref="{}RenewPayFlag"/>
 *         &lt;element ref="{}AutoPayFlag"/>
 *         &lt;element ref="{}RnewFlagL"/>
 *         &lt;element ref="{}RnewFlag"/>
 *         &lt;element ref="{}Password"/>
 *         &lt;element ref="{}GetPolMode"/>
 *         &lt;element ref="{}NeedPrompt"/>
 *         &lt;element ref="{}TotalPrem"/>
 *         &lt;element ref="{}SlipForm"/>
 *         &lt;element ref="{}EntrustType"/>
 *         &lt;element ref="{}EntrustNo"/>
 *         &lt;element ref="{}RIskSumPrem"/>
 *         &lt;element ref="{}Pattern"/>
 *         &lt;element ref="{}OutContNo"/>
 *         &lt;element ref="{}OutComNo"/>
 *         &lt;element ref="{}RiskType3"/>
 *         &lt;element ref="{}ProSetCodeFlag"/>
 *         &lt;element ref="{}SRiskPeriod"/>
 *         &lt;element ref="{}LRiskPeriod"/>
 *         &lt;element ref="{}ISbonusFlag"/>
 *         &lt;element ref="{}YBTEditflag"/>
 *         &lt;element ref="{}Risktype5"/>
 *         &lt;element ref="{}VerifyInfo"/>
 *         &lt;element ref="{}LCAppnt"/>
 *         &lt;element ref="{}LCInsuredList"/>
 *         &lt;element ref="{}TellInfoList"/>
 *         &lt;element ref="{}imageList"/>
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
    "proposalContNo",
    "polApplyDate",
    "receiveDate",
    "manageCom",
    "saleChnl",
    "salesWay",
    "salesWaySub",
    "poLissuPlat",
    "bpoFlag",
    "agentCode",
    "agentState",
    "agentName",
    "agentBankCode",
    "agentCom",
    "agentComName",
    "bankAgent",
    "bankAgentName",
    "newBankAccNo",
    "newBankAccName",
    "newAccBankCode",
    "bankAccNo",
    "bankAccName",
    "accBankCode",
    "payIntv",
    "newPayMode",
    "payMode",
    "renewPayFlag",
    "autoPayFlag",
    "rnewFlagL",
    "rnewFlag",
    "password",
    "getPolMode",
    "needPrompt",
    "totalPrem",
    "slipForm",
    "entrustType",
    "entrustNo",
    "rIskSumPrem",
    "pattern",
    "outContNo",
    "outComNo",
    "riskType3",
    "proSetCodeFlag",
    "sRiskPeriod",
    "lRiskPeriod",
    "iSbonusFlag",
    "ybtEditflag",
    "risktype5",
    "verifyInfo",
    "lcAppnt",
    "lcInsuredList",
    "tellInfoList",
    "imageList"
})
@XmlRootElement(name = "Proposal")
public class Proposal {

    @XmlElement(name = "ProposalContNo", required = true)
    protected String proposalContNo;
    @XmlElement(name = "PolApplyDate", required = true)
    protected String polApplyDate;
    @XmlElement(name = "ReceiveDate", required = true)
    protected String receiveDate;
    @XmlElement(name = "ManageCom", required = true)
    protected String manageCom;
    @XmlElement(name = "SaleChnl", required = true)
    protected String saleChnl;
    @XmlElement(name = "SalesWay", required = true)
    protected String salesWay;
    @XmlElement(name = "SalesWaySub", required = true)
    protected String salesWaySub;
    @XmlElement(name = "PoLissuPlat", required = true)
    protected String poLissuPlat;
    @XmlElement(name = "BpoFlag", required = true)
    protected String bpoFlag;
    @XmlElement(name = "AgentCode", required = true)
    protected String agentCode;
    @XmlElement(name = "AgentState", required = true)
    protected String agentState;
    @XmlElement(name = "AgentName", required = true)
    protected String agentName;
    @XmlElement(name = "AgentBankCode", required = true)
    protected String agentBankCode;
    @XmlElement(name = "AgentCom", required = true)
    protected String agentCom;
    @XmlElement(name = "AgentComName", required = true)
    protected String agentComName;
    @XmlElement(name = "BankAgent", required = true)
    protected String bankAgent;
    @XmlElement(name = "BankAgentName", required = true)
    protected String bankAgentName;
    @XmlElement(name = "NewBankAccNo", required = true)
    protected String newBankAccNo;
    @XmlElement(name = "NewBankAccName", required = true)
    protected String newBankAccName;
    @XmlElement(name = "NewAccBankCode", required = true)
    protected String newAccBankCode;
    @XmlElement(name = "BankAccNo", required = true)
    protected String bankAccNo;
    @XmlElement(name = "BankAccName", required = true)
    protected String bankAccName;
    @XmlElement(name = "AccBankCode", required = true)
    protected String accBankCode;
    @XmlElement(name = "PayIntv", required = true)
    protected String payIntv;
    @XmlElement(name = "NewPayMode", required = true)
    protected String newPayMode;
    @XmlElement(name = "PayMode", required = true)
    protected String payMode;
    @XmlElement(name = "RenewPayFlag", required = true)
    protected String renewPayFlag;
    @XmlElement(name = "AutoPayFlag", required = true)
    protected String autoPayFlag;
    @XmlElement(name = "RnewFlagL", required = true)
    protected String rnewFlagL;
    @XmlElement(name = "RnewFlag", required = true)
    protected String rnewFlag;
    @XmlElement(name = "Password", required = true)
    protected String password;
    @XmlElement(name = "GetPolMode", required = true)
    protected String getPolMode;
    @XmlElement(name = "NeedPrompt", required = true)
    protected String needPrompt;
    @XmlElement(name = "TotalPrem", required = true)
    protected String totalPrem;
    @XmlElement(name = "SlipForm", required = true)
    protected String slipForm;
    @XmlElement(name = "EntrustType", required = true)
    protected String entrustType;
    @XmlElement(name = "EntrustNo", required = true)
    protected String entrustNo;
    @XmlElement(name = "RIskSumPrem", required = true)
    protected String rIskSumPrem;
    @XmlElement(name = "Pattern", required = true)
    protected String pattern;
    @XmlElement(name = "OutContNo", required = true)
    protected String outContNo;
    @XmlElement(name = "OutComNo", required = true)
    protected String outComNo;
    @XmlElement(name = "RiskType3", required = true)
    protected String riskType3;
    @XmlElement(name = "ProSetCodeFlag", required = true)
    protected String proSetCodeFlag;
    @XmlElement(name = "SRiskPeriod", required = true)
    protected String sRiskPeriod;
    @XmlElement(name = "LRiskPeriod", required = true)
    protected String lRiskPeriod;
    @XmlElement(name = "ISbonusFlag", required = true)
    protected String iSbonusFlag;
    @XmlElement(name = "YBTEditflag", required = true)
    protected String ybtEditflag;
    @XmlElement(name = "Risktype5", required = true)
    protected String risktype5;
    @XmlElement(name = "VerifyInfo", required = true)
    protected VerifyInfo verifyInfo;
    @XmlElement(name = "LCAppnt", required = true)
    protected LCAppnt lcAppnt;
    @XmlElement(name = "LCInsuredList", required = true)
    protected LCInsuredList lcInsuredList;
    @XmlElement(name = "TellInfoList", required = true)
    protected TellInfoList tellInfoList;
    @XmlElement(required = true)
    protected ImageList imageList;

    /**
     * 获取proposalContNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProposalContNo() {
        return proposalContNo;
    }

    /**
     * 设置proposalContNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProposalContNo(String value) {
        this.proposalContNo = value;
    }

    /**
     * 获取polApplyDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolApplyDate() {
        return polApplyDate;
    }

    /**
     * 设置polApplyDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolApplyDate(String value) {
        this.polApplyDate = value;
    }

    /**
     * 获取receiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveDate() {
        return receiveDate;
    }

    /**
     * 设置receiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveDate(String value) {
        this.receiveDate = value;
    }

    /**
     * 获取manageCom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManageCom() {
        return manageCom;
    }

    /**
     * 设置manageCom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManageCom(String value) {
        this.manageCom = value;
    }

    /**
     * 获取saleChnl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleChnl() {
        return saleChnl;
    }

    /**
     * 设置saleChnl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleChnl(String value) {
        this.saleChnl = value;
    }

    /**
     * 获取salesWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesWay() {
        return salesWay;
    }

    /**
     * 设置salesWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesWay(String value) {
        this.salesWay = value;
    }

    /**
     * 获取salesWaySub属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesWaySub() {
        return salesWaySub;
    }

    /**
     * 设置salesWaySub属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesWaySub(String value) {
        this.salesWaySub = value;
    }

    /**
     * 获取poLissuPlat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoLissuPlat() {
        return poLissuPlat;
    }

    /**
     * 设置poLissuPlat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoLissuPlat(String value) {
        this.poLissuPlat = value;
    }

    /**
     * 获取bpoFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpoFlag() {
        return bpoFlag;
    }

    /**
     * 设置bpoFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpoFlag(String value) {
        this.bpoFlag = value;
    }

    /**
     * 获取agentCode属性的值。
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
     * 设置agentCode属性的值。
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
     * 获取agentState属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentState() {
        return agentState;
    }

    /**
     * 设置agentState属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentState(String value) {
        this.agentState = value;
    }

    /**
     * 获取agentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * 设置agentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
    }

    /**
     * 获取agentBankCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentBankCode() {
        return agentBankCode;
    }

    /**
     * 设置agentBankCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentBankCode(String value) {
        this.agentBankCode = value;
    }

    /**
     * 获取agentCom属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCom() {
        return agentCom;
    }

    /**
     * 设置agentCom属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCom(String value) {
        this.agentCom = value;
    }

    /**
     * 获取agentComName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentComName() {
        return agentComName;
    }

    /**
     * 设置agentComName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentComName(String value) {
        this.agentComName = value;
    }

    /**
     * 获取bankAgent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAgent() {
        return bankAgent;
    }

    /**
     * 设置bankAgent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAgent(String value) {
        this.bankAgent = value;
    }

    /**
     * 获取bankAgentName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAgentName() {
        return bankAgentName;
    }

    /**
     * 设置bankAgentName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAgentName(String value) {
        this.bankAgentName = value;
    }

    /**
     * 获取newBankAccNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBankAccNo() {
        return newBankAccNo;
    }

    /**
     * 设置newBankAccNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBankAccNo(String value) {
        this.newBankAccNo = value;
    }

    /**
     * 获取newBankAccName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewBankAccName() {
        return newBankAccName;
    }

    /**
     * 设置newBankAccName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewBankAccName(String value) {
        this.newBankAccName = value;
    }

    /**
     * 获取newAccBankCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewAccBankCode() {
        return newAccBankCode;
    }

    /**
     * 设置newAccBankCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewAccBankCode(String value) {
        this.newAccBankCode = value;
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
     * 获取bankAccName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccName() {
        return bankAccName;
    }

    /**
     * 设置bankAccName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccName(String value) {
        this.bankAccName = value;
    }

    /**
     * 获取accBankCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccBankCode() {
        return accBankCode;
    }

    /**
     * 设置accBankCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccBankCode(String value) {
        this.accBankCode = value;
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
     * 获取newPayMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPayMode() {
        return newPayMode;
    }

    /**
     * 设置newPayMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPayMode(String value) {
        this.newPayMode = value;
    }

    /**
     * 获取payMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * 设置payMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * 获取renewPayFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenewPayFlag() {
        return renewPayFlag;
    }

    /**
     * 设置renewPayFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenewPayFlag(String value) {
        this.renewPayFlag = value;
    }

    /**
     * 获取autoPayFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoPayFlag() {
        return autoPayFlag;
    }

    /**
     * 设置autoPayFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoPayFlag(String value) {
        this.autoPayFlag = value;
    }

    /**
     * 获取rnewFlagL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnewFlagL() {
        return rnewFlagL;
    }

    /**
     * 设置rnewFlagL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnewFlagL(String value) {
        this.rnewFlagL = value;
    }

    /**
     * 获取rnewFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRnewFlag() {
        return rnewFlag;
    }

    /**
     * 设置rnewFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRnewFlag(String value) {
        this.rnewFlag = value;
    }

    /**
     * 获取password属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取getPolMode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGetPolMode() {
        return getPolMode;
    }

    /**
     * 设置getPolMode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGetPolMode(String value) {
        this.getPolMode = value;
    }

    /**
     * 获取needPrompt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNeedPrompt() {
        return needPrompt;
    }

    /**
     * 设置needPrompt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNeedPrompt(String value) {
        this.needPrompt = value;
    }

    /**
     * 获取totalPrem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrem() {
        return totalPrem;
    }

    /**
     * 设置totalPrem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrem(String value) {
        this.totalPrem = value;
    }

    /**
     * 获取slipForm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipForm() {
        return slipForm;
    }

    /**
     * 设置slipForm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipForm(String value) {
        this.slipForm = value;
    }

    /**
     * 获取entrustType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrustType() {
        return entrustType;
    }

    /**
     * 设置entrustType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrustType(String value) {
        this.entrustType = value;
    }

    /**
     * 获取entrustNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntrustNo() {
        return entrustNo;
    }

    /**
     * 设置entrustNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntrustNo(String value) {
        this.entrustNo = value;
    }

    /**
     * 获取rIskSumPrem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIskSumPrem() {
        return rIskSumPrem;
    }

    /**
     * 设置rIskSumPrem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIskSumPrem(String value) {
        this.rIskSumPrem = value;
    }

    /**
     * 获取pattern属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * 设置pattern属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * 获取outContNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutContNo() {
        return outContNo;
    }

    /**
     * 设置outContNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutContNo(String value) {
        this.outContNo = value;
    }

    /**
     * 获取outComNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutComNo() {
        return outComNo;
    }

    /**
     * 设置outComNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutComNo(String value) {
        this.outComNo = value;
    }

    /**
     * 获取riskType3属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRiskType3() {
        return riskType3;
    }

    /**
     * 设置riskType3属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRiskType3(String value) {
        this.riskType3 = value;
    }

    /**
     * 获取proSetCodeFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProSetCodeFlag() {
        return proSetCodeFlag;
    }

    /**
     * 设置proSetCodeFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProSetCodeFlag(String value) {
        this.proSetCodeFlag = value;
    }

    /**
     * 获取sRiskPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRiskPeriod() {
        return sRiskPeriod;
    }

    /**
     * 设置sRiskPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRiskPeriod(String value) {
        this.sRiskPeriod = value;
    }

    /**
     * 获取lRiskPeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRiskPeriod() {
        return lRiskPeriod;
    }

    /**
     * 设置lRiskPeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRiskPeriod(String value) {
        this.lRiskPeriod = value;
    }

    /**
     * 获取iSbonusFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISbonusFlag() {
        return iSbonusFlag;
    }

    /**
     * 设置iSbonusFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISbonusFlag(String value) {
        this.iSbonusFlag = value;
    }

    /**
     * 获取ybtEditflag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYBTEditflag() {
        return ybtEditflag;
    }

    /**
     * 设置ybtEditflag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYBTEditflag(String value) {
        this.ybtEditflag = value;
    }

    /**
     * 获取risktype5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisktype5() {
        return risktype5;
    }

    /**
     * 设置risktype5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisktype5(String value) {
        this.risktype5 = value;
    }

    /**
     * 获取verifyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VerifyInfo }
     *     
     */
    public VerifyInfo getVerifyInfo() {
        return verifyInfo;
    }

    /**
     * 设置verifyInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VerifyInfo }
     *     
     */
    public void setVerifyInfo(VerifyInfo value) {
        this.verifyInfo = value;
    }

    /**
     * 获取lcAppnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LCAppnt }
     *     
     */
    public LCAppnt getLCAppnt() {
        return lcAppnt;
    }

    /**
     * 设置lcAppnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LCAppnt }
     *     
     */
    public void setLCAppnt(LCAppnt value) {
        this.lcAppnt = value;
    }

    /**
     * 获取lcInsuredList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LCInsuredList }
     *     
     */
    public LCInsuredList getLCInsuredList() {
        return lcInsuredList;
    }

    /**
     * 设置lcInsuredList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LCInsuredList }
     *     
     */
    public void setLCInsuredList(LCInsuredList value) {
        this.lcInsuredList = value;
    }

    /**
     * 获取tellInfoList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TellInfoList }
     *     
     */
    public TellInfoList getTellInfoList() {
        return tellInfoList;
    }

    /**
     * 设置tellInfoList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TellInfoList }
     *     
     */
    public void setTellInfoList(TellInfoList value) {
        this.tellInfoList = value;
    }

    /**
     * 获取imageList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImageList }
     *     
     */
    public ImageList getImageList() {
        return imageList;
    }

    /**
     * 设置imageList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImageList }
     *     
     */
    public void setImageList(ImageList value) {
        this.imageList = value;
    }

}
