# spring-boot-webmvc-demo-1

> This demo follows the [30天學習Spring MVC系列](https://ithelp.ithome.com.tw/users/20107812/ironman/1538).

##### 重要觀念

* [AOP(Aspect-Oriented Programming)](https://zh.wikipedia.org/zh-tw/%E9%9D%A2%E5%90%91%E4%BE%A7%E9%9D%A2%E7%9A%84%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1):
  基本概念為從一個軟體最主要的關注點ーー主關注點（core concern）分離出橫切關注點（crosscutting concerns），如此可以將「解決特定領域問題的程式碼」從業務邏輯中獨立出來，業務邏輯的程式碼中不再含有針對特定領域問題程式碼的呼叫，而是通過**切面**來封裝、維護這些「解決特定領域問題的程式碼」，這樣可以對原本分散於整個應用程式中的變動進行有效管理。
  例如：一個信用卡應用程式來說，存款、取款、帳單管理是它的主關注點，記錄檔和持久化將成為橫切整個物件結構的橫切關注點。

* Spring MVC 相關模組：

  ![**Overview of the Spring Framework**](https://docs.spring.io/spring/docs/4.0.x/spring-framework-reference/html/images/spring-overview.png "[**Overview of the Spring Framework**](https://docs.spring.io/spring/docs/4.0.x/spring-framework-reference/html/overview.html)")

  1. 核心容器(Core controller)
     * Spring-core: Spring 核心
     * Spring-Beans: 定義 Bean 的支援
     * Spirng-Context: 提供依賴注入功能


    2. AOP
     * Spring-AOP
     * Spring-Aspects


    3. Web
    4. 數據訪問與整合
     * Spring-JDBC
     * Spring-ORM

  ==基本上，每個模組都會對應一個以上的 jar 檔。==









