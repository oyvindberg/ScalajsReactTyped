package typingsJapgolly.jsrsasign.global.jsrsasign.KJUR.asn1

import typingsJapgolly.jsrsasign.anon.Array
import typingsJapgolly.jsrsasign.anon.CertString
import typingsJapgolly.jsrsasign.anon.Certs
import typingsJapgolly.jsrsasign.anon.Cms
import typingsJapgolly.jsrsasign.anon.Hex
import typingsJapgolly.jsrsasign.anon.IsValid
import typingsJapgolly.jsrsasign.anon.Issuer
import typingsJapgolly.jsrsasign.anon.Name
import typingsJapgolly.jsrsasign.anon.OidString
import typingsJapgolly.jsrsasign.anon.Sorted
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ASN1ObjectParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.ArrayParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.TypeParam
import typingsJapgolly.jsrsasign.jsrsasignStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * kjur's ASN.1 class for Cryptographic Message Syntax(CMS)
  *
  * This name space provides
  * [RFC 5652 Cryptographic Message Syntax (CMS)](https://tools.ietf.org/html/rfc5652) SignedData generator.
  *
  * __FEATURES__
  *
  * - easily generate CMS SignedData
  * - easily verify CMS SignedData
  * - APIs are very similar to BouncyCastle library ASN.1 classes. So easy to learn.
  *
  *
  * __PROVIDED CLASSES__
  *
  * - `KJUR.asn1.cms.SignedData`
  * - `KJUR.asn1.cms.SignerInfo`
  * - `KJUR.asn1.cms.AttributeList`
  * - `KJUR.asn1.cms.ContentInfo`
  * - `KJUR.asn1.cms.EncapsulatedContentInfo`
  * - `KJUR.asn1.cms.IssuerAndSerialNumber`
  * - `KJUR.asn1.cms.CMSUtil`
  * - `KJUR.asn1.cms.Attribute`
  * - `KJUR.asn1.cms.ContentType`
  * - `KJUR.asn1.cms.MessageDigest`
  * - `KJUR.asn1.cms.SigningTime`
  * - `KJUR.asn1.cms.SigningCertificate`
  * - `KJUR.asn1.cms.SigningCertificateV2`
  */
object cms {
  
  /**
    * Attribute class for base of CMS attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attributes ::= SET OF Attribute
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * ```
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.Attribute")
  @js.native
  open class Attribute ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.Attribute
  
  /**
    * class for Attributes ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * Attributes ::= SET OF Attribute
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * ```
    * @example
    * // specify by X500Name and DERInteger
    * o = new KJUR.asn1.cms.AttributeList({sorted: false}); // ASN.1 BER unsorted SET OF
    * o = new KJUR.asn1.cms.AttributeList();  // ASN.1 DER sorted by default
    * o.clear();                              // clear list of Attributes
    * n = o.length();                         // get number of Attribute
    * o.add(new KJUR.asn1.cms.SigningTime()); // add SigningTime attribute
    * hex = o.getEncodedHex();                // get hex encoded ASN.1 data
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.AttributeList")
  @js.native
  open class AttributeList ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.AttributeList {
    def this(params: Sorted) = this()
  }
  
  object CMSUtil {
    
    @JSGlobal("jsrsasign.KJUR.asn1.cms.CMSUtil")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * generate SignedData object specified by JSON parameters
      * @param param JSON parameter to generate CMS SignedData
      * @return object just generated
      * @description
      * This method provides more easy way to genereate
      * CMS SignedData ASN.1 structure by JSON data.
      * @example
      * var sd = KJUR.asn1.cms.CMSUtil.newSignedData({
      *   content: {str: "jsrsasign"},
      *   certs: [certPEM],
      *   signerInfos: [{
      *     hashAlg: 'sha256',
      *     sAttr: {
      *       SigningTime: {}
      *       SigningCertificateV2: {array: [certPEM]},
      *     },
      *     signerCert: certPEM,
      *     sigAlg: 'SHA256withRSA',
      *     signerPrvKey: prvPEM
      *   }]
      * });
      */
    inline def SignedData(): typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData = ^.asInstanceOf[js.Dynamic].applyDynamic("SignedData")().asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData]
    inline def SignedData(param: Certs): typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData = ^.asInstanceOf[js.Dynamic].applyDynamic("SignedData")(param.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData]
    
    /**
      * verify SignedData specified by JSON parameters
      *
      * @param param JSON parameter to verify CMS SignedData
      * @return JSON data as the result of validation
      * @description
      * This method provides validation for CMS SignedData.
      * Following parameters can be applied:
      *
      * - cms - hexadecimal data of DER CMS SignedData (aka. PKCS#7 or p7s)
      *     to verify (OPTION)
      *
      * @example
      * KJUR.asn1.cms.CMSUtil.verifySignedData({ cms: "3082058a..." })
      * →
      * {
      *   isValid: true,
      *   parse: ... // parsed data
      *   signerInfos: [
      *     {
      *     }
      *   ]
      * }
      */
    inline def verifySignedData(): IsValid = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySignedData")().asInstanceOf[IsValid]
    inline def verifySignedData(param: Cms): IsValid = ^.asInstanceOf[js.Dynamic].applyDynamic("verifySignedData")(param.asInstanceOf[js.Any]).asInstanceOf[IsValid]
  }
  
  /**
    * class for ContentInfo ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * ContentInfo ::= SEQUENCE {
    *    contentType ContentType,
    *    content [0] EXPLICIT ANY DEFINED BY contentType }
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * a = [new KJUR.asn1.DERInteger({int: 1}),
    *      new KJUR.asn1.DERInteger({int: 2})];
    * seq = new KJUR.asn1.DERSequence({array: a});
    * o = new KJUR.asn1.cms.ContentInfo({type: 'data', obj: seq});
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.ContentInfo")
  @js.native
  open class ContentInfo ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.ContentInfo {
    def this(params: ASN1ObjectParam) = this()
    def this(params: TypeParam) = this()
  }
  
  /**
    * class for CMS ContentType attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * o = new KJUR.asn1.cms.ContentType({name: 'data'});
    * o = new KJUR.asn1.cms.ContentType({oid: '1.2.840.113549.1.9.16.1.4'});
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.ContentType")
  @js.native
  open class ContentType ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.ContentType {
    def this(params: Name) = this()
    def this(params: OidString) = this()
  }
  
  /**
    * class for EncapsulatedContentInfo ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * EncapsulatedContentInfo ::= SEQUENCE {
    *    eContentType ContentType,
    *    eContent [0] EXPLICIT OCTET STRING OPTIONAL }
    * ContentType ::= OBJECT IDENTIFIER
    * ```
    * @example
    * o = new KJUR.asn1.cms.EncapsulatedContentInfo();
    * o.setContentType('1.2.3.4.5');     // specify eContentType by OID
    * o.setContentType('data');          // specify eContentType by name
    * o.setContentValueHex('a1a2a4...'); // specify eContent data by hex string
    * o.setContentValueStr('apple');     // specify eContent data by UTF-8 string
    * // for detached contents (i.e. data not concluded in eContent)
    * o.isDetached = true;               // false as default
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.EncapsulatedContentInfo")
  @js.native
  open class EncapsulatedContentInfo ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.EncapsulatedContentInfo {
    def this(params: string) = this()
  }
  
  /**
    * class for IssuerAndSerialNumber ASN.1 structure for CMS
    * @param params associative array of parameters
    * @description
    * ```
    * IssuerAndSerialNumber ::= SEQUENCE {
    *    issuer Name,
    *    serialNumber CertificateSerialNumber }
    * CertificateSerialNumber ::= INTEGER
    * ```
    * @example
    * // specify by X500Name and DERInteger
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber(
    *      {issuer: {str: '/C=US/O=T1'}, serial {int: 3}});
    * // specify by PEM certificate
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber({cert: certPEM});
    * o = new KJUR.asn1.cms.IssuerAndSerialNumber(certPEM); // since 1.0.3
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.IssuerAndSerialNumber")
  @js.native
  open class IssuerAndSerialNumber ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.IssuerAndSerialNumber {
    def this(params: String) = this()
    def this(params: CertString) = this()
    def this(params: Issuer) = this()
  }
  
  /**
    * class for CMS MessageDigest attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * MessageDigest ::= OCTET STRING
    * ```
    * @example
    * o = new KJUR.asn1.cms.MessageDigest({hex: 'a1a2a3a4...'});
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.MessageDigest")
  @js.native
  open class MessageDigest ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.MessageDigest {
    def this(params: Hex) = this()
  }
  
  /**
    * class for SignerInfo ASN.1 structure of CMS SignedData
    * @param params associative array of parameters
    * @description
    * ```
    * SignedData ::= SEQUENCE {
    *    version CMSVersion,
    *    digestAlgorithms DigestAlgorithmIdentifiers,
    *    encapContentInfo EncapsulatedContentInfo,
    *    certificates [0] IMPLICIT CertificateSet OPTIONAL,
    *    crls [1] IMPLICIT RevocationInfoChoices OPTIONAL,
    *    signerInfos SignerInfos }
    * SignerInfos ::= SET OF SignerInfo
    * CertificateSet ::= SET OF CertificateChoices
    * DigestAlgorithmIdentifiers ::= SET OF DigestAlgorithmIdentifier
    * CertificateSet ::= SET OF CertificateChoices
    * RevocationInfoChoices ::= SET OF RevocationInfoChoice
    * ```
    *
    * @example
    * sd = new KJUR.asn1.cms.SignedData();
    * sd.dEncapContentInfo.setContentValueStr("test string");
    * sd.signerInfoList[0].setForContentAndHash({sdObj: sd,
    *                                            eciObj: sd.dEncapContentInfo,
    *                                            hashAlg: 'sha256'});
    * sd.signerInfoList[0].dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
    * sd.signerInfoList[0].setSignerIdentifier(certPEM);
    * sd.signerInfoList[0].sign(prvP8PEM, "SHA256withRSA");
    * hex = sd.getContentInfoEncodedHex();
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.SignedData")
  @js.native
  open class SignedData ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.SignedData
  
  /**
    * class for SignerInfo ASN.1 structure of CMS SignedData
    * @param params associative array of parameters
    * @description
    * ```
    * SignerInfo ::= SEQUENCE {
    *    version CMSVersion,
    *    sid SignerIdentifier,
    *    digestAlgorithm DigestAlgorithmIdentifier,
    *    signedAttrs [0] IMPLICIT SignedAttributes OPTIONAL,
    *    signatureAlgorithm SignatureAlgorithmIdentifier,
    *    signature SignatureValue,
    *    unsignedAttrs [1] IMPLICIT UnsignedAttributes OPTIONAL }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SignerInfo();
    * o.setSignerIdentifier(certPEMstring);
    * o.dSignedAttrs.add(new KJUR.asn1.cms.ContentType({name: 'data'}));
    * o.dSignedAttrs.add(new KJUR.asn1.cms.MessageDigest({hex: 'a1b2...'}));
    * o.dSignedAttrs.add(new KJUR.asn1.cms.SigningTime());
    * o.sign(privteKeyParam, "SHA1withRSA");
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.SignerInfo")
  @js.native
  open class SignerInfo ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.SignerInfo {
    def this(params: String) = this()
  }
  
  /**
    * class for CMS SigningCertificate attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningCertificate ::= SEQUENCE {
    *    certs SEQUENCE OF ESSCertID,
    *    policies SEQUENCE OF PolicyInformation OPTIONAL }
    * ESSCertID ::= SEQUENCE {
    *    certHash Hash,
    *    issuerSerial IssuerSerial OPTIONAL }
    * IssuerSerial ::= SEQUENCE {
    *    issuer GeneralNames,
    *    serialNumber CertificateSerialNumber }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SigningCertificate({array: [certPEM]});
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.SigningCertificate")
  @js.native
  open class SigningCertificate ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.SigningCertificate {
    def this(params: ArrayParam[String]) = this()
  }
  
  /**
    * class for CMS SigningCertificateV2 attribute
    * @param params associative array of parameters
    * @description
    * ```
    * oid-signingCertificateV2 = 1.2.840.113549.1.9.16.2.47
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningCertificateV2 ::=  SEQUENCE {
    *    certs        SEQUENCE OF ESSCertIDv2,
    *    policies     SEQUENCE OF PolicyInformation OPTIONAL }
    * ESSCertIDv2 ::=  SEQUENCE {
    *    hashAlgorithm           AlgorithmIdentifier
    *                            DEFAULT {algorithm id-sha256},
    *    certHash                Hash,
    *    issuerSerial            IssuerSerial OPTIONAL }
    * Hash ::= OCTET STRING
    * IssuerSerial ::= SEQUENCE {
    *    issuer                  GeneralNames,
    *    serialNumber            CertificateSerialNumber }
    * ```
    * @example
    * // hash algorithm is sha256 by default:
    * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM]});
    * o = new KJUR.asn1.cms.SigningCertificateV2({array: [certPEM],
    *                                             hashAlg: 'sha512'});
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.SigningCertificateV2")
  @js.native
  open class SigningCertificateV2 ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.SigningCertificateV2 {
    def this(params: Array) = this()
    def this(params: ArrayParam[String]) = this()
  }
  
  /**
    * class for CMS SigningTime attribute
    * @param params associative array of parameters
    * @description
    * ```
    * Attribute ::= SEQUENCE {
    *    type               OBJECT IDENTIFIER,
    *    values             AttributeSetValue }
    * AttributeSetValue ::= SET OF ANY
    * SigningTime  ::= Time
    * Time ::= CHOICE {
    *    utcTime UTCTime,
    *    generalTime GeneralizedTime }
    * ```
    * @example
    * o = new KJUR.asn1.cms.SigningTime(); // current time UTCTime by default
    * o = new KJUR.asn1.cms.SigningTime({type: 'gen'}); // current time GeneralizedTime
    * o = new KJUR.asn1.cms.SigningTime({str: '20140517093800Z'}); // specified GeneralizedTime
    * o = new KJUR.asn1.cms.SigningTime({str: '140517093800Z'}); // specified UTCTime
    */
  @JSGlobal("jsrsasign.KJUR.asn1.cms.SigningTime")
  @js.native
  open class SigningTime ()
    extends typingsJapgolly.jsrsasign.mod.KJUR.asn1.cms.SigningTime {
    def this(params: StringParam) = this()
    def this(params: TypeParam) = this()
  }
}
