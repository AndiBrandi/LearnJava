# LearnJava
### Ein Guide für die gängisten Aufgaben bei der Java Programmierung (in [IntelliJ IDEA Ultimate](https://www.jetbrains.com/de-de/idea/))

von Andreas Brandstetter (5AHEL HTL-Steyr)

<details>
  <summary>Inhaltsverzeichnis</summary>
  
  - [Tipps & IntelliJ Shortcuts](#tipps--intellij-shortcuts)
    - [Alt+Enter](#alt--enter)
    - [IDE Features](#ide-features)
  - [JavaFX Basic](#javafx-basic)
  - [JavaFX Advanced](#javafx-advanced)
  - [Dateioperationen](#dateioperationen)
  - [JSON](#json)
  - [JDBC](#jdbc)
  

</details>

# Tipps & IntelliJ Shortcuts

## Alt + Enter

#### Beispiel Fehler: String zu Integer konvertierung  
Der folgende Code ist **rot** markiert da versucht wird den Rückgabewert von .getText() _`String`_ in eine _`int`_ variable zu speichern, was natürlich nicht geht.  

![grafik](https://user-images.githubusercontent.com/79520423/153776399-1187b014-b8f4-40e2-a75c-2d5f7dcc8bff.png)


1. Wenn dir deine IDE etwas **rot** markiert ist es schlau als erstes den Code auf Tipp- und Klammerfehler zu prüfen.  

2. Kannst du diese Fehler ausschließen solltest du als nächstes in Erwägung ziehen **mit der maus über den rot markierten Code zu fahren**  
In den meisten Fällen weiß die IDE hier schon wo der Fehler liegt und zeigt diesen auch an.  
![grafik](https://user-images.githubusercontent.com/79520423/153776422-eff25a1b-274a-42ad-841a-870baf6a965a.png)
###### _In unserem Beispiel gibt es einen Fehler da der Inhalt eines TextFelds (String) nicht einfach in eine Integer variable gespeichert werden kann_


3. Weißt du aber nicht was du mit dieser Information anfangen sollst ist es hilfreich sich mit dem Cursor auf den rot markierten Code zu stellen und  die Tastenkombination `Alt`+`Enter` zu drücken.  
Hier kannst du dann im Kontext Menü die IDE die passendste Lösung anwenden lassen  
![grafik](https://user-images.githubusercontent.com/79520423/153776459-2fb465ed-c0e7-49ca-87e6-430c7cedf80e.png)
###### _Um das Problem nun endlich zu beseitigen wählst du den Vorschlag "Wrap using 'Integer.parseInt()'". Diese Funktion der Integer Klasse wandelt den String in einen `int` Wert um_
Ergebnis:  
```java
public void buttonClicked(ActionEvent actionEvent) {

        int x = 0;
        x = Integer.parseInt(textField.getText());

    }
```
## IDE features  

### Woher weiß ich ob der Datentyp/die Klasse die ich gewählt habe die richtige ist?
Erklärt hier am Beispiel einer Dateioperation
```java
try {
            BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
            // Create new Reader

            String string = reader.readLine();
            // do something with your String
            
        } catch (IOException e) {
            e.printStackTrace();
        }
```
Woher weiß ich, dass der Wert, den ich von `reader().readLine();` zurückbekomme ein `String` ist?  

Die Auto-Vervollständigung von IntelliJ zeigt rechts im Kontext Menü an, welcher Datentyp bei der jeweiligen Methode zurück kommt, hier `String`.  

![grafik](https://user-images.githubusercontent.com/79520423/153775529-b4cd7992-6696-4d15-a8c1-c2c07dc28411.png)


# JavaFX Basic

### Setup für eine JavaFX Anwendung:
#### 1. Checken ob die richtige JDK eingestellt ist:
- Unter `File -> Project Structure -> SDK` eine JDK auswählen die funktioniert (nicht rot ist)
- Unter `File -> Project Structure -> Language Level` "SDK Default" auswählen

#### 2. JavaFX Libraries hinzufügen
- `File -> Project Structure -> Global Libraries` mit **"+"** *(Java)* alle JavaFx **.jar** dateien hinzufügen
- Diese liegen üblicherweise auf C:\Programme\ Java\ {sdk_version}\lib\

![grafik](https://user-images.githubusercontent.com/79520423/153752441-42d46d6c-2b03-4b8e-8cb3-b69b767669b1.png)


#### 3. In den Dependencies auf fehlerhafte Einträge prüfen
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

Damit die Scene weiß wer sie steuert (Controller) muss dieser erstmal dazu gelinkt werden:
- Auf der untersten Schicht der Scene, hier die Anchorpane, muss ein Attribut `fx:controller="..."`fxml als Inhalt
den Controller der Scene beinhalten. In diesem Fall "JavaFX_Basic.Controller", *Package:* `JavaFX_Basic` + `.` + *Klasse:* `Controller`

# JavaFX Advanced

# Dateioperationen  


# JSON  


# JDBC

Datenbank abfragen in Java mittels JDBC erfolgen immer in 4 einfachen Schritten  

### 1. Connection aufbauen  

Wir verwenden eine eigene Klasse `Database` die für das aufbauen der Verbindung zuständig ist. Dies hat den Vorteil dass wir, um die Connection zu bekommen, nur eine Methode aufrufen müssen. 

```java  
    public static Connection getInstance() {

        if (connection == null) {
            try {

                connection = DriverManager.getConnection("jdbc:" + type + "://" + host + ":" + port + "/" + database, user, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return connection;
    }
```

###### _Dies hat den Vorteil, dass bei jedem aufruf der statischen Methode `getInstance()` wegen Singleton verfahren immer die gleiche Connection verwendet wird._

Also holen wir uns die Connection dorthin wo wir sie brauchen

```java  
Connection connection = Database.getInstance();
```

### 2. Auf der Connection ein Statement definieren

Mit einem `PreparedStatement` definieren wir unsere Anfrage an die DB.

```java
PreparedStatement statement = connection.prepareStatement("SELECT * FROM tabellen_Name");
```

### 3. Statement ausführen und Antwort in ein ResultSet speichern

Das Statement wird mit der methode `executeQuery()` oder `executeUpdate()` an die DB geschickt.  

```java
ResultSet resultSet = statement.executeQuery();
```  
###### _Die Methode `executeQuery()` wird ausschließlich zum ausführen von Statements mit Rückgabe "SELECT" verwendet. Für andere Typen von SQL Statements wie "INSERT INTO", "UPDATE" und "DELETE" wird `executeUpdate` verwendet._  

#### ❗Wenn ein Abfragetyp ohne Rückgabe ("INSERT","UPDATE","DELETE") verwendet wird genügt es das Statement auszuführen mit `ececuteUpdate()`. Man muss dies nicht in ein ResultSet speichern. Der vierte Punkt fällt in diesem Fall weg❗

### 4. Daten aus dem ResultSet extrahieren  

Wenn es sich aber um ein `SELECT` Statement handelt, d.h. wenn Daten zurückkommen müssen wir diese logischerweise noch verarbeiten  

#### Handelt es sich um ein Statement bei dem nur EINE Zeile zurückkommt reicht es das ResultSet einmal zu durchlaufen:  

Mit `getString()` bzw. `getInt()` lassen sich bestimmte Daten aus dem Set herausholen

```java
if (resultSet.next()) {
  System.out.println(resultSet.getString("variable"));
}
```

#### Handelt es sich um ein Statement bei dem mehrere Datensätze zurückkommen muss das Set mehrmals durchlaufen werden:

```java
while (resultSet.next()) {
  System.out.println(resultSet.getString("title"));
}
```

###  Zu guter letzt sollten Statement und ResultSet noch geschlossen werden. Hierfür gibt es die methode `close()` in beiden Klassen
