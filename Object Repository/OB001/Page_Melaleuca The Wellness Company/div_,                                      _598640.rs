<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>div_,                                      _598640</name>
   <tag></tag>
   <elementGuidId>f65ab7d2-5e3a-4af1-929b-4b8eb66c9c00</elementGuidId>
   <selectorCollection>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='跳到主頁'])[1]/following::div[1]</value>
      </entry>
      <entry>
         <key>CSS</key>
         <value></value>
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
      <value>site-header </value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
    
        
    

        
                
                        歡迎 港島一號
                        , 優惠顧客
                
                        
                            我的帳戶 

                            
                                
                                    
                                        我的帳戶 
                                    
                                    
                                    
                                        
                                        消費回饋
                                        我的清單                                        訂單記錄
                                        設定付款方式 (請親臨生活館並帶同相關文件設定或更新各項付款方式)
電子郵件偏好設定                                        瀏覽全部
                                    
                                    
                                         關閉
                                    
                                
                            
                        
                    
                        
                            消費回饋: HK$791.0
                        
                    
                    
                        服務中心
                    
                
                    登出
                
        


        
                    
                        





  
     
  






var amzSearchApiHosts = {
  preProd: 'api-jp-dv',
  prod: 'api-jp'
};


var searchCultureConfig = {
  suggestCharMin: 1,
  searchBoxLabel: '搜尋',
  suggestionInCategory: '{{ category.name }}中含',
  topResults: '{{ hoverTerm }}的熱門搜尋結果',
  topResultsCategory: '{{ hoverCategory }}中含{{ hoverTerm }}的熱門搜尋結果',
  viewResults: '顯示搜尋結果',
  docTypes: {
    'product': '產品',
    'web page': '網頁',
    'video': '影片',
    'document': '文件'
  },
  sortLabel: '排序',
  sortBy: [
    {
      name: '最相關',
      value: {
        sortField: '_score',
        sortDir: 'desc'
      }
    },
    {
      name: '價格：高至低',
      value: {
        sortField: 'price.{{customerPriceType}}',
        sortDir: 'desc'
      }
    },
    {
      name: '價格：低至高',
      value: {
        sortField: 'price.{{customerPriceType}}',
        sortDir: 'asc'
      }
    },
    {
      name: '點數：高至低',
      value: {
        sortField: 'points',
        sortDir: 'desc'
      }
    },
    {
      name: '點數：低至高',
      value: {
        sortField: 'points',
        sortDir: 'asc'
      }
    }
  ],
  count: {
    singular: '顯示{{ searchTerm }}共{{ resultCount }}項中的{{ products.length }}項的搜尋結果',
    plural: '顯示{{ searchTerm }}共{{ resultCount }}項中的{{ products.length }}項的搜尋結果'
  },
  countCategory: {
    singular: '顯示{{ category}}中含{{ searchTerm }}共{{ resultCount }}項中的{{ products.length }}項的搜尋結果',
    plural: '顯示{{ category}}中含{{ searchTerm }}共{{ resultCount }}項中的{{ products.length }}項的搜尋結果'
  },
  correction: '搜尋不到{{ originalSpelling }}的結果 改爲顯示{{ searchTerm }}的搜尋結果',
  correctionCategory: '搜尋不到{{ originalSpelling }}的結果 改爲顯示{{ searchTerm }}的搜尋結果',
  soldOut: 'Sold Out',
  addLabel: '新增至購物車',
  itemLabel: '產品編號',
  sizeLabel: '規格',
  savingsLabel: '節省',
  pointSingle: '點數',
  pointPlural: '點數',
  showMoreLabel: '顯示更多',
  loadingTitle: '請稍候',
  noResults: '搜尋不到 {{ originalSpelling || searchTerm }}的結果',
  noResultsCategory: '搜尋不到 {{ originalSpelling || searchTerm }}的結果',
  priceLabels: {
    preferred: '優惠價',
    retail: '建議售價'
  },
  addToList: '增加至我的清單',
  move: '移至'
};


  var contentImagesDirectory = '//cdntesttw.melaleuca.com';
  var customerPriceType = 'Preferred';








    @charset &quot;UTF-8&quot;;
#bd-app {
  top: 0;
  position: fixed;
  left: 0;
  z-index: 700;
}

#bd-app * {
  font-family: &quot;Microsoft JhengHei&quot;;
}

#bd-app .mask {
  opacity: 0.68;
  background-color: #020202;
  position: absolute;
  width: 100vw;
  height: 100vh;
}

#bd-app .popupBox {
  position: relative;
  margin-top: 35%;
  padding: 0;
  height: 50%;
  -webkit-box-shadow: 0 3px 10px 0 rgba(0, 0, 0, 0.52);
          box-shadow: 0 3px 10px 0 rgba(0, 0, 0, 0.52);
  background-color: #F3EDE0;
  border-radius: 17px;
  width: calc(100vw - 60px);
  left: 50%;
  -webkit-transform: translateX(-40%);
          transform: translateX(-40%);
  height: 460px;
}

#bd-app .popupBox .imgWrap {
  width: 100%;
  height: 30%;
}

#bd-app .popupBox .imgWrap > img {
  width: 50%;
  left: 50%;
  position: absolute;
  -webkit-transform: translateX(-50%);
          transform: translateX(-50%);
  top: -45px;
  opacity: 1;
}

#bd-app .popupBox .imgWrap .stars {
  position: relative;
  width: 100%;
  height: 100%;
}

#bd-app .popupBox .imgWrap .stars > span {
  display: inline-block;
  position: absolute;
  width: 5px;
  height: 5px;
  background-color: #DBA23E;
  -webkit-transform: rotate(45deg);
          transform: rotate(45deg);
  /* 使星星模糊一点 */
  opacity: 0.2;
  /* 动画名称 动画时间  速度  开始时间 次数 */
  -webkit-animation: blinking 1s linear var(--d) infinite;
          animation: blinking 1s linear var(--d) infinite;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(1) {
  top: 10%;
  left: 10%;
  --d: 10s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(2) {
  top: 20%;
  left: 20%;
  --d: 6s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(3) {
  top: 30%;
  left: 30%;
  --d: 5s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(4) {
  top: 10%;
  margin-left: 40%;
  --d: 4s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(5) {
  top: 40%;
  left: 60%;
  --d: 7s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(6) {
  top: 30%;
  left: 80%;
  --d: 9s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(7) {
  top: 40%;
  left: 20%;
  --d: 8s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(8) {
  top: 50%;
  left: 40%;
  --d: 15s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(9) {
  top: 60%;
  left: 70%;
  --d: 14s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(10) {
  top: 80%;
  left: 50%;
  --d: 11s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(11) {
  top: 75%;
  left: 23%;
  --d: 20s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(12) {
  top: 55%;
  left: 4%;
  --d: 24s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(13) {
  top: 36%;
  left: 26%;
  --d: 8s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(14) {
  top: 93%;
  left: 18%;
  --d: 3s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(15) {
  top: 58%;
  left: 68%;
  --d: 2.6s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(16) {
  top: 64%;
  left: 86%;
  --d: 1.5s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(17) {
  top: 6%;
  left: 78%;
  --d: 3.5s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(18) {
  top: 13%;
  left: 58%;
  --d: 6s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(19) {
  top: 50%;
  left: 50%;
  --d: 8s;
}

#bd-app .popupBox .imgWrap .stars span:nth-child(20) {
  top: 88%;
  left: 88%;
  --d: 7s;
}

@-webkit-keyframes blinking {
  0%,
  100% {
    opacity: 0.2;
  }
  50% {
    /* 星星大小放大 1.5倍 ，旋转45度成菱形 */
    -webkit-transform: scale(1.5) rotate(45deg);
            transform: scale(1.5) rotate(45deg);
    opacity: 1;
  }
}

@keyframes blinking {
  0%,
  100% {
    opacity: 0.2;
  }
  50% {
    /* 星星大小放大 1.5倍 ，旋转45度成菱形 */
    -webkit-transform: scale(1.5) rotate(45deg);
            transform: scale(1.5) rotate(45deg);
    opacity: 1;
  }
}

#bd-app .popupBox .ContentWrap {
  padding: 0 24px;
  text-align: center;
  color: #020202;
}

#bd-app .popupBox .ContentWrap .memberName {
  font-size: 25px;
  margin-bottom: 0;
  text-align: center;
  margin-top: 20px;
}

#bd-app .popupBox .ContentWrap .firstLine {
  font-size: 18px;
  margin: 16px 0;
}

#bd-app .popupBox .ContentWrap .contentDetail {
  font-size: 16px;
  margin: 10px -50px 0px;
  line-height: 30px;
  color: #252525;
}

#bd-app .popupBox .ContentWrap .btnBuyNow {
  cursor: pointer;
  display: block;
  margin: 32px 0 0;
  border-radius: 4px;
  background-color: #30862d;
  color: #fff;
  font-size: 24px;
  border-radius: 3px;
  border: none;
  display: block;
  line-height: 55px;
  height: 100%;
  width: 100%;
}

#bd-app .popupBox .ContentWrap .btnBuyNow > a {
  display: block;
  color: #fff;
}

#bd-app .popupBox .bdCloseBtn {
  position: absolute;
  top: 0;
  border-radius: 73%;
  font-size: 20px;
  right: -22px;
  cursor: pointer;
}

#bd-app .popupBox .bdCloseBtn > i {
  color: #fff;
}

@-webkit-keyframes blink-animation {
  to {
    visibility: hidden;
  }
}

@keyframes blink-animation {
  to {
    visibility: hidden;
  }
}

@-webkit-keyframes failing {
  0%,
  100% {
    opacity: 0;
  }
  70% {
    opacity: 1;
  }
  100% {
    -webkit-transform: translate(0, 200px);
            transform: translate(0, 200px);
  }
  0% {
    -webkit-transform: translate(100px, 0px);
            transform: translate(100px, 0px);
  }
}

@keyframes failing {
  0%,
  100% {
    opacity: 0;
  }
  70% {
    opacity: 1;
  }
  100% {
    -webkit-transform: translate(0, 200px);
            transform: translate(0, 200px);
  }
  0% {
    -webkit-transform: translate(100px, 0px);
            transform: translate(100px, 0px);
  }
}

@media only screen and (min-width: 768px) {
  #bd-app {
    width: 100vw;
  }
  #bd-app .popupBox {
    width: 400px;
    margin-top: 170px;
    height: 455px;
  }
  #bd-app .popupBox .imgWrap {
    height: 33%;
  }
  #bd-app .popupBox .imgWrap > img {
    top: -65px;
  }
  #bd-app .popupBox .ContentWrap .memberName {
    font-size: 32px;
  }
  #bd-app .popupBox .ContentWrap .firstLine {
    font-size: 22px;
    margin: 24px 0 16px;
  }
  #bd-app .popupBox .ContentWrap .contentDetail {
    padding: 0 40px;
  }
}
/*# sourceMappingURL=birthdayPopUp.css.map */
  



    if (location.pathname === '/ProductStore/Product') {
        if (location.search.length === 0) {
            location.replace('/ProductStore/Home/ProductStoreLanding')
        }
    }

    var bdPromotionArr = [2005852];
    console.log('popup')
    $(document).ready(function() {
        var customerName = &quot;港島一號&quot;
        var birthdayPopUpHTML = `&lt;main id=&quot;bd-app&quot;>
    &lt;div class=&quot;mask&quot;>&lt;/div>
    &lt;div class=&quot;popupBox&quot;>
        &lt;div class=&quot;imgWrap&quot;>
            &lt;img src=&quot;https://cdntw.melaleuca.com/Images/ProductStore/giftbox_image.png&quot; />
            &lt;!-- &lt;img src=&quot;./giftbox@4x.png&quot; /> -->
            &lt;div class=&quot;stars&quot;>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
                &lt;span>&lt;/span>
            &lt;/div>
        &lt;/div>


        &lt;div class=&quot;ContentWrap&quot;>

            &lt;div class=&quot;memberName&quot; style=&quot;font-family: 'Microsoft JhengHei' !important;margin-top:14px;font-size:28px;line-height:28px;&quot;>尊敬的${customerName}&lt;/div>

            &lt;div class=&quot;firstLine&quot; style=&quot;font-family: 'Microsoft JhengHei' !important;&quot;>
                美樂家祝您 , 生日快樂！
            &lt;/div>
            &lt;div class=&quot;contentDetail&quot; style=&quot;font-family: 'Microsoft JhengHei' !important;&quot;>
                在這特別的月份我們為您準備了生日獨享禮優惠&lt;br>凡當月生日之優惠顧客,單張訂單消費滿35點或以上,&lt;br>即享有多重生日獨享優惠禮遇!

            &lt;/div>

            &lt;button class=&quot;btnBuyNow&quot; style=&quot;margin-top:18px;&quot;>
                &lt;a href=&quot;/ProductStore/Content/Birthday&quot; style=&quot;font-family: 'Microsoft JhengHei' !important;&quot;>立即選購&lt;/a>
             &lt;/button>

        &lt;/div>

        &lt;div class=&quot;bdCloseBtn&quot;>
            &lt;i class=&quot;fa fa-times-circle&quot;>&lt;/i>
        &lt;/div>

    &lt;/div>

&lt;/main>`

        function SetlvipBirthdayStorage() {
            sessionStorage.setItem('bdPopUped', 'true');
        }

        function GetlvipBirthdayStorage() {
            return sessionStorage.getItem('bdPopUped');
        }

        if (GetlvipBirthdayStorage()) return;

        function findPromotionArr(promotionValueArr) {
            var promotionArr = []
            for (let i = 0; i &lt; promotionValueArr.length; i++) {
                promotionArr.push(promotionValueArr[i]['PromotionID']);
            }
            return promotionArr
        }

        function checkIfBirthday() {
         //   var interSectArr = _.intersection(findPromotionArr(PageClientData.CustomerPromotionValues), bdPromotionArr)
            var interSectArr =  findPromotionArr(PageClientData.CustomerPromotionValues).filter(ele=>bdPromotionArr.includes(ele));
            if (interSectArr.length !== 0) return true;
            else return false;
        }

        if (PageClientData.CustomerStatus &amp;&amp; checkIfBirthday()) { // login, birthday, 

            $('body').append(birthdayPopUpHTML);
            setTimeout(() => {
                $(&quot;body&quot;).delegate(&quot;.bdCloseBtn&quot;, &quot;click&quot;, function() {
                    $('#bd-app').css('display', 'none');
                });
                SetlvipBirthdayStorage();
            }, 1000)
        }


    });
    
   





const configObj = {
    // cateId : hash
    &quot;87&quot;:'New-Products',&quot;134&quot;:'Web-Only',&quot;135&quot;:'40P'
}

function redirect(configObj) {
 const keyArr = Object.keys(configObj);
 for (let i=0; i&lt; keyArr.length; i++) {
    if (location.pathname === `/ProductStore/CategoryLanding/${keyArr[i]}`) {
       window.location.href = `/ProductStore/Content/All_Extra_Savings#/${configObj[keyArr[i]]}`;
    }      
 }
}

 redirect(configObj);

 

                    
                    
  
  我的清單

 購物車 (0)                     
                        結帳
                    


    var miniCartLocalizations = {
            &quot;MyMiniCartv2_Qty&quot;: &quot;數量&quot;,
            &quot;MyMiniCartv2_Sku&quot;: &quot;編號&quot;,
            &quot;MyMiniCartv2_Item&quot;: &quot;項目&quot;,
            &quot;MyMiniCartv2_Savings&quot;: &quot;省下&quot;,
            &quot;MyMiniCartv2_Points&quot;: &quot;點數&quot;,
            &quot;MyMiniCartv2_Commissionable&quot;: &quot;佣金&quot;,
            &quot;MyMiniCartv2_Remove&quot;: &quot;移除&quot;,
            &quot;MyMiniCart_AdjustedTotal&quot;: &quot;總金額&quot;,
            &quot;Shared_Close&quot;: &quot;關閉&quot;,
            &quot;NoItemsInCart&quot;: &quot;您的購物車中沒有任何項目&quot;,
            &quot;MyMiniCartItem_Remove&quot;: &quot;刪除&quot;,
            &quot;MyMiniCartv2_Total&quot;: &quot;小計&quot;,
            &quot;ino_ConfirmRemove&quot;: &quot;此項目為自動添加到您的購物車。您確定要刪除？注意：此項目將於下次登入此筆訂單時，重新添加到您的購物車。有任何疑問，請聯絡顧客服務部2577-5266。&quot;,
            &quot;AjaxLoader_Loading&quot;: &quot;下載中…&quot;,
            &quot;AjaxErrorMessage_ErrorMessage&quot;: &quot;檢視您的資料有錯誤&quot;,
            &quot;AjaxErrorMessage_Click&quot;: &quot;點選&quot;,
            &quot;AjaxErrorMessage_Here&quot;: &quot;這裡&quot;,
            &quot;AjaxErrorMessage_TryAgain&quot;: &quot;再試一次&quot;,
            &quot;SpacingTableCell&quot;: &quot;&amp;nbsp;&quot;,
            &quot;LoyaltyReceiptFree&quot;: &quot;免費&quot;,
            &quot;LsdCredit&quot;: &quot;Loyalty Shopping Dollars Credit&quot;
        };




	
	
		
			購物車 ()
		
		
		    
            加入購物車
		
	
    
        
            
                
                刪除
            
        


        
        
        
            
                
                
                    
                        
                            數量
                        
                        
                            編號
                        
                        
                            項目
                        
                        
                            建議售價
                        
                        
                            省下
                        
                        
                            優惠價
                        
                        
                            點數
                        
                        
                        
                            移除
                        
                    
                
                
                
                    
                    
                    
                    
                        您的購物車中沒有任何項目
                    
                                        
                    
                
                
                
                    
                        
                            小計
                        
                        
                            HK$0.0
                        
                        
                            HK$0.0
                        
                        
                            HK$0.0
                        
                        
                            0
                        
                        
                    
                    
                    
                
            
        
        
        
            結帳
              
        
    
                
                 關閉
            
            

 


    
    
    

    
        
            
                
                    
                        
                    
                
            
        
    

     關閉






    var favoritesUrl = '/ProductStore/MiniFavorites';



        
</value>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/div[@class=&quot;container zh-HK&quot;]/div[@class=&quot;headerWrapper&quot;]/div[@class=&quot;site-header&quot;]</value>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='跳到主頁'])[1]/following::div[1]</value>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//div[3]/div/div[2]</value>
   </webElementXpaths>
</WebElementEntity>