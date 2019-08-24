package telegram4s.models

import scala.language.implicitConversions

/**
 * ISO 3166-1 alpha-2 country codes.
 */
object CountryCode extends Enumeration {
  type CountryCode = Value

  sealed case class Country(
                             code: String,
                             englishName: String) extends Val(code)

  implicit def valueToCountry(v: Value): Country = v.asInstanceOf[Country]

  val AD = Country(code = "AD", englishName = "Andorra")
  val AE = Country(code = "AE", englishName = "United Arab Emirates")
  val AF = Country(code = "AF", englishName = "Afghanistan")
  val AG = Country(code = "AG", englishName = "Antigua and Barbuda")
  val AI = Country(code = "AI", englishName = "Anguilla")
  val AL = Country(code = "AL", englishName = "Albania")
  val AM = Country(code = "AM", englishName = "Armenia")
  val AN = Country(code = "AN", englishName = "Netherlands Antilles")
  val AO = Country(code = "AO", englishName = "Angola")
  val AQ = Country(code = "AQ", englishName = "Antarctica")
  val AR = Country(code = "AR", englishName = "Argentina")
  val AS = Country(code = "AS", englishName = "American Samoa")
  val AT = Country(code = "AT", englishName = "Austria")
  val AU = Country(code = "AU", englishName = "Australia")
  val AW = Country(code = "AW", englishName = "Aruba")
  val AX = Country(code = "AX", englishName = "Åland Islands")
  val AZ = Country(code = "AZ", englishName = "Azerbaijan")
  val BA = Country(code = "BA", englishName = "Bosnia and Herzegovina")
  val BB = Country(code = "BB", englishName = "Barbados")
  val BD = Country(code = "BD", englishName = "Bangladesh")
  val BE = Country(code = "BE", englishName = "Belgium")
  val BF = Country(code = "BF", englishName = "Burkina Faso")
  val BG = Country(code = "BG", englishName = "Bulgaria")
  val BH = Country(code = "BH", englishName = "Bahrain")
  val BI = Country(code = "BI", englishName = "Burundi")
  val BJ = Country(code = "BJ", englishName = "Benin")
  val BL = Country(code = "BL", englishName = "Saint Barthélemy")
  val BM = Country(code = "BM", englishName = "Bermuda")
  val BN = Country(code = "BN", englishName = "Brunei")
  val BO = Country(code = "BO", englishName = "Bolivia")
  val BQ = Country(code = "BQ", englishName = "Bonaire, Sint Eustatius and Saba")
  val BR = Country(code = "BR", englishName = "Brazil")
  val BS = Country(code = "BS", englishName = "Bahamas")
  val BT = Country(code = "BT", englishName = "Bhutan")
  val BV = Country(code = "BV", englishName = "Bouvet Island")
  val BW = Country(code = "BW", englishName = "Botswana")
  val BY = Country(code = "BY", englishName = "Belarus")
  val BZ = Country(code = "BZ", englishName = "Belize")
  val CA = Country(code = "CA", englishName = "Canada")
  val CC = Country(code = "CC", englishName = "Cocos Islands")
  val CD = Country(code = "CD", englishName = "The Democratic Republic Of Congo")
  val CF = Country(code = "CF", englishName = "Central African Republic")
  val CG = Country(code = "CG", englishName = "Congo")
  val CH = Country(code = "CH", englishName = "Switzerland")
  val CI = Country(code = "CI", englishName = "Côte d'Ivoire")
  val CK = Country(code = "CK", englishName = "Cook Islands")
  val CL = Country(code = "CL", englishName = "Chile")
  val CM = Country(code = "CM", englishName = "Cameroon")
  val CN = Country(code = "CN", englishName = "China")
  val CO = Country(code = "CO", englishName = "Colombia")
  val CR = Country(code = "CR", englishName = "Costa Rica")
  val CU = Country(code = "CU", englishName = "Cuba")
  val CV = Country(code = "CV", englishName = "Cape Verde")
  val CW = Country(code = "CW", englishName = "Curaçao")
  val CX = Country(code = "CX", englishName = "Christmas Island")
  val CY = Country(code = "CY", englishName = "Cyprus")
  val CZ = Country(code = "CZ", englishName = "Czech Republic")
  val DE = Country(code = "DE", englishName = "Germany")
  val DJ = Country(code = "DJ", englishName = "Djibouti")
  val DK = Country(code = "DK", englishName = "Denmark")
  val DM = Country(code = "DM", englishName = "Dominica")
  val DO = Country(code = "DO", englishName = "Dominican Republic")
  val DZ = Country(code = "DZ", englishName = "Algeria")
  val EC = Country(code = "EC", englishName = "Ecuador")
  val EE = Country(code = "EE", englishName = "Estonia")
  val EG = Country(code = "EG", englishName = "Egypt")
  val EH = Country(code = "EH", englishName = "Western Sahara")
  val ER = Country(code = "ER", englishName = "Eritrea")
  val ES = Country(code = "ES", englishName = "Spain")
  val ET = Country(code = "ET", englishName = "Ethiopia")
  val FI = Country(code = "FI", englishName = "Finland")
  val FJ = Country(code = "FJ", englishName = "Fiji")
  val FK = Country(code = "FK", englishName = "Falkland Islands")
  val FM = Country(code = "FM", englishName = "Micronesia")
  val FO = Country(code = "FO", englishName = "Faroe Islands")
  val FR = Country(code = "FR", englishName = "France")
  val GA = Country(code = "GA", englishName = "Gabon")
  val GB = Country(code = "GB", englishName = "United Kingdom")
  val GD = Country(code = "GD", englishName = "Grenada")
  val GE = Country(code = "GE", englishName = "Georgia")
  val GF = Country(code = "GF", englishName = "French Guiana")
  val GG = Country(code = "GG", englishName = "Guernsey")
  val GH = Country(code = "GH", englishName = "Ghana")
  val GI = Country(code = "GI", englishName = "Gibraltar")
  val GL = Country(code = "GL", englishName = "Greenland")
  val GM = Country(code = "GM", englishName = "Gambia")
  val GN = Country(code = "GN", englishName = "Guinea")
  val GP = Country(code = "GP", englishName = "Guadeloupe")
  val GQ = Country(code = "GQ", englishName = "Equatorial Guinea")
  val GR = Country(code = "GR", englishName = "Greece")
  val GS = Country(code = "GS", englishName = "South Georgia And The South Sandwich Islands")
  val GT = Country(code = "GT", englishName = "Guatemala")
  val GU = Country(code = "GU", englishName = "Guam")
  val GW = Country(code = "GW", englishName = "Guinea-Bissau")
  val GY = Country(code = "GY", englishName = "Guyana")
  val HK = Country(code = "HK", englishName = "Hong Kong")
  val HM = Country(code = "HM", englishName = "Heard Island And McDonald Islands")
  val HN = Country(code = "HN", englishName = "Honduras")
  val HR = Country(code = "HR", englishName = "Croatia")
  val HT = Country(code = "HT", englishName = "Haiti")
  val HU = Country(code = "HU", englishName = "Hungary")
  val ID = Country(code = "ID", englishName = "Indonesia")
  val IE = Country(code = "IE", englishName = "Ireland")
  val IL = Country(code = "IL", englishName = "Israel")
  val IM = Country(code = "IM", englishName = "Isle Of Man")
  val IN = Country(code = "IN", englishName = "India")
  val IO = Country(code = "IO", englishName = "British Indian Ocean Territory")
  val IQ = Country(code = "IQ", englishName = "Iraq")
  val IR = Country(code = "IR", englishName = "Iran")
  val IS = Country(code = "IS", englishName = "Iceland")
  val IT = Country(code = "IT", englishName = "Italy")
  val JE = Country(code = "JE", englishName = "Jersey")
  val JM = Country(code = "JM", englishName = "Jamaica")
  val JO = Country(code = "JO", englishName = "Jordan")
  val JP = Country(code = "JP", englishName = "Japan")
  val KE = Country(code = "KE", englishName = "Kenya")
  val KG = Country(code = "KG", englishName = "Kyrgyzstan")
  val KH = Country(code = "KH", englishName = "Cambodia")
  val KI = Country(code = "KI", englishName = "Kiribati")
  val KM = Country(code = "KM", englishName = "Comoros")
  val KN = Country(code = "KN", englishName = "Saint Kitts And Nevis")
  val KP = Country(code = "KP", englishName = "North Korea")
  val KR = Country(code = "KR", englishName = "South Korea")
  val KW = Country(code = "KW", englishName = "Kuwait")
  val KY = Country(code = "KY", englishName = "Cayman Islands")
  val KZ = Country(code = "KZ", englishName = "Kazakhstan")
  val LA = Country(code = "LA", englishName = "Laos")
  val LB = Country(code = "LB", englishName = "Lebanon")
  val LC = Country(code = "LC", englishName = "Saint Lucia")
  val LI = Country(code = "LI", englishName = "Liechtenstein")
  val LK = Country(code = "LK", englishName = "Sri Lanka")
  val LR = Country(code = "LR", englishName = "Liberia")
  val LS = Country(code = "LS", englishName = "Lesotho")
  val LT = Country(code = "LT", englishName = "Lithuania")
  val LU = Country(code = "LU", englishName = "Luxembourg")
  val LV = Country(code = "LV", englishName = "Latvia")
  val LY = Country(code = "LY", englishName = "Libya")
  val MA = Country(code = "MA", englishName = "Morocco")
  val MC = Country(code = "MC", englishName = "Monaco")
  val MD = Country(code = "MD", englishName = "Moldova")
  val ME = Country(code = "ME", englishName = "Montenegro")
  val MF = Country(code = "MF", englishName = "Saint Martin")
  val MG = Country(code = "MG", englishName = "Madagascar")
  val MH = Country(code = "MH", englishName = "Marshall Islands")
  val MK = Country(code = "MK", englishName = "Macedonia")
  val ML = Country(code = "ML", englishName = "Mali")
  val MM = Country(code = "MM", englishName = "Myanmar")
  val MN = Country(code = "MN", englishName = "Mongolia")
  val MO = Country(code = "MO", englishName = "Macao")
  val MP = Country(code = "MP", englishName = "Northern Mariana Islands")
  val MQ = Country(code = "MQ", englishName = "Martinique")
  val MR = Country(code = "MR", englishName = "Mauritania")
  val MS = Country(code = "MS", englishName = "Montserrat")
  val MT = Country(code = "MT", englishName = "Malta")
  val MU = Country(code = "MU", englishName = "Mauritius")
  val MV = Country(code = "MV", englishName = "Maldives")
  val MW = Country(code = "MW", englishName = "Malawi")
  val MX = Country(code = "MX", englishName = "Mexico")
  val MY = Country(code = "MY", englishName = "Malaysia")
  val MZ = Country(code = "MZ", englishName = "Mozambique")
  val NA = Country(code = "NA", englishName = "Namibia")
  val NC = Country(code = "NC", englishName = "New Caledonia")
  val NE = Country(code = "NE", englishName = "Niger")
  val NF = Country(code = "NF", englishName = "Norfolk Island")
  val NG = Country(code = "NG", englishName = "Nigeria")
  val NI = Country(code = "NI", englishName = "Nicaragua")
  val NL = Country(code = "NL", englishName = "Netherlands")
  val NO = Country(code = "NO", englishName = "Norway")
  val NP = Country(code = "NP", englishName = "Nepal")
  val NR = Country(code = "NR", englishName = "Nauru")
  val NU = Country(code = "NU", englishName = "Niue")
  val NZ = Country(code = "NZ", englishName = "New Zealand")
  val OM = Country(code = "OM", englishName = "Oman")
  val PA = Country(code = "PA", englishName = "Panama")
  val PE = Country(code = "PE", englishName = "Peru")
  val PF = Country(code = "PF", englishName = "French Polynesia")
  val PG = Country(code = "PG", englishName = "Papua New Guinea")
  val PH = Country(code = "PH", englishName = "Philippines")
  val PK = Country(code = "PK", englishName = "Pakistan")
  val PL = Country(code = "PL", englishName = "Poland")
  val PM = Country(code = "PM", englishName = "Saint Pierre And Miquelon")
  val PN = Country(code = "PN", englishName = "Pitcairn")
  val PR = Country(code = "PR", englishName = "Puerto Rico")
  val PS = Country(code = "PS", englishName = "Palestine")
  val PT = Country(code = "PT", englishName = "Portugal")
  val PW = Country(code = "PW", englishName = "Palau")
  val PY = Country(code = "PY", englishName = "Paraguay")
  val QA = Country(code = "QA", englishName = "Qatar")
  val RE = Country(code = "RE", englishName = "Reunion")
  val RO = Country(code = "RO", englishName = "Romania")
  val RS = Country(code = "RS", englishName = "Serbia")
  val RU = Country(code = "RU", englishName = "Russia")
  val RW = Country(code = "RW", englishName = "Rwanda")
  val SA = Country(code = "SA", englishName = "Saudi Arabia")
  val SB = Country(code = "SB", englishName = "Solomon Islands")
  val SC = Country(code = "SC", englishName = "Seychelles")
  val SD = Country(code = "SD", englishName = "Sudan")
  val SE = Country(code = "SE", englishName = "Sweden")
  val SG = Country(code = "SG", englishName = "Singapore")
  val SH = Country(code = "SH", englishName = "Saint Helena")
  val SI = Country(code = "SI", englishName = "Slovenia")
  val SJ = Country(code = "SJ", englishName = "Svalbard And Jan Mayen")
  val SK = Country(code = "SK", englishName = "Slovakia")
  val SL = Country(code = "SL", englishName = "Sierra Leone")
  val SM = Country(code = "SM", englishName = "San Marino")
  val SN = Country(code = "SN", englishName = "Senegal")
  val SO = Country(code = "SO", englishName = "Somalia")
  val SR = Country(code = "SR", englishName = "Suriname")
  val SS = Country(code = "SS", englishName = "South Sudan")
  val ST = Country(code = "ST", englishName = "Sao Tome And Principe")
  val SV = Country(code = "SV", englishName = "El Salvador")
  val SX = Country(code = "SX", englishName = "Sint Maarten (Dutch part)")
  val SY = Country(code = "SY", englishName = "Syria")
  val SZ = Country(code = "SZ", englishName = "Swaziland")
  val TC = Country(code = "TC", englishName = "Turks And Caicos Islands")
  val TD = Country(code = "TD", englishName = "Chad")
  val TF = Country(code = "TF", englishName = "French Southern Territories")
  val TG = Country(code = "TG", englishName = "Togo")
  val TH = Country(code = "TH", englishName = "Thailand")
  val TJ = Country(code = "TJ", englishName = "Tajikistan")
  val TK = Country(code = "TK", englishName = "Tokelau")
  val TL = Country(code = "TL", englishName = "Timor-Leste")
  val TM = Country(code = "TM", englishName = "Turkmenistan")
  val TN = Country(code = "TN", englishName = "Tunisia")
  val TO = Country(code = "TO", englishName = "Tonga")
  val TR = Country(code = "TR", englishName = "Turkey")
  val TT = Country(code = "TT", englishName = "Trinidad and Tobago")
  val TV = Country(code = "TV", englishName = "Tuvalu")
  val TW = Country(code = "TW", englishName = "Taiwan")
  val TZ = Country(code = "TZ", englishName = "Tanzania")
  val UA = Country(code = "UA", englishName = "Ukraine")
  val UG = Country(code = "UG", englishName = "Uganda")
  val UM = Country(code = "UM", englishName = "United States Minor Outlying Islands")
  val US = Country(code = "US", englishName = "United States")
  val UY = Country(code = "UY", englishName = "Uruguay")
  val UZ = Country(code = "UZ", englishName = "Uzbekistan")
  val VA = Country(code = "VA", englishName = "Vatican")
  val VC = Country(code = "VC", englishName = "Saint Vincent And The Grenadines")
  val VE = Country(code = "VE", englishName = "Venezuela")
  val VG = Country(code = "VG", englishName = "British Virgin Islands")
  val VI = Country(code = "VI", englishName = "U.S. Virgin Islands")
  val VN = Country(code = "VN", englishName = "Vietnam")
  val VU = Country(code = "VU", englishName = "Vanuatu")
  val WF = Country(code = "WF", englishName = "Wallis And Futuna")
  val WS = Country(code = "WS", englishName = "Samoa")
  val YE = Country(code = "YE", englishName = "Yemen")
  val YT = Country(code = "YT", englishName = "Mayotte")
  val ZA = Country(code = "ZA", englishName = "South Africa")
  val ZM = Country(code = "ZM", englishName = "Zambia")
  val ZW = Country(code = "ZW", englishName = "Zimbabwe")
}
