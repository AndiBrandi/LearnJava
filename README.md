# LearnJava



## JavaFX_Basic

### Setup für eine JavaFX Anwendung:
#### 1. checken ob die richtige JDK eingestellt ist:
- Unter `File -> Project Structure -> SDK` eine JDK auswählen die funktioniert (nicht rot ist)
- Unter `File -> Project Structure -> Language Level` "SDK Default" auswählen

#### 2. JavaFX Libraries hinzufügen
- `File -> Project Structure -> Global Libraries` mit **"+"** *(Java)* alle JavaFx **.jar** dateien hinzufügen
- Diese liegen üblicherweise auf C:\Programme\ Java\ {sdk_version}\lib\

![grafik](https://user-images.githubusercontent.com/79520423/153752441-42d46d6c-2b03-4b8e-8cb3-b69b767669b1.png)


#### 3. In den Dependencies auf fehlerhafte Einträge schauen
- `File -> Project Structure -> Modules -> {Projekt_Name} -> Dependencies`
- Sind in der Liste rote Einträge, lösch diese raus mit **"-"**

![grafik](https://user-images.githubusercontent.com/79520423/153752395-e160b88c-88d7-4655-a046-06068da4a018.png)


### Grafische Benutzeroberfläche (GUI):
#### Scene bauen:
Nachdem man alle FX Komponenten mit dem SceneBuilder dort hat wo man sie möchte:
- Ist es nie verkehrt, jeder Komponente eine fx:id zu geben
- Sollte man den Komponenten die etwas ausführen sollen eine '**OnAction**' _(oder andere arten von Aktionen hinzuzufügen)_

#### Scene mit Conrtoller verknüpfen:
Beispiel für eine Scene mit einem Label `helloLabel`, einem TextFeld `textField`, und einem Button `button`
```fxml
<AnchorPane prefHeight="400.0" prefWidth="600.0" xmlns="http://javafx.com/javafx/11.0.1" xmlns:fx="http://javafx.com/fxml/1" fx:controller="JavaFX_Basic.Controller">
        <Label fx:id="helloLabel" layoutX="60.0" layoutY="49.0" prefHeight="19.0" prefWidth="184.0" text="Hello"/>
        <TextField fx:id="textField" layoutX="60.0" layoutY="110.0"/>
        <Button fx:id="button" layoutX="60.0" layoutY="187.0" mnemonicParsing="false" onAction="#buttonClicked" text="Button"/>
</AnchorPane>
```
[Link](###setup-)
