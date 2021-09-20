# az-appservice-servicebus-learn

azure appservice と azure service bus を簡単に使ったてみた。

https://docs.microsoft.com/ja-jp/azure/app-service/quickstart-java?tabs=javase&pivots=platform-linux


## 必要なもの
```
azure
azure cli
java 11
maven
IntelliJ
```

## config
```
mvn com.microsoft.azure:azure-webapp-maven-plugin:2.1.0:config
```
* 設定はpom.xmlに保存されます。自分で変更しても良い
* slopを指定する場合は slot名


## deploy to app service
```
mvn package azure-webapp:deploy
```

slopにもデプロイできる



