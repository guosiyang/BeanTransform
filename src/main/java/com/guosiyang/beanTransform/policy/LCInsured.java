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
 *         &lt;element ref="{}RelationToApnnt"/>
 *         &lt;element ref="{}Sequenceno"/>
 *         &lt;element ref="{}TaxCustomerType"/>
 *         &lt;element ref="{}InsuredNo"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}FirstName"/>
 *         &lt;element ref="{}LastName"/>
 *         &lt;element ref="{}Sex"/>
 *         &lt;element ref="{}Birthday"/>
 *         &lt;element ref="{}Age"/>
 *         &lt;element ref="{}NativePlace"/>
 *         &lt;element ref="{}RgtAddress"/>
 *         &lt;element ref="{}Degree"/>
 *         &lt;element ref="{}Marriage"/>
 *         &lt;element ref="{}HavaMotorcycleLicence"/>
 *         &lt;element ref="{}IDType"/>
 *         &lt;element ref="{}IDNo"/>
 *         &lt;element ref="{}IDValidDate"/>
 *         &lt;element ref="{}Stature"/>
 *         &lt;element ref="{}Avoirdupois"/>
 *         &lt;element ref="{}HomeAddress"/>
 *         &lt;element ref="{}PostalAddress"/>
 *         &lt;element ref="{}ZoneCode"/>
 *         &lt;element ref="{}FixPhone"/>
 *         &lt;element ref="{}Mobile"/>
 *         &lt;element ref="{}EMail"/>
 *         &lt;element ref="{}GrpName"/>
 *         &lt;element ref="{}OccupationCode"/>
 *         &lt;element ref="{}OccupationType"/>
 *         &lt;element ref="{}OccupationDesc"/>
 *         &lt;element ref="{}PluralityDesc"/>
 *         &lt;element ref="{}Position"/>
 *         &lt;element ref="{}SSFlag"/>
 *         &lt;element ref="{}Childimpart"/>
 *         &lt;element ref="{}ChildTotalAmnt"/>
 *         &lt;element ref="{}InsurIncome"/>
 *         &lt;element ref="{}InsurIncomeWay"/>
 *         &lt;element ref="{}TellInfoList"/>
 *         &lt;element ref="{}LCBnfList"/>
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
    "relationToApnnt",
    "sequenceno",
    "taxCustomerType",
    "insuredNo",
    "name",
    "firstName",
    "lastName",
    "sex",
    "birthday",
    "age",
    "nativePlace",
    "rgtAddress",
    "degree",
    "marriage",
    "havaMotorcycleLicence",
    "idType",
    "idNo",
    "idValidDate",
    "stature",
    "avoirdupois",
    "homeAddress",
    "postalAddress",
    "zoneCode",
    "fixPhone",
    "mobile",
    "eMail",
    "grpName",
    "occupationCode",
    "occupationType",
    "occupationDesc",
    "pluralityDesc",
    "position",
    "ssFlag",
    "childimpart",
    "childTotalAmnt",
    "insurIncome",
    "insurIncomeWay",
    "tellInfoList",
    "lcBnfList",
    "riskList"
})
@XmlRootElement(name = "LCInsured")
public class LCInsured {

    @XmlElement(name = "RelationToApnnt", required = true)
    protected String relationToApnnt;
    @XmlElement(name = "Sequenceno", required = true)
    protected String sequenceno;
    @XmlElement(name = "TaxCustomerType", required = true)
    protected String taxCustomerType;
    @XmlElement(name = "InsuredNo", required = true)
    protected String insuredNo;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Sex", required = true)
    protected String sex;
    @XmlElement(name = "Birthday", required = true)
    protected String birthday;
    @XmlElement(name = "Age", required = true)
    protected String age;
    @XmlElement(name = "NativePlace", required = true)
    protected String nativePlace;
    @XmlElement(name = "RgtAddress", required = true)
    protected String rgtAddress;
    @XmlElement(name = "Degree", required = true)
    protected String degree;
    @XmlElement(name = "Marriage", required = true)
    protected String marriage;
    @XmlElement(name = "HavaMotorcycleLicence", required = true)
    protected String havaMotorcycleLicence;
    @XmlElement(name = "IDType", required = true)
    protected String idType;
    @XmlElement(name = "IDNo", required = true)
    protected String idNo;
    @XmlElement(name = "IDValidDate", required = true)
    protected String idValidDate;
    @XmlElement(name = "Stature", required = true)
    protected String stature;
    @XmlElement(name = "Avoirdupois", required = true)
    protected String avoirdupois;
    @XmlElement(name = "HomeAddress", required = true)
    protected HomeAddress homeAddress;
    @XmlElement(name = "PostalAddress", required = true)
    protected PostalAddress postalAddress;
    @XmlElement(name = "ZoneCode", required = true)
    protected String zoneCode;
    @XmlElement(name = "FixPhone", required = true)
    protected String fixPhone;
    @XmlElement(name = "Mobile", required = true)
    protected String mobile;
    @XmlElement(name = "EMail", required = true)
    protected String eMail;
    @XmlElement(name = "GrpName", required = true)
    protected String grpName;
    @XmlElement(name = "OccupationCode", required = true)
    protected String occupationCode;
    @XmlElement(name = "OccupationType", required = true)
    protected String occupationType;
    @XmlElement(name = "OccupationDesc", required = true)
    protected String occupationDesc;
    @XmlElement(name = "PluralityDesc", required = true)
    protected String pluralityDesc;
    @XmlElement(name = "Position", required = true)
    protected String position;
    @XmlElement(name = "SSFlag", required = true)
    protected String ssFlag;
    @XmlElement(name = "Childimpart", required = true)
    protected String childimpart;
    @XmlElement(name = "ChildTotalAmnt", required = true)
    protected String childTotalAmnt;
    @XmlElement(name = "InsurIncome", required = true)
    protected String insurIncome;
    @XmlElement(name = "InsurIncomeWay", required = true)
    protected String insurIncomeWay;
    @XmlElement(name = "TellInfoList", required = true)
    protected TellInfoList tellInfoList;
    @XmlElement(name = "LCBnfList", required = true)
    protected LCBnfList lcBnfList;
    @XmlElement(name = "RiskList", required = true)
    protected RiskList riskList;

    /**
     * 获取relationToApnnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToApnnt() {
        return relationToApnnt;
    }

    /**
     * 设置relationToApnnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToApnnt(String value) {
        this.relationToApnnt = value;
    }

    /**
     * 获取sequenceno属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceno() {
        return sequenceno;
    }

    /**
     * 设置sequenceno属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceno(String value) {
        this.sequenceno = value;
    }

    /**
     * 获取taxCustomerType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCustomerType() {
        return taxCustomerType;
    }

    /**
     * 设置taxCustomerType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCustomerType(String value) {
        this.taxCustomerType = value;
    }

    /**
     * 获取insuredNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredNo() {
        return insuredNo;
    }

    /**
     * 设置insuredNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredNo(String value) {
        this.insuredNo = value;
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
     * 获取firstName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * 设置firstName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * 获取lastName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * 设置lastName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
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
     * 获取age属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置age属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(String value) {
        this.age = value;
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
     * 获取rgtAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRgtAddress() {
        return rgtAddress;
    }

    /**
     * 设置rgtAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRgtAddress(String value) {
        this.rgtAddress = value;
    }

    /**
     * 获取degree属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * 设置degree属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * 获取marriage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriage() {
        return marriage;
    }

    /**
     * 设置marriage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriage(String value) {
        this.marriage = value;
    }

    /**
     * 获取havaMotorcycleLicence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHavaMotorcycleLicence() {
        return havaMotorcycleLicence;
    }

    /**
     * 设置havaMotorcycleLicence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHavaMotorcycleLicence(String value) {
        this.havaMotorcycleLicence = value;
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
     * 获取stature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStature() {
        return stature;
    }

    /**
     * 设置stature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStature(String value) {
        this.stature = value;
    }

    /**
     * 获取avoirdupois属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvoirdupois() {
        return avoirdupois;
    }

    /**
     * 设置avoirdupois属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvoirdupois(String value) {
        this.avoirdupois = value;
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
     * 获取postalAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress }
     *     
     */
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    /**
     * 设置postalAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress }
     *     
     */
    public void setPostalAddress(PostalAddress value) {
        this.postalAddress = value;
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
     * 获取eMail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * 设置eMail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * 获取grpName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpName() {
        return grpName;
    }

    /**
     * 设置grpName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpName(String value) {
        this.grpName = value;
    }

    /**
     * 获取occupationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * 设置occupationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationCode(String value) {
        this.occupationCode = value;
    }

    /**
     * 获取occupationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationType() {
        return occupationType;
    }

    /**
     * 设置occupationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationType(String value) {
        this.occupationType = value;
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
     * 获取pluralityDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPluralityDesc() {
        return pluralityDesc;
    }

    /**
     * 设置pluralityDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPluralityDesc(String value) {
        this.pluralityDesc = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * 获取ssFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSFlag() {
        return ssFlag;
    }

    /**
     * 设置ssFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSFlag(String value) {
        this.ssFlag = value;
    }

    /**
     * 获取childimpart属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildimpart() {
        return childimpart;
    }

    /**
     * 设置childimpart属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildimpart(String value) {
        this.childimpart = value;
    }

    /**
     * 获取childTotalAmnt属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildTotalAmnt() {
        return childTotalAmnt;
    }

    /**
     * 设置childTotalAmnt属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildTotalAmnt(String value) {
        this.childTotalAmnt = value;
    }

    /**
     * 获取insurIncome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurIncome() {
        return insurIncome;
    }

    /**
     * 设置insurIncome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurIncome(String value) {
        this.insurIncome = value;
    }

    /**
     * 获取insurIncomeWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurIncomeWay() {
        return insurIncomeWay;
    }

    /**
     * 设置insurIncomeWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurIncomeWay(String value) {
        this.insurIncomeWay = value;
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
     * 获取lcBnfList属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LCBnfList }
     *     
     */
    public LCBnfList getLCBnfList() {
        return lcBnfList;
    }

    /**
     * 设置lcBnfList属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LCBnfList }
     *     
     */
    public void setLCBnfList(LCBnfList value) {
        this.lcBnfList = value;
    }

    /**
     * 获取riskList属性的值。
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
     * 设置riskList属性的值。
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
