<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>body_iframe srchttpswww.googletagmanager.co</name>
   <tag></tag>
   <elementGuidId>8c35ee4f-2ea2-435d-a66c-a0629991c267</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>//body</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value>body.desktopBody</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>body</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>desktopBody</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>

    
&lt;iframe src=&quot;https://www.googletagmanager.com/ns.html?id=GTM-KTXVXPV&quot;
height=&quot;0&quot; width=&quot;0&quot; style=&quot;display:none;visibility:hidden&quot;>&lt;/iframe>

    
    
        
            
  .site-header {
    position: relative;
    color: #fff;
    padding: 17px 0px;
  }

  .site-header .header-logo {
    position: absolute;
    top: 3px;
    left: 10px;
  }

  .site-header a.header-link,
  .site-header a.header-link:hover {
    float: right;
    color: #fff;
    text-decoration: none;
    padding: 0 10px;
    border-color: #fff;
    border-left: solid 2px rgba(255, 255, 255, 0.3);
  }

  .site-header a.header-link:first-child,
  .site-header a.header-link:first-child:hover {
    padding-right: 0;
  }

  .site-header h2 {
    color: #fff;
  }

  .site-header .site-header-text {
    text-align: right;
  }

  .error-container {
    margin-right: 130px;
  }

  /* The backup order option in the progress bar  */
  .title.backuporder {
    left: -170%;
  }

  .backuporder {
    left: -170%;
  }

  .infoWrapper {
    word-wrap: break-word;
  }

  /* form format */
  .passwordContainer {
    overflow: hidden;
  }

  .desktop .imea #addressForm .customerDataRow:nth-child(1) {
    display: flex;
  }

  .personalInfo .imea-split.left {
    width: 50%;
  }

  #AddressResult .infoWrapper {
    padding-top: 0;
  }



  
  
    立即成為美樂家會員顧客！
  



  $(function () {
    var lazyLayout = _.debounce(setForeignerHold, 1000);
    $('#GovernmentId').on('input', lazyLayout);
  });

  function setForeignerHold() {
    var governmentIdValue = $('#GovernmentId').val();
    var isForeignerHold = /^[w]/i.test(governmentIdValue) ? 'true' : 'false';

    sessionStorage.setItem('isForeignerHold', isForeignerHold);
  }

        

        
            







   
    
        
            
                如您有問題
                
            
        
        
            
    /* style culture dropdown list */
    .desktopBody .culture-popup-body {
        right: 360px;
    }



    
    
    
    
        
            有疑問?
        
      
    
        
            我們在這裡提供協助！請致電聯繫美樂家顧客服務部(852)2577 5266
            或聯繫您的推薦人港島一號，電話號碼091100011。
        
      



    $(function () {
        // Format number number
        $('#enrollerPhone').text($('#enrollerPhone').text().replace(/\-/g, '').replace(/(\d{3})(\d{4})(\d{4})/, '$1-$2-$3'));
    });

        
    



    function helpPopup() {
        Popup.displayGeneralMessagePopup($(&quot;#HelpPopup&quot;,0).html());
    }



    
        獨立事業代表協議 
    

    
        獲取佣金和獎金
    

    

    
        
            
                
                    身份證號碼 
                    C74xxxx
                
            
        

        
            何種類別最符合您成為美樂家事業代表的目標?*
            
                
                    我不打算推​​薦很多客戶或建立業務，但如果我推薦客戶，我想賺取佣金。
                
                
                    賺取額外收入
                
                
                    賺取可觀的收入
                
                
            
            
        
        
    


    $(document).ready(function () {
        $(&quot;.participationLevels&quot;)[0].addEventListener(&quot;keydown&quot;,
            function (e) {
                if (e.key === ' ' || e.key === &quot;Enter&quot;) {
                    e.preventDefault();
                    $(this).find(&quot;div:focus input&quot;)[0].click();
                }
            });

        $('.bankList').select2({
                theme: &quot;classic&quot;,
                placeholder: localizations.BankSelectionMessage,
                width: '100%',
                language: {
                        noResults: function () {
                            return localizations.BankSearchNotFoundMessage;
                        }
                    },
                containerCss: { 'height': '40px' },
                dropdownCss: { 'line-height': '40px' }
            });
    });



    



    
        
            
                銀行資料 (佣金入帳用)
            

            
                帳戶持有人姓名*
                
                
            

            
                銀行名稱*
                
003 渣打銀行（香港）有限公司Standard Chartered Bank（Hong Kong）Ltd
004 香港上海滙豐銀行有限公司The Hongkong and Shanghai Banking Corporation Ltd
005 東方匯理银行Credit Agricole Corporate and Investment Bank
006 花旗銀行有限公司Citibank National Association
007 摩根大通銀行JP Morgan Chase Bank, N.A.
008 蘇格蘭皇家銀行The Royal Bank of Scotland plc
009 中國建設銀行（亞洲）股份有限公司China Construction Bank（Asia）Corp. Ltd
011 渣打銀行(前 美國運通銀行)American Express Bank
012 中國銀行（香港）有限公司Bank of China（Hong Kong）Ltd
014 中國銀行(前鹽業銀行)Previously as &quot;Yien Yieh Commerical Bank&quot;
015 東亞銀行有限公司The Bank of East Asia Ltd
016 星展銀行（香港）有限公司DBS Bank (Hong Kong) Ltd
017 東亞銀行(前 第一太平銀行)First Pacific Bank Ltd
018 中信銀行國際有限公司China CITIC Bank International Ltd
019 中國銀行(前廣東省銀行)Previously as &quot;The Kwangtung Provincial Bank&quot;
020 招商永隆銀行有限公司CMB Wing Lung Bank Ltd
021 大新銀行(前 永安銀行/豐明銀行)Wing On Bank Ltd / Mevas Bank
022 華僑銀行有限公司OCBC BANK Ltd
024 恒生銀行有限公司Hang Seng Bank Ltd
025 上海商業銀行有限公司Shanghai Commercial Bank
026 中國銀行(前中南銀行Previously as &quot;The China &amp; South Sea Bank&quot;
027 交通銀行（香港）有限公司Previously as Bank of Communications Co., Ltd., HK Branch
028 大眾銀行（香港）有限公司Public Bank（Hong Kong）Ltd
029 工銀亞洲(前 華比銀行)Belgian Bank
030 中國銀行(前金城銀行)Previously as &quot;Kinchueng Banking Corporation&quot;
031 中國銀行(前新華銀行)Previously as &quot;Sin Hua Bank&quot;
032 星展銀行(前 DBS廣安銀行)DBS Kwong On Bank
033 中國銀行(前國華商業銀行)Previously as &quot;The China State Bank&quot;
034 星展銀行(前 恒隆銀行)Hang Lung Bank
035 華僑永亨銀行有限公司OCBC Wing Hang Bank Ltd
036 中國銀行(前浙江興業銀行)Previously as &quot;The National Commercial Bank&quot;
038 大有銀行有限公司Tai Yau Bank Ltd
039 集友銀行有限公司Chiyu Banking Corporation Ltd
040 大新銀行有限公司Dah Sing Bank Ltd
041 創興銀行有限公司Chong Hing Bank
042 東亞銀行(前 中國聯合銀行)United Chinses Bank Ltd
043 南洋商業銀行有限公司Nanyang Commercial Bank
044 永亨銀行(前 浙江第一銀行)Chekiang First Bank Ltd
045 合 眾 銀 行UCO Bank
051 中信銀行（國際）(前 華人銀行)Hong Kong Chinese Bank
052 星展銀行(前 海外信託銀行)Overseas Trust Bank Ltd
055 美國銀行Bank of America
056 法國巴黎銀行BNP PARIS
057 大華銀行(前 華聯銀行)Overseas United Bank
059 東亞銀行(前 遠東銀行)Far East Bank Ltd
060 巴 基 斯 坦 銀 行National Bank of Pakistan
061 大生銀行有限公司Tai Sang Bank
063 馬來亞銀行Malayan Banking Berhad (Maybank)
064 中國銀行(前華僑商業銀行)Previously as &quot;Hua Chiao Commercial Bank&quot;
065 三井住友銀行Sumitomo Mitsui Banking Corporation
066 印尼國家銀行PT. Bank Negara Indonesia (Persero), Tbk.
067 BDO Unibank, Inc.
070 中國銀行(前寶生銀行)Previously as &quot;Po Sang Bank&quot;
071 大華銀行United Overseas Bank
072 中國工商銀行（亞洲）有限公司Industrial and Commercial Bank of China (Asia)
073 中國建設銀行（亞洲）(前建新銀行)Previously as &quot;Jian Sing Bank&quot;
074 巴克萊銀行Barclays Bank PLC
075 Manufacturers Hanover Trust Company
076 加拿大豐業銀行Bank of Nova Scotia（THE）
079 Lloyds Bank PLC
128 富邦銀行（香港）有限公司Fubon Bank（Hong Kong）Ltd
196 標準銀行亞洲有限公司STANDARD BANK ASIA Ltd
238 招商銀行香港分行CHINA MERCHANTS BANK (HONG KONG BRANCH)
250 花旗銀行（香港）有限公司CitiBank (Hong Kong) Ltd
382 交通銀行（香港）有限公司Bank of Communications（Hong Kong）Ltd
004 香港上海滙豐銀行有限公司The Hongkong and Shanghai Banking Corporation Ltd
                
            
            
                帳戶號碼*
                
                
            
        
    

    


    
        帳戶資料標題
    

    
        
            
                個人資料
                
                     編輯
                
            

            
                
                    




    
        帳戶姓名
        hk918216
    

        
            電郵地址
            hk918216@melaleuca.com
        

        
            手機
            85251918216
        

    

    
        
                
                    出生日期
                    1/1/1988
                
        
    

    

                
                
                    



    
        
            
                中文全名 (與身份證上的姓名相同)*
                
                
            
             
            
            
                國籍*
                
                    
本國籍
澳門籍

                
                
            

            
            
            
            

            
                
                    
                        電話
                        
                            手機
家居電話
公司電話

                        
                    
                     
                    
                        電話號碼*
                        
                        
                    
                
                 
                
                    電郵地址*
                    
                    
                
            

            

            
                
                    
                        出生日期*
                        
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

                        
                        
                            年
2004
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

                        
                        
                    
                    
                
            
        
    

                
            
            
                    
                        
    
    
            地址

        香港,香港  852

            中環

        testaddress1

            testaddress2

                送貨說明
            do not ship
    




                    
                    
                        
    

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
                    
                        
                            選擇上水古洞大埔大埔墟大埔滘太和打鼓嶺沙頭角米埔粉嶺
                            
                            
                        
                    
                    
                
            
            
            
            
                請以中文填寫通訊地址屋苑/屋村/樓宇名稱/街號及街道名稱
                
            
            
            
            
                單位/樓層/座數 (例子：03室,11樓,2座)
                
            
            
            
            
                
                    送貨說明
                    do not ship
                
            
        




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


                    
            
        
        

        
            
                

    
        新增配偶資料 (選填)
    



    
    
        配偶資訊 (選填)
         移除
        
        
            
                中文全名*
                
                
            
             
            
                英文全名(與身份證上的姓名相同)
                
                
            
            
            
            
        
        
        
            
                電郵地址*
                
                
            
             
            
                
                    電話
                    手機
家居電話
公司電話

                
                 
                
                    
                        電話號碼*
                        
                        
                    
                
            
            
        

    

            
        
        

    

    
        請在以下簽名：
    

    

        
            
                
                *我同意並承認我已閱讀 獨立事業代表協議, 政策聲明 與 獎金制度, 所有這些都包含在本協議中，可以不時修改。申請人已年滿18歲(只適用於申請人是個人)，且依照香港法律具有合法身分可以申請成為美樂家公司的獨立事業代表。申請人瞭解美樂家公司不保證申請人事業必定成功。申請人以此協議書申請為美樂家公司之獨立事業代表，但必須在:1.美樂家公司收到並核准本協議書2.申請人之事業組織中推薦至少一位親自推薦的有效會員顧客3.申請人收到第一次佣金後，才視為獨立事業代表
                
            

             
             

            
                
                    
                        
                            hk918216
                            
                             數位簽名必須與上述完全符合* (字母大小寫須符合)
                        
                    

                    
                        
                            
                            
                             數位簽名必須與上述完全符合* (字母大小寫須符合)
                        
                    
                
            
            
            
                提交
            
            我們無法儲存您的資料, 請再試一次
            我理解本文件是成為美樂家獨立事業代表的申請，我不是美樂家獨立事業代表，直到：1）美樂家已收到並接受本協議，2）我的營銷組織中至少有一位顧客， 3）我收到第一筆佣金。
            * 表示必填欄位
        
    

 



    var customerInfo;
    var isPersonalDataDirty = false;
    var isAddressDataDirty = false;
    var isSpouseDataDirty = false;
    var accountTypeUpgradeAnalyticsCategory = 'AccountTypeUpgradeToImea';
    var isAccountBeingUpgradedToImea = 'false';
    var hasPpaProgram = false;
    var isShipToCustomer = false;

    $(document).ready(function () {
        customerInfo = new MarketingExecutive(pageUrls, localizations);
        customerInfo.Initialize();

        var validateInputAndClearHtml = function () {
            // Reset the error message to empty string when a user updates the value. This is needed for the server side validated fields.
            $(&quot;#&quot; + this.id + &quot;~ div&quot;).html(&quot;&quot;);
        }

        $(&quot;#dvAccountInformation :text&quot;).blur(function () {
            validateInputAndClearHtml();
        });

        $(&quot;select&quot;).change(function () {
            validateInputAndClearHtml();
        });


        $('#customerInformationForm :input').on('input', function () {
            isPersonalDataDirty = true;
        });


        $('#addressForm :input').on('input', function () {
            isAddressDataDirty = true;
        });


        $('#saveSpouseForm').on('input', function () {
            isSpouseDataDirty = true;
        });

        customerInfo.SetEnrolleeFullNameForDigitalSignature('hk918216');
        customerInfo.SetSpouseNameForDigitalSignature('');
    });



    .desktopBody .imea-split{
        width:50%;
    }
    
    .participationLevels {
        display:block;
        justify-content: space-between;
        padding-left:0px;
    }
    #enrolleeDigitalSignatureNames{
        white-space: pre;
    }
    /* hide English text */
    .asteriskText {
        display: none;
    }


    $(function() {

        // translate dropdown placeholder
        $('.select2-selection__placeholder').text('請選擇銀行');
        
        var customerName = $('#FirstName').val();
        $('div#dvAccountInfo .customerInfo:first, #enrolleeDigitalSignatureNames').text(customerName);
        
        var spouseName = $('spouseFirstName').val();
        if (spouseName){
            $('#spouseDigitalSignatureNames').text(spouseName);
        }
        
        customerInfo.UpdateDigitalSignature = function() {

            var enrolleeName = $('#FirstName').val().trim();

            $('#LastName').val(enrolleeName);

            customerInfo.SetEnrolleeFullNameForDigitalSignature(enrolleeName);

            $('#enrolleeDigitalSignatureNames').text(enrolleeName);

            var enteredSignature = $('#txtEnrollerDigitalSignature').val();
            if (enteredSignature &amp;&amp; enteredSignature != enrolleeName) {
                $('.enrollerDigitalSignature ').addClass('invalid');
            }
        };

        customerInfo.ValidateSpouseInformation = function() {
            var $spouseName = $('#spouseFirstName');

            var $spouseSignatureContainer = $('#spouseDigitalSignature');
            var $spouseSignature = $('#spouseDigitalSignatureNames');

            if ($spouseName.val().length > 0) {
                // If a spouse name has been entered, we need to capture their digital signature as well

                var spouseName = $spouseName.val().trim();

                $('#spouseLastName').val(spouseName);

                this.SetSpouseNameForDigitalSignature(spouseName);

                var enteredSignature = $('#txtSpouseDigitalSignature').val();
                if (enteredSignature &amp;&amp; enteredSignature != spouseName) {
                    $('.spouseDigitalSignature ').addClass('invalid');
                }

                $('#digitalSignatureContainer').addClass('digitalSignatureWrapper');
                $spouseSignatureContainer.show();
                $spouseSignature.text(spouseName);

                // If a spouse name has been entered, make sure they also have an email and phone number entered
                var $spouseEmail = $('#spouseEmailAddress');
                var $spousePhone = $('#phoneNumber_spousePrimaryPhoneNumber');

                if ($spouseEmail.val().length > 0 &amp;&amp; $spousePhone.val().length > 0) {
                    return true;
                }

                return false;
            }

            // No spouse has been entered so there is no need to capture their digital signature
            $('#digitalSignatureContainer').removeClass('digitalSignatureWrapper');
            $spouseSignatureContainer.hide();
            $spouseSignature.text('');

            return true;
        };
    });

    function SetupEnglishName(name, targetID) {
        var targetElement = $('#' + targetID);

        $.ajax({
                url: '/AccountInformation/TranslateCustomerEnglishName',
                cache: true,
                type: &quot;POST&quot;,
                dataType: &quot;json&quot;,
                data: {
                    name: name
                }
            })
            .success(function(response, status, jqXhr) {
                if (response) {
                    targetElement.val(response);
                }
            });
    };




        

        
            
                


  
    
      
      消費回饋
      產品目錄/月刊/價目表
      美樂家會員優惠禮遇
    
    
      100％顧客滿意保證
      客戶意見信箱 
      常見問與答
    
    
      聯絡美樂家
      
      關於美樂家
       
        
  
  
     ©document.write((new Date()).getFullYear());2022 美商亞洲美樂家有限公司香港分公司版權所有 | 嚴禁未經美樂家有限公司允許複製或者使用該網站的內容
    美樂家首頁   |   
      產品中心   |   
      私隱政策   |   
      使用條款
    
  



     CustomerInfoBase.prototype.ValidateBirthDate = function () {
        var mm = parseInt($(&quot;#DayOfBirthEdit&quot;)[0].value);
        var dd = parseInt($(&quot;#MonthOfBirthEdit&quot;)[0].value);
        var yy = parseInt($(&quot;#YearOfBirthEdit&quot;)[0].value);

        var validDate = true;

        if ((mm === 0 || dd === 0 || yy === 0) &amp;&amp; mm + dd + yy > 0) {
            // At least one but not all fields are filled
            validDate = false;
        }

        var listOfDays = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
        if (mm === 1 || mm > 2) {
            if (dd > listOfDays[mm - 1]) {
                validDate = false;
            }
        }
        if (mm === 2) {
            var isLeapYear = false;
            if (!(yy % 4) &amp;&amp; yy % 100 || !(yy % 400)) {
                isLeapYear = true;
            }
            if (isLeapYear === false &amp;&amp; dd >= 29) {
                validDate = false;
            }
            if (isLeapYear === true &amp;&amp; dd > 29) {
                validDate = false;
            }
        }

        var $dateWrapper = $(&quot;.birth-date-wrapper&quot;);

        if (validDate) {
            $dateWrapper.removeClass('invalid');
            $dateWrapper.find('.errorMessage').text('');
            $dateWrapper.find('.errorMessage').hide();
        } else {
            $dateWrapper.addClass('invalid');
            $dateWrapper.find('.errorMessage').text('Invalid birthdate');
            $dateWrapper.find('.errorMessage').show();
        }
    };
    
    function goToSelectedOption(obj) {
        window.location = obj.value;
    }
    function openSelectedOption(obj) {
        window.open(obj.value);
    }
    $(function() {
   if( $(&quot;#navigationContainer&quot;).length > 0 ){ 
          $(&quot;div[data-p='footer_private_view']&quot;).addClass(&quot;skinny&quot;); 

          // shift links for better layout
          var $footerblock1 = $('#FTCenterContent51');
          var $footerblock2 = $('#FTCenterContent52');
          var $footerblock3 = $('#FTCenterContent53');
          var $link1 = $footerblock1.find('p:last-child').remove();
          var $link2 = $footerblock2.find('p:last-child').remove();

          $footerblock2.prepend($link1);
          $footerblock3.prepend($link2);



   }
});

$('.clickToChatContainer').remove();

// adding this to calculate new price in mini cart based on quantity if customer blurs input instead of hitting enter
$('#mycart').on('blur','.QtyTxtBoxv2',function(){
  ChangeQuantity($(this).parent().siblings().eq(0).children().text().trim(), this);
})




            
        
    var trackData=[{type:&quot;userEvent&quot;,eC:&quot;Content&quot;,eA:&quot;Change Region / Lang&quot;},{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Products You Use&quot;,eA:&quot;Product Select&quot;,pP:&quot;/businesscenter/whichproducts&quot;,pT:&quot;Business Center. Which Products&quot;},{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Products You Use&quot;,eA:&quot;Get Your Results&quot;,pP:&quot;/businesscenter/whichproducts&quot;,pT:&quot;Business Center. Which Products&quot;},{type:&quot;virtualPageview&quot;,pP:&quot;/businesscenter/whichproducts/your-results&quot;,pT:&quot;Business Center. Which Products. Your Results&quot;},
{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Products You Use&quot;,eA:&quot;See Products&quot;,pP:&quot;/businesscenter/whichproducts/your-results&quot;,pT:&quot;Business Center. Which Products. Your Results&quot;},{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Products You Use&quot;,eA:&quot;Hide Products&quot;,pP:&quot;/businesscenter/whichproducts/your-results&quot;,pT:&quot;Business Center. Which Products. Your Results&quot;},{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Products You Use&quot;,eA:&quot;Edit Selection&quot;,pP:&quot;/businesscenter/whichproducts/your-results&quot;,pT:&quot;Business Center. Which Products. Your Results&quot;},
{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Content Sharing&quot;,eA:&quot;Email Open Modal&quot;,pP:&quot;/businesscenter/whichproducts/your-results&quot;,pT:&quot;Business Center. Which Products. Your Results&quot;},{type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Content Sharing&quot;,eA:&quot;Email Click Send&quot;,pP:&quot;/businesscenter/whichproducts/your-results&quot;,pT:&quot;Business Center. Which Products. Your Results&quot;},{type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Select&quot;},{type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Add to cart&quot;},{type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Remove from list&quot;},
{type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Move to list&quot;},{type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Click go to product&quot;},{type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Sort by&quot;},{type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;Open Lists&quot;}];trackData[15]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Play&quot;};trackData[400]={type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;Edit or Create&quot;};trackData[16]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Pause&quot;};trackData[401]={type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;Create&quot;};trackData[17]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Complete&quot;};
trackData[18]={type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;Save&quot;};trackData[18]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Error&quot;};trackData[19]={type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;Make default&quot;};trackData[19]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;25%&quot;};trackData[402]={type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;Delete&quot;};trackData[20]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;50%&quot;};trackData[21]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;75%&quot;};trackData[22]={type:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Ready&quot;};
trackData[23]={type:&quot;userEvent&quot;,eC:&quot;Conversion&quot;,eA:&quot;CTA&quot;};trackData[24]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/securecontent/refer-a-friend-invite/email-sent&quot;,pT:&quot;Refer a Friend. Email Sent&quot;};trackData[25]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/securecontent/refer-a-friend-invite/text  -sent&quot;,pT:&quot;Refer a Friend. Text Sent&quot;};trackData[26]={type:&quot;userEvent&quot;,eC:&quot;Internal Navigation&quot;,eA:&quot;Link / Button&quot;};trackData[27]={type:&quot;userEvent&quot;,eC:&quot;Event&quot;,eA:&quot;Registration&quot;};
trackData[28]={type:&quot;userEvent&quot;,eC:&quot;Event&quot;,eA:&quot;Watch Now&quot;};trackData[29]={type:&quot;userEvent&quot;,eC:&quot;Content&quot;,eA:&quot;Carousel&quot;};trackData[30]={type:&quot;virtualPageview&quot;,pP:&quot;/convention/home&quot;,pT:&quot;Convention. Home&quot;};trackData[31]={type:&quot;virtualPageview&quot;,pP:&quot;/convention/schedule&quot;,pT:&quot;Convention. Schedule&quot;};trackData[32]={type:&quot;virtualPageview&quot;,pP:&quot;/convention/speakers&quot;,pT:&quot;Convention. Speakers&quot;};trackData[33]={type:&quot;virtualPageview&quot;,pP:&quot;/convention/workshops&quot;,pT:&quot;Convention. Workshos&quot;};
trackData[34]={type:&quot;virtualPageview&quot;,pP:&quot;/convention/awards&quot;,pT:&quot;Convention. Awards&quot;};trackData[35]={type:&quot;virtualPageview&quot;,pP:&quot;/convention/watch&quot;,pT:&quot;Convention. Watch&quot;};trackData[36]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/content/new_products&quot;,pT:&quot;New Products. Show All&quot;};trackData[37]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/content/new_products/beauty&quot;,pT:&quot;New Products. Beauty&quot;};trackData[38]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/content/new_products/household&quot;,pT:&quot;New Products. Household&quot;};
trackData[39]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/content/new_products/personal-care&quot;,pT:&quot;New Products. Personal Care&quot;};trackData[40]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/content/new_products/essential-oils&quot;,pT:&quot;New Products. Essential Oils&quot;};trackData[41]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/content/new_products/supplements&quot;,pT:&quot;New Products. Supplements&quot;};trackData[42]={type:&quot;virtualPageview&quot;,pP:&quot;/productstore/minicart&quot;,pT:&quot;Product Store, MiniCart Opens&quot;};
trackData[43]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Quest 2021&quot;,eA:&quot;Jump to Leaderboard Click&quot;,pP:&quot;/BusinessCenter/SecureContent/Quest/leaderboard-content&quot;,pT:&quot;Quest.Leaderboardcontent&quot;};trackData[44]={type:&quot;virtualPageview&quot;,pP:&quot;/BusinessCenter/SecureContent/Quest/mypoint&quot;,pT:&quot;Quest.Mypoint&quot;};trackData[45]={type:&quot;virtualPageview&quot;,pP:&quot;/BusinessCenter/SecureContent/Quest/leaderboard&quot;,pT:&quot;Quest.Leaderboard&quot;};trackData[46]={type:&quot;virtualPageview&quot;,pP:&quot;/BusinessCenter/SecureContent/Quest/myorg&quot;,pT:&quot;Quest.Myorg&quot;};
trackData[47]={type:&quot;userEvent&quot;,eC:&quot;Quest Search Results&quot;,eA:&quot;Search Input&quot;};trackData[58]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Signup-top&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Signup1&quot;};trackData[59]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Signup-bottom&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Signup2&quot;};
trackData[60]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Contact US&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Contact US&quot;};trackData[61]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Contact US&quot;,eA:&quot;Select Option&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Contact US.Option Selected&quot;};trackData[62]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Contact US&quot;,eA:&quot;Submit&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Contact US. Submit&quot;};
trackData[63]={type:&quot;virtualPageview&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Choose the Best Plan &quot;};trackData[64]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Plan Select&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Choose the Best Plan &quot;};trackData[65]={type:&quot;virtualPageview&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security.Choose Your Equipment&quot;};
trackData[66]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Choose Equipment&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security.Choose Your Equipment&quot;};trackData[67]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Continue&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security.Choose Your Equipment&quot;};trackData[68]={type:&quot;virtualPageview&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Personal Information&quot;};
trackData[69]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Address Checkbox&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Personal Information&quot;};trackData[70]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Personal Information&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Personal Information&quot;};trackData[71]={type:&quot;virtualPageview&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Payment Information&quot;};
trackData[72]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Add / Edit payment&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Payment Information&quot;};trackData[73]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Terms Checkbox&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Payment Information&quot;};trackData[74]={type:&quot;virtualPageview&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Order Summary&quot;};
trackData[75]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Edit&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Order Summary&quot;};trackData[76]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;Order Placed&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Order Summary&quot;};trackData[77]={type:&quot;virtualPageview&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Post Enrollment&quot;};
trackData[78]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Home Security&quot;,eA:&quot;CTA&quot;,pP:&quot;/MarketPlace/SecureContent/Home_Security&quot;,pT:&quot;Home Security. Post Enrollment&quot;};trackData[79]={type:&quot;userEvent&quot;,eC:&quot;Christmas Celebration 2020&quot;,eA:&quot;CTA&quot;};trackData[80]={type:&quot;userEvent&quot;,eC:&quot;Christmas Celebration 2020&quot;,eA:&quot;CTA&quot;};trackData[81]={type:&quot;userEvent&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;};trackData[82]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment.Start New Enrollment&quot;};
trackData[83]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment. Send Email&quot;};trackData[84]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment. Send Text&quot;};trackData[85]={type:&quot;virtualPageview&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment. Confirmation Modal&quot;};trackData[86]={type:&quot;virtualPageview&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment. View Invitation&quot;};
trackData[90]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment.Regular Customer&quot;};trackData[91]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/CustomerType&quot;,pT:&quot;CustomerType.Go Back&quot;};trackData[92]={type:&quot;userEvent&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;};trackData[93]={type:&quot;userEvent&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/Enrollments&quot;,pT:&quot;Enrollment. Account Information&quot;};
trackData[94]={type:&quot;userEvent&quot;,eC:&quot;Enrollments&quot;,eA:&quot;CTA&quot;,pP:&quot;/CustomerType&quot;,pT:&quot;CustomerType.Go Back&quot;};trackData[95]={type:&quot;userEvent&quot;,eC:&quot;SELC&quot;,eA:&quot;CTA&quot;};trackData[96]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;SELC&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/securecontent/virtual-5k-leaderboard&quot;,pT:&quot;LeaderBoard. Mens&quot;};trackData[97]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;SELC&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/securecontent/virtual-5k-leaderboard&quot;,pT:&quot;LeaderBoard. Mens Master&quot;};
trackData[98]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;SELC&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/securecontent/virtual-5k-leaderboard&quot;,pT:&quot;LeaderBoard. Womens&quot;};trackData[99]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;SELC&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/securecontent/virtual-5k-leaderboard&quot;,pT:&quot;LeaderBoard. Womens Master&quot;};trackData[100]={type:&quot;userEvent&quot;,eC:&quot;Rowing Page&quot;,eA:&quot;CTA&quot;};trackData[111]={type:&quot;userEvent&quot;,eC:&quot;Header Clicks&quot;,eA:&quot;Order Click&quot;};trackData[112]={type:&quot;userEvent&quot;,eC:&quot;Header Clicks&quot;,eA:&quot;Lists&quot;};
trackData[113]={type:&quot;userEvent&quot;,eC:&quot;Header Clicks&quot;,eA:&quot;Notications&quot;};trackData[114]={type:&quot;userEvent&quot;,eC:&quot;Header Clicks&quot;,eA:&quot;Account&quot;};trackData[115]={type:&quot;userEvent&quot;,eC:&quot;Footer Clicks&quot;,eA:&quot;Love to hear&quot;};trackData[159]={type:&quot;userEvent&quot;,eC:&quot;Order Tracking &quot;,eA:&quot;Track&quot;};trackData[160]={type:&quot;userEvent&quot;,eC:&quot;Content Edit&quot;,eA:&quot;Manage Click&quot;};trackData[170]={type:&quot;userEvent&quot;,eC:&quot;Photo Recognition&quot;,eA:&quot;CTA&quot;};trackData[171]={type:&quot;userEvent&quot;,eC:&quot;Photo Recognition&quot;,eA:&quot;Photo License Option&quot;};
trackData[172]={type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Add to list&quot;};trackData[173]={type:&quot;userEvent&quot;,eC:&quot;List Menu&quot;,eA:&quot;Dropdown Select&quot;};trackData[174]={type:&quot;userEvent&quot;,eC:&quot;Product List&quot;,eA:&quot;View List / Keep Shopping&quot;};trackData[175]={type:&quot;userEvent&quot;,eC:&quot;Content Sharing&quot;,eA:&quot;Email Click Send&quot;};trackData[176]={type:&quot;userEvent&quot;,eC:&quot;Content Sharing&quot;,eA:&quot;Cancel&quot;};trackData[178]={type:&quot;userEvent&quot;,eC:&quot;Shopping \x26 Reminder&quot;,eA:&quot;Set Date Click&quot;};
trackData[179]={type:&quot;userEvent&quot;,eC:&quot;Shopping \x26 Reminder&quot;,eA:&quot;Clear Date&quot;};trackData[180]={type:&quot;userEvent&quot;,eC:&quot;My Account&quot;,eA:&quot;Order History&quot;};trackData[182]={type:&quot;userEvent&quot;,eC:&quot;Account SignIn&quot;,eA:&quot;CTA&quot;};trackData[183]={type:&quot;userEvent&quot;,eC:&quot;Account Access Req&quot;,eA:&quot;CTA&quot;};trackData[184]={type:&quot;userEvent&quot;,eC:&quot;Create Account &quot;,eA:&quot;CTA&quot;};trackData[185]={type:&quot;userEvent&quot;,eC:&quot;Search Results Page&quot;,eA:&quot;CTA&quot;};trackData[187]={type:&quot;userEvent&quot;,eC:&quot;Notifications&quot;,eA:&quot;CTA&quot;};
trackData[188]={type:&quot;userEvent&quot;,eC:&quot;Notifications&quot;,eA:&quot;Sort by&quot;};trackData[190]={type:&quot;userEvent&quot;,eC:&quot;Saving Packs&quot;,eA:&quot;CTA&quot;};trackData[191]={type:&quot;userEvent&quot;,eC:&quot;Receipt Page&quot;,eA:&quot;CTA&quot;};trackData[192]={type:&quot;userEvent&quot;,eC:&quot;Receipt Page&quot;,eA:&quot;Set Date Click&quot;};trackData[195]={type:&quot;userEvent&quot;,eC:&quot;Cancel Preferred Memebership&quot;,eA:&quot;CTA&quot;};trackData[202]={type:&quot;userEvent&quot;,eC:&quot;Category&quot;,eA:&quot;Facet Selected&quot;};trackData[204]={type:&quot;userEvent&quot;,eC:&quot;My Account&quot;,eA:&quot;CTA&quot;};
trackData[205]={type:&quot;userEvent&quot;,eC:&quot;My Account&quot;,eA:&quot;Terms \x26 Condition&quot;};trackData[208]={type:&quot;userEvent&quot;,eC:&quot;Owning Balance &quot;,eA:&quot;CTA&quot;};trackData[209]={type:&quot;userEvent&quot;,eC:&quot;BUO&quot;,eA:&quot;Order Select&quot;};trackData[210]={type:&quot;userEvent&quot;,eC:&quot;BUO&quot;,eA:&quot;CTA&quot;};trackData[211]={type:&quot;userEvent&quot;,eC:&quot;BUO&quot;,eA:&quot;Search Filter&quot;};trackData[212]={type:&quot;userEvent&quot;,eC:&quot;BUO&quot;,eA:&quot;Sort by&quot;};trackData[213]={type:&quot;userEvent&quot;,eC:&quot;BUO&quot;,eA:&quot;Category Sort&quot;};trackData[214]={type:&quot;userEvent&quot;,eC:&quot;Cart&quot;,eA:&quot;CTA&quot;};
trackData[233]={type:&quot;userEvent&quot;,eC:&quot;Shopping \x26 Reminder&quot;,eA:&quot;Select Date&quot;};trackData[234]={type:&quot;userEvent&quot;,eC:&quot;Cart&quot;,eA:&quot;Select Date&quot;};trackData[229]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Cart&quot;,eA:&quot;CTA&quot;,pP:&quot;/Cart-coupons&quot;,pT:&quot;Cart.Your Coupons&quot;};trackData[230]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Cart&quot;,eA:&quot;CTA&quot;,pP:&quot;/Cart-buy-it-again&quot;,pT:&quot;Cart.Buy it Again&quot;};trackData[231]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Cart&quot;,eA:&quot;CTA&quot;,pP:&quot;/Cart-extra-savings&quot;,pT:&quot;Cart.Extra Savings&quot;};
trackData[232]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Cart&quot;,eA:&quot;CTA&quot;,pP:&quot;/Cart-activate&quot;,pT:&quot;Cart.Activate&quot;};trackData[215]={type:&quot;userEvent&quot;,eC:&quot;List Dropdown&quot;,eA:&quot;List Selected&quot;};trackData[216]={type:&quot;userEvent&quot;,eC:&quot;SB Tool&quot;,eA:&quot;CTA&quot;};trackData[217]={type:&quot;userEvent&quot;,eC:&quot;SB Tool&quot;,eA:&quot;Image Selected&quot;};trackData[241]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Conversion&quot;,eA:&quot;CTA&quot;,pP:&quot;/my-account/settings&quot;,pT:&quot;Settings.Cancel&quot;};trackData[219]={type:&quot;userEvent&quot;,eC:&quot;Category&quot;,eA:&quot;Facet Clicks&quot;};
trackData[220]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;PDP&quot;,eA:&quot;CTA&quot;,pP:&quot;/productstore/about-this-product&quot;,pT:&quot;Product Detail. About this Product&quot;};trackData[221]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;PDP&quot;,eA:&quot;CTA&quot;,pP:&quot;/productstore-ingredients&quot;,pT:&quot;Product Detail. Ingredients&quot;};trackData[222]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;PDP&quot;,eA:&quot;CTA&quot;,pP:&quot;/productstore-review&quot;,pT:&quot;Product Detail. Review&quot;};
trackData[242]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Conversion&quot;,eA:&quot;CTA&quot;,pP:&quot;/my-account/settings&quot;,pT:&quot;Settings.Save&quot;};trackData[243]={type:&quot;userEvent&quot;,eC:&quot;My Account&quot;,eA:&quot;CTA&quot;};trackData[245]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Conversion&quot;,eA:&quot;CTA&quot;,pP:&quot;/my-account/settings&quot;,pT:&quot;Settings.Communication Preferences Save&quot;};trackData[246]={type:&quot;userEvent&quot;,eC:&quot;My Account&quot;,eA:&quot;CTA&quot;};trackData[247]={type:&quot;virtualPageview&quot;,pP:&quot;/Cart-Ship-To&quot;,pT:&quot;Cart.Ship To&quot;};
trackData[248]={type:&quot;virtualPageview&quot;,pP:&quot;/Cart-Paywith&quot;,pT:&quot;Cart.Paywith&quot;};trackData[249]={type:&quot;userEvent&quot;,eC:&quot;Checkout&quot;,eA:&quot;CTA&quot;};trackData[250]={type:&quot;userEvent&quot;,eC:&quot;Category&quot;,eA:&quot;CTA&quot;};trackData[300]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/ProductStore/content/Events_MenuHolder_5/virtual-launch&quot;,pT:&quot;Virtual Launch 2021.Virtual Launch Tab&quot;};
trackData[301]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/ProductStore/content/Events_MenuHolder_5/speakers&quot;,pT:&quot;Virtual Launch 2021. Speakers Tab&quot;};trackData[302]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/ProductStore/content/Events_MenuHolder_5&quot;,pT:&quot;Virtual Launch 2021. WatchTab&quot;};trackData[303]={type:&quot;userEvent&quot;,eC:&quot;Product Launch 2022&quot;,eA:&quot;CTA&quot;};trackData[304]={type:&quot;userEvent&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;Fast Track&quot;};
trackData[305]={type:&quot;userEvent&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;Meet the Speakers&quot;};trackData[306]={type:&quot;userEvent&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;Back to Virtual Launch&quot;};trackData[307]={type:&quot;userEvent&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;Virtual Live Streaming&quot;};trackData[308]={type:&quot;userEvent&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;Main Event &quot;};trackData[309]={type:&quot;userEvent&quot;,eC:&quot;Virtual Launch 2021&quot;,eA:&quot;Workshop&quot;};trackData[310]={type:&quot;userEvent&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;};
trackData[311]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/create-team-form-opens&quot;,pT:&quot;Fast Track.Create Team Form Opens&quot;};trackData[313]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;Create Team Form&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/create-team-checkbox-done&quot;,pT:&quot;Fast Track.Checkbox Ticked&quot;};trackData[314]={type:&quot;virtualPageview&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/success&quot;,pT:&quot;Fast Track. Succes Modal Appears&quot;};
trackData[315]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack&quot;,pT:&quot;Fast Track. Succes Modal Appears&quot;};trackData[316]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/cancel-form/jump-to-leaderboard&quot;,pT:&quot;Fast Track. Jump to Leaderboard&quot;};trackData[317]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/my-team&quot;,pT:&quot;Fast Track. My Team&quot;};
trackData[318]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/leaderboard&quot;,pT:&quot;Fast Track. Leaderboard&quot;};trackData[319]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/my-org&quot;,pT:&quot;Fast Track. My Org&quot;};trackData[320]={type:&quot;userEvent&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;};trackData[321]={type:&quot;userEvent&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;};
trackData[327]={type:&quot;userEvent&quot;,eC:&quot;Methyl-B LP&quot;,eA:&quot;CTA&quot;};trackData[332]={type:&quot;userEvent&quot;,eC:&quot;Oil PDP&quot;,eA:&quot;CTA&quot;};trackData[333]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;RAF&quot;,eA:&quot;CTA&quot;,pP:&quot;businesscenter/securecontent/refer-a-friend-invite/checkbox&quot;,pT:&quot;RFA.Checkbox&quot;};trackData[334]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;RAF&quot;,eA:&quot;CTA&quot;,pP:&quot;businesscenter/securecontent/refer-a-friend-invite/Link-Copy&quot;,pT:&quot;RFA. Link Copied&quot;};
trackData[335]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;RAF&quot;,eA:&quot;CTA&quot;,pP:&quot;businesscenter/securecontent/refer-a-friend-invite/Okay&quot;,pT:&quot;RFA. Ok&quot;};trackData[336]={type:&quot;virtualPageview&quot;,pP:&quot;businesscenter/securecontent/refer-a-friend-invite/Limit-Reached&quot;,pT:&quot;RFA.Limit Reached&quot;};trackData[337]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;RFA&quot;,eA:&quot;CTA&quot;,pP:&quot;businesscenter/securecontent/refer-a-friend-invite/Limit-Reached&quot;,pT:&quot;RFA.Limit Reached&quot;};
trackData[338]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/submit-form&quot;,pT:&quot;Fast Track. Form Submitted&quot;};trackData[339]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/cancel-form&quot;,pT:&quot;Fast Track. Form Cancel&quot;};trackData[340]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/platinum-voucher&quot;,pT:&quot;Fast Track.platinum Voucher&quot;};
trackData[341]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Fast Track 2021&quot;,eA:&quot;CTA&quot;,pP:&quot;/businesscenter/securecontent/fasttrack/travel-voucher&quot;,pT:&quot;Fast Track.Travel Voucher&quot;};trackData[342]={type:&quot;userEvent&quot;,eC:&quot;Getting Started Page&quot;,eA:&quot;CTA&quot;};trackData[343]={type:&quot;userEvent&quot;,eC:&quot;Foundation Video&quot;,eA:&quot;CTA&quot;};trackData[344]={type:&quot;userEvent&quot;,eC:&quot;Critical Activity&quot;,eA:&quot;CTA&quot;};trackData[345]={type:&quot;userEvent&quot;,eC:&quot;Additional Links&quot;,eA:&quot;CTA&quot;};trackData[346]={type:&quot;userEvent&quot;,eC:&quot;Find it Here&quot;,eA:&quot;CTA&quot;};
trackData[347]={type:&quot;userEvent&quot;,eC:&quot;January Launch Replay&quot;,eA:&quot;CTA&quot;};trackData[348]={type:&quot;userEvent&quot;,eC:&quot;Quest 2021&quot;,eA:&quot;CTA&quot;};trackData[349]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};trackData[350]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};trackData[351]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};trackData[352]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};trackData[356]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};
trackData[357]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};trackData[353]={type:&quot;userEvent&quot;,eC:&quot;Convention 2021&quot;,eA:&quot;CTA&quot;};trackData[360]={type:&quot;virtualPageview&quot;,pP:&quot;businesscenter/securecontent/events_MenuHolder_2/about&quot;,pT:&quot;Convention 2021.About&quot;};trackData[361]={type:&quot;virtualPageview&quot;,pP:&quot;businesscenter/securecontent/events_MenuHolder_2/speakers&quot;,pT:&quot;Convention 2021.Speakers&quot;};trackData[362]={type:&quot;virtualPageview&quot;,pP:&quot;businesscenter/securecontent/events_MenuHolder_2/schedule&quot;,pT:&quot;Convention 2021.Schedule&quot;};
trackData[363]={type:&quot;virtualPageview&quot;,pP:&quot;businesscenter/securecontent/events_MenuHolder_2/watch&quot;,pT:&quot;Convention 2021.Watch&quot;};trackData[364]={type:&quot;virtualPageview&quot;,pP:&quot;businesscenter/securecontent/events_MenuHolder_2/celebration-corner&quot;,pT:&quot;Convention 2021.Celebration Corner&quot;};trackData[365]={type:&quot;virtualPageview&quot;,pP:&quot;/nse-pop-up&quot;,pT:&quot;NSE Popup&quot;};trackData[366]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;NSE Order Pop Up&quot;,eA:&quot;CTA&quot;,pP:&quot;/nse-pop-up&quot;,pT:&quot;NSE Popup&quot;};
trackData[367]={type:&quot;userEvent&quot;,eC:&quot;Getting Started FAQ&quot;,eA:&quot;CTA&quot;};trackData[368]={type:&quot;userEvent&quot;,eC:&quot;Road Tour 2021&quot;,eA:&quot;CTA&quot;};trackData[369]={type:&quot;userEvent&quot;,eC:&quot;SELC 2021&quot;,eA:&quot;CTA&quot;};trackData[406]={type:&quot;userEvent&quot;,eC:&quot;Carosuel&quot;,eA:&quot;CTA&quot;};trackData[407]={type:&quot;userEvent&quot;,eC:&quot;Modals&quot;,eA:&quot;Modal Click&quot;};trackData[408]={type:&quot;userEvent&quot;,eC:&quot;Bogo Page&quot;,eA:&quot;CTA&quot;};trackData[409]={type:&quot;userEvent&quot;,eC:&quot;L2E&quot;,eA:&quot;CTA&quot;};trackData[410]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;L2E&quot;,eA:&quot;CTA&quot;,pP:&quot;&quot;,pT:&quot;&quot;};
trackData[411]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;L2E&quot;,eA:&quot;CTA&quot;,pP:&quot;&quot;,pT:&quot;&quot;};trackData[412]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;L2E&quot;,eA:&quot;CTA&quot;,pP:&quot;&quot;,pT:&quot;&quot;};trackData[413]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;L2E&quot;,eA:&quot;CTA&quot;,pP:&quot;&quot;,pT:&quot;&quot;};trackData[414]={type:&quot;virtualPageview&quot;,pP:&quot;/Cart-shipping&quot;,pT:&quot;Cart.Shipping&quot;};trackData[415]={type:&quot;userEvent&quot;,eC:&quot;Product&quot;,eA:&quot;Select&quot;};trackData[416]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Product &quot;,eA:&quot;CTA&quot;,pP:&quot;/whichproducts/product-select&quot;,pT:&quot;Products.Select&quot;};
trackData[417]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Which Product &quot;,eA:&quot;CTA&quot;,pP:&quot;/whichproducts/email-sent&quot;,pT:&quot;Products. Email Sent&quot;};trackData[418]={type:&quot;virtualPageview&quot;,pP:&quot;/whichproducts/limit-reached&quot;,pT:&quot;Products.limit reached&quot;};trackData[605]={type:&quot;userEvent&quot;,eC:&quot;Carbonus&quot;,eA:&quot;CTA&quot;};trackData[606]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Product Launch 2022&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/securecontent/January_Launch/tab1&quot;,pT:&quot;Product Launch 2022.Jan Launch&quot;};
trackData[607]={type:&quot;userEventInVirtualPageview&quot;,eC:&quot;Product Launch 2022&quot;,eA:&quot;CTA&quot;,pP:&quot;/BusinessCenter/securecontent/January_Launch/tab2&quot;,pT:&quot;Product Launch 2022. Speakers&quot;};google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(6)&amp;&amp;console.log(&quot;Debug Mode TRUE&quot;);
function trackAction(a){try{google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(7)&amp;&amp;(console.log(&quot;%cNEW PUSH SENT----------------------------&quot;,&quot;color:red;font-weight: bold&quot;),trackData[a.id]?console.table(a):console.log(&quot;%cERROR: Object does not exist in trackData array&quot;,&quot;color:red;font-weight: bold&quot;)),trackData[a.id]&amp;&amp;&quot;userEvent&quot;==trackData[a.id].type&amp;&amp;(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(8)&amp;&amp;(console.log(&quot;%ctrackAction: userEvent sent&quot;,&quot;color:blue;font-weight: bold&quot;),console.table(trackData[a.id])),dataLayer.push({event:&quot;userEvent&quot;,eC:trackData[a.id].eC,
eA:trackData[a.id].eA,eL:a.eL})),trackData[a.id]&amp;&amp;&quot;virtualPageview&quot;==trackData[a.id].type&amp;&amp;(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(9)&amp;&amp;(console.log(&quot;%ctrackAction: virtualPageview sent&quot;,&quot;color:blue;font-weight: bold&quot;),console.table(trackData[a.id])),&quot;virtualPageview&quot;==trackData[a.id].type&amp;&amp;dataLayer.push({event:&quot;virtualPageview&quot;,pP:trackData[a.id].pP,pT:trackData[a.id].pT})),trackData[a.id]&amp;&amp;&quot;userEventInVirtualPageview&quot;==trackData[a.id].type&amp;&amp;(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(10)&amp;&amp;(console.log(&quot;%ctrackAction: userEventInVirtualPageview sent&quot;,
&quot;color:blue;font-weight: bold&quot;),console.table(trackData[a.id])),dataLayer.push({event:&quot;userEventInVirtualPageview&quot;,eC:trackData[a.id].eC,eA:trackData[a.id].eA,eL:a.eL,pP:trackData[a.id].pP,pT:trackData[a.id].pT}))}catch(b){dataLayer.push({event:&quot;userEvent&quot;,eC:&quot;Error&quot;,eA:&quot;GTM JS Code: &quot;+b.name,eL:b.message})}};
(function(){.4>Math.random()&amp;&amp;(window.smartlook||function(a){var b=smartlook=function(){b.api.push(arguments)},c=a.getElementsByTagName(&quot;head&quot;)[0];a=a.createElement(&quot;script&quot;);b.api=[];a.async=!0;a.type=&quot;text/javascript&quot;;a.charset=&quot;utf-8&quot;;a.src=&quot;https://rec.smartlook.com/recorder.js&quot;;c.appendChild(a)}(document),smartlook(&quot;init&quot;,&quot;9d6e3660bb82e4864b4c9e9b70410abd0f3d7b2f&quot;))})();


    #debuggingTool-container {
        position: absolute;
        z-index: 100000;
        font-size: 1.2em;
        top: 10px;
        left: 10px;
        text-align: left;
    }

        #debuggingTool-container.nav_floated {
            top: 0;
        }

        #debuggingTool-container > div {
            border-radius: 4px;
        }

    #close,
    #debuggingTool-header {
        cursor: pointer;
    }

        #debuggingTool-header > div {
            display: inline-block;
        }


    .forwardDated {
        padding: 1px 5px;
        border: 1px solid #ff3019;
        background: #ff3019; /* Old browsers */
        background: -moz-linear-gradient(top, #ff3019 0, #cf0404 100%); /* FF3.6+ */
        background: -webkit-gradient(linear, left top, left bottom, color-stop(0,#ff3019), color-stop(100%,#cf0404)); /* Chrome,Safari4+ */
        background: -webkit-linear-gradient(top, #ff3019 0,#cf0404 100%); /* Chrome10+,Safari5.1+ */
        background: -o-linear-gradient(top, #ff3019 0,#cf0404 100%); /* Opera 11.10+ */
        background: -ms-linear-gradient(top, #ff3019 0,#cf0404 100%); /* IE10+ */
        background: linear-gradient(to bottom, #ff3019 0,#cf0404 100%); /* W3C */
        filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ff3019', endColorstr='#cf0404',GradientType=0 ); /* IE6-9 */
    }

    .notForwardDated {
        padding: 1px 5px;
        border: 1px solid #f1e767;
        background: #f1e767; /* Old browsers */
        background: -moz-linear-gradient(top, #f1e767 0, #feb645 100%); /* FF3.6+ */
        background: -webkit-gradient(linear, left top, left bottom, color-stop(0,#f1e767), color-stop(100%,#feb645)); /* Chrome,Safari4+ */
        background: -webkit-linear-gradient(top, #f1e767 0,#feb645 100%); /* Chrome10+,Safari5.1+ */
        background: -o-linear-gradient(top, #f1e767 0,#feb645 100%); /* Opera 11.10+ */
        background: -ms-linear-gradient(top, #f1e767 0,#feb645 100%); /* IE10+ */
        background: linear-gradient(to bottom, #f1e767 0,#feb645 100%); /* W3C */
        filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#f1e767', endColorstr='#feb645',GradientType=0 ); /* IE6-9 */
    }

    .contentDateElement {
        font-weight: 600;
    }

    .serverNameElement {
        padding: 0 5px;
        color: grey;
    }

    .newErrorCountElement {
        color: darkred;
        padding-right: 5px;
    }

    div #hiddenTools {
        display: none;
        background-color: #fff;
        border: 1px solid black;
        padding: 5px;
    }

    #hiddenTools ul {
        padding: 3px 0 7px 5px;
    }



    
        
            1/6/2022 1:57:25 PM (January)
            SGHGDAUSWWTW02
            
            ✖
        
    

    
    


    
    var analyticsElementCategory = 'OnlineEnrollments'; var accountTypeUpgradeAnalyticsCategory = 'AccountTypeUpgradeToImea';
        



(function(){function f(d){g=[{id:d.id,markers:[]}];d.on(&quot;play&quot;,function(a){dataLayer.push({event:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Play&quot;,eL:this.getPlaylistItem().file.split(&quot;/&quot;).reverse()[0]})});d.on(&quot;pause&quot;,function(a){dataLayer.push({event:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Pause&quot;,eL:this.getPlaylistItem().file.split(&quot;/&quot;).reverse()[0]})});d.on(&quot;complete&quot;,function(a){dataLayer.push({event:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:&quot;Complete&quot;,eL:this.getPlaylistItem().file.split(&quot;/&quot;).reverse()[0]})});d.on(&quot;error&quot;,function(a){dataLayer.push({event:&quot;userEvent&quot;,
eC:&quot;Video&quot;,eA:&quot;Error: &quot;+a.message,eL:this.getPlaylistItem().file.split(&quot;/&quot;).reverse()[0]})});d.on(&quot;time&quot;,function(a){a=Math.floor(100*a.position/a.duration);var b;a:{for(b=0;b&lt;g.length;b++)if(g[b].id==this.id)break a;b=null}-1&lt;h.indexOf(a)&amp;&amp;-1==g[b].markers.indexOf(a)&amp;&amp;(g[b].markers.push(a),dataLayer.push({event:&quot;userEvent&quot;,eC:&quot;Video&quot;,eA:a+&quot;%&quot;,eL:this.getPlaylistItem().file.split(&quot;/&quot;).reverse()[0]}))})}for(var h=[25,50,75],g=[],e=document.querySelectorAll(&quot;[data-mediaid]&quot;),c=0;c&lt;e.length;++c)e[c].addEventListener(&quot;mousedown&quot;,
function(d){var a=50,b=setInterval(function(){jwplayer().id&amp;&amp;(clearInterval(b),f(jwplayer(0)));a--;0===a&amp;&amp;jwplayer().id&amp;&amp;clearInterval(b)},10)});jwplayer().id&amp;&amp;(f(jwplayer(0)),/\.melaleuca\.com\.cn/.test(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(13))&amp;&amp;$(&quot;.jw-controlbar&quot;).data(&quot;tracked&quot;,&quot;true&quot;));e=document.querySelectorAll('.play-button[ng-show\x3d&quot;card.videoimage&quot;]');for(c=0;c&lt;e.length;++c)e[c].addEventListener(&quot;mousedown&quot;,function(d){var a=75,b=setInterval(function(){jwplayer().id&amp;&amp;(clearInterval(b),f(jwplayer(0)));a--;
0===a&amp;&amp;jwplayer().id&amp;&amp;clearInterval(b)},20)});e=document.querySelectorAll(&quot;[data-videoname]&quot;);for(c=0;c&lt;e.length;++c)e[c].addEventListener(&quot;mousedown&quot;,function(d){var a=75,b=setInterval(function(){jwplayer().id&amp;&amp;(clearInterval(b),f(jwplayer(0)));a--;0===a&amp;&amp;jwplayer().id&amp;&amp;clearInterval(b)},20)});if(/\www.melaleuca\.com\.cn/.test(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(14)))jQuery(document).on(&quot;click&quot;,&quot;.jw-controlbar&quot;,function(){$(this).data(&quot;tracked&quot;)||($(this).data(&quot;tracked&quot;,&quot;true&quot;),f(jwplayer(&quot;audio-player&quot;)))});if(/australia.melaleuca\.com/.test(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(15)))jQuery(document).on(&quot;click&quot;,
&quot;.jw-controlbar&quot;,function(){$(this).data(&quot;tracked&quot;)||($(this).data(&quot;tracked&quot;,&quot;true&quot;),f(jwplayer(0)))});if(/BusinessCenter\/securecontent\/update-center/.test(google_tag_manager[&quot;GTM-KTXVXPV&quot;].macro(16)))jQuery(document).on(&quot;click&quot;,&quot;.jw-controlbar&quot;,function(){$(this).data(&quot;tracked&quot;)||($(this).data(&quot;tracked&quot;,&quot;true&quot;),f(jwplayer(0)))})})();/html[1]/body[@class=&quot;desktopBody&quot;]</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[@class=&quot;desktopBody&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//body</value>
   </webElementXpaths>
</WebElementEntity>
