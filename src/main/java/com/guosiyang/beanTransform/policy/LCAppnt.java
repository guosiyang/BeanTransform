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
 *         &lt;element ref="{}CUSLevel"/>
 *         &lt;element ref="{}AppRgtTpye"/>
 *         &lt;element ref="{}TaxCustomerTpye"/>
 *         &lt;element ref="{}AppntNo"/>
 *         &lt;element ref="{}Name"/>
 *         &lt;element ref="{}FirstName"/>
 *         &lt;element ref="{}LastName"/>
 *         &lt;element ref="{}Sex"/>
 *         &lt;element ref="{}Birthday"/>
 *         &lt;element ref="{}Age"/>
 *         &lt;element ref="{}RelationToInsuerd"/>
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
 *         &lt;element ref="{}AppntPhoneType"/>
 *         &lt;element ref="{}ZoneCode"/>
 *         &lt;element ref="{}FixPhone"/>
 *         &lt;element ref="{}Mobile"/>
 *         &lt;element ref="{}Phone"/>
 *         &lt;element ref="{}EMail"/>
 *         &lt;element ref="{}GrpName"/>
 *         &lt;element ref="{}AppntOccupationCode"/>
 *         &lt;element ref="{}AppntOccupationType"/>
 *         &lt;element ref="{}OccupationDesc"/>
 *         &lt;element ref="{}PluralityDesc"/>
 *         &lt;element ref="{}Position"/>
 *         &lt;element ref="{}AppntInCome"/>
 *         &lt;element ref="{}AppntIncomeWay"/>
 *         &lt;element ref="{}AppntFamilyIncome"/>
 *         &lt;element ref="{}TaxProvince"/>
 *         &lt;element ref="{}TaxCity"/>
 *         &lt;element ref="{}TaxDistrict"/>
 *         &lt;element ref="{}CompanyOrgCode"/>
 *         &lt;element ref="{}LinkMan"/>
 *         &lt;element ref="{}TinFlag"/>
 *         &lt;element ref="{}TinNo"/>
 *         &lt;element ref="{}TellInfoList"/>
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
    "cusLevel",
    "appRgtTpye",
    "taxCustomerTpye",
    "appntNo",
    "name",
    "firstName",
    "lastName",
    "sex",
    "birthday",
    "age",
    "relationToInsuerd",
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
    "appntPhoneType",
    "zoneCode",
    "fixPhone",
    "mobile",
    "phone",
    "eMail",
    "grpName",
    "appntOccupationCode",
    "appntOccupationType",
    "occupationDesc",
    "pluralityDesc",
    "position",
    "appntInCome",
    "appntIncomeWay",
    "appntFamilyIncome",
    "taxProvince",
    "taxCity",
    "taxDistrict",
    "companyOrgCode",
    "linkMan",
    "tinFlag",
    "tinNo",
    "tellInfoList"
})
@XmlRootElement(name = "LCAppnt")
public class LCAppnt {

    @XmlElement(name = "CUSLevel", required = true)
    protected String cusLevel;
    @XmlElement(name = "AppRgtTpye", required = true)
    protected String appRgtTpye;
    @XmlElement(name = "TaxCustomerTpye", required = true)
    protected String taxCustomerTpye;
    @XmlElement(name = "AppntNo", required = true)
    protected String appntNo;
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
    @XmlElement(name = "RelationToInsuerd", required = true)
    protected String relationToInsuerd;
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
    @XmlElement(name = "AppntPhoneType", required = true)
    protected String appntPhoneType;
    @XmlElement(name = "ZoneCode", required = true)
    protected String zoneCode;
    @XmlElement(name = "FixPhone", required = true)
    protected String fixPhone;
    @XmlElement(name = "Mobile", required = true)
    protected String mobile;
    @XmlElement(name = "Phone", required = true)
    protected String phone;
    @XmlElement(name = "EMail", required = true)
    protected String eMail;
    @XmlElement(name = "GrpName", required = true)
    protected String grpName;
    @XmlElement(name = "AppntOccupationCode", required = true)
    protected String appntOccupationCode;
    @XmlElement(name = "AppntOccupationType", required = true)
    protected String appntOccupationType;
    @XmlElement(name = "OccupationDesc", required = true)
    protected String occupationDesc;
    @XmlElement(name = "PluralityDesc", required = true)
    protected String pluralityDesc;
    @XmlElement(name = "Position", required = true)
    protected String position;
    @XmlElement(name = "AppntInCome", required = true)
    protected String appntInCome;
    @XmlElement(name = "AppntIncomeWay", required = true)
    protected String appntIncomeWay;
    @XmlElement(name = "AppntFamilyIncome", required = true)
    protected String appntFamilyIncome;
    @XmlElement(name = "TaxProvince", required = true)
    protected String taxProvince;
    @XmlElement(name = "TaxCity", required = true)
    protected String taxCity;
    @XmlElement(name = "TaxDistrict", required = true)
    protected String taxDistrict;
    @XmlElement(name = "CompanyOrgCode", required = true)
    protected String companyOrgCode;
    @XmlElement(name = "LinkMan", required = true)
    protected LinkMan linkMan;
    @XmlElement(name = "TinFlag", required = true)
    protected String tinFlag;
    @XmlElement(name = "TinNo", required = true)
    protected String tinNo;
    @XmlElement(name = "TellInfoList", required = true)
    protected TellInfoList tellInfoList;

    /**
     * 获取cusLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUSLevel() {
        return cusLevel;
    }

    /**
     * 设置cusLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUSLevel(String value) {
        this.cusLevel = value;
    }

    /**
     * 获取appRgtTpye属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppRgtTpye() {
        return appRgtTpye;
    }

    /**
     * 设置appRgtTpye属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppRgtTpye(String value) {
        this.appRgtTpye = value;
    }

    /**
     * 获取taxCustomerTpye属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCustomerTpye() {
        return taxCustomerTpye;
    }

    /**
     * 设置taxCustomerTpye属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCustomerTpye(String value) {
        this.taxCustomerTpye = value;
    }

    /**
     * 获取appntNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntNo() {
        return appntNo;
    }

    /**
     * 设置appntNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntNo(String value) {
        this.appntNo = value;
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
     * 获取relationToInsuerd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationToInsuerd() {
        return relationToInsuerd;
    }

    /**
     * 设置relationToInsuerd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationToInsuerd(String value) {
        this.relationToInsuerd = value;
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
     * 获取appntPhoneType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntPhoneType() {
        return appntPhoneType;
    }

    /**
     * 设置appntPhoneType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntPhoneType(String value) {
        this.appntPhoneType = value;
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
     * 获取phone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置phone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
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
     * 获取appntOccupationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntOccupationCode() {
        return appntOccupationCode;
    }

    /**
     * 设置appntOccupationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntOccupationCode(String value) {
        this.appntOccupationCode = value;
    }

    /**
     * 获取appntOccupationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntOccupationType() {
        return appntOccupationType;
    }

    /**
     * 设置appntOccupationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntOccupationType(String value) {
        this.appntOccupationType = value;
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
     * 获取appntInCome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntInCome() {
        return appntInCome;
    }

    /**
     * 设置appntInCome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntInCome(String value) {
        this.appntInCome = value;
    }

    /**
     * 获取appntIncomeWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntIncomeWay() {
        return appntIncomeWay;
    }

    /**
     * 设置appntIncomeWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntIncomeWay(String value) {
        this.appntIncomeWay = value;
    }

    /**
     * 获取appntFamilyIncome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppntFamilyIncome() {
        return appntFamilyIncome;
    }

    /**
     * 设置appntFamilyIncome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppntFamilyIncome(String value) {
        this.appntFamilyIncome = value;
    }

    /**
     * 获取taxProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxProvince() {
        return taxProvince;
    }

    /**
     * 设置taxProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxProvince(String value) {
        this.taxProvince = value;
    }

    /**
     * 获取taxCity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCity() {
        return taxCity;
    }

    /**
     * 设置taxCity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCity(String value) {
        this.taxCity = value;
    }

    /**
     * 获取taxDistrict属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDistrict() {
        return taxDistrict;
    }

    /**
     * 设置taxDistrict属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDistrict(String value) {
        this.taxDistrict = value;
    }

    /**
     * 获取companyOrgCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyOrgCode() {
        return companyOrgCode;
    }

    /**
     * 设置companyOrgCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyOrgCode(String value) {
        this.companyOrgCode = value;
    }

    /**
     * 获取linkMan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LinkMan }
     *     
     */
    public LinkMan getLinkMan() {
        return linkMan;
    }

    /**
     * 设置linkMan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LinkMan }
     *     
     */
    public void setLinkMan(LinkMan value) {
        this.linkMan = value;
    }

    /**
     * 获取tinFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinFlag() {
        return tinFlag;
    }

    /**
     * 设置tinFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinFlag(String value) {
        this.tinFlag = value;
    }

    /**
     * 获取tinNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTinNo() {
        return tinNo;
    }

    /**
     * 设置tinNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTinNo(String value) {
        this.tinNo = value;
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

}
