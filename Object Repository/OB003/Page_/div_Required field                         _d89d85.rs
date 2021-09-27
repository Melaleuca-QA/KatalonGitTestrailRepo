<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_Required field                         _d89d85</name>
   <tag></tag>
   <elementGuidId>ffd639ac-1e43-4259-bd72-e4ea962dc1d8</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>#simplePageContent</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>//div[@id='simplePageContent']</value>
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
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>id</name>
      <type>Main</type>
      <value>simplePageContent</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
        
            編輯送貨地址
            
            
            
                
                    地址
               

                
            

            

    
        
            
                
                    姓名
                    
                
                
            
            
                
                    市/縣
                    選擇台北市基隆市新北市連江縣宜蘭縣釣魚台新竹市新竹縣桃園市苗栗縣台中市彰化縣南投縣嘉義市嘉義縣雲林縣台南市高雄市南海島澎湖縣金門縣屏東縣台東縣花蓮縣
                
                
                
                    區/鄉/鎮
                    選擇仁愛區信義區中正區中山區安樂區暖暖區七堵區
                
                
            
            
                
                    郵遞區號
                    
                
                
                    
                
            
            
                地址
                
                    
                
                
            
            
                
            
            *Required field
        
        
            送貨地址選項
            寄貨說明
            
                
            
            電話號碼
            
                
            
            
            
                
                設定為我的預設送貨地址
            
        
    

    
    
    
    





    var addressJson = '';
    var searchAddressUrl = '/MyAccount/Address/SearchForAddressData';
    var initCustomerAddress = true;

    $(document).ready(function () {

        initialCitySuburb();

        if (initCustomerAddress === true) {
            $('#addressPostalCode').val($('#postalCode').val());
        }

        $(&quot;#addressSuburb&quot;).on('change', function () {

            var suburb = $(this).val();
            $(&quot;#suburbName&quot;).val(suburb);
            var city = $(&quot;#cityName&quot;).val();

            var findPostalCode = _.find(addressJson, function (addressData) {
                return addressData.CityName === city &amp;&amp; addressData.SuburbName === suburb;
            });
            if (findPostalCode) {
                $('#postalCode').val(findPostalCode.PostalCode);
                $('#addressPostalCode').val(findPostalCode.PostalCode);
            }
        });

        $(&quot;#addressCity&quot;).on('change', function () {

            var city = $(this).val();
            $(&quot;#cityName&quot;).val(city);
            $('#postalCode').val(&quot;&quot;);
            $('#addressPostalCode').val(&quot;&quot;);
           populateSuburb();
        });

    });

    var initialCitySuburb = function () {

        $.ajax({
            url: searchAddressUrl,
            cache: true,
            type: &quot;GET&quot;,
            data: { searchString: 'TWN' }
        })
        .success(function (response) {
            if (response &amp;&amp; response.length > 0) {
                addressJson = response;
                initCityList();
            }
        })
        .error(function (jqXhr, status, error) {
        });
    }

    var initCityList = function () {

        var validCityList = _.uniq(addressJson, function (city) {
            return city.CityName;
        });

        var SuburbOptionsHtml = '';
        if (validCityList) {
            SuburbOptionsHtml += $.format('&lt;option value=&quot;&quot; style=&quot;color:#bbb;&quot;>{0}&lt;/option>', '選擇');
            _.each(validCityList, function (city) {
                SuburbOptionsHtml += $.format('&lt;option value=&quot;{1}&quot;>{0}&lt;/option>', city.CityName, city.CityName);
            });
            $(&quot;#addressCity&quot;).html(SuburbOptionsHtml);
            $('#addressSuburb').prop('disabled', false);
            $('#addressCity').prop('disabled', false);

            if (initCustomerAddress === true &amp;&amp; $(&quot;#cityName&quot;).val() !== '') {
                $(&quot;#addressCity&quot;).children().each(function () {
                    if ($(this).val() === $(&quot;#cityName&quot;).val()) {
                        $(this).attr(&quot;selected&quot;, true);
                        populateSuburb();
                    }
                });
            }
        }
    }

    var populateSuburb = function () {

        var City = $(&quot;#cityName&quot;).val();

        var validSuburbList = _.filter(addressJson, function (city) {
            return city.CityName === City;
        });

        var CitiesOptionsHtml = '';
        if (validSuburbList) {
            CitiesOptionsHtml += $.format('&lt;option value=&quot;&quot; style=&quot;color:#bbb;&quot;>{0}&lt;/option>', '選擇');
            _.each(validSuburbList, function (surburb) {
                CitiesOptionsHtml += $.format('&lt;option value=&quot;{1}&quot;>{0}&lt;/option>', surburb.SuburbName, surburb.SuburbName);
            });
            $(&quot;#addressSuburb&quot;).html(CitiesOptionsHtml);
            $('#addressSuburb').prop('disabled', false);

            if (initCustomerAddress === true &amp;&amp; $(&quot;#suburbName&quot;).val() !== '') {
                $(&quot;#addressSuburb&quot;).children().each(function () {
                    if ($(this).val() === $(&quot;#suburbName&quot;).val()) {
                        $(this).attr(&quot;selected&quot;, true);
                    }
                });
            }
        }
        initCustomerAddress = false;
    }




            
                
                    儲存

                    取消
                
            
        
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>id(&quot;simplePageContent&quot;)</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:attributes</name>
      <type>Main</type>
      <value>//div[@id='simplePageContent']</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:idRelative</name>
      <type>Main</type>
      <value>//div[@id='rightContainer']/div</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='會員資料'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='其他選項'])[1]/following::div[3]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[2]/div[2]/div</value>
   </webElementXpaths>
</WebElementEntity>
