<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_8                                      _82dcf9</name>
   <tag></tag>
   <elementGuidId>92cfca09-580a-4977-b622-81f26db2adcc</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>div.account-info.zh-HK</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='content-wrapper']/div[2]/div[3]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>div</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>account-info zh-HK</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
        您的普通客戶帳戶
        您的優惠顧客帳戶
    

    
        
    

    
            第二步：  建立您的帳號並開始啟動
    

    
        




    
        
            

            
            
                
                    
                        用戶名（輸入您的電子郵件地址或8位數的手提號碼）*
                    
                
                
                
            
            
                
                    
                        
                            密碼*
                        
                    
                    
                    
                
                 
                
                    
                        
                            確認密碼*
                        
                    
                    
                    
                
            
            

            
            
                
                    
                        
                            名字*
                        
                    
                    
                    
                
            
            
                
                    
                        
                            中文全名 (與身份證上的姓名相同)*
                        
                    
                    
                    
                
            
            
                
                    
                        
                            英文全名(與身份證上的姓名相同)*
                        
                    
                    
                    
                
            
            
                
                    
                        
                            
                                身份證號碼 *
                            
                        
                        
                        
                    
                
                
                    
                        國籍*
                        
                            
                                
                                    本國籍
                                    澳門籍
                                
                                
                                
                            
                        
                        
                    
                
            

            
            
                
                    
                        出生日期*
                        
                            日
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31

                        
                        
                            月
一月
二月
三月
四月
五月
六月
七月
八月
九月
十月
十一月
十二月

                        

                        
                            年
2003
2002
2001
2000
1999
1998
1997
1996
1995
1994
1993
1992
1991
1990
1989
1988
1987
1986
1985
1984
1983
1982
1981
1980
1979
1978
1977
1976
1975
1974
1973
1972
1971
1970
1969
1968
1967
1966
1965
1964
1963
1962
1961
1960
1959
1958
1957
1956
1955
1954
1953
1952
1951
1950
1949
1948
1947
1946
1945
1944
1943
1942
1941
1940
1939
1938
1937
1936
1935
1934
1933
1932
1931
1930
1929
1928
1927
1926
1925
1924
1923
1922
1921
1920
1919
1918
1917
1916
1915
1914
1913
1912
1911
1910
1909
1908
1907
1906
1905
1904
1903

                        
                        
                    
                
            

            
            
                
                    
                        
                            電郵地址*
                        
                    
                    
                    
                
            

            
                
                    
                        
                            
                                電話*
                            
                        
                        手機
家居電話
公司電話

                        
                    
                    
                        
                            
                                電話號碼*
                            
                        
                        
                        
                        
                    
                
            
            
        
    



    $(document).ready(function () {
        var $lastNameCtrl = $(&quot;#LastName&quot;);
        var lastName = $lastNameCtrl.val() || '';
        $(&quot;#FirstName&quot;).val(lastName);
        $lastNameCtrl.trigger('change');

    });


    AccountInformation.prototype.PrepareViewAfterCustomerInformation = function () {
        $(&quot;#PostalCode&quot;).focus();
    };

    var OverrideFormattedPhoneNumberInContentPage = function (phoneNumber, phoneTypeCtrl) {
        var $phoneInput = $('#' + phoneNumber);
        var $phoneTypeInput = $('#' + phoneTypeCtrl);
        var phoneNumber = $phoneInput.val();
        var phoneType = $phoneTypeInput.val();

        if (phoneType === 'MobilePhone' &amp;&amp; (phoneNumber.length === 11)) {
            var formattedPhoneNumber = phoneNumber.replace(/^(\d{3})(\d{4})(\d{4})$/g, '$1 $2 $3');

            $phoneInput.val(formattedPhoneNumber);
        }
    }

    $(&quot;#LastName&quot;).on('change', function () {
        $(&quot;#FirstName&quot;).val($(this).val());
        var lastName = $(this).val();
        $(&quot;#FirstName&quot;).val(lastName);
        var url = &quot;/AccountInformation/TranslateCustomerEnglishName&quot;;
        $.ajax({
            url: url,
            cache: true,
            type: &quot;POST&quot;,
            dataType: &quot;json&quot;,
            data: {
                name: lastName
            }
        })
        .success(function (response, status, jqXhr) {
            if (response) {
                $(&quot;#EnglishName&quot;).val(response);
            }
        })
        .error(function (jqXhr, status, error) {

        });
    });

        
            繼續
            我們無法儲存您的資料, 請再試一次
            * 表示必填欄位
        

        
            
                var customerMembershipFeePrice = 'HK$10.0';
                var regularMembershipFeePrice = 'HK$250.0';
                var promotionStartDate = '9/1/2021 12:00:00 AM';
                var promotionEndDate = '9/30/2021 11:59:59 PM';
                var customerFirstName = 'hk918211';
                var customerLastName = 'hk918211';
            

            
                
    
        會籍 費用
    
    
        在本月份，您的入會費只需HK$HK$10.0！
    
    
        你的會籍費用(HK$250)讓你獲得優惠顧客權益
    



    var price;

    $(document).ready(function() {
        if(regularMembershipFeePrice != customerMembershipFeePrice)
        {
            // Customer is getting a promotional price
            price = customerMembershipFeePrice;
            // Add strike through here
            $('.promo-container').addClass('is-active');
            $('.js-price').addClass('strike');
            $('#special-price').html(price);
        }
        else
        {
            // Customer is paying the regular price
            price = regularMembershipFeePrice;
            $(&quot;.js-price&quot;).html(price);
        }

        // When City is Macau, then the suburb select option become empty
        $('#CityCtrl').change(function (e) {
            if(e.target.value === '853') {
                $('#Region').change(function(e) {
                    if(e.target.value === '氹仔' || e.target.value === '澳門半島' || e.target.value === '路環') {
                        $('#SuburbName').val('');
                    }
                });
            }
        });
    });

            

            
                 通訊地址及付款資訊
            

            
    

    .address-delivery {
        padding-top: 10px;
    }

    .address-state {
        margin: 0%;
        width: 45%;
        float: right;
    }

    .address-zip {
        width: 50%;
    }

    .address-city {
        width: 100%;
    }

    .address-city, .address-Suburb, .address-1 {
        margin: 8px 0;
    }

    .gray-default-option {
        color: #bbb;
    }



        
            
                
                
                    
                        城市*
                        
                            
                                選擇香港澳門
                                
                                
                            
                        
                        
                    
                
                
                
                
                    
                        地區*
                        
                            
                                選擇新界北香港九龍東九龍西新界西離島新界東偏遠地區
                                
                                
                            
                        
                        
                    
                
            
            
                
                    分區*
                    
                        
                            選擇上環中環北角半山堅尼地城壽臣山大坑大潭天后太古寶馬山小西灣山頂杏花邨柴灣深水灣淺水灣渣甸山灣仔炮台山石塘咀石澳筲箕灣舂坎角薄扶林西灣河西營盤西環赤柱跑馬地金鐘銅鑼灣香港仔鰂魚涌鴨脷洲黃竹坑
                            
                            
                        
                    
                    
                
            
            
            
            
                請以中文填寫通訊地址屋苑/屋村/樓宇名稱/街號及街道名稱
                
            
            
            
            
                單位/樓層/座數 (例子：03室,11樓,2座)
                
            
            
            
            
                
                    送貨說明
                    
                
            
        




    var addressJson = '';
    var ZipCodeEnum = {
        &quot;HongKong&quot;: { &quot;zipCode&quot;: 852, &quot;stateName&quot;: &quot;香港&quot;, &quot;stateId&quot;: 104 },
        &quot;Macao&quot;: { &quot;zipCode&quot;: 853, &quot;stateName&quot;: &quot;澳門&quot;, &quot;stateId&quot;: 152 }
    };

     var $Suburb = $(&quot;.Suburb-type-wrapper&quot;);

    $(document).ready(function () {
        defaultModel();
        initialRegionAndSuburb();

        $(&quot;#Region&quot;).on('change', function () {
            var city = $(&quot;#CityCtrl&quot;).val();
            var ctrlId = $(this).attr('id');
            var region = $(&quot;#Region&quot;).val() || '';
            var suburb = $(&quot;#SuburbName&quot;).val() || '';
            $(&quot;#CityName&quot;).val($.format(&quot;{0}&quot;, region));
            initSuburbList();

            if ($(this).val() === '選擇') {
                $(this).css('color', '#bbb')
            } else {
                $(this).css('color', 'rgb(51, 51, 51)')
            }

        });

        $(&quot;#CityCtrl&quot;).on('change', function () {
            var city = $(this).val();
            var region = $(&quot;#Region&quot;).val();
            var $zipCode = $(&quot;#PostalCode&quot;);
            var $state = $(&quot;#StateName&quot;);
            var $stateId = $(&quot;#StateId&quot;);
            
            var isSuburbExisted = $Suburb.attr('data-required');

            if (city == ZipCodeEnum.HongKong.zipCode) {
                $zipCode.val(ZipCodeEnum.HongKong.zipCode);
                $state.val(ZipCodeEnum.HongKong.stateName);
                $stateId.val(ZipCodeEnum.HongKong.stateId);
                if (!isSuburbExisted) {
                    $Suburb.attr(&quot;data-required&quot;, &quot;required&quot;);
                }
            }
            else {
                $zipCode.val(ZipCodeEnum.Macao.zipCode);
                $state.val(ZipCodeEnum.Macao.stateName);
                $stateId.val(ZipCodeEnum.Macao.stateId);
                if (isSuburbExisted) {
                    $Suburb.removeAttr(&quot;data-required&quot;);
                }
            }
            initialRegionAndSuburb();

            if ($(this).val() === '選擇') {
                $(this).css('color', '#bbb')
            } else {
                $(this).css('color', 'rgb(51, 51, 51)')
            }

        });

        $(&quot;#SuburbName&quot;).on('change', function () {
            if ($(this).val() === '選擇') {
                $(this).css('color', '#bbb')
            } else {
                $(this).css('color', 'rgb(51, 51, 51)')
            }
        });
    });

    var defaultModel = function () {
        var $zipCode = $(&quot;#PostalCode&quot;);
        var $state = $(&quot;#StateName&quot;);
        var $stateId = $(&quot;#StateId&quot;);
        initCityList();
        if ($zipCode.val()) {
            $(&quot;#CityCtrl&quot;).val($zipCode.val());
        }
        if (parseInt($stateId.val()) === NaN || parseInt($stateId.val()) === 0) {
            $zipCode.val(ZipCodeEnum.HongKong.zipCode);
            $state.val(ZipCodeEnum.HongKong.stateName);
            $stateId.val(ZipCodeEnum.HongKong.stateId);
        }
    }

    var initialRegionAndSuburb = function () {
        var zipCode = $(&quot;#PostalCode&quot;).val() || ZipCodeEnum.HongKong.zipCode;
        $.ajax({
            url: pageUrls.SearchForAddressData,
            cache: true,
            type: &quot;GET&quot;,
            data: {
                searchString: zipCode
            }
        })
            .success(function (response, status, jqXhr) {
                if (response &amp;&amp; response.length > 0) {
                    var $city = $(&quot;#CityCtrl&quot;);
                    addressJson = response;
                    initRegionList();
                    initSuburbList();
                    $(&quot;#Region&quot;).trigger('change');
                }
            })
            .error(function (jqXhr, status, error) {

            });
    }

    var initCityList = function () {
        var regionsOptionsHtml = '';
        regionsOptionsHtml += $.format('&lt;option value=&quot;&quot;>{0}&lt;/option>', '選擇');
        regionsOptionsHtml += $.format('&lt;option value=&quot;{1}&quot;>{0}&lt;/option>', ZipCodeEnum.HongKong.stateName, ZipCodeEnum.HongKong.zipCode);
        regionsOptionsHtml += $.format('&lt;option value=&quot;{1}&quot;>{0}&lt;/option>', ZipCodeEnum.Macao.stateName, ZipCodeEnum.Macao.zipCode);
        $(&quot;#CityCtrl&quot;).html(regionsOptionsHtml);
    }

    var initRegionList = function () {
        var regionsOptionsHtml = '';
        var cityList = _.map(addressJson, function (addressData) {
            return {
                CityName: addressData.CityName
            };
        });

        cityList = _.uniq(cityList, function (city) {
            return city.CityName;
        });

        if (cityList) {
            regionsOptionsHtml += $.format('&lt;option value=&quot;&quot;>{0}&lt;/option>', '選擇');
            _.each(cityList, function (region) {
                regionsOptionsHtml += $.format('&lt;option value=&quot;{1}&quot;>{0}&lt;/option>', region.CityName, region.CityName);
            });
            $(&quot;#Region&quot;).html(regionsOptionsHtml);
        }
    }

    var initSuburbList = function () {
        var region = $(&quot;#Region&quot;).val();
        var regionsOptionsHtml = '';

        var suburbList = _.filter(addressJson, function (addressData) {
            return addressData.CityName == region;
        });

        var validSuburbList = _.map(suburbList, function (addressData) {
            return {
                SuburbName: addressData.SuburbName
            };
        });

        validSuburbList = _.uniq(validSuburbList, function (suburb) {
            return suburb.SuburbName;
        });

        if (validSuburbList) {
            regionsOptionsHtml += $.format('&lt;option value=&quot;&quot;>{0}&lt;/option>', '選擇');
            _.each(validSuburbList, function (suburb) {
                regionsOptionsHtml += $.format('&lt;option value=&quot;{1}&quot;>{0}&lt;/option>', suburb.SuburbName, suburb.SuburbName);
            });
            $(&quot;#SuburbName&quot;).html(regionsOptionsHtml);
        }
        $Suburb.removeClass(&quot;invalid&quot;);
    }



            
                

    
        
            信用卡
        

    

    
        付款方式必須為申請者本人的信用卡。以下所授權之信用卡資料將用作您的預備訂單、預存訂單、續約訂單(例：國際推薦續約)、傳真訂單及電話訂單扣款用。為保障你的優惠顧客權益我們將會在未滿足當月產品的月份，從已登記的信用卡扣除已設定金額。詳情請細閱表格背後的條文。
        



    
        
            
                姓名(與信用卡一致)*
                
                
            

            
                
                    信用卡號碼*
                    
                    
                    
                    
                    
                
            

            
                    
                        有效日期*
                        月
01
02
03
04
05
06
07
08
09
10
11
12

                        
                    
                    
                        有效日期
                        年
2021
2022
2023
2024
2025
2026
2027
2028
2029
2030
2031
2032
2033
2034
2035
2036
2037
2038
2039
2040

                        
                    
            
        
    



    var paytypeRegexes;
    var isAmericanExpress;
    var isCvvFeatureOn = false;
    var shouldDisplayCvvForWorldPay = true;

    $(document).ready(function () {
        
        paytypeRegexes = {
Visa:/^4[0-9]{12,15}$/, Mastercard:/^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)[0-9]{12}$/        };

        UpdateCvv();
    });

    var UpdateCvv = function () {
        if(!isCvvFeatureOn || !shouldDisplayCvvForWorldPay) {
            return;
        }

        DetermineCardType();
        UpdateCvvIcon();
    }

    var DetermineCardType = function () {
        var userInput = $('#PaymethodViewModel_CreditCardViewModel_AccountNumber').val();
        var americanExpressType = &quot;AmericanExpress&quot;;
        var isUserInputDefined = userInput !== null &amp;&amp; userInput !== undefined &amp;&amp; userInput.length > 0;
        isAmericanExpress = false;

        if (isUserInputDefined) {
            $.each(paytypeRegexes, function (index, value) {
                if(value.exec(userInput) &amp;&amp; index === americanExpressType) {
                    isAmericanExpress = true;
                    return false;
                }
            });
        }
    }

    //Changes which CVV Icon is currently visible based on what kind of credit card is being entered in by the user. Defaults to the standard, 3 digit CVV icon.
    //Also changes the length of the CVV input text box
    var UpdateCvvIcon = function () {
        var $cvvIconThreeDigitBack = $('#cvvIconThreeDigitBack');
        var $cvvIconFourDigitFront = $('#cvvIconFourDigitFront');

        if (isAmericanExpress) {
            $cvvIconThreeDigitBack.hide();
            $cvvIconFourDigitFront.show();
            if ($('.cvv').attr(&quot;maxlength&quot;) !== &quot;4&quot;) {
                $('.cvv').attr(&quot;maxlength&quot;, &quot;4&quot;);
                $('.cvv').val('');
            }
        }
        else {
            $cvvIconThreeDigitBack.show();
            $cvvIconFourDigitFront.hide();
            if ($('.cvv').attr(&quot;maxlength&quot;) !== &quot;3&quot;) {
                $('.cvv').attr(&quot;maxlength&quot;, &quot;3&quot;);
                $('.cvv').val('');
            }
        }
    }

    var IsCvvInputValid = function () {
        if (!isCvvFeatureOn || !shouldDisplayCvvForWorldPay) {      // For countries doesn't have CVV feature on, don't validate
            return true;
        }
        var cvvDigits = $('#PaymethodViewModel_CreditCardViewModel_Cvv').val().length;
        return ((isAmericanExpress &amp;&amp; cvvDigits === 4) || (!isAmericanExpress &amp;&amp; cvvDigits === 3));
    }

    

    
        

            
                
                    無效信用卡
                
                
                    添加的信用卡無法保存。
                
                信用卡無效。請添加新的付款方式。

                OK
            

            
                
                    Invalid Electronic Checking Account
                
                The account information provided could not be validated.  Please re-enter the information, enter new information or provide an alternate method of payment.  For further information please contact your financial institution or Giact at 866-918-2409.

                OK
            

        
    

            
            
            
            
                * 表示必填欄位

                
                    
                         
                    

                    
                        
    /* Style the required text */
    .notifyCategory.invalid {
        position: relative;
        overflow: unset !important;
    }

    #termsContainer {
        position: relative;
    }

    #err-msg-chkAgreeToTerms {
        position: absolute;
        left: 0;
        margin-top: 35px;
    }

    #err-msg-OptInToTextMessaging {
        position: absolute;
        left: -20px;
        top: -55px;
    }



    $(document).ready(function(){
        $(&quot;#isOptedInForTextMessages&quot;).val('True');
        $(&quot;#isOptedInForEmail&quot;).val('False');

        if ($('#categoryContainer .c2')[0] &amp;&amp; $('#categoryContainer .c2')[1]) {
            $('#categoryContainer .c2')[0].textContent = '手機訊息 SMS';
            $('#categoryContainer .c2')[1].textContent = '電子郵件 Email';
        }
    });

                    
                

                
    
    
    我授權美商亞洲美樂家有限公司使用我以上提供的我的姓名、電子郵件、手機號碼和其他相關聯繫資料，通過電子郵件和或手機短信，發送產品和服務信息，包括滿意度調查、活動、優惠和促銷活動資訊給我。


    
    
        
            手機訊息 SMS
        
        
            電子郵件 Email
        
        
    





    $(&quot;#EmailCheckBoxContainer&quot;).on('click', function (event) {
        event.preventDefault();
        var currentMasterAgreement = $(&quot;#chkAgreeToTextMessaging&quot;).is(&quot;:checked&quot;);
        if (currentMasterAgreement) {
            var currentSelection = $(&quot;#OptInToEmail&quot;).is(&quot;:checked&quot;) == true;
            $(&quot;#OptInToEmail&quot;).attr(&quot;checked&quot;, !currentSelection);
            $(&quot;#OptInToTextMessaging&quot;).attr(&quot;checked&quot;, currentSelection);
            SetupPreference();
        }
    });
    $(&quot;#OptInToEmail&quot;).on('click', function (event) {        
        event.preventDefault();
        var currentMasterAgreement = $(&quot;#chkAgreeToTextMessaging&quot;).is(&quot;:checked&quot;);
        if (currentMasterAgreement) {
            var currentSelection = $(this).is(&quot;:checked&quot;) == true;
            $(this).attr(&quot;checked&quot;, !currentSelection);    
            $(&quot;#OptInToTextMessaging&quot;).attr(&quot;checked&quot;, currentSelection);                     
            SetupPreference();
        }
    });

    $(&quot;#SmsCheckBoxContainer&quot;).on('click', function (event) {
        event.preventDefault();
        var currentMasterAgreement = $(&quot;#chkAgreeToTextMessaging&quot;).is(&quot;:checked&quot;);
        if (currentMasterAgreement) {
            var currentSelection = $(&quot;#OptInToTextMessaging&quot;).is(&quot;:checked&quot;) == true;
            $(&quot;#OptInToTextMessaging&quot;).attr(&quot;checked&quot;, !currentSelection);
            $(&quot;#OptInToEmail&quot;).attr(&quot;checked&quot;, currentSelection);
            SetupPreference();
        }
    });    
    $(&quot;#OptInToTextMessaging&quot;).on('click', function (event) {
        event.preventDefault();
        var currentMasterAgreement = $(&quot;#chkAgreeToTextMessaging&quot;).is(&quot;:checked&quot;);
        if (currentMasterAgreement) {
            var currentSelection = $(this).is(&quot;:checked&quot;) == true;
            $(this).attr(&quot;checked&quot;, !currentSelection);
            $(&quot;#OptInToEmail&quot;).attr(&quot;checked&quot;, currentSelection);
           SetupPreference();
        }
    });

    $(&quot;#chkAgreeToTextMessaging&quot;).on('click', function (event) {
        var $agreeSendingInfromation = $(this);
        var isChecked = $agreeSendingInfromation.is(&quot;:checked&quot;);

        var $SmsHiddenField = $('#isOptedInForTextMessages');
        var $EmailHiddenField = $('#isOptedInForEmail');
        var $SmsCheckBox = $('#OptInToTextMessaging');
        var $EmailCheckBox = $('#OptInToEmail');

        if (isChecked == false) {
            //Uncheck both boxes and set hidden value to false
            $SmsHiddenField.val(&quot;False&quot;);
            $EmailHiddenField.val(&quot;False&quot;);
            $SmsCheckBox.attr(&quot;checked&quot;, false);
            $EmailCheckBox.attr(&quot;checked&quot;, false);
        }
        else {
            // Default to SMS
            $SmsHiddenField.val(&quot;True&quot;);            
            $SmsCheckBox.attr(&quot;checked&quot;, true);            
        }        
    });
    
    var SetupPreference = function () {
        var IsSmsChecked = $(&quot;#OptInToTextMessaging&quot;).is(&quot;:checked&quot;);
        var IsEmailChecked = $(&quot;#OptInToEmail&quot;).is(&quot;:checked&quot;);
        var $SmsHiddenField = $('#isOptedInForTextMessages');
        var $EmailHiddenField = $('#isOptedInForEmail');
        var isMasterAgreementChecked = $(&quot;#chkAgreeToTextMessaging&quot;).is(&quot;:checked&quot;);

        if (isMasterAgreementChecked &amp;&amp; IsSmsChecked) {
            $SmsHiddenField.val(&quot;True&quot;);
        }
        else {
            $SmsHiddenField.val(&quot;False&quot;);
        }

        if (isMasterAgreementChecked &amp;&amp; IsEmailChecked) {
            $EmailHiddenField.val(&quot;True&quot;);
        }
        else {
            $EmailHiddenField.val(&quot;False&quot;);
        }
    };



                
    
    我同意並確認我已閱讀 會員顧客協議書 中列出的所有條文聲明。*
    


                
                    繼續
                
                
                    Please complete all the required fields.
                    You must consent to all the Customer Agreements to continue.
                    我們無法儲存您的資料, 請再試一次
                    
                
            
        
    

    

</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;content-wrapper&quot;)/div[@class=&quot;main-container desktop zh-HK&quot;]/div[@class=&quot;account-info zh-HK&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='content-wrapper']/div[2]/div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='港島一號'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='有疑問?'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[3]</value>
   </webElementXpaths>
</WebElementEntity>
